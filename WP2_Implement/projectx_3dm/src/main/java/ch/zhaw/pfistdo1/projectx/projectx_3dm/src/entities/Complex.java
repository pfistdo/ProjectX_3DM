package ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("complex")
public class Complex extends Shape {

    private String color;

    @OneToMany
    @JoinColumn(name = "complex_id")
    List<Shape> shapes;

    public Complex() {
        super();
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public List<Shape> getShapes() {
        return shapes;
    }
    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }
}