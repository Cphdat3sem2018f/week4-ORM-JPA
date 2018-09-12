/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversejpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author cnls
 */
@Entity
@Table(name = "offices")
@NamedQueries(
{
    @NamedQuery(name = "Offices.findAll", query = "SELECT o FROM Offices o"),
    @NamedQuery(name = "Offices.findByOfficeCode", query = "SELECT o FROM Offices o WHERE o.officeCode = :officeCode"),
    @NamedQuery(name = "Offices.findByCity", query = "SELECT o FROM Offices o WHERE o.city = :city"),
    @NamedQuery(name = "Offices.findByPhone", query = "SELECT o FROM Offices o WHERE o.phone = :phone"),
    @NamedQuery(name = "Offices.findByAddressLine1", query = "SELECT o FROM Offices o WHERE o.addressLine1 = :addressLine1"),
    @NamedQuery(name = "Offices.findByAddressLine2", query = "SELECT o FROM Offices o WHERE o.addressLine2 = :addressLine2"),
    @NamedQuery(name = "Offices.findByState", query = "SELECT o FROM Offices o WHERE o.state = :state"),
    @NamedQuery(name = "Offices.findByCountry", query = "SELECT o FROM Offices o WHERE o.country = :country"),
    @NamedQuery(name = "Offices.findByPostalCode", query = "SELECT o FROM Offices o WHERE o.postalCode = :postalCode"),
    @NamedQuery(name = "Offices.findByTerritory", query = "SELECT o FROM Offices o WHERE o.territory = :territory")
})
public class Offices implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "officeCode")
    private String officeCode;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "addressLine1")
    private String addressLine1;
    @Column(name = "addressLine2")
    private String addressLine2;
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @Column(name = "postalCode")
    private String postalCode;
    @Basic(optional = false)
    @Column(name = "territory")
    private String territory;

    public Offices()
    {
    }

    public Offices(String officeCode)
    {
        this.officeCode = officeCode;
    }

    public Offices(String officeCode, String city, String phone, String addressLine1, String country, String postalCode, String territory)
    {
        this.officeCode = officeCode;
        this.city = city;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.country = country;
        this.postalCode = postalCode;
        this.territory = territory;
    }

    public String getOfficeCode()
    {
        return officeCode;
    }

    public void setOfficeCode(String officeCode)
    {
        this.officeCode = officeCode;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getAddressLine1()
    {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1)
    {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2()
    {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2)
    {
        this.addressLine2 = addressLine2;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getTerritory()
    {
        return territory;
    }

    public void setTerritory(String territory)
    {
        this.territory = territory;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (officeCode != null ? officeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offices))
        {
            return false;
        }
        Offices other = (Offices) object;
        if ((this.officeCode == null && other.officeCode != null) || (this.officeCode != null && !this.officeCode.equals(other.officeCode)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "reversejpa.Offices[ officeCode=" + officeCode + " ]";
    }
    
}
