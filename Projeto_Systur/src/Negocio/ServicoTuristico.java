/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author RAFAELA
 */
public class ServicoTuristico {
    
    private int idServico;
    private double valor;
    private String nome;
    private String descricao;
    private int lotMax;
    private int lotMin;
    private String obs;

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public int getLotMax() {
        return lotMax;
    }

    public void setLotMax(int lotMax) {
        this.lotMax = lotMax;
    }

    public int getLotMin() {
        return lotMin;
    }

    public void setLotMin(int lotMin) {
        this.lotMin = lotMin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
