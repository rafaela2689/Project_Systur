/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

//import Dao.VeiculoDao;
import DAO.VeiculoDao;
import Negocio.Veiculo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAFAELA
 */
public class jifCadVeiculo extends javax.swing.JInternalFrame {
    
     //define o modelo da tabela, suas colunas
    DefaultTableModel tmVeiculo = new DefaultTableModel(null, new String[]{"IdVeículo" ,"Placa", "Cor", "Chassi",
                "Modelo", "Marca", "Capacidade", "Status", "Tipo", "Observacao"});
    List<Veiculo> veiculo;
    ListSelectionModel lsmVeiculo;

    /**
     * Creates new form jifCadVeiculo
     */
    public jifCadVeiculo() {
        initComponents();
        desabilitaDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelCadVeiculo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jBtPesquisar = new javax.swing.JButton();
        jTFPesquisar = new javax.swing.JTextField();
        jBtSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTFcapacidade = new javax.swing.JTextField();
        jLbCapacidade = new javax.swing.JLabel();
        jTFPlaca = new javax.swing.JTextField();
        jLbPlaca = new javax.swing.JLabel();
        jLbChassi = new javax.swing.JLabel();
        jTFChassi = new javax.swing.JTextField();
        jLbCor = new javax.swing.JLabel();
        jTFCor = new javax.swing.JTextField();
        jTFModelo = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jLbModelo = new javax.swing.JLabel();
        jLbMarca = new javax.swing.JLabel();
        jLbStatus = new javax.swing.JLabel();
        jLbObs = new javax.swing.JLabel();
        jTFObs = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFTipo = new javax.swing.JTextField();
        jBtGravar = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtNovo = new javax.swing.JButton();
        jlbIdVeiculo = new javax.swing.JLabel();
        jTFIdVeiculo = new javax.swing.JTextField();
        jTFStatus = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabPesquisa = new javax.swing.JTable();

        setTitle("Cadastro de Veículos");
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        jBtPesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAFAELA\\Downloads\\MiniCurso\\imgs\\procurar.png")); // NOI18N
        jBtPesquisar.setText("Pesquisar");
        jBtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisarActionPerformed(evt);
            }
        });

        jBtSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAFAELA\\Downloads\\MiniCurso\\imgs\\sair.png")); // NOI18N
        jBtSair.setText("Sair");
        jBtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtPesquisar)
                .addGap(34, 34, 34)
                .addComponent(jBtSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtPesquisar)
                    .addComponent(jTFPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jTFcapacidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFcapacidadeActionPerformed(evt);
            }
        });

        jLbCapacidade.setText("Capacidade:");

        jLbPlaca.setText("Placa:");

        jLbChassi.setText("Chassi:");

        jLbCor.setText("Cor:");

        jTFCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorActionPerformed(evt);
            }
        });

        jLbModelo.setText("Modelo:");

        jLbMarca.setText("Marca:");

        jLbStatus.setText("Status:");

        jLbObs.setText("Observação:");

        jLabel1.setText("Tipo:");

        jBtGravar.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAFAELA\\Downloads\\MiniCurso\\imgs\\ok.png")); // NOI18N
        jBtGravar.setText("Gravar");
        jBtGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGravarActionPerformed(evt);
            }
        });

        jBtAlterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAFAELA\\Downloads\\MiniCurso\\imgs\\edit.png")); // NOI18N
        jBtAlterar.setText("Alterar");
        jBtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAlterarActionPerformed(evt);
            }
        });

        jBtExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAFAELA\\Downloads\\MiniCurso\\imgs\\cancelar.png")); // NOI18N
        jBtExcluir.setText("Excluir");
        jBtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirActionPerformed(evt);
            }
        });

        jBtNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\RAFAELA\\Downloads\\MiniCurso\\imgs\\editcopy.png")); // NOI18N
        jBtNovo.setText("Novo");
        jBtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtNovoActionPerformed(evt);
            }
        });

        jlbIdVeiculo.setText("IdVeículo:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbCor)
                            .addComponent(jLbCapacidade)
                            .addComponent(jLbModelo)
                            .addComponent(jLbMarca)
                            .addComponent(jlbIdVeiculo)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLbPlaca)
                                .addComponent(jLbChassi)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFcapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFIdVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLbStatus)
                                    .addComponent(jLabel1)
                                    .addComponent(jLbObs)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtGravar)
                        .addGap(29, 29, 29)
                        .addComponent(jBtAlterar)
                        .addGap(30, 30, 30)
                        .addComponent(jBtExcluir)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jBtNovo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTFObs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jTFStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFChassi, jTFCor, jTFIdVeiculo, jTFMarca, jTFModelo, jTFObs, jTFPlaca, jTFTipo, jTFcapacidade});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbIdVeiculo)
                            .addComponent(jTFIdVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLbStatus)
                        .addComponent(jTFStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbPlaca)
                    .addComponent(jLabel1)
                    .addComponent(jTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbObs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbChassi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbModelo)
                            .addComponent(jTFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbMarca)
                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbCapacidade)
                            .addComponent(jTFcapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTFObs, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtNovo)
                    .addComponent(jBtExcluir)
                    .addComponent(jBtAlterar)
                    .addComponent(jBtGravar))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jTabPesquisa.setModel(tmVeiculo);
        jTabPesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmVeiculo = jTabPesquisa.getSelectionModel();
        lsmVeiculo.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(! e.getValueIsAdjusting()){
                    linhaSelecionada(jTabPesquisa);
                }
            }
        });
        jScrollPane1.setViewportView(jTabPesquisa);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPainelCadVeiculoLayout = new javax.swing.GroupLayout(jPainelCadVeiculo);
        jPainelCadVeiculo.setLayout(jPainelCadVeiculoLayout);
        jPainelCadVeiculoLayout.setHorizontalGroup(
            jPainelCadVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelCadVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelCadVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelCadVeiculoLayout.setVerticalGroup(
            jPainelCadVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelCadVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelCadVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelCadVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGravarActionPerformed
        // TODO add your handling code here:
        if (verificaDados()) {
            cadastro();
            desabilitaDados();
        }
    }//GEN-LAST:event_jBtGravarActionPerformed

     //realiza uma pesquisa
    public void listarVeiculos() throws SQLException {
        VeiculoDao dao = new VeiculoDao();
        veiculo = dao.getLista("%" + jTFPesquisar.getText() + "%");
        mostraPesquisa(veiculo);
    }

    //cadastra novo veiculo
    public void cadastro() {
        try {
            Veiculo v = new Veiculo();

            //v.setIdVeiculo(Integer.parseInt(jTFIdVeiculo.getText()));
            v.setPlaca(jTFPlaca.getText());
            v.setCor(jTFCor.getText());
            v.setChassi(jTFChassi.getText());
            v.setModelo(jTFModelo.getText());
            v.setMarca(jTFMarca.getText());
            v.setCapacidade(Integer.parseInt(jTFcapacidade.getText()));
            v.setStatus(jTFStatus.getText());
            //v.setStatus(jCBStatus.getSelectedItem().toString());
            v.setTipo(jTFTipo.getText());
            v.setObservacao(jTFObs.getText());

            VeiculoDao vd = new VeiculoDao();
            vd.adiciona(v);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage() );
            //JOptionPane.showMessageDialog(null, "Erro no botão cadastrar\n" + ex);
        }
    }

    
    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed
        try {
            // TODO add your handling code here:
            alterar();
            listarVeiculos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no botão alterar" + ex);
        }
    }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
        try {
            // TODO add your handling code here:
            excluir();
            mostraPesquisa(veiculo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no botão excluir\n" + ex);
        }
    }//GEN-LAST:event_jBtExcluirActionPerformed

     public void excluir() throws SQLException {
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir os dados? ",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {
            VeiculoDao dao = new VeiculoDao();
            dao.exclui(veiculo.get(jTabPesquisa.getSelectedRow()));
            mostraPesquisa(veiculo);
        }

    }
    
    private void jBtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisarActionPerformed
        try {
            // TODO add your handling code here:
            listarVeiculos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no botão pesquisar" + ex);
        }
    }//GEN-LAST:event_jBtPesquisarActionPerformed

    private void jBtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtNovoActionPerformed
        // TODO add your handling code here:
        habilitaDados();
        
        jTFIdVeiculo.setText("");
        jTFPlaca.setText("");
        jTFCor.setText("");
        jTFChassi.setText("");
        jTFModelo.setText("");
        jTFMarca.setText("");
        jTFcapacidade.setText("");
        //jCBStatus.setToolTipText("");
        jTFStatus.setText("");
        jTFTipo.setText("");
        jTFObs.setText("");
    }//GEN-LAST:event_jBtNovoActionPerformed

    private void jTFcapacidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFcapacidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFcapacidadeActionPerformed

    private void jTFCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorAdded

    private void jBtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSairActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jBtSairActionPerformed

     //desabilita a ediçao dos dados
    public void desabilitaDados() {
        jTFIdVeiculo.setEditable(false);
        jTFPlaca.setEditable(false);
        jTFCor.setEditable(false);
        jTFChassi.setEditable(false);
        jTFModelo.setEditable(false);
        jTFMarca.setEditable(false);
        jTFcapacidade.setEditable(false);
        //jCBStatus.setEditable(false);
        jTFStatus.setEditable(false);
        jTFTipo.setEditable(false);
        jTFObs.setEditable(false);
    }
    //permite a ediçao dos dados

    public void habilitaDados() {
        jTFIdVeiculo.setEditable(false);
        jTFPlaca.setEditable(true);
        jTFCor.setEditable(true);
        jTFChassi.setEditable(true);
        jTFModelo.setEditable(true);
        jTFMarca.setEditable(true);
        jTFcapacidade.setEditable(true);
        //jCBStatus.setEditable(true);
        jTFStatus.setEditable(true);
        jTFTipo.setEditable(true);
        jTFObs.setEditable(true);
    }

    /**
     * @param args the command line arguments
     */
    //seleciona uma linha na tabela para alterar ou excluir dados 
    private void linhaSelecionada(JTable tabela) {
        if (jTabPesquisa.getSelectedRow() != -1) {
            habilitaDados();
            jTFIdVeiculo.setText(String.valueOf(veiculo.get(tabela.getSelectedRow()).getIdVeiculo()));
            jTFPlaca.setText(veiculo.get(tabela.getSelectedRow()).getPlaca());
            jTFCor.setText(veiculo.get(tabela.getSelectedRow()).getCor());
            jTFChassi.setText(veiculo.get(tabela.getSelectedRow()).getChassi());
            jTFModelo.setText(veiculo.get(tabela.getSelectedRow()).getModelo());
            jTFMarca.setText(veiculo.get(tabela.getSelectedRow()).getMarca());
            jTFcapacidade.setText(String.valueOf(veiculo.get(tabela.getSelectedRow()).getCapacidade()));
            //jCBStatus.setToolTipText(veiculo.get(tabela.getSelectedRow()).getStatus());
            jTFStatus.setText(veiculo.get(tabela.getSelectedRow()).getStatus());
            jTFTipo.setText(veiculo.get(tabela.getSelectedRow()).getTipo());
            jTFObs.setText(veiculo.get(tabela.getSelectedRow()).getObservacao());
        } else {

            jTFIdVeiculo.setText("");
            jTFPlaca.setText("");
            jTFCor.setText("");
            jTFChassi.setText("");
            jTFModelo.setText("");
            jTFMarca.setText("");
            jTFcapacidade.setText("");
            //jCBStatus.setToolTipText("");
            jTFStatus.setText("");
            jTFTipo.setText("");
            jTFObs.setText("");
        }
    }

    //verifica se foi deixado algum campo obrigatório em branco
    public boolean verificaDados() {
        //&& (!jTFStatus.getText().equals(""))
        if ((!jTFPlaca.getText().equals("")) && (!jTFCor.getText().equals(""))
                && (!jTFChassi.getText().equals("")) && (!jTFModelo.getText().equals("")) && (!jTFMarca.getText().equals(""))
                && (!jTFcapacidade.getText().equals(""))  && (!jTFTipo.getText().equals(""))) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios em branco!");
            return false;
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtGravar;
    private javax.swing.JButton jBtNovo;
    private javax.swing.JButton jBtPesquisar;
    private javax.swing.JButton jBtSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbCapacidade;
    private javax.swing.JLabel jLbChassi;
    private javax.swing.JLabel jLbCor;
    private javax.swing.JLabel jLbMarca;
    private javax.swing.JLabel jLbModelo;
    private javax.swing.JLabel jLbObs;
    private javax.swing.JLabel jLbPlaca;
    private javax.swing.JLabel jLbStatus;
    private javax.swing.JPanel jPainelCadVeiculo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFChassi;
    private javax.swing.JTextField jTFCor;
    private javax.swing.JTextField jTFIdVeiculo;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFModelo;
    private javax.swing.JTextField jTFObs;
    private javax.swing.JTextField jTFPesquisar;
    private javax.swing.JTextField jTFPlaca;
    private javax.swing.JTextField jTFStatus;
    private javax.swing.JTextField jTFTipo;
    private javax.swing.JTextField jTFcapacidade;
    private javax.swing.JTable jTabPesquisa;
    private javax.swing.JLabel jlbIdVeiculo;
    // End of variables declaration//GEN-END:variables

 //mostra a pesquisa na tabela
    private void mostraPesquisa(List<Veiculo> veiculo) {

        while (tmVeiculo.getRowCount() > 0) {
            tmVeiculo.removeRow(0);
        }
        if (veiculo.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado!");
        } else {
            String[] linha = new String[]{null, null, null, null, null, null, null, null, null};
            for (int i = 0; i < veiculo.size(); i++) {

                tmVeiculo.addRow(linha);
                tmVeiculo.setValueAt(veiculo.get(i).getIdVeiculo(), i, 0);
                tmVeiculo.setValueAt(veiculo.get(i).getPlaca(), i, 1);
                tmVeiculo.setValueAt(veiculo.get(i).getCor(), i, 2);
                tmVeiculo.setValueAt(veiculo.get(i).getChassi(), i, 3);
                tmVeiculo.setValueAt(veiculo.get(i).getModelo(), i, 4);
                tmVeiculo.setValueAt(veiculo.get(i).getMarca(), i, 5);
                tmVeiculo.setValueAt(veiculo.get(i).getCapacidade(), i, 6);
                tmVeiculo.setValueAt(veiculo.get(i).getStatus(), i, 7);
                tmVeiculo.setValueAt(veiculo.get(i).getTipo(), i, 8);
                tmVeiculo.setValueAt(veiculo.get(i).getObservacao(), i, 9);

            }
        }
    }

    //altera os dados selecionados na tabela
    private void alterar() throws SQLException {
        if (jTabPesquisa.getSelectedRow() != -1) {
            if (verificaDados()) {
                Veiculo v1 = new Veiculo();
                VeiculoDao dao = new VeiculoDao();
                
                v1.setIdVeiculo(Integer.valueOf(jTFIdVeiculo.getText()));
                v1.setPlaca(jTFPlaca.getText());
                v1.setCor(jTFCor.getText());
                v1.setChassi(jTFChassi.getText());
                v1.setModelo(jTFModelo.getText());
                v1.setMarca(jTFMarca.getText());
                v1.setCapacidade(Integer.parseInt(jTFcapacidade.getText()));
                //v1.setStatus(jCBStatus.getSelectedItem().toString());
                v1.setStatus(jTFStatus.getText());
                v1.setTipo(jTFTipo.getText());
                v1.setObservacao(jTFObs.getText());
                dao.altera(v1);
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            }
        }
    }
}
