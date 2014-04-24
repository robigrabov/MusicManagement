package repositoryjpa;

import domain.Artist;

import java.util.List;


public class ArtistRepositoryJPA extends AbstractJPARepository<Artist> {

    @Override
    public List<Artist> findAll() {
        return entityManager().createQuery("SELECT l FROM Artist l", Artist.class).getResultList();
    }

    @Override
    public Artist findById(Long id) {
        return entityManager().find(Artist.class, id);
    }
}