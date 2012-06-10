/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RAFAELA
 */
public class Conexao {
    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando ao banco!");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/systur", "root", "ediane1011");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());

        }
    }
}
    
    /*
    
    public static Connection abrirConexao() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "";
            url += "jdbc:mysql://localhost:3306/systur";
            url += "user=root&password=";
            con = DriverManager.getConnection(url);
            System.out.println("Conexão aberta.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
}
    return con;
}
    public static void fecharConexao(Connection con) {
        try {
            con.close();
            System.out.println("Conexão fechada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
}
}
}
    
    /*private String driverName;
    
    private Connection conexao = null;
    
    private String fonte = "Systur";
    
    public Conexao() throws ClassNotFoundException{
        
        driverName = "org.gjt.mm.mysql.Driver";
        Class.forName(driverName);
        
        String url = "jdbc:mysql://localhost:3306/systur";
    
    }
    * 
    */
    
    
    
    

