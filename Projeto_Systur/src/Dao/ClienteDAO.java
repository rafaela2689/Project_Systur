/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import BancoDados.ConexaoCliente;
import Negocio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ediane
 */
public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO() throws SQLException {
        this.conexao = ConexaoCliente.getConexao();


    }//fecha construtor
    
    public void adiciona (Cliente c1) throws SQLException{
        String sql = "insert into Clientes(cpf, nome)"+
                "values(?,?)";
        
        //interface pro banco de dados preparando a conexao
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        //setando valores no statement
        
        stmt.setInt(1,c1.getCpf());
        stmt.setString(2,c1.getNome());
        //executa e fecha o codigo sql
        stmt.execute();
        stmt.close();
        
    }//fecha inserir
    
   public List <Cliente> getLista() throws SQLException{
       //coloca pra listar todos os clientes
       String sql = "select * from Clientes";
       PreparedStatement stmt = this.conexao.prepareStatement(sql);
       //variavel que pega o resultado
       ResultSet rs = stmt.executeQuery();
       //lista para armazenar os elementos procurados
       List<Cliente> ListaClientes = new ArrayList<Cliente>();
       
       while(rs.next()){
           Cliente c1 = new Cliente();
           c1.setNome(rs.getString("nome"));
           c1.setCpf(rs.getInt("cpf"));
           ListaClientes.add(c1);
       }//fecha while
       rs.close();
       stmt.close();
       return ListaClientes;
   
   }//fecha lista
}
