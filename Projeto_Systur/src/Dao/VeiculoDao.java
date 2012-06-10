/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Negocio.Veiculo;
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
public class VeiculoDao {

    private Connection conexao;

    public VeiculoDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adiciona(Veiculo veiculo) throws SQLException {
        String sql = "insert into veiculo( placa, capacidade)" + "values(?,?)";

        PreparedStatement st = conexao.prepareStatement(sql);
        //seta os valores
        //st.setInt(1, veiculo.getIdVeiculo());
        st.setString(1, veiculo.getPlaca());
        st.setInt(2, veiculo.getCapacidade());

        //executa o código sql
        st.execute();
        st.close();
    }

    public List<Veiculo> getLista(String nome) throws SQLException {

        String sql = "select *from veiculo where placa like?";
        PreparedStatement st = this.conexao.prepareStatement(sql);
        st.setString(1, nome);
        ResultSet rs = st.executeQuery();

        List<Veiculo> minhaLista = new ArrayList<Veiculo>();

        while (rs.next()) {
            Veiculo v1 = new Veiculo();
            //v1.setIdVeiculo(rs.getInt("IdVeiculo"));
            v1.setPlaca(rs.getString("placa"));
            v1.setCapacidade(rs.getInt("capacidade"));

            minhaLista.add(v1);

        }
        rs.close();
        st.close();
        return minhaLista;
    }

    public void altera(Veiculo v) throws SQLException {
        String sql = "update veiculo set placa=?, capacidade=? where idVeiculo=?";
        PreparedStatement st = conexao.prepareStatement(sql);

        st.setString(1, v.getPlaca());
        st.setInt(2, v.getCapacidade());
        //st.setInt(3, v.getIdVeiculo());

        //executa o código sql
        st.execute();
        st.close();
    }

    public void exclui(Veiculo v) throws SQLException {
        String sql = "delete from veiculo where idVeiculo=?";
        PreparedStatement st = conexao.prepareStatement(sql);

        //st.setInt(1, v.getIdVeiculo());
        st.execute();
        st.close();
    }
}
