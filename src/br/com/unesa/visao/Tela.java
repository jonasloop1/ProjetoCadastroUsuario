package br.com.unesa.visao;

import br.com.unesa.controle.ControleCliente;
import br.com.unesa.modelo.Cliente;
import javax.swing.JOptionPane;

/**
 * @author Jonas Silva Carvalho<jonasloop1@gmail.com>
 * @author Gabriel Henrique Santos Marques<gabrielmarques142@gmail.com>
 * @author Marlon Ribeiro da Silva<marlonribeirodasilva@outlook.com.br>
 * @author Victor Augusto Fonseca da Silva<victorfonsecass@outlook.com>
 * @brief Tela de cadastro do usuario.
 * @date 29/09/2020
 */
public class Tela extends javax.swing.JFrame {

    ControleCliente controle = new ControleCliente();
    Cliente cliente = new Cliente();

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botcadastro = new javax.swing.JButton();
        botbuscar = new javax.swing.JButton();
        botlistar = new javax.swing.JButton();
        caixanome = new javax.swing.JTextField();
        caixaemail = new javax.swing.JTextField();
        caixacpf = new javax.swing.JTextField();
        caixaprofissao = new javax.swing.JTextField();
        caixaidade = new javax.swing.JTextField();
        caixaformacao = new javax.swing.JTextField();
        boteditar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        caixaid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        caixasexo = new javax.swing.JTextField();
        caixahab = new javax.swing.JTextField();
        caixaBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("CADASTRO");

        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Nome:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("E-mail:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("CPF:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Profissão:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Idade:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Formação:");

        botcadastro.setText("Cadastrar");
        botcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botcadastroActionPerformed(evt);
            }
        });

        botbuscar.setText("Buscar");
        botbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botbuscarActionPerformed(evt);
            }
        });

        botlistar.setText("Listar");
        botlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botlistarActionPerformed(evt);
            }
        });

        caixaemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaemailActionPerformed(evt);
            }
        });

        boteditar.setText("Editar");
        boteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteditarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 204));
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Ver.  1.0");

        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("MJVG");

        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("Possui Habilitação?");

        jLabel12.setForeground(new java.awt.Color(255, 255, 204));
        jLabel12.setText("ID:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 204));
        jLabel13.setText("Sexo:");

        caixaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(caixaemail, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                            .addComponent(caixaformacao, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                            .addComponent(caixaidade, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                            .addComponent(caixaprofissao, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                            .addComponent(caixacpf, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                            .addComponent(caixasexo)))
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caixanome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caixaid, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(caixahab, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(boteditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botlistar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(caixaBuscar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(caixaemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(caixacpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaprofissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(caixaformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixasexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(caixahab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botcadastro)
                .addGap(25, 25, 25)
                .addComponent(caixaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botbuscar)
                    .addComponent(boteditar)
                    .addComponent(botlistar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botcadastroActionPerformed
  
        cliente.setId(Integer.parseInt(caixaid.getText()));
        cliente.setCpf(caixacpf.getText());
        cliente.setNome(caixanome.getText());
        cliente.setIdade(caixaidade.getText());
        cliente.setEmail(caixaemail.getText());
        cliente.setSexo(caixasexo.getText());
        cliente.setProfissao(caixaprofissao.getText());
        cliente.setFormacao(caixaformacao.getText());
        cliente.setHabilitacao(caixahab.getText());
        controle.incluir(cliente);

        JOptionPane.showMessageDialog(rootPane, "Cadastro feito com sucesso!");

        caixaid.setText("");
        caixacpf.setText("");
        caixanome.setText("");
        caixaidade.setText("");
        caixaemail.setText("");
        caixasexo.setText("");
        caixaprofissao.setText("");
        caixaformacao.setText("");
        caixahab.setText("");


    }//GEN-LAST:event_botcadastroActionPerformed

    private void caixaemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaemailActionPerformed

    private void botbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botbuscarActionPerformed
            controle.buscar().forEach((cliente) -> {
            JOptionPane.showMessageDialog(rootPane, cliente.getId() + ", " + cliente.getCpf() + ", " + cliente.getNome() + ", " + cliente.getIdade()+", "
                    + cliente.getEmail() + ", " + cliente.getSexo() + ", " + cliente.getProfissao() + ", " + cliente.getFormacao() + ", "
                    + cliente.getHabilitacao());
        });
    }//GEN-LAST:event_botbuscarActionPerformed

    private void boteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteditarActionPerformed

        cliente.setId(Integer.parseInt(caixaid.getText()));
        cliente.setCpf(caixacpf.getText());
        cliente.setNome(caixanome.getText());
        cliente.setIdade(caixaidade.getText());
        cliente.setEmail(caixaemail.getText());
        cliente.setSexo(caixasexo.getText());
        cliente.setProfissao(caixaprofissao.getText());
        cliente.setFormacao(caixaformacao.getText());
        cliente.setHabilitacao(caixahab.getText());
        controle.alterar(cliente);
        
        JOptionPane.showMessageDialog(rootPane, "Atualização feita com sucesso!");

        caixaid.setText("");
        caixacpf.setText("");
        caixanome.setText("");
        caixaidade.setText("");
        caixaemail.setText("");
        caixasexo.setText("");
        caixaprofissao.setText("");
        caixaformacao.setText("");
        caixahab.setText("");
        
    }//GEN-LAST:event_boteditarActionPerformed

    private void botlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botlistarActionPerformed
        controle.ObterListar().forEach((cliente) -> {
            JOptionPane.showMessageDialog(rootPane, cliente.getId() + ", " + cliente.getCpf() + ", " + cliente.getNome() + ", " + cliente.getIdade()
                    + cliente.getEmail() + ", " + cliente.getSexo() + ", " + cliente.getProfissao() + ", " + cliente.getFormacao() + ", "
                    + cliente.getHabilitacao());
        });
    }//GEN-LAST:event_botlistarActionPerformed

    private void caixaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botbuscar;
    private javax.swing.JButton botcadastro;
    private javax.swing.JButton boteditar;
    private javax.swing.JButton botlistar;
    private javax.swing.JTextField caixaBuscar;
    private javax.swing.JTextField caixacpf;
    private javax.swing.JTextField caixaemail;
    private javax.swing.JTextField caixaformacao;
    private javax.swing.JTextField caixahab;
    private javax.swing.JTextField caixaid;
    private javax.swing.JTextField caixaidade;
    private javax.swing.JTextField caixanome;
    private javax.swing.JTextField caixaprofissao;
    private javax.swing.JTextField caixasexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
