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

public class HotelTO implements Serializable {
    
    private int codigo;
    private String nome;
    private int qtdeEstrelas;
    private String cidade;
    private String telefone;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeEstrelas() {
        return qtdeEstrelas;
    }

    public void setQtdeEstrelas(int qtdeEstrelas) {
        this.qtdeEstrelas = qtdeEstrelas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
