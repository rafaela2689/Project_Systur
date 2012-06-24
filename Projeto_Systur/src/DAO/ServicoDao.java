/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Negocio.ServicoTuristico;
//import Negocio.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RAFAELA
 */
public class ServicoDao {
    
    private Connection conexao;

    public ServicoDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adiciona(ServicoTuristico servico) throws SQLException {
        String sql = "insert into servico(idservico, valor, nome, descricao, lotacaoMax, lotacaoMin, observacao)" + "values(?,?,?,?,?,?,?)";

        PreparedStatement st = conexao.prepareStatement(sql);
        //seta os valores
        st.setInt(1, servico.getIdServico());
        st.setDouble(2, servico.getValor());
        st.setString(3, servico.getNome());
        st.setString(4, servico.getDescricao());
        st.setInt(5, servico.getLotMax());
        st.setInt(6, servico.getLotMin());
        st.setString(7, servico.getObs());
        

        //executa o código sql
        st.execute();
        st.close();
    }

   

    public void altera(ServicoTuristico s) throws SQLException {
        String sql = "update servico set valor=?, nome=?, descricao=?, lotacaoMax=?, lotacaoMin=?, observacao=? where idservico=?";
        PreparedStatement st = conexao.prepareStatement(sql);

        //st.setString(1, v.getPlaca());
        st.setInt(1, s.getIdServico());
        st.setDouble(2, s.getValor());
        st.setString(3, s.getNome());
        st.setString(4, s.getDescricao());
        st.setInt(5, s.getLotMax());
        st.setInt(6, s.getLotMin());
        st.setString(7, s.getObs());
        //st.setInt(3, v.getIdVeiculo());

        //executa o código sql
        st.execute();
        st.close();
    }
    
     public List<ServicoTuristico> getLista(String nome) throws SQLException {

        String sql = "select *from servico where nome like?";
        PreparedStatement st = this.conexao.prepareStatement(sql);
        st.setString(1, nome);
        ResultSet rs = st.executeQuery();

        List<ServicoTuristico> minhaLista = new ArrayList<ServicoTuristico>();

        while (rs.next()) {
            ServicoTuristico v1 = new ServicoTuristico();
            
            v1.setIdServico(rs.getInt("idServico"));
            v1.setValor(rs.getDouble("valor"));
            v1.setNome(rs.getString("nome"));
            v1.setDescricao(rs.getString("descricao"));
            v1.setLotMax(rs.getInt("lotacaoMax"));
            v1.setLotMin(rs.getInt("lotacaoMin"));
            v1.setObs(rs.getString("observacao"));

            minhaLista.add(v1);

        }
        rs.close();
        st.close();
        return minhaLista;
    }

    public void exclui(ServicoTuristico s) throws SQLException {
        String sql = "delete from servico where idServico=?";
        PreparedStatement st = conexao.prepareStatement(sql);

        //st.setString(1, v.getPlaca());
        st.setInt(1, s.getIdServico());
        st.execute();
        st.close();
    }

    
}
