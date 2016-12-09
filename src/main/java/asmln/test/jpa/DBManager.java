package asmln.test.jpa;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by asmln on 09.12.2016.
 */
@Service
@Transactional
public class DBManager implements org.springframework.data.repository.Repository<Animal, Integer> {

    @PersistenceContext
    EntityManager em;

    public void createDB() {
        em.persist(new Cat("cat1", 1, 10, false));
        em.persist(new Cat("cat2", 2, 20, true));
        em.persist(new Dog("dog1", 3, 5));
        em.persist(new Dog("dog2", 4, 15));
        em.persist(new Dog("dog3", 5, 25));
    }

    public List<Dog> findAllDogs() {
        return em.createQuery(
                "from Dog")
                .getResultList();
    }

    public List<Dog> findAllCats() {
        return em.createQuery(
                "from Dog")
                .getResultList();
    }

    public List<Animal> findAll() {
        return em.createQuery(
                "from Animal a")
                .getResultList();
    }

    public List<Animal> findAllByClass(Class clazz) {
        return em.createQuery(
                "from Animal a where TYPE(a) = ?1").setParameter(1, clazz)
                .getResultList();
    }
}
