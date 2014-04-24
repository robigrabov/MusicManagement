package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "artist")
public class Artist extends BasePersistable{
	private static final long serialVersionUID = -7934766653780631348L;

    @Column(name = "vorname")
    private String vorname;

    @Column(name = "nachname")
    private String nachname;

    @Column(name = "gehalt")
    private float gehalt;

    public Artist(String vorname, String nachname, float gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gehalt = gehalt;
    }

    public Artist() {
    }

    public float getGehalt() {
        return gehalt;
    }

    public void setGehalt(float gehalt) {
        this.gehalt = gehalt;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
