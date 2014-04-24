package repository;

import domain.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KlasseRepository extends CrudRepository<Album, Long> {

    List<Album> findByName(String name);

    List<Album> findByGenre(String genre);


}
