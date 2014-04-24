package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "songs")
public class Song extends BasePersistable{
	private static final long serialVersionUID = 8931651232610317168L;

    @Column(name = "titel")
    private String titel;

    @ManyToOne//(targetEntity = Album.class)
    private Album album;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
