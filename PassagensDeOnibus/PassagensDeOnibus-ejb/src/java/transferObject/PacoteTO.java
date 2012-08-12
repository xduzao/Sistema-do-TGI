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

public class PacoteTO implements Serializable {
   
    private int codigo;
    private int qtdePessoa;
    private int preco;
    private int dataInicial;
    private int dataFinal;

    
    private CarroTO carroTO;
    
    private ClienteTO clienteTO;
    
    private HotelTO hotelTO;
    
    private PassagemTO passagemTO;

    public CarroTO getCarroTO() {
        return carroTO;
    }

    public void setCarroTO(CarroTO carroTO) {
        this.carroTO = carroTO;
    }

    public ClienteTO getClienteTO() {
        return clienteTO;
    }

    public void setClienteTO(ClienteTO clienteTO) {
        this.clienteTO = clienteTO;
    }

    public HotelTO getHotelTO() {
        return hotelTO;
    }

    public void setHotelTO(HotelTO hotelTO) {
        this.hotelTO = hotelTO;
    }

    public PassagemTO getPassagemTO() {
        return passagemTO;
    }

    public void setPassagemTO(PassagemTO passagemTO) {
        this.passagemTO = passagemTO;
    }
    
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


    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQtdePessoa() {
        return qtdePessoa;
    }

    public void setQtdePessoa(int qtdePessoa) {
        this.qtdePessoa = qtdePessoa;
    }

}
