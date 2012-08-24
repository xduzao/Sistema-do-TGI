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
public class Assento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAssento;
    private String fileira;
    private String numero;
//     @ManyToOne(cascade=CascadeType.ALL)
//    @JoinColumn(name ="onibus", referencedColumnName="idOnibus")
//    private Onibus onibus;

//    public Onibus getOnibus() {
//        return onibus;
//    }
//
//    public void setOnibus(Onibus onibus) {
//        this.onibus = onibus;
//    }
    
    

    public String getFileira() {
        return fileira;
    }

    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    

    public Long getId() {
        return idAssento;
    }

    public void setId(Long id) {
        this.idAssento = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAssento != null ? idAssento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assento)) {
            return false;
        }
        Assento other = (Assento) object;
        if ((this.idAssento == null && other.idAssento != null) || (this.idAssento != null && !this.idAssento.equals(other.idAssento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Assento[ id=" + idAssento + " ]";
    }
    
}
