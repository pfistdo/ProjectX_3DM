package ch.zhaw.pfistdo1.projectx.projectx_3dm.src.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("simple")
public class Simple extends Shape {
    
    private int size;

    public Simple() {
        super();
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}