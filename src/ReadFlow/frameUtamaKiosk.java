package ReadFlow;

public class frameUtamaKiosk extends javax.swing.JFrame {

    
    public frameUtamaKiosk() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bCariBuku = new javax.swing.JButton();
        bRegistrasi = new javax.swing.JButton();
        bFeedback = new javax.swing.JButton();
        lblFotoBuku = new javax.swing.JLabel();
        lblWelcomeToKiosk = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frame Utama Kiosk");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(59, 171, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bCariBuku.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        bCariBuku.setText("Cari Buku");
        bCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariBukuActionPerformed(evt);
            }
        });
        jPanel1.add(bCariBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 120, 30));
        bCariBuku.getAccessibleContext().setAccessibleParent(jPanel1);

        bRegistrasi.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        bRegistrasi.setText("Registrasi");
        bRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrasiActionPerformed(evt);
            }
        });
        jPanel1.add(bRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, 30));
        bRegistrasi.getAccessibleContext().setAccessibleParent(jPanel1);

        bFeedback.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        bFeedback.setText("Feedback");
        bFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFeedbackActionPerformed(evt);
            }
        });
        jPanel1.add(bFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 120, 30));
        bFeedback.getAccessibleContext().setAccessibleParent(jPanel1);

        lblFotoBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Foto Buku.png"))); // NOI18N
        jPanel1.add(lblFotoBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 283, 320));

        lblWelcomeToKiosk.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblWelcomeToKiosk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Proyek Baru (1).png"))); // NOI18N
        jPanel1.add(lblWelcomeToKiosk, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 270, 50));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Proyek Baru.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 240, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFeedbackActionPerformed
        frameFeedBack feedback = new frameFeedBack();
        feedback.setVisible(true);
    }//GEN-LAST:event_bFeedbackActionPerformed

    private void bRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrasiActionPerformed
        frameRegistrasi registrasi = new frameRegistrasi();
        registrasi.cbRole.setSelectedIndex(2);
        registrasi.cbRole.setEnabled(false);
        registrasi.setVisible(true);
    }//GEN-LAST:event_bRegistrasiActionPerformed

    private void bCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariBukuActionPerformed
        frameCariBuku cariBuku = new frameCariBuku();
        cariBuku.setVisible(true);
    }//GEN-LAST:event_bCariBukuActionPerformed

    
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
            java.util.logging.Logger.getLogger(frameUtamaKiosk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameUtamaKiosk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameUtamaKiosk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameUtamaKiosk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameUtamaKiosk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCariBuku;
    private javax.swing.JButton bFeedback;
    private javax.swing.JButton bRegistrasi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFotoBuku;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblWelcomeToKiosk;
    // End of variables declaration//GEN-END:variables
}
