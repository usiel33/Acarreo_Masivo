package lab22;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PantallaConfiguracionReinos extends javax.swing.JPanel {
    
  
    Guerra guerra= new Guerra();
    

    public PantallaConfiguracionReinos() {
        initComponents();
        inicializarDatos();
    }

    //Método para obtener datos de cad reino
    
    
    public void inicializarDatos(){
      cmpNombreR1.setText(guerra.getReino1());
       cmpNombreR2.setText(guerra.getReino2()); 
       
       cmpCantSoldadosR1.setText(guerra.getCantSoldadosR1());
       cmpCantSoldadosR2.setText(guerra.getCantSoldadosR2());
       
       pantallaR1.setText(guerra.ejercitosReino1.get(0).contarSoldados(guerra.ejercitosReino1));
       pantallaR2.setText(guerra.ejercitosReino2.get(0).contarSoldados(guerra.ejercitosReino2));
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmpNombreR1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        pantallaR1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmpEjercitoR1 = new javax.swing.JTextField();
        cmpCantSoldadosR1 = new javax.swing.JTextField();
        cmpEjercitoR2 = new javax.swing.JTextField();
        cmpCantSoldadosR2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDatosSoladosR1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pantallaR2 = new javax.swing.JTextArea();
        btnDatosSoladosR2 = new javax.swing.JButton();
        btnInicar = new javax.swing.JButton();
        cmpNombreR2 = new javax.swing.JTextField();

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setForeground(new java.awt.Color(153, 153, 153));
        contenedor.setPreferredSize(new java.awt.Dimension(1238, 669));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("REINO ");

        jLabel6.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("REINO ");

        cmpNombreR1.setBackground(new java.awt.Color(255, 255, 255));
        cmpNombreR1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        cmpNombreR1.setForeground(new java.awt.Color(153, 153, 153));
        cmpNombreR1.setBorder(null);

        pantallaR1.setColumns(20);
        pantallaR1.setRows(5);
        jScrollPane2.setViewportView(pantallaR1);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Ejercito :");

        jLabel5.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Cantidad Soldados:");

        cmpEjercitoR1.setBackground(new java.awt.Color(255, 255, 255));
        cmpEjercitoR1.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        cmpEjercitoR1.setForeground(new java.awt.Color(153, 153, 153));
        cmpEjercitoR1.setBorder(null);

        cmpCantSoldadosR1.setBackground(new java.awt.Color(255, 255, 255));
        cmpCantSoldadosR1.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        cmpCantSoldadosR1.setForeground(new java.awt.Color(153, 153, 153));
        cmpCantSoldadosR1.setBorder(null);

        cmpEjercitoR2.setBackground(new java.awt.Color(255, 255, 255));
        cmpEjercitoR2.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        cmpEjercitoR2.setForeground(new java.awt.Color(153, 153, 153));
        cmpEjercitoR2.setBorder(null);

        cmpCantSoldadosR2.setBackground(new java.awt.Color(255, 255, 255));
        cmpCantSoldadosR2.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        cmpCantSoldadosR2.setForeground(new java.awt.Color(153, 153, 153));
        cmpCantSoldadosR2.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Ejercito :");

        jLabel8.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Cantidad Soldados:");

        btnDatosSoladosR1.setText("Datos de Soldados");

        pantallaR2.setColumns(20);
        pantallaR2.setRows(5);
        jScrollPane3.setViewportView(pantallaR2);

        btnDatosSoladosR2.setText("Datos de Soldados");

        btnInicar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnInicar.setText("INICIAR GUERRA");
        btnInicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicarActionPerformed(evt);
            }
        });

        cmpNombreR2.setBackground(new java.awt.Color(255, 255, 255));
        cmpNombreR2.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        cmpNombreR2.setForeground(new java.awt.Color(153, 153, 153));
        cmpNombreR2.setBorder(null);
        cmpNombreR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpNombreR2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmpNombreR1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenedorLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmpEjercitoR1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmpCantSoldadosR1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnDatosSoladosR1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGap(32, 32, 32)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpNombreR2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDatosSoladosR2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmpEjercitoR2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmpCantSoldadosR2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnInicar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmpNombreR1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmpEjercitoR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmpCantSoldadosR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDatosSoladosR1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(cmpNombreR2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addComponent(cmpEjercitoR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmpCantSoldadosR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDatosSoladosR2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnInicar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmpNombreR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNombreR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpNombreR2ActionPerformed

    
    
    
    
    
    private void btnInicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicarActionPerformed

        PantallaJuego panelJuegos = new PantallaJuego();

       panelJuegos.setLocation(0, 0);
        panelJuegos.setSize(1238, 669);
        contenedor.removeAll();
        contenedor.add(panelJuegos, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();


    }//GEN-LAST:event_btnInicarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatosSoladosR1;
    private javax.swing.JButton btnDatosSoladosR2;
    private javax.swing.JButton btnInicar;
    private javax.swing.JTextField cmpCantSoldadosR1;
    private javax.swing.JTextField cmpCantSoldadosR2;
    private javax.swing.JTextField cmpEjercitoR1;
    private javax.swing.JTextField cmpEjercitoR2;
    private javax.swing.JTextField cmpNombreR1;
    private javax.swing.JTextField cmpNombreR2;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea pantallaR1;
    private javax.swing.JTextArea pantallaR2;
    // End of variables declaration//GEN-END:variables
}
