/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;


import Dao.ClienteDAO;

import Negocio.Cliente;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ediane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        //testando conexao
       /*
         * Connection conexao = ConexaoCliente.getConexao(); conexao.close();
         * System.out.println("Desconectado do Banco de Dados");
         *
         * aDICIONANDO cLIENTE // instanciando objeto Cliente c1 = new
         * Cliente(); c1.setCpf(1234567890); c1.setNome("Ediane");
         *
         *
         * //criando objeto do tipo contato dao ClienteDAO dao = new
         * ClienteDAO(); dao.adiciona(c1); System.out.println("salvo no banco");
         */
        // ClienteDAO dao = new ClienteDAO();
        //List<Cliente> ListaCliente = dao.getLista();

      /*  Clientes c1 = new Clientes();

        c1.setNome("ediane");
        c1.setCpf(123333);

        //persistindo o objeto no banco 

        

        //criando a instancia no banco 
        ClientesJpaController cljpa = new ClientesJpaController(null, null);
        cljpa.create(c1);



        //veiculo.setPlaca("HJI-9872");
        //veiculo.setCapacidade(14);


*/
    }//fecha main
}
