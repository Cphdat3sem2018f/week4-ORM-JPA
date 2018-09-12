package facade;

import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

interface FacadeInterface
{
    public void addEntityManagerFactory(EntityManagerFactory emf);        
    public EntityManager getEntityManager();
    public Person createPerson(Person p);
    public Person getPerson(Long id);
    public Person editPerson(Person p);
    public Person deletePerson(Person p);
}
