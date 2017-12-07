/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.swing.JTextField;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author a1502549
 */
@Entity
@Table(catalog = "proHouse", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipamento.findAll", query = "SELECT e FROM Equipamento e")
    , @NamedQuery(name = "Equipamento.findById", query = "SELECT e FROM Equipamento e WHERE e.id = :id")
    , @NamedQuery(name = "Equipamento.findByNome", query = "SELECT e FROM Equipamento e WHERE e.nome = :nome")
    , @NamedQuery(name = "Equipamento.findByIp", query = "SELECT e FROM Equipamento e WHERE e.ip = :ip")})
public class Equipamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Column(length = 50)
    private String nome;
    @Column(length = 15)
    private String ip;

    public Equipamento() {
    }

    public Equipamento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipamento)) {
            return false;
        }
        Equipamento other = (Equipamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "classes.Equipamento[ id=" + id + " ]";
    }

    
}
