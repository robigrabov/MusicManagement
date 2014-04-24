package repositoryjpa;

import domain.Song;

import java.util.List;


public class SongRepositoryJPA extends AbstractJPARepository<Song> {

    @Override
    public List<Song> findAll() {
        return entityManager().createQuery("SELECT s FROM Song s", Song.class).getResultList();
    }

    @Override
    public Song findById(Long id) {
        return entityManager().find(Song.class, id);
    }

}