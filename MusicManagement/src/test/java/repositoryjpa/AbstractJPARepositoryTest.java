package repositoryjpa;

import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AbstractJPARepositoryTest {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected EntityManagerFactory entityManagerFactory;

    protected EntityManager entityManager;

    @Before
    public void setup() {
        entityManagerFactory = Persistence
                .createEntityManagerFactory("spengergassePU");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    @After
    public void teardown() {
        if (entityManager != null)
            entityManager.getTransaction().commit();
        if (entityManager != null)
            entityManager.close();
        if (entityManagerFactory != null)
            entityManagerFactory.close();
    }
}
