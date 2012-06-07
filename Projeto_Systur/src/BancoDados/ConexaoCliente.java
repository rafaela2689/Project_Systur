/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ediane
 */
public class ConexaoCliente {

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println( "Conectado ao Banco");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/Systur", "root", "ediane1011");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }//catch
    }//SQLException
}//fecha ConexaoCliente

