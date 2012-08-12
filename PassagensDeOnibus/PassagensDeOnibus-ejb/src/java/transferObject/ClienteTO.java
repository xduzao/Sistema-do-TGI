/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package transferObject;

import java.io.Serializable;


/**
 *
 * @author 30926076
 */

public class ClienteTO implements Serializable {
    
    private int cpf;
    private String nome;
    private String telefone;
    private String email;
    
    private String endereco;
    private int cep;

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

}
