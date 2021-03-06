/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontEnd;

import backEnd.FormulaVelocidad;

/**
 *
 * @author gustavoreyeshdez
 */
public class CalculoVelocidad extends javax.swing.JFrame {

    /**
     * Creates new form CalculoVelocidad
     */
    public CalculoVelocidad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        optVelocidad = new javax.swing.JRadioButton();
        optDistancia = new javax.swing.JRadioButton();
        optTiempo = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtDistancia = new javax.swing.JTextField();
        txtVelocidad = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fórmula de la velocidad");

        buttonGroup1.add(optVelocidad);
        optVelocidad.setSelected(true);
        optVelocidad.setText("Velocidad");
        optVelocidad.setToolTipText("Velocidad = Distancia / Tiempo");
        optVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optVelocidadActionPerformed(evt);
            }
        });

        buttonGroup1.add(optDistancia);
        optDistancia.setText("Distancia");
        optDistancia.setToolTipText("Distancia = Velocidad x Tiempo");
        optDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optDistanciaActionPerformed(evt);
            }
        });

        buttonGroup1.add(optTiempo);
        optTiempo.setText("Tiempo");
        optTiempo.setToolTipText("Tiempo = Distancia / Velocidad");
        optTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optTiempoActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel1.setText("Distancia (d)");

        jLabel2.setText("Tiempo (t)");

        jLabel3.setText("Velocidad (v)");

        lblResultado.setText("Velocidad = ");

        txtDistancia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDistancia.setText("0");
        txtDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanciaActionPerformed(evt);
            }
        });

        txtVelocidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtVelocidad.setText("0");
        txtVelocidad.setEnabled(false);
        txtVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVelocidadActionPerformed(evt);
            }
        });

        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTiempo.setText("0");
        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(optVelocidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optTiempo)
                            .addComponent(optDistancia))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optVelocidad)
                            .addComponent(jLabel3)
                            .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optTiempo)
                            .addComponent(jLabel1)
                            .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(optDistancia))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanciaActionPerformed

    private void txtVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVelocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVelocidadActionPerformed

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        FormulaVelocidad objeto; //Declaración de objeto
        objeto = new FormulaVelocidad(); //Creamos la Instancia de objeto
        //Determinar que formula vamos a aplicar (Velocidad, tiempo o distancia
        if (optVelocidad.isSelected()){
            objeto.setDistancia(Float.parseFloat(txtDistancia.getText()));
            objeto.setTiempo(Float.parseFloat(txtTiempo.getText()));
            objeto.calculaVelocidad();
            lblResultado.setText("Velocidad = "+objeto.getVelocidad());
        }
        if (optDistancia.isSelected()){
            objeto.setVelocidad(Float.parseFloat(txtVelocidad.getText()));
            objeto.setTiempo(Float.parseFloat(txtTiempo.getText()));
            objeto.calculaDistancia();
            lblResultado.setText("Distancia = "+objeto.getDistancia());
        }
        if (optTiempo.isSelected()){
            objeto.setDistancia(Float.parseFloat(txtDistancia.getText()));
            objeto.setVelocidad(Float.parseFloat(txtVelocidad.getText()));
            objeto.calculaVelocidad();
            lblResultado.setText("Tiempo = "+objeto.getVelocidad());
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void optTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optTiempoActionPerformed
        // TODO add your handling code here:
        txtTiempo.setEnabled(false);
        txtVelocidad.setEnabled(true);
        txtDistancia.setEnabled(true);
        txtTiempo.setText("0") ;
        txtVelocidad.setText("0") ;
        txtDistancia.setText("0");
        lblResultado.setText("Tiempo = 0");
    }//GEN-LAST:event_optTiempoActionPerformed

    private void optVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optVelocidadActionPerformed
        // TODO add your handling code here:
        txtTiempo.setEnabled(true);
        txtVelocidad.setEnabled(false);
        txtDistancia.setEnabled(true);
        txtTiempo.setText("0") ;
        txtVelocidad.setText("0") ;
        txtDistancia.setText("0");
        lblResultado.setText("Velocidad = 0");
    }//GEN-LAST:event_optVelocidadActionPerformed

    private void optDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optDistanciaActionPerformed
        // TODO add your handling code here:
        txtTiempo.setEnabled(true);
        txtVelocidad.setEnabled(true);
        txtDistancia.setEnabled(false);
        txtTiempo.setText("0") ;
        txtVelocidad.setText("0") ;
        txtDistancia.setText("0");
        lblResultado.setText("Distancia = 0");
    }//GEN-LAST:event_optDistanciaActionPerformed

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
            java.util.logging.Logger.getLogger(CalculoVelocidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoVelocidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoVelocidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoVelocidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculoVelocidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JRadioButton optDistancia;
    private javax.swing.JRadioButton optTiempo;
    private javax.swing.JRadioButton optVelocidad;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
