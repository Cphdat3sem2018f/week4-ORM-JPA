package jpacontrol;

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
        
        Person p = new Person("Dan", "Larsson", 56);
        em.persist(p);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
