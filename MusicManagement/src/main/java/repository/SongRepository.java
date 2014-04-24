package repository;

import domain.Album;
import domain.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

    List<Song> findByTitel(String titel);

    List<Song> findByAlbum(Album album);
}
