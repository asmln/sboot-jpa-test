package asmln.test.jpa;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by asmln on 09.12.2016.
 */
@Entity
@PrimaryKeyJoinColumn(name = "cat_id")
public class Cat extends Animal {
    private Boolean strips;

    public Cat() {
    }

    public Cat(String name, Integer age, Integer weight, Boolean strips) {
        super(name, age, weight);
        this.strips = strips;
    }

    public Boolean getStrips() {
        return strips;
    }

    public void setStrips(Boolean strips) {
        this.strips = strips;
    }
}
