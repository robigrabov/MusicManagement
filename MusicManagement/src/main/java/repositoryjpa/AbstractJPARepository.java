package repositoryjpa;

import domain.BasePersistable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public abstract class AbstractJPARepository<T extends BasePersistable> implements JPARepository {

    @PersistenceContext
    private EntityManager entityManager;

    public AbstractJPARepository() {

    }

    protected EntityManager entityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract List<T> findAll();

    public abstract T findById(Long id);

    public void persist(T entity) {
        entityManager.persist(entity);
    }

}