/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Negocio.Cliente;
import Negocio.ServicoTuristico;
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
public class ClienteDao {
 
    private Connection conexao;

    public ClienteDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adiciona(Cliente cliente) throws SQLException {
        String sql = "insert into clientes(cpf, nome)" + "values(?,?)";

        PreparedStatement st = conexao.prepareStatement(sql);
        //seta os valores
        st.setString(1, cliente.getCPF());
        st.setString(2, cliente.getPrimeiroNome());
        //st.setString(3, servico.getNome());
        //st.setString(4, servico.getDescricao());
        //st.setInt(5, servico.getLotMax());
        //st.setInt(6, servico.getLotMin());
        //st.setString(7, servico.getObs());
        

        //executa o código sql
        st.execute();
        st.close();
    }

    public List<Cliente> getLista(String nome) throws SQLException {

        String sql = "select *from clientes where cpf like?";
        PreparedStatement st = this.conexao.prepareStatement(sql);
        st.setString(1, nome);
        ResultSet rs = st.executeQuery();

        List<Cliente> minhaLista = new ArrayList<Cliente>();

        while (rs.next()) {
            Cliente c1 = new Cliente();
            c1.setCPF(rs.getString("cpf"));
            c1.setPrimeiroNome(rs.getString("nome"));
           // v1.setNome(rs.getString("nome"));
            // v1.setDescricao(rs.getString("descrição"));
             //v1.setLotMax(rs.getInt("lotação máxima"));
            // v1.setLotMin(rs.getInt("lotação mínima"));
          //   v1.setObs(rs.getString("observacao"));

            minhaLista.add(c1);

        }
        rs.close();
        st.close();
        return minhaLista;
    }

    public void altera(Cliente s) throws SQLException {
        String sql = "update clientes set valor=?, cpf =?, nome=?  where cpf=?";
        PreparedStatement st = conexao.prepareStatement(sql);

        //st.setString(1, v.getPlaca());
        //st.setInt(1, servico.getIdServico());
        st.setString(1, s.getCPF());
        st.setString(2, s.getPrimeiroNome());
        //st.setString(4, s.getDescricao());
      //  st.setInt(5, s.getLotMax());
       // st.setInt(6, s.getLotMin());
       // st.setString(7, s.getObs());
        //st.setInt(3, v.getIdVeiculo());

        //executa o código sql
        st.execute();
        st.close();
    }

    public void exclui(Cliente s) throws SQLException {
        String sql = "delete from clientes where cpf=?";
        PreparedStatement st = conexao.prepareStatement(sql);

        //st.setString(1, v.getPlaca());
        st.setString(1, s.getCPF());
        st.execute();
        st.close();
    }

    
}


