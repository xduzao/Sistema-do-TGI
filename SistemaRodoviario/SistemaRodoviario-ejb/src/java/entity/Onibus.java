/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Eduardo
 */
@Entity
public class Onibus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOnibus;
    private String modelo;
    private boolean manutencao;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAssento")
//    private Collection<Assento> assento;

//    public Collection<Assento> getAssento() {
//        return assento;
//    }
//
//    public void setAssento(Collection<Assento> assento) {
//        this.assento = assento;
//    }
    

    public boolean isManutencao() {
        return manutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Long getId() {
        return idOnibus;
    }

    public void setId(Long id) {
        this.idOnibus = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOnibus != null ? idOnibus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Onibus)) {
            return false;
        }
        Onibus other = (Onibus) object;
        if ((this.idOnibus == null && other.idOnibus != null) || (this.idOnibus != null && !this.idOnibus.equals(other.idOnibus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Onibus[ id=" + idOnibus + " ]";
    }
    
}
