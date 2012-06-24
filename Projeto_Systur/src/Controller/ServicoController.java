/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ServicoDao;
import GUI.jifCadServico;
import Negocio.ServicoTuristico;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author RAFAELA
 */
public class ServicoController {
    
  public void salvar(double valor, String nome, String descricao, int lotmax, int lotmin, String obs ) throws
SQLException, ParseException {
        ServicoTuristico servico = new ServicoTuristico();
        
        //servico.setIdServico(id);
        servico.setValor(valor);
        servico.setNome(nome);   
        servico.setDescricao(descricao);
        servico.setLotMax(lotmax);
        servico.setLotMin(lotmin);
        servico.setObs(obs);
        
        new ServicoDao().adiciona(servico);
    }
  
   public void alterar(int id, double valor, String nome, String descricao, int lotmax, int lotmin, String obs) 
throws ParseException, SQLException {
        ServicoTuristico servico = new ServicoTuristico();
        
        servico.setIdServico(id);
        servico.setValor(valor);
        servico.setNome(nome);   
        servico.setDescricao(descricao);
        servico.setLotMax(lotmax);
        servico.setLotMin(lotmin);
        servico.setObs(obs);
        
        new ServicoDao().altera(servico);
    }
   
    public List<ServicoTuristico> listaServicos(String nome) {
        try {
            ServicoDao dao = new ServicoDao();
            return dao.getLista(nome);        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar contato\n "+ e.getLocalizedMessage());
        }
        return null;
    }
    
    public void excluir(ServicoTuristico s) throws SQLException {
        new ServicoDao().exclui(s);
    }
    
    
    
}
