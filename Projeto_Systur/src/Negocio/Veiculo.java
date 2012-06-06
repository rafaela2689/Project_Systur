/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author RAFAELA
 */
public class Veiculo {
    private int idVeiculo;
    private String placa;
    private int capacidade;

    public Veiculo(int idVeiculo, String placa, int capacidade) {
        this.idVeiculo = idVeiculo;
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public Veiculo() {
    }

    /**
     * @return the idVeiculo
     */
    public int getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * @param idVeiculo the idVeiculo to set
     */
    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
