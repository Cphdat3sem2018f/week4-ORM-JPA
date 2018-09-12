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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author cnls
 */
@Entity
@Table(name = "productlines")
@NamedQueries(
{
    @NamedQuery(name = "Productlines.findAll", query = "SELECT p FROM Productlines p"),
    @NamedQuery(name = "Productlines.findByProductLine", query = "SELECT p FROM Productlines p WHERE p.productLine = :productLine"),
    @NamedQuery(name = "Productlines.findByTextDescription", query = "SELECT p FROM Productlines p WHERE p.textDescription = :textDescription")
})
public class Productlines implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "productLine")
    private String productLine;
    @Column(name = "textDescription")
    private String textDescription;
    @Lob
    @Column(name = "htmlDescription")
    private String htmlDescription;
    @Lob
    @Column(name = "image")
    private byte[] image;

    public Productlines()
    {
    }

    public Productlines(String productLine)
    {
        this.productLine = productLine;
    }

    public String getProductLine()
    {
        return productLine;
    }

    public void setProductLine(String productLine)
    {
        this.productLine = productLine;
    }

    public String getTextDescription()
    {
        return textDescription;
    }

    public void setTextDescription(String textDescription)
    {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription()
    {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription)
    {
        this.htmlDescription = htmlDescription;
    }

    public byte[] getImage()
    {
        return image;
    }

    public void setImage(byte[] image)
    {
        this.image = image;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (productLine != null ? productLine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productlines))
        {
            return false;
        }
        Productlines other = (Productlines) object;
        if ((this.productLine == null && other.productLine != null) || (this.productLine != null && !this.productLine.equals(other.productLine)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "reversejpa.Productlines[ productLine=" + productLine + " ]";
    }
    
}
