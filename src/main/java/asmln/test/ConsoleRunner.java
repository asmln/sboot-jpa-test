package asmln.test;

import asmln.test.jpa.Cat;
import asmln.test.jpa.DBManager;
import asmln.test.jpa.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by asmln on 09.12.2016.
 */
@Component
public class ConsoleRunner implements CommandLineRunner {

    @Autowired
    DBManager dbManager;

    @Override
    public void run(String... args) throws Exception {
        dbManager.createDB();
        System.out.println("Select all animals");
        dbManager.findAll().forEach(a -> System.out.println("+++ " + a.getName() + " | " + a));
        System.out.println("Select all dogs by class");
        dbManager.findAllByClass(Dog.class).forEach(a -> System.out.println("+++ " + a.getName() + " | " + a));
        System.out.println("Select all cats by class");
        dbManager.findAllByClass(Cat.class).forEach(a -> System.out.println("+++ " + a.getName() + " | " + a));
    }
}
