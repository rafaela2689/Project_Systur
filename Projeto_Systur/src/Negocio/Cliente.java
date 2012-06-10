package Negocio;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAFAELA
 */
public class Cliente {
    
    private String nome;
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    private int passaporte;
    private String email;

    
    public int getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(int passaporte) {
        this.passaporte = passaporte;
    }
    


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome
     */
}