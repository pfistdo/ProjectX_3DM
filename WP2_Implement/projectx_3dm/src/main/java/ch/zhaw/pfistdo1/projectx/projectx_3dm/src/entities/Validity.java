package ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Validity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String country;
    
    @ManyToOne
    private Diagram diagram;
    @ManyToOne
    private Shape shape;
    
    public Validity() {}

    public long getId() {
        return id;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Diagram getDiagram() {
        return diagram;
    }
    public void setDiagram(Diagram diagram) {
        this.diagram = diagram;
    }
    public Shape getShape() {
        return shape;
    }
    public void setShape(Shape shape) {
        this.shape = shape;
    }
}