package servicejpa;

import domain.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositoryjpa.ArtistRepositoryJPA;


@Service
public class MusicManagementServiceJpa {
    @Autowired
    private ArtistRepositoryJPA artistRepositoryJPA;

    public void createNewArtist(String vorname, String nachname, float gehalt)
    {
        Artist l=new Artist(vorname, nachname, gehalt);
        artistRepositoryJPA.persist(l);
    }

    public void setArtistRepositoryJPA(ArtistRepositoryJPA artistRepositoryJPA)
    {
        this.artistRepositoryJPA=artistRepositoryJPA;
    }
}
