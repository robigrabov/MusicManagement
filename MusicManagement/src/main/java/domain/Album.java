package domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.Collection;


@Entity
@Table(name="album")
public class Album extends BasePersistable{
	private static final long serialVersionUID = -6902625070478614808L;

    @NotNull
    @Column(name="name")
    private String name;

    @Column(name="genre")
    private String genre;

    @OneToMany(targetEntity=Song.class, mappedBy="klasse")
    private Collection<Song> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    public void setSongs(Collection<Song> songs) {
        this.songs = songs;
    }
}
