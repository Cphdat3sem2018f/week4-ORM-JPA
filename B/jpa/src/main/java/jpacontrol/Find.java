package jpacontrol;

import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpapu");
        EntityManager em = emf.createEntityManager();
        
        em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        System.out.println("PersonFound: " + em.find(Person.class, 1l));
        
        em.getTransaction().commit();
        em.close();
    }   
}