/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;
import Negocio.Cliente;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Ediane
 */
public class ClienteDAO {
    private Connection con;
    
  //  String Nome;
   // String Cpf;
    
  public ClienteDAO(Connection con) {
      setCon(con);
       
 
    }

    

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String Inserir(Cliente c){
    
    String sql = "insert into c(nome, cpf) values(?,?)";
    try{
    PreparedStatement ps = getCon().prepareStatement(sql);
    ps.setString(1, c.getNome());
    ps.setString(2, c.getCpf());
    if (ps.executeUpdate() > 0) {
        return "Inserido com sucesso.";
    } else {
        return "Erro ao inserir";
    }
    
    } catch (SQLException e) {
        return e.getMessage();
}

    }//fecha inserir
    
    public String alterar(Cliente c){
    
        String sql = "update c set nome = ?";
        sql += " where cpf = ?";

        try {
        PreparedStatement ps = getCon().prepareStatement(sql);
        ps.setString(1, c.getNome());
        ps.setString(2, c.getCpf());
                   
        if (ps.executeUpdate() > 0) {
            return "Alterado com sucesso.";
        } else {
            return "Erro ao alterar";
                }
        } catch (SQLException e) {
            return e.getMessage();
                                  }
}

        }

/*
    public String excluir(Cliente c){
        String sql = "delete from c where cpf= ?";
    
   try {
    PreparedStatement ps = getCon().prepareStatement(sql);
s    ps.setString(1, c.getCpf());
       
    if (ps.executeUpdate() > 0) {
        return "Excluído com sucesso.";
    } else {
        return "Erro ao excluir";

            }
    } catch (SQLException e) {
        return e.getMessage();
}*/

