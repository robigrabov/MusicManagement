package app;

import repositoryjpa.*;

import javax.persistence.EntityManager;

import java.util.HashMap;


public class PersistenceFactoryImpl implements PersistenceFactory{

    private final HashMap<Class<?>, JPARepository> repositories = new HashMap<>();

    public PersistenceFactoryImpl(EntityManager entityManager) {
        LabelRepositoryJPA labelRepositoryJPA=new LabelRepositoryJPA();
        labelRepositoryJPA.setEntityManager(entityManager);
        repositories.put(LabelRepositoryJPA.class, labelRepositoryJPA);

        AlbumRepositoryJPA albumRepositoryJPA=new AlbumRepositoryJPA();
        albumRepositoryJPA.setEntityManager(entityManager);
        repositories.put(AlbumRepositoryJPA.class, albumRepositoryJPA);

        ArtistRepositoryJPA artistRepositoryJPA=new ArtistRepositoryJPA();
        artistRepositoryJPA.setEntityManager(entityManager);
        repositories.put(ArtistRepositoryJPA.class, artistRepositoryJPA);

        SongRepositoryJPA songRepositoryJPA=new SongRepositoryJPA();
        songRepositoryJPA.setEntityManager(entityManager);
        repositories.put(SongRepositoryJPA.class, songRepositoryJPA);
    }

    @Override
    public LabelRepositoryJPA labelRepository() {
        return (LabelRepositoryJPA) repositories.get(LabelRepositoryJPA.class);
    }

    @Override
    public AlbumRepositoryJPA albumRepository() {
        return (AlbumRepositoryJPA) repositories.get(AlbumRepositoryJPA.class);
    }

    @Override
    public ArtistRepositoryJPA artistRepository() {
        return (ArtistRepositoryJPA) repositories.get(ArtistRepositoryJPA.class);
    }

    @Override
    public SongRepositoryJPA songRepository() {
        return (SongRepositoryJPA) repositories.get(SongRepositoryJPA.class);
    

}
}
