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

public class PassagemTO implements Serializable{
   
    private int codigo;
    private String assento;
    private String aviao;
    private String horario;
    private int dia;
    private int preco;

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getAviao() {
        return aviao;
    }

    public void setAviao(String aviao) {
        this.aviao = aviao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getData() {
        return dia;
    }

    public void setData(int data) {
        this.dia = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }


    

}
