package service;

import domain.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ArtistRepository;


@Service
public class MusicManagementService {

    @Qualifier("artistRepository")
    @Autowired
    private ArtistRepository artistRepository;

    @Transactional
    public void createNewArtist(String vorname, String nachname, float gehalt) {
        Artist l = new Artist(vorname, nachname, gehalt);
        artistRepository.save(l);
    }
}
