package Janelas;

import Interfaces.Autenticavel;
import PacoteClassesSistema.Funcionario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame { 
    
    public TelaPrincipal(Autenticavel funcionario) {
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
        lblUsuario.setText(funcionario.getLogin());
        //this.lblUsuario.setText(usuario.getLogin());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmConsultar = new javax.swing.JMenu();
        jmiConsultaFuncionario = new javax.swing.JMenuItem();
        jmiConsultaHospede = new javax.swing.JMenuItem();
        jmiConsultaVaga = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmCadastrar = new javax.swing.JMenu();
        jmiCadastraFuncionario = new javax.swing.JMenuItem();
        jmiCadastraHospede = new javax.swing.JMenuItem();
        jmRegistrar = new javax.swing.JMenu();
        jmiHospedagem = new javax.swing.JMenuItem();
        jmiRegistraReserva = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmiSobre = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema Controle de Hospedaria");
        setPreferredSize(new java.awt.Dimension(1356, 710));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1375, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\controlhost.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Usuário:");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .add(lblUsuario))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel1)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(93, 93, 93)
                .add(jLabel1)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jmConsultar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\icon-16-search.png")); // NOI18N
        jmConsultar.setText("Consultar");

        jmiConsultaFuncionario.setText("Funcionários");
        jmiConsultaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaFuncionarioActionPerformed(evt);
            }
        });
        jmConsultar.add(jmiConsultaFuncionario);

        jmiConsultaHospede.setText("Hospedes");
        jmiConsultaHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaHospedeActionPerformed(evt);
            }
        });
        jmConsultar.add(jmiConsultaHospede);

        jmiConsultaVaga.setText("Quartos");
        jmiConsultaVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaVagaActionPerformed(evt);
            }
        });
        jmConsultar.add(jmiConsultaVaga);

        jMenuItem1.setText("Aluguel");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmConsultar.add(jMenuItem1);

        jMenuItem2.setText("Reserva");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmConsultar.add(jMenuItem2);

        jMenuBar1.add(jmConsultar);

        jmCadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\icon-16-user-dd.png")); // NOI18N
        jmCadastrar.setText("Cadastrar");

        jmiCadastraFuncionario.setText("Funcionário");
        jmiCadastraFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastraFuncionarioActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiCadastraFuncionario);

        jmiCadastraHospede.setText("Hospede");
        jmiCadastraHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastraHospedeActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiCadastraHospede);

        jMenuBar1.add(jmCadastrar);

        jmRegistrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\icon-16-new.png")); // NOI18N
        jmRegistrar.setText("Registrar");

        jmiHospedagem.setText("Aluguel");
        jmiHospedagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHospedagemActionPerformed(evt);
            }
        });
        jmRegistrar.add(jmiHospedagem);

        jmiRegistraReserva.setText("Reserva");
        jmiRegistraReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistraReservaActionPerformed(evt);
            }
        });
        jmRegistrar.add(jmiRegistraReserva);

        jMenuBar1.add(jmRegistrar);

        jmAjuda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\icon-16-help.png")); // NOI18N
        jmAjuda.setText("Ajuda");

        jmiSobre.setText("Sobre");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jmAjuda.add(jmiSobre);

        jMenuBar1.add(jmAjuda);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\icon-16-delete.png")); // NOI18N
        jMenu2.setText("Sair");

        jMenuItem4.setText("Logoff");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem3.setText("Fechar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiConsultaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaFuncionarioActionPerformed
        // TODO add your handling code here:
        new ConsultaFuncionario().setVisible(true);
    }//GEN-LAST:event_jmiConsultaFuncionarioActionPerformed

    private void jmiConsultaHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaHospedeActionPerformed
        // TODO add your handling code here:
        new ConsultaHospede().setVisible(true);
    }//GEN-LAST:event_jmiConsultaHospedeActionPerformed

    private void jmiConsultaVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaVagaActionPerformed
        try {
            new QuadroDeQuartos().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiConsultaVagaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new ConsultaAluguel().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new ConsultaReserva().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmiCadastraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastraFuncionarioActionPerformed
        // TODO add your handling code here:
        new CadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_jmiCadastraFuncionarioActionPerformed

    private void jmiCadastraHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastraHospedeActionPerformed
        // TODO add your handling code here
        new CadastroHospede().setVisible(true);
    }//GEN-LAST:event_jmiCadastraHospedeActionPerformed

    private void jmiHospedagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHospedagemActionPerformed
        // TODO add your handling code here:
        new RegistraHospedagem().setVisible(true);
    }//GEN-LAST:event_jmiHospedagemActionPerformed

    private void jmiRegistraReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistraReservaActionPerformed
        // TODO add your handling code here:
        new RegistraReserva().setVisible(true);

    }//GEN-LAST:event_jmiRegistraReservaActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        // TODO add your handling code here:
        new Sobre().setVisible(true);
    }//GEN-LAST:event_jmiSobreActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(null, "Deseja sair? ", null, 0);
        if (op == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginDeAcesso().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /*public void menuStatus(String usuario, String perfil){
    lblUsuario.setText(usuario);
    switch(perfil){
        case "1":lblPerfil.setText("Gerente");break;
        case "2":lblPerfil.setText("Supervisor");break;
        case "3":lblPerfil.setText("Atendente");break;
        case "4":lblPerfil.setText("Administrador");
    }
        
    }
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenu jmConsultar;
    private javax.swing.JMenu jmRegistrar;
    private javax.swing.JMenuItem jmiCadastraFuncionario;
    private javax.swing.JMenuItem jmiCadastraHospede;
    private javax.swing.JMenuItem jmiConsultaFuncionario;
    private javax.swing.JMenuItem jmiConsultaHospede;
    private javax.swing.JMenuItem jmiConsultaVaga;
    private javax.swing.JMenuItem jmiHospedagem;
    private javax.swing.JMenuItem jmiRegistraReserva;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

    void bloquear() {
        this.jmiConsultaFuncionario.setEnabled(false);
        this.jmiCadastraFuncionario.setEnabled(false);
    }
}
