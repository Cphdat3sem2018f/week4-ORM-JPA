package facade;

import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Facade implements FacadeInterface
{
    EntityManagerFactory emf;
    
    public Facade()
    {
    }
    
    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    @Override
    public EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }
    
    @Override
    public Person createPerson(Person person)
    {
        EntityManager em = getEntityManager();
        
        try
        {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
            return person;
        }
        finally
        {
            em.close();
        }
    }
    
    @Override
    public Person getPerson(Long id)
    {
        EntityManager em = getEntityManager();
        
        Person p = null;
        
        try
        {
            em.getTransaction().begin();
            p = em.find(Person.class, id);
            em.getTransaction().commit();
            return p;
        }
        finally
        {
            em.close();
        }
    }
    
    @Override
    public Person editPerson(Person person)
    {
        EntityManager em = getEntityManager();
        
        Person p = null;
        
        try
        {
            em.getTransaction().begin();
            p = em.find(Person.class, person.getId());
            if(p != null)
            {
                em.merge(p);
            }
            em.getTransaction().commit();
            return p;
        }
        finally
        {
            em.close();
        }
    }

    @Override
    public Person deletePerson(Person person)
    {
        EntityManager em = getEntityManager();
        
        Person p = null;
        
        try
        {
            em.getTransaction().begin();
            p = em.find(Person.class, person.getId());
            if(p != null)
            {
                em.remove(p);
            }
            em.getTransaction().commit();
            return p;
        }
        finally
        {
            em.close();
        }
    }
}