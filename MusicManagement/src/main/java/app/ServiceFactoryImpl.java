package app;

import repositoryjpa.PersistenceFactory;
import servicejpa.MusicManagementServiceJpa;
import servicejpa.ServiceJpa;
import servicejpa.ServiceJpaFactory;

import java.util.HashMap;

public class ServiceFactoryImpl implements ServiceJpaFactory{
    private final HashMap<Class<?>, ServiceJpa> services = new HashMap<>();

    private PersistenceFactory persistenceFactory;
    @Override
    public MusicManagementServiceJpa musicManagementService() {
        MusicManagementServiceJpa musicManagementService = new MusicManagementServiceJpa();
        musicManagementService.setArtistRepositoryJPA(persistenceFactory.artistRepository());
        return musicManagementService;
    }

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }


}