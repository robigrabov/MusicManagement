package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "label")
public class Label extends BasePersistable{
	private static final long serialVersionUID = -7067435441135504880L;

    @Column(name = "name")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
