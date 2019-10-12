
package Janelas;
import PacoteClassesSistema.Aluguel;
import PacoteClassesSistema.Quartos;
import PacoteClassesSistema.Reserva;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QuadroDeQuartos extends javax.swing.JFrame {

private Quartos quarto = new Quartos();
private Aluguel objAluguel = new Aluguel();
private Reserva objReserva = new Reserva();


    public QuadroDeQuartos() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jplQuarto1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jlbTipo1 = new javax.swing.JLabel();
        jlbNome1 = new javax.swing.JLabel();
        jlbData1 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jplQuarto2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jlbTipo2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jlbNome2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jlbData2 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jplQuarto3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jlbTipo3 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jlbNome3 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jlbData3 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jplQuarto4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jlbTipo4 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jlbNome4 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jlbData4 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jplQuarto5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jlbTipo5 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jlbNome5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jlbData5 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jplQuarto10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jlbTipo10 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jlbNome10 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jlbData10 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jplQuarto9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jlbTipo9 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jlbNome9 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jlbData9 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jplQuarto8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jlbTipo8 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jlbNome8 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jlbData8 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jplQuarto7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jlbTipo7 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jlbNome7 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jlbData7 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jplQuarto6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jlbTipo6 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jlbNome6 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jlbData6 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jpn = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Quadro de Quartos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N
        jLabel1.setText("Quadro de Quartos");

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Legenda"));

        jPanel21.setBackground(new java.awt.Color(153, 255, 153));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.setToolTipText("");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel22.setBackground(new java.awt.Color(255, 0, 0));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(255, 153, 0));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("Livre");

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel87.setText("Ocupado");

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel88.setText("Reservado");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel86)
                .addGap(24, 24, 24)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addGap(24, 24, 24)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel88)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jplQuarto1.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto1MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Nº1");

        jLabel23.setText("Tipo:");

        jLabel24.setText("Nome:");

        jLabel25.setText("Data Entrada:");

        jlbData1.setText("00/00/0000");

        jLabel83.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto1Layout = new javax.swing.GroupLayout(jplQuarto1);
        jplQuarto1.setLayout(jplQuarto1Layout);
        jplQuarto1Layout.setHorizontalGroup(
            jplQuarto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jplQuarto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel83))
                    .addGroup(jplQuarto1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jplQuarto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jplQuarto1Layout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlbTipo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jplQuarto1Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(10, 10, 10)
                            .addComponent(jlbData1)))))
        );
        jplQuarto1Layout.setVerticalGroup(
            jplQuarto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jplQuarto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(jplQuarto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jplQuarto1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel24))
                    .addGroup(jplQuarto1Layout.createSequentialGroup()
                        .addComponent(jlbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jplQuarto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jlbData1)))
        );

        jplQuarto2.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto2.setPreferredSize(new java.awt.Dimension(163, 127));
        jplQuarto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto2MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Nº2");

        jLabel29.setText("Tipo:");

        jLabel31.setText("Nome:");

        jLabel33.setText("Data Entrada:");

        jlbData2.setText("00/00/0000");

        jLabel85.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto2Layout = new javax.swing.GroupLayout(jplQuarto2);
        jplQuarto2.setLayout(jplQuarto2Layout);
        jplQuarto2Layout.setHorizontalGroup(
            jplQuarto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jplQuarto2Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbData2))
                    .addGroup(jplQuarto2Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbTipo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jplQuarto2Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbNome2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jplQuarto2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85)
                .addContainerGap())
        );
        jplQuarto2Layout.setVerticalGroup(
            jplQuarto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlbNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jplQuarto2Layout.createSequentialGroup()
                        .addGroup(jplQuarto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel85))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jplQuarto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jlbTipo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jlbData2))
                .addContainerGap())
        );

        jplQuarto3.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto3.setPreferredSize(new java.awt.Dimension(163, 127));
        jplQuarto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto3MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Nº3");

        jLabel35.setText("Tipo:");

        jLabel37.setText("Nome:");

        jLabel39.setText("Data Entrada:");

        jlbData3.setText("00/00/0000");

        jLabel89.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto3Layout = new javax.swing.GroupLayout(jplQuarto3);
        jplQuarto3.setLayout(jplQuarto3Layout);
        jplQuarto3Layout.setHorizontalGroup(
            jplQuarto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jplQuarto3Layout.createSequentialGroup()
                .addGroup(jplQuarto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto3Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel89))
                    .addGroup(jplQuarto3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jplQuarto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplQuarto3Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbNome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jplQuarto3Layout.createSequentialGroup()
                                .addGroup(jplQuarto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jplQuarto3Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlbData3))
                                    .addGroup(jplQuarto3Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlbTipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jplQuarto3Layout.setVerticalGroup(
            jplQuarto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jplQuarto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbTipo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jlbData3))
                .addContainerGap())
        );

        jplQuarto4.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto4.setPreferredSize(new java.awt.Dimension(163, 127));
        jplQuarto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto4MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Nº4");

        jLabel41.setText("Tipo:");

        jLabel43.setText("Nome:");

        jLabel45.setText("Data Entrada:");

        jlbData4.setText("00/00/0000");

        jLabel90.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto4Layout = new javax.swing.GroupLayout(jplQuarto4);
        jplQuarto4.setLayout(jplQuarto4Layout);
        jplQuarto4Layout.setHorizontalGroup(
            jplQuarto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto4Layout.createSequentialGroup()
                .addGroup(jplQuarto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19))
                    .addGroup(jplQuarto4Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel90))
                    .addGroup(jplQuarto4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jplQuarto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplQuarto4Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbTipo4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jplQuarto4Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbNome4))
                            .addGroup(jplQuarto4Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbData4)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jplQuarto4Layout.setVerticalGroup(
            jplQuarto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplQuarto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jlbTipo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jlbNome4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jlbData4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jplQuarto5.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto5.setPreferredSize(new java.awt.Dimension(163, 127));
        jplQuarto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto5MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("Nº5");

        jLabel47.setText("Tipo:");

        jLabel49.setText("Nome:");

        jLabel51.setText("Data Entrada:");

        jlbData5.setText("00/00/0000");

        jLabel91.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto5Layout = new javax.swing.GroupLayout(jplQuarto5);
        jplQuarto5.setLayout(jplQuarto5Layout);
        jplQuarto5Layout.setHorizontalGroup(
            jplQuarto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addContainerGap())
            .addGroup(jplQuarto5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto5Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbTipo5))
                    .addGroup(jplQuarto5Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbNome5))
                    .addGroup(jplQuarto5Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbData5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jplQuarto5Layout.setVerticalGroup(
            jplQuarto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jplQuarto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jlbTipo5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jplQuarto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jlbNome5)))
                    .addGroup(jplQuarto5Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jlbData5))
                .addContainerGap())
        );

        jplQuarto10.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto10.setPreferredSize(new java.awt.Dimension(163, 127));
        jplQuarto10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto10MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Nº10");

        jLabel53.setText("Tipo:");

        jLabel55.setText("Nome:");

        jLabel57.setText("Data Entrada:");

        jlbData10.setText("00/00/0000");

        jLabel96.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto10Layout = new javax.swing.GroupLayout(jplQuarto10);
        jplQuarto10.setLayout(jplQuarto10Layout);
        jplQuarto10Layout.setHorizontalGroup(
            jplQuarto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto10Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbTipo10))
                    .addGroup(jplQuarto10Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbNome10))
                    .addGroup(jplQuarto10Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbData10)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jplQuarto10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel96)
                .addContainerGap())
        );
        jplQuarto10Layout.setVerticalGroup(
            jplQuarto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto10Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jplQuarto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(jlbTipo10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jplQuarto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(jlbNome10)))
                    .addGroup(jplQuarto10Layout.createSequentialGroup()
                        .addComponent(jLabel96)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jlbData10))
                .addContainerGap())
        );

        jplQuarto9.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto9.setPreferredSize(new java.awt.Dimension(163, 127));
        jplQuarto9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto9MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Nº9");

        jLabel59.setText("Tipo:");

        jLabel61.setText("Nome:");

        jLabel63.setText("Data Entrada:");

        jlbData9.setText("00/00/0000");

        jLabel95.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto9Layout = new javax.swing.GroupLayout(jplQuarto9);
        jplQuarto9.setLayout(jplQuarto9Layout);
        jplQuarto9Layout.setHorizontalGroup(
            jplQuarto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto9Layout.createSequentialGroup()
                .addGroup(jplQuarto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20))
                    .addGroup(jplQuarto9Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel95))
                    .addGroup(jplQuarto9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jplQuarto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplQuarto9Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbTipo9))
                            .addGroup(jplQuarto9Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbNome9))
                            .addGroup(jplQuarto9Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbData9)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jplQuarto9Layout.setVerticalGroup(
            jplQuarto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel95))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jlbTipo9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jlbNome9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jlbData9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jplQuarto8.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto8.setPreferredSize(new java.awt.Dimension(163, 127));
        jplQuarto8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto8MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Nº8");

        jLabel65.setText("Tipo:");

        jLabel67.setText("Nome:");

        jLabel69.setText("Data Entrada:");

        jlbData8.setText("00/00/0000");

        jLabel94.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto8Layout = new javax.swing.GroupLayout(jplQuarto8);
        jplQuarto8.setLayout(jplQuarto8Layout);
        jplQuarto8Layout.setHorizontalGroup(
            jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto8Layout.createSequentialGroup()
                .addGroup(jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplQuarto8Layout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbData8)
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addGroup(jplQuarto8Layout.createSequentialGroup()
                                .addGroup(jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jplQuarto8Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addComponent(jlbTipo8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 22, Short.MAX_VALUE))
                                    .addComponent(jlbNome8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jplQuarto8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel94)))
                .addContainerGap())
        );
        jplQuarto8Layout.setVerticalGroup(
            jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel94))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jlbTipo8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto8Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jplQuarto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jlbData8)))
                    .addComponent(jlbNome8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jplQuarto7.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto7.setPreferredSize(new java.awt.Dimension(163, 127));
        jplQuarto7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto7MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Nº7");

        jLabel71.setText("Tipo:");

        jLabel73.setText("Nome:");

        jLabel75.setText("Data Entrada:");

        jlbData7.setText("00/00/0000");

        jLabel93.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto7Layout = new javax.swing.GroupLayout(jplQuarto7);
        jplQuarto7.setLayout(jplQuarto7Layout);
        jplQuarto7Layout.setHorizontalGroup(
            jplQuarto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplQuarto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto7Layout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbNome7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jplQuarto7Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbData7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jplQuarto7Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbTipo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jplQuarto7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel93))
        );
        jplQuarto7Layout.setVerticalGroup(
            jplQuarto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto7Layout.createSequentialGroup()
                .addGroup(jplQuarto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jplQuarto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71)
                    .addComponent(jlbTipo7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplQuarto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNome7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jlbData7))
                .addContainerGap())
        );

        jplQuarto6.setBackground(new java.awt.Color(153, 255, 153));
        jplQuarto6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplQuarto6.setPreferredSize(new java.awt.Dimension(191, 136));
        jplQuarto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jplQuarto6MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Nº6");

        jLabel77.setText("Tipo:");

        jLabel79.setText("Nome:");

        jLabel81.setText("Data Entrada:");

        jlbData6.setText("00/00/0000");

        jLabel92.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adriano\\Documents\\NetBeansProjects\\Hospedaria\\imagens\\header\\icon-48-frontpage.png")); // NOI18N

        javax.swing.GroupLayout jplQuarto6Layout = new javax.swing.GroupLayout(jplQuarto6);
        jplQuarto6.setLayout(jplQuarto6Layout);
        jplQuarto6Layout.setHorizontalGroup(
            jplQuarto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto6Layout.createSequentialGroup()
                .addGroup(jplQuarto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jplQuarto6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel92))
                    .addGroup(jplQuarto6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel81)
                        .addGap(10, 10, 10)
                        .addComponent(jlbData6))
                    .addGroup(jplQuarto6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jplQuarto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplQuarto6Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbTipo6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jplQuarto6Layout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbNome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
        );
        jplQuarto6Layout.setVerticalGroup(
            jplQuarto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplQuarto6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jplQuarto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplQuarto6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel14))
                    .addComponent(jLabel92))
                .addGap(13, 13, 13)
                .addGroup(jplQuarto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77)
                    .addComponent(jlbTipo6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplQuarto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jplQuarto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81)
                    .addComponent(jlbData6)))
        );

        jpn.setBackground(new java.awt.Color(51, 102, 255));
        jpn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnLayout = new javax.swing.GroupLayout(jpn);
        jpn.setLayout(jpnLayout);
        jpnLayout.setHorizontalGroup(
            jpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jpnLayout.setVerticalGroup(
            jpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jplQuarto6, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jplQuarto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jplQuarto2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jplQuarto7, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jplQuarto3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jplQuarto8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jplQuarto4, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jplQuarto9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jplQuarto5, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jplQuarto10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jplQuarto5, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jplQuarto3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jplQuarto2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jplQuarto4, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jplQuarto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jplQuarto7, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jplQuarto8, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jplQuarto9, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jplQuarto10, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jplQuarto6, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jplQuarto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto1MouseClicked
        // TODO add your handling code here:
      this.chamaTela(1);
    }//GEN-LAST:event_jplQuarto1MouseClicked

    private void jplQuarto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto2MouseClicked
        // TODO add your handling code here:
        this.chamaTela(2);
    }//GEN-LAST:event_jplQuarto2MouseClicked

    private void jplQuarto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto3MouseClicked
        // TODO add your handling code here:
        this.chamaTela(3);
    }//GEN-LAST:event_jplQuarto3MouseClicked

    private void jplQuarto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto4MouseClicked
        // TODO add your handling code here:
        this.chamaTela(4);
    }//GEN-LAST:event_jplQuarto4MouseClicked

    private void jplQuarto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto5MouseClicked
        // TODO add your handling code here:
        this.chamaTela(5);
    }//GEN-LAST:event_jplQuarto5MouseClicked

    private void jplQuarto6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto6MouseClicked
        // TODO add your handling code here:
        this.chamaTela(6);
    }//GEN-LAST:event_jplQuarto6MouseClicked

    private void jplQuarto7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto7MouseClicked
        // TODO add your handling code here:
        this.chamaTela(7);
    }//GEN-LAST:event_jplQuarto7MouseClicked

    private void jplQuarto8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto8MouseClicked
        // TODO add your handling code here:
        this.chamaTela(8);
    }//GEN-LAST:event_jplQuarto8MouseClicked

    private void jplQuarto9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto9MouseClicked
        // TODO add your handling code here:
        this.chamaTela(9);
    }//GEN-LAST:event_jplQuarto9MouseClicked

    private void jplQuarto10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplQuarto10MouseClicked
        // TODO add your handling code here:
        this.chamaTela(10);
    }//GEN-LAST:event_jplQuarto10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new QuadroDeQuartos().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(QuadroDeQuartos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

     private void verificaStatus(JPanel strQuarto, JLabel strTipo, JLabel strNome, JLabel strData) throws SQLException{
         
    }
  private void chamaTela(int numQ){
           
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JLabel jlbData1;
    private javax.swing.JLabel jlbData10;
    private javax.swing.JLabel jlbData2;
    private javax.swing.JLabel jlbData3;
    private javax.swing.JLabel jlbData4;
    private javax.swing.JLabel jlbData5;
    private javax.swing.JLabel jlbData6;
    private javax.swing.JLabel jlbData7;
    private javax.swing.JLabel jlbData8;
    private javax.swing.JLabel jlbData9;
    private javax.swing.JLabel jlbNome1;
    private javax.swing.JLabel jlbNome10;
    private javax.swing.JLabel jlbNome2;
    private javax.swing.JLabel jlbNome3;
    private javax.swing.JLabel jlbNome4;
    private javax.swing.JLabel jlbNome5;
    private javax.swing.JLabel jlbNome6;
    private javax.swing.JLabel jlbNome7;
    private javax.swing.JLabel jlbNome8;
    private javax.swing.JLabel jlbNome9;
    private javax.swing.JLabel jlbTipo1;
    private javax.swing.JLabel jlbTipo10;
    private javax.swing.JLabel jlbTipo2;
    private javax.swing.JLabel jlbTipo3;
    private javax.swing.JLabel jlbTipo4;
    private javax.swing.JLabel jlbTipo5;
    private javax.swing.JLabel jlbTipo6;
    private javax.swing.JLabel jlbTipo7;
    private javax.swing.JLabel jlbTipo8;
    private javax.swing.JLabel jlbTipo9;
    private javax.swing.JPanel jplQuarto1;
    private javax.swing.JPanel jplQuarto10;
    private javax.swing.JPanel jplQuarto2;
    private javax.swing.JPanel jplQuarto3;
    private javax.swing.JPanel jplQuarto4;
    private javax.swing.JPanel jplQuarto5;
    private javax.swing.JPanel jplQuarto6;
    private javax.swing.JPanel jplQuarto7;
    private javax.swing.JPanel jplQuarto8;
    private javax.swing.JPanel jplQuarto9;
    private javax.swing.JPanel jpn;
    // End of variables declaration//GEN-END:variables
}
