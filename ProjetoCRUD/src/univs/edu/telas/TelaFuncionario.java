/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas;

import univs.edu.funcionario.Funcionario;
import univs.edu.funcionario.FuncionarioDAO;
import univs.edu.usuario.Usuario;

/**
 *
 * @author LABORATORIO 01
 */
public class TelaFuncionario extends javax.swing.JFrame {

  Funcionario funcionario = new Funcionario();
  FuncionarioDAO dao = new FuncionarioDAO();
    public TelaFuncionario() {
        initComponents();
    }
    
    public void limparCampos(){
        funcionario = new Funcionario();
        tfNome.setText("");
        tfSalario.setText("");
        tfUsuario.setText("");
        tfCPF.setText("");
        jcCargo.setSelectedItem("selecione");
       
    }
    public void carregarUsuario(Usuario usuario){
        funcionario.setUsuario(usuario);
        tfUsuario.setText(usuario.getLogin());
    }
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcCargo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/usuario-40.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Cadastro Funcionário");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 35, 189, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Nome.:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 94, 373, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("CPF.:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 125, -1, -1));
        getContentPane().add(tfCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 126, 373, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Cargo.:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        getContentPane().add(tfSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 153, 373, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Sálario.:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 152, -1, -1));

        jcCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Recursos Humanos" }));
        jcCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCargoActionPerformed(evt);
            }
        });
        getContentPane().add(jcCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 180, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Usuário.:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        tfUsuario.setEditable(false);
        tfUsuario.setEnabled(false);
        getContentPane().add(tfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 380, -1));

        jButton1.setText("Selecionar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jButton2.setText("Voltar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jButton4.setText("Salvar");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jButton5.setText("Pesquisar");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCargoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jcCargo;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}