package jpacontrol;

import entity.Address;
import entity.BallPlayer;
import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Populate
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpapu");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        /*
        Person p = new Person("Dan", "Larsson", 56);

        Address a = new Address("SomeRoad 345", "Copenhagen");
        
        //em.persist(a);
        //em.persist(p);
        
        //em.remove(p);

        p.addAddress(a);
        a.addPerson(p);
        */
        
        BallPlayer bp = new BallPlayer("RealMadrid", 7, "Cristiano", "Ronaldo", 99);

        em.persist(bp);

        
        em.getTransaction().commit();
        em.close();
    }
    
}
