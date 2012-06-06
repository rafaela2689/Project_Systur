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

    public List<Veiculo> getLista() throws SQLException {

        String sql = "select *from veiculo";
        PreparedStatement st = this.conexao.prepareStatement(sql);
        ResultSet rs = st.executeQuery();

        List<Veiculo> minhaLista = new ArrayList<Veiculo>();

        while (rs.next()) {
            Veiculo v1 = new Veiculo();
            v1.setPlaca(rs.getString("placa"));
            v1.setCapacidade(rs.getInt("capacidade"));

            minhaLista.add(v1);

        }
        rs.close();
        st.close();
        return minhaLista;
    }
    
    public void altera(Veiculo v) throws SQLException{
        String sql = "update veiculo set placa=?, capacidade=? where idVeiculo=?";
        PreparedStatement st = conexao.prepareStatement(sql);
        
        st.setString(1, v.getPlaca());
        st.setInt(2, v.getCapacidade());
        st.setInt(3, v.getIdVeiculo());

        //executa o código sql
        st.execute();
        st.close();
    }
    
    public void exclui(Veiculo v) throws SQLException{
        String sql = "delete from veiculo where idVeiculo=?";
        PreparedStatement st = conexao.prepareStatement(sql);
        
        st.setInt(1, v.getIdVeiculo());
        st.execute();
        st.close();
    }
}


    /*private Connection con;

    public VeiculoDao(Connection con) {
        setCon(con);
    }

    public VeiculoDao() {
    }

    public String inserir(Veiculo v) {
        String sql = "insert into veiculo(idVeiculo,placa,capacidade)values(?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, v.getIdVeiculo());
            ps.setString(2, v.getPlaca());
            ps.setInt(3, v.getCapacidade());
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String alterar(Veiculo v) {
        String sql = "update veiculo set placa = ?,capacidade = ?";
        sql += " where idVeiculo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, v.getIdVeiculo());
            ps.setString(2, v.getPlaca());
            ps.setInt(3, v.getCapacidade());
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }

        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String excluir(Veiculo v) {
        String sql = "delete from veiculo where idVeiculo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, v.getIdVeiculo());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<Veiculo> listarTodos() {
        String sql = "select * from veiculo ";
        List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Veiculo vc = new Veiculo();
                    vc.setIdVeiculo(rs.getInt(1));
                    vc.setPlaca(rs.getString(2));
                    vc.setCapacidade(rs.getInt(3));
                    listaVeiculo.add(vc);
                }
                return listaVeiculo;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}*/
