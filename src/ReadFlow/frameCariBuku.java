package ReadFlow;

import com.mysql.jdbc.ResultSet;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import com.toedter.calendar.JDateChooser;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frameCariBuku extends frameMaster {

//    public String tanggal = "";
    public String bukuID = "";
    public String username = "";
    public String pilihBuku = "";
    public String lokasiBuku = "";
    
    public frameCariBuku() {
        initComponents();
        
        txtPilihBuku.setEnabled(false);
        txtLokasi.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPilihBuku = new javax.swing.JLabel();
        txtLokasi = new javax.swing.JTextField();
        lblJudulPeminjaman = new javax.swing.JLabel();
        lblLokasi = new javax.swing.JLabel();
        txtPilihBuku = new javax.swing.JTextField();
        bClose = new javax.swing.JButton();
        lblSampul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(59, 171, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPilihBuku.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblPilihBuku.setText("Pilih Buku (DOUBLE CLICK)");
        jPanel1.add(lblPilihBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 60, -1, -1));
        jPanel1.add(txtLokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 142, 228, -1));

        lblJudulPeminjaman.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        lblJudulPeminjaman.setText("KIOSK - Cari Buku");
        jPanel1.add(lblJudulPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 21, -1, -1));

        lblLokasi.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblLokasi.setText("Lokasi Buku");
        jPanel1.add(lblLokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 115, -1, -1));

        txtPilihBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPilihBukuMouseClicked(evt);
            }
        });
        jPanel1.add(txtPilihBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 81, 228, -1));

        bClose.setText("CLOSE");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });
        jPanel1.add(bClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 320, 228, 40));

        lblSampul.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lblSampul, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 242, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/buku.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 150, 190));

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel2.setText("Sampul Buku");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showSampul()
    {
        File file = new File("img/" + bukuID + ".jpg");
        BufferedImage bi;
        try {
            // display the image in a Jlabel
            bi = ImageIO.read(file);
            lblSampul.setIcon(new ImageIcon(bi));
        } 
        catch(IOException e) 
        {
           e.printStackTrace(); // todo: implement proper error handeling
        }
        this.pack();
    }
    
    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    private void txtPilihBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPilihBukuMouseClicked
        //https://stackoverflow.com/questions/8409347/mouse-event-with-double-click-in-java
        
        if (evt.getClickCount() == 2 && !evt.isConsumed()) 
        {
            //Cara dapetin nilai dari frame Lain
            framePemilihanBuku pilihBuku = new framePemilihanBuku();
            //pilihBuku.main(null); //JANGAN PANGGIL MAIN DISINI
            pilihBuku.setVisible(true); //Tampilkan JFRAME dengan ini
            bukuID = pilihBuku.getInfo()[0]; //Ambil Nilai Disini, getBukuID() ada di frame yang kita show
            lokasiBuku = pilihBuku.getInfo()[1];
            txtPilihBuku.setText(bukuID);
            txtLokasi.setText(lokasiBuku);
            
            showSampul();
        }
    }//GEN-LAST:event_txtPilihBukuMouseClicked

    
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
            java.util.logging.Logger.getLogger(frameCariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameCariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameCariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameCariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameCariBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJudulPeminjaman;
    private javax.swing.JLabel lblLokasi;
    private javax.swing.JLabel lblPilihBuku;
    private javax.swing.JLabel lblSampul;
    private javax.swing.JTextField txtLokasi;
    private javax.swing.JTextField txtPilihBuku;
    // End of variables declaration//GEN-END:variables
}
