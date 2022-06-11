package ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Diagram {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String author;

    @OneToMany(mappedBy = "diagram")
    private List<Validity> validities;

    public Diagram(String name) {
        this.name = name;
    }
    public Diagram() {}

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public List<Validity> getValidities() {
        return validities;
    }
}