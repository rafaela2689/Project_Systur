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
        String sql = "insert into veiculo( placa,cor, chassi, modelo, marca, capacidade, status, tipo, observaçao)" + "values(?,?,?,?,?,?,?,?,?)";

        PreparedStatement st = conexao.prepareStatement(sql);
        //seta os valores
        //st.setInt(1, veiculo.getIdVeiculo());
        st.setString(1, veiculo.getPlaca());
        st.setString(2, veiculo.getCor());
        st.setString(3, veiculo.getChassi());
        st.setString(4, veiculo.getModelo());
        st.setString(5, veiculo.getMarca());
        st.setInt(6, veiculo.getCapacidade());
        st.setString(7, veiculo.getStatus());
        st.setString(8, veiculo.getTipo());
        st.setString(9, veiculo.getObservacao());
        

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
            v1.setChassi(rs.getString("chassi"));
            v1.setCor(rs.getString("cor"));
            v1.setModelo(rs.getString("modelo"));
            v1.setMarca(rs.getString("marca"));
            v1.setCapacidade(rs.getInt("capacidade"));
            v1.setStatus(rs.getString("status"));
            v1.setTipo(rs.getString("tipo"));
            v1.setObservacao(rs.getString("observaçao"));

            minhaLista.add(v1);

        }
        rs.close();
        st.close();
        return minhaLista;
    }

    public void altera(Veiculo v) throws SQLException {
        String sql = "update veiculo set cor=?, chassi=?, modelo=?, marca=?, capacidade=?, status=?, tipo=?, observacao=? where placa=?";
        PreparedStatement st = conexao.prepareStatement(sql);

        //st.setString(1, v.getPlaca());
        st.setString(1, v.getCor());
        st.setString(2, v.getChassi());
        st.setString(3, v.getModelo());
        st.setString(4, v.getMarca());
        st.setInt(5, v.getCapacidade());
        st.setString(6, v.getStatus());
        st.setString(7, v.getTipo());
        st.setString(8, v.getObservacao());
        //st.setInt(3, v.getIdVeiculo());

        //executa o código sql
        st.execute();
        st.close();
    }

    public void exclui(Veiculo v) throws SQLException {
        String sql = "delete from veiculo where placa=?";
        PreparedStatement st = conexao.prepareStatement(sql);

        //st.setInt(1, v.getIdVeiculo());
        st.execute();
        st.close();
    }
}
