package persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logic.Turno;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logic.Paciente;
import persistence.exceptions.NonexistentEntityException;

public class PacienteJpaController implements Serializable {

    public PacienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public PacienteJpaController() {
        emf = Persistence.createEntityManagerFactory("dental-clinic_PU");
    }

    public void create(Paciente paciente) {
        if (paciente.getListaTurnosPaciente() == null) {
            paciente.setListaTurnosPaciente(new ArrayList<Turno>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Turno> attachedListaTurnosPaciente = new ArrayList<Turno>();
            for (Turno listaTurnosPacienteTurnoToAttach : paciente.getListaTurnosPaciente()) {
                listaTurnosPacienteTurnoToAttach = em.getReference(listaTurnosPacienteTurnoToAttach.getClass(), listaTurnosPacienteTurnoToAttach.getId_turno());
                attachedListaTurnosPaciente.add(listaTurnosPacienteTurnoToAttach);
            }
            paciente.setListaTurnosPaciente(attachedListaTurnosPaciente);
            em.persist(paciente);
            for (Turno listaTurnosPacienteTurno : paciente.getListaTurnosPaciente()) {
                Paciente oldPacienOfListaTurnosPacienteTurno = listaTurnosPacienteTurno.getPacien();
                listaTurnosPacienteTurno.setPacien(paciente);
                listaTurnosPacienteTurno = em.merge(listaTurnosPacienteTurno);
                if (oldPacienOfListaTurnosPacienteTurno != null) {
                    oldPacienOfListaTurnosPacienteTurno.getListaTurnosPaciente().remove(listaTurnosPacienteTurno);
                    oldPacienOfListaTurnosPacienteTurno = em.merge(oldPacienOfListaTurnosPacienteTurno);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Paciente paciente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente persistentPaciente = em.find(Paciente.class, paciente.getId());
            List<Turno> listaTurnosPacienteOld = persistentPaciente.getListaTurnosPaciente();
            List<Turno> listaTurnosPacienteNew = paciente.getListaTurnosPaciente();
            List<Turno> attachedListaTurnosPacienteNew = new ArrayList<Turno>();
            for (Turno listaTurnosPacienteNewTurnoToAttach : listaTurnosPacienteNew) {
                listaTurnosPacienteNewTurnoToAttach = em.getReference(listaTurnosPacienteNewTurnoToAttach.getClass(), listaTurnosPacienteNewTurnoToAttach.getId_turno());
                attachedListaTurnosPacienteNew.add(listaTurnosPacienteNewTurnoToAttach);
            }
            listaTurnosPacienteNew = attachedListaTurnosPacienteNew;
            paciente.setListaTurnosPaciente(listaTurnosPacienteNew);
            paciente = em.merge(paciente);
            for (Turno listaTurnosPacienteOldTurno : listaTurnosPacienteOld) {
                if (!listaTurnosPacienteNew.contains(listaTurnosPacienteOldTurno)) {
                    listaTurnosPacienteOldTurno.setPacien(null);
                    listaTurnosPacienteOldTurno = em.merge(listaTurnosPacienteOldTurno);
                }
            }
            for (Turno listaTurnosPacienteNewTurno : listaTurnosPacienteNew) {
                if (!listaTurnosPacienteOld.contains(listaTurnosPacienteNewTurno)) {
                    Paciente oldPacienOfListaTurnosPacienteNewTurno = listaTurnosPacienteNewTurno.getPacien();
                    listaTurnosPacienteNewTurno.setPacien(paciente);
                    listaTurnosPacienteNewTurno = em.merge(listaTurnosPacienteNewTurno);
                    if (oldPacienOfListaTurnosPacienteNewTurno != null && !oldPacienOfListaTurnosPacienteNewTurno.equals(paciente)) {
                        oldPacienOfListaTurnosPacienteNewTurno.getListaTurnosPaciente().remove(listaTurnosPacienteNewTurno);
                        oldPacienOfListaTurnosPacienteNewTurno = em.merge(oldPacienOfListaTurnosPacienteNewTurno);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = paciente.getId();
                if (findPaciente(id) == null) {
                    throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente paciente;
            try {
                paciente = em.getReference(Paciente.class, id);
                paciente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.", enfe);
            }
            List<Turno> listaTurnosPaciente = paciente.getListaTurnosPaciente();
            for (Turno listaTurnosPacienteTurno : listaTurnosPaciente) {
                listaTurnosPacienteTurno.setPacien(null);
                listaTurnosPacienteTurno = em.merge(listaTurnosPacienteTurno);
            }
            em.remove(paciente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Paciente> findPacienteEntities() {
        return findPacienteEntities(true, -1, -1);
    }

    public List<Paciente> findPacienteEntities(int maxResults, int firstResult) {
        return findPacienteEntities(false, maxResults, firstResult);
    }

    private List<Paciente> findPacienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paciente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Paciente findPaciente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Paciente.class, id);
        } finally {
            em.close();
        }
    }

    public int getPacienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paciente> rt = cq.from(Paciente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
