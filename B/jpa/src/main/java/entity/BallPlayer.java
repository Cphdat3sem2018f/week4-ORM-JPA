package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BallPlayer extends Person implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String club;
    private int jerseyNumber;

    public BallPlayer()
    {
    } 
    
    public BallPlayer(String firstName, String lastName, int age)
    {
        super(firstName, lastName, age);
    }

    public BallPlayer(String club, int jerseyNumber, String firstName, String lastName, int age)
    {
        super(firstName, lastName, age);
        this.club = club;
        this.jerseyNumber = jerseyNumber;
    }
    
    public BallPlayer(String club, int jerseyNumber)
    {
        this.club = club;
        this.jerseyNumber = jerseyNumber;
    }
    
    
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getClub()
    {
        return club;
    }

    public void setClub(String club)
    {
        this.club = club;
    }

    public int getJerseyNumber()
    {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber)
    {
        this.jerseyNumber = jerseyNumber;
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
        if (!(object instanceof BallPlayer))
        {
            return false;
        }
        BallPlayer other = (BallPlayer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "BallPlayer{" + "id=" + super.getId() + ", club=" + club + ", jerseyNumber=" + jerseyNumber + '}';
    }

    
    
}
