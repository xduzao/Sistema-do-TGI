/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable {
    @Id
    private Long idFuncionario;
    private String nome;
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
      
    public Long getId() {
        return idFuncionario;
    }

    public void setId(Long id) {
        this.idFuncionario = id;
    }
    
}
