package Negocio;
/**
 *
 * @author RAFAELA
 */
public class Veiculo {

    private int idVeiculo;//chave primária

   
    
    private String placa;
    private String cor;
    private String chassi;
    private String modelo;
    private String marca;
    private int capacidade;
    private String status;//será usado falso caso o veiculo nao esteja mais
    private String tipo;
    private String observacao;
    
     public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public String getChassi() {
        return chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidade() {
        return capacidade;
    }
    //pohha nao vai funcionar nao?

    public String getStatus() {
        return status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
