/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.newpackage;

/**
 *
 * @author jpedr
 */
public class TransformarMetro extends javax.swing.JFrame {

    /**
     * Creates new form TransformarMetro
     */
    public TransformarMetro() {
        initComponents();
    }
    double metro, resultado, KM, CM, DAM, HM;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMetros = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        opKM = new javax.swing.JCheckBox();
        opHM = new javax.swing.JCheckBox();
        opDAM = new javax.swing.JCheckBox();
        opCM = new javax.swing.JCheckBox();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DIGITE OS METROS:");

        jLabel2.setText("DESEJA TRANSFORMAR EM: ");

        opKM.setText("KM");
        opKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opKMActionPerformed(evt);
            }
        });

        opHM.setText("HM");
        opHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opHMActionPerformed(evt);
            }
        });

        opDAM.setText("DAM");
        opDAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDAMActionPerformed(evt);
            }
        });

        opCM.setText("CM");
        opCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCMActionPerformed(evt);
            }
        });

        btnCalcular.setText("Transformar");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCalcular)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opHM)
                                    .addComponent(opKM)
                                    .addComponent(opDAM)
                                    .addComponent(opCM))))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(opKM)
                    .addComponent(jLabel3)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opHM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opDAM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opCM)
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opKMActionPerformed
       opKM.setSelected(true);
       opHM.setSelected(false);
       opDAM.setSelected(false);
       opCM.setSelected(false);
    }//GEN-LAST:event_opKMActionPerformed

    private void opHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opHMActionPerformed
       opKM.setSelected(false);
       opHM.setSelected(true);
       opDAM.setSelected(false);
       opCM.setSelected(false);
       
    }//GEN-LAST:event_opHMActionPerformed

    private void opDAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDAMActionPerformed
       opKM.setSelected(false);
       opHM.setSelected(false);
       opDAM.setSelected(true);
       opCM.setSelected(false);
    }//GEN-LAST:event_opDAMActionPerformed

    private void opCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCMActionPerformed
       opKM.setSelected(false);
       opHM.setSelected(false);
       opDAM.setSelected(false);
       opCM.setSelected(true);
    }//GEN-LAST:event_opCMActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        metro = Double.parseDouble(lblMetros.getText());
        
        if(opKM.isSelected()){
            KM = (metro/1000);
           lblResultado.setText(String.valueOf(KM));
        }else if (opHM.isSelected()){
            HM = (metro/100);
           lblResultado.setText(String.valueOf(HM));    
    }else if(opDAM.isSelected()){
           DAM = (metro/10);
           lblResultado.setText(String.valueOf(DAM));
    }else if(opCM.isSelected()){ 
        CM = (metro*100);
        lblResultado.setText(String.valueOf(CM));
    }//GEN-LAST:event_btnCalcularActionPerformed
    }
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
            java.util.logging.Logger.getLogger(TransformarMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransformarMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransformarMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransformarMetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransformarMetro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lblMetros;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JCheckBox opCM;
    private javax.swing.JCheckBox opDAM;
    private javax.swing.JCheckBox opHM;
    private javax.swing.JCheckBox opKM;
    // End of variables declaration//GEN-END:variables
}
