package app;

import repositoryjpa.PersistenceFactory;
import servicejpa.ServiceJpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MyApplication {
    private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    private PersistenceFactory persistenceFactory;

    private ServiceJpaFactory serviceFactory;

    public MyApplication() {
        entityManagerFactory = Persistence.createEntityManagerFactory("spengergassePU");
        entityManager = entityManagerFactory.createEntityManager();
        persistenceFactory = new PersistenceFactoryImpl(entityManager);
        serviceFactory = new ServiceFactoryImpl(persistenceFactory);
    }

    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        myApplication.doSomething();
        myApplication.teardown();
    }

    public void doSomething() {

    }

    public void teardown() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}
