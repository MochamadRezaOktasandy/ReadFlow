package ReadFlow;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class frameFeedBack extends frameMaster {

    private final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    
    public frameFeedBack() {
        initComponents();
        
        lblNamaUser.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNamaUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFeedBack = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bFeedBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFeedBack = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(59, 171, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNamaUser.setText("NAMA");
        jPanel1.add(lblNamaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 280, 20));

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jLabel2.setText("Masukan pendapat dan masukan anda dibawah sini!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 289, -1));

        lblFeedBack.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblFeedBack.setText("FeedBack");
        jPanel1.add(lblFeedBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 202, 49));

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jLabel3.setText("Setiap feedback Anda sangat berharga bagi kami. Terima kasih banyak");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        bFeedBack.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        bFeedBack.setText("Send");
        bFeedBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFeedBackActionPerformed(evt);
            }
        });
        jPanel1.add(bFeedBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 335, 136, 35));

        txtFeedBack.setColumns(20);
        txtFeedBack.setRows(5);
        jScrollPane1.setViewportView(txtFeedBack);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 115, 656, 177));

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel1.setText(" Kami sangat menghargai pendapat dan masukan Anda tentang apa pun yang ingin Anda bagikan. ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 26));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/RF2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 100, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bFeedBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFeedBackActionPerformed
        // TODO add your handling code here:
        Date tanggal = new Date();
        String feedback = txtFeedBack.getText();
        try 
        {
            String sql = "INSERT INTO feedback (tanggal, username, feedback) VALUES('" + df.format(tanggal)+ "' , '" + db.loggedInUser + "' , '" + feedback + "')";
            boolean success = db.Execute(sql);
            if(success)
            {
                JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Memberikan Feedback (:");
                
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Terdapat Kesalahan Saat Menyimpan Feedback");
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_bFeedBackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        if(db.loggedInNamaUser.length() == 0)
        {
            frameLogin login = new frameLogin();
            login.setVisible(true);
            
            if(db.loggedInNamaUser.length() != 0)
            {
                JOptionPane.showMessageDialog(this, "Selamat Datang " + db.loggedInNamaUser);
                lblNamaUser.setText("Halo, "+ db.loggedInNamaUser);
                lblNamaUser.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Silahkan Login Terlebih Dahulu!");
                this.dispose();
            }
        }
    }//GEN-LAST:event_formWindowOpened

    
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
            java.util.logging.Logger.getLogger(frameFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameFeedBack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFeedBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFeedBack;
    private javax.swing.JLabel lblNamaUser;
    private javax.swing.JTextArea txtFeedBack;
    // End of variables declaration//GEN-END:variables
}
