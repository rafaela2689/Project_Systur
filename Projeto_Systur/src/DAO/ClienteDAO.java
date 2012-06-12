/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
        
        stmt.setString(1,c1.getCPF());
        stmt.setString(2,c1.getPrimeiroNome());
       
        //executa e fecha o codigo sql
        stmt.execute();
        stmt.close();
        
    }//fecha inserir
    
  public List<Cliente> getLista(String nome) throws SQLException {

        String sql = "select *from veiculo where placa like?";
        PreparedStatement st = this.conexao.prepareStatement(sql);
        st.setString(1, nome);
        ResultSet rs = st.executeQuery();

        List<Cliente> ListaCliente = new ArrayList<Cliente>();

        while (rs.next()) {
            Cliente c1 = new Cliente();
            //v1.setIdVeiculo(rs.getInt("IdVeiculo"));
            c1.setCPF(rs.getString("CPF"));
            c1.setPrimeiroNome(rs.getString("Nome"));

            ListaCliente.add(c1);

        }
        rs.close();
        st.close();
        return ListaCliente;
    }

    public void altera(Cliente c1) throws SQLException {
        String sql = "update Cliente set nome=? where cpf=?";
        PreparedStatement st = conexao.prepareStatement(sql);
        st.setString(1,c1.getCPF());
        st.setString(2, c1.getPrimeiroNome());
        //st.setInt(3, v.getIdVeiculo());

        //executa o código sql
        st.execute();
        st.close();
    }

    public void exclui(Cliente c1) throws SQLException {
        String sql = "delete from veiculo where idVeiculo=?";
        PreparedStatement st = conexao.prepareStatement(sql);

        //st.setInt(1, v.getIdVeiculo());
        st.execute();
        st.close();
    }
}