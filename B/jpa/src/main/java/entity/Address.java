package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Street;
    private String city;
    
    @ManyToMany(mappedBy = "addresses")
    private List<Person> persons = new ArrayList();
    

    
    
    public Address()
    {
    }

    public Address(String Street, String city)
    {
        this.Street = Street;
        this.city = city;
    }

    
    
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getStreet()
    {
        return Street;
    }

    public void setStreet(String Street)
    {
        this.Street = Street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public List<Person> getPersons()
    {
        return persons;
    }

    public void setPersons(List<Person> persons)
    {
        this.persons = persons;
    }

    public void addPerson(Person person)
    {
        this.persons.add(person);
    }
    
    
    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address))
        {
            return false;
        }
        Address other = (Address) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Address{" + "id=" + id + ", Street=" + Street + ", city=" + city + '}';
    }

   
    
}
