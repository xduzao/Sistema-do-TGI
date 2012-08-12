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

public class CarroTO implements Serializable {
    
    private int codigo;
    
    private String placa;
    private int dataInicial;
    private int dataFinal;
    private String modelo;
    private String fabricante;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(int dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(int dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    

}
