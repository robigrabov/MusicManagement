package repositoryjpa;

import domain.Album;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AlbumRepositoryJPA extends AbstractJPARepository<Album> {

    @Override
    public List<Album> findAll() {
        return entityManager().createQuery("SELECT k FROM Album k", Album.class).getResultList();
    }

    @Override
    public Album findById(Long id) {
        return entityManager().find(Album.class, id);
    }
}