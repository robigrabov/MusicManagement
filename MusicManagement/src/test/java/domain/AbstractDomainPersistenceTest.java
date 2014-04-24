package domain;

import org.junit.After;
import org.junit.Before;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by viktor on 3/26/14.
 */
public abstract class AbstractDomainPersistenceTest {

    private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    @Before
    public void setup() {
        entityManagerFactory = Persistence.createEntityManagerFactory("spengergassePU");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    @After
    public void teardown() {
        if (entityManager != null) {
            entityManager.getTransaction().commit();
        }
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

    protected EntityManager entityManager() {
        return entityManager;
    }
}