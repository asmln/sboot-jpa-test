package asmln.test.jpa;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by asmln on 09.12.2016.
 */
@Entity
@PrimaryKeyJoinColumn(name = "dog_id")
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }
}
