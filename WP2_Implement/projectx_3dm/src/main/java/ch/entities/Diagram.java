package ch.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Diagram {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long diagramId;

    private String name;
    private String author;

    public Diagram() {
    }

    public Diagram(String name, String author) {
        this.name = name;
        this.author = author;
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
}