package facade;

import entity.Person;
import javax.persistence.Persistence;

public class FacadeTest
{
    public static void main(String[] args)
    {
        Facade facade = new Facade();
        facade.addEntityManagerFactory(Persistence.createEntityManagerFactory("jpapu"));
        
        //Create
        Person person1 = new Person("Henry", "Williams", 46);
        System.out.println("createPerson: " + facade.createPerson(person1));
        
        //Get
        System.out.println("getPerson: " + facade.getPerson(1l));
        
        //Edit
        Person person2 = new Person("Jack", "Rogers", 67);
        person2.setId(1l);
        System.out.println("editPerson: " + facade.editPerson(person2));
        
        //Delete
        Person person3 = new Person();
        person3.setId(1l);
        //System.out.println("deletePerson: " + facade.deletePerson(person3));
    }
}
