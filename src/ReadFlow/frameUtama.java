package ReadFlow;

import javax.swing.JOptionPane;


public class frameUtama extends frameMaster {

    
    public frameUtama() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSetting = new javax.swing.JMenuItem();
        menuRegistrasi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuDaftarBuku = new javax.swing.JMenuItem();
        menuPeminjamanBuku = new javax.swing.JMenuItem();
        menuPengembalianBuku = new javax.swing.JMenuItem();
        menuDaftarPeminjam = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jMenu1.setText("Admin");

        menuSetting.setText("Atur Setting");
        menuSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSettingActionPerformed(evt);
            }
        });
        jMenu1.add(menuSetting);

        menuRegistrasi.setText("Registrasi");
        menuRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrasiActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistrasi);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pegawai");

        menuDaftarBuku.setText("Daftar Buku");
        menuDaftarBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarBukuActionPerformed(evt);
            }
        });
        jMenu2.add(menuDaftarBuku);

        menuPeminjamanBuku.setText("Peminjaman Buku");
        menuPeminjamanBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPeminjamanBukuActionPerformed(evt);
            }
        });
        jMenu2.add(menuPeminjamanBuku);

        menuPengembalianBuku.setText("Pengembalian Buku");
        menuPengembalianBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPengembalianBukuActionPerformed(evt);
            }
        });
        jMenu2.add(menuPengembalianBuku);

        menuDaftarPeminjam.setText("Daftar Peminjam");
        menuDaftarPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarPeminjamActionPerformed(evt);
            }
        });
        jMenu2.add(menuDaftarPeminjam);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuDaftarBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarBukuActionPerformed
        framePendaftaranBuku daftarBuku = new framePendaftaranBuku();
        daftarBuku.main(null);
        this.setVisible(false);
    }//GEN-LAST:event_menuDaftarBukuActionPerformed

    private void menuPeminjamanBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPeminjamanBukuActionPerformed
        framePinjamBuku pinjamBuku = new framePinjamBuku();
        pinjamBuku.bKembalikan.setVisible(false);
        pinjamBuku.txtDenda.setVisible(false);
        pinjamBuku.bListKembalikan.setVisible(false);
        pinjamBuku.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuPeminjamanBukuActionPerformed

    private void menuDaftarPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarPeminjamActionPerformed
        frameRegistrasi register = new frameRegistrasi();
        register.main(null);
        this.setVisible(false);
    }//GEN-LAST:event_menuDaftarPeminjamActionPerformed

    private void menuSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSettingActionPerformed
        frameSetting setting = new frameSetting();
        setting.main(null);
        this.setVisible(false);
    }//GEN-LAST:event_menuSettingActionPerformed

    private void menuPengembalianBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPengembalianBukuActionPerformed
        // TODO add your handling code here:
        framePinjamBuku kembalikanBuku = new framePinjamBuku();
        kembalikanBuku.txtBukuYangDipinjam.setVisible(false);
        kembalikanBuku.bListTambah.setVisible(false);
        kembalikanBuku.bHitungBuku.setVisible(false);
        kembalikanBuku.bPinjam.setVisible(false);
        kembalikanBuku.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuPengembalianBukuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        if(db.loggedInNamaUser.length() == 0)
        {
            frameLogin login = new frameLogin();
            login.setVisible(true);
            
            if(db.loggedInNamaUser.length() != 0)
            {
                JOptionPane.showMessageDialog(this, "Anda Login Sebagai " + db.loggedInNamaUser);
                
                if(db.role.compareTo("Admin") == 0)
                {
                    jMenu2.setEnabled(false);
                    jMenu1.setEnabled(true);
                }
                else if(db.role.compareTo("Pegawai") == 0)
                {
                    jMenu1.setEnabled(false);
                    jMenu2.setEnabled(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Anda Gagal Login Sebagai Admin Atau Pegawai, Program Akan Dihentikan.");
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void menuRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrasiActionPerformed
        // TODO add your handling code here:
        frameRegistrasi registrasi = new frameRegistrasi();
        registrasi.cbRole.removeItemAt(2);
        registrasi.setVisible(true);
    }//GEN-LAST:event_menuRegistrasiActionPerformed

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
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuDaftarBuku;
    private javax.swing.JMenuItem menuDaftarPeminjam;
    private javax.swing.JMenuItem menuPeminjamanBuku;
    private javax.swing.JMenuItem menuPengembalianBuku;
    private javax.swing.JMenuItem menuRegistrasi;
    private javax.swing.JMenuItem menuSetting;
    // End of variables declaration//GEN-END:variables
}
