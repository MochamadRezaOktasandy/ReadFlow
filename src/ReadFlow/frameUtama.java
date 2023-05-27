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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuPeminjamanBuku = new javax.swing.JMenuItem();
        menuPengembalianBuku = new javax.swing.JMenuItem();
        menuDaftarBuku = new javax.swing.JMenuItem();
        menuEditBuku = new javax.swing.JMenuItem();
        menuHapusBuku = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuSetting = new javax.swing.JMenuItem();
        menuRegistrasi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frame Utama");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(59, 171, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/First ReadFlow.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 260, 270));

        jMenu2.setText("Pegawai");

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

        menuDaftarBuku.setText("Pendaftaran Buku");
        menuDaftarBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarBukuActionPerformed(evt);
            }
        });
        jMenu2.add(menuDaftarBuku);

        menuEditBuku.setText("Edit Buku");
        menuEditBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditBukuActionPerformed(evt);
            }
        });
        jMenu2.add(menuEditBuku);

        menuHapusBuku.setText("Hapus Buku");
        menuHapusBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHapusBukuActionPerformed(evt);
            }
        });
        jMenu2.add(menuHapusBuku);

        jMenuBar1.add(jMenu2);

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuDaftarBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarBukuActionPerformed
        framePendaftaranBuku daftarBuku = new framePendaftaranBuku();
        daftarBuku.setVisible(true);
        daftarBuku.bEdit.setVisible(false);
        daftarBuku.bDelete.setVisible(false);
    }//GEN-LAST:event_menuDaftarBukuActionPerformed

    private void menuPeminjamanBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPeminjamanBukuActionPerformed
        framePinjamBuku pinjamBuku = new framePinjamBuku();
        pinjamBuku.setVisible(true);
        pinjamBuku.bKembalikan.setVisible(false);
        pinjamBuku.txtDenda.setVisible(false);
        pinjamBuku.bListKembalikan.setVisible(false);
        pinjamBuku.lblTotalDenda.setVisible(false);
    }//GEN-LAST:event_menuPeminjamanBukuActionPerformed

    private void menuSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSettingActionPerformed
        frameSetting setting = new frameSetting();
        setting.setVisible(true);
    }//GEN-LAST:event_menuSettingActionPerformed

    private void menuPengembalianBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPengembalianBukuActionPerformed
        // TODO add your handling code here:
        framePinjamBuku kembalikanBuku = new framePinjamBuku();
        kembalikanBuku.txtBukuYangDipinjam.setVisible(false);
        kembalikanBuku.bListTambah.setVisible(false);
        kembalikanBuku.bHitungBuku.setVisible(false);
        kembalikanBuku.bPinjam.setVisible(false);
        kembalikanBuku.jLabel4.setText("Form Pengembalian Buku");
        kembalikanBuku.setVisible(true);
    }//GEN-LAST:event_menuPengembalianBukuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        if(db.loggedInNamaUser.length() == 0)
        {
            frameLogin login = new frameLogin();
            login.setVisible(true);
            
            if(db.loggedInNamaUser.length() != 0)
            {
                JOptionPane.showMessageDialog(this, "Selamat Datang " + db.loggedInNamaUser);
                if(db.role.compareTo("Admin") == 0)
                {
                    jMenu2.setEnabled(false);
                    jMenu1.setEnabled(true);
                }
                else if(db.role.compareTo("Pegawai") == 0)
                {
                    jMenu2.setEnabled(true);
                    jMenu1.setEnabled(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Anda Gagal Login Sebagai Admin Atau Pegawai, Program Akan Dihentikan.");
                    System.exit(0);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Silahkan Login Terlebih Dahulu!");
                this.dispose();
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void menuRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrasiActionPerformed
        // TODO add your handling code here:
        frameRegistrasi registrasi = new frameRegistrasi();
        registrasi.setVisible(true);
        registrasi.cbRole.removeItemAt(2);
    }//GEN-LAST:event_menuRegistrasiActionPerformed

    private void menuEditBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditBukuActionPerformed
        // TODO add your handling code here:
        framePendaftaranBuku edit = new framePendaftaranBuku();
        edit.setVisible(true);
        edit.jLabel1.setText("EDIT BUKU");
        edit.bDaftarBuku.setVisible(false);
        edit.bDelete.setVisible(false);
    }//GEN-LAST:event_menuEditBukuActionPerformed

    private void menuHapusBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHapusBukuActionPerformed
        // TODO add your handling code here:
        framePendaftaranBuku edit = new framePendaftaranBuku();
        edit.setVisible(true);
        edit.jLabel1.setText("HAPUS BUKU");
        edit.bDaftarBuku.setVisible(false);
        edit.bEdit.setVisible(false);
    }//GEN-LAST:event_menuHapusBukuActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuDaftarBuku;
    private javax.swing.JMenuItem menuEditBuku;
    private javax.swing.JMenuItem menuHapusBuku;
    private javax.swing.JMenuItem menuPeminjamanBuku;
    private javax.swing.JMenuItem menuPengembalianBuku;
    private javax.swing.JMenuItem menuRegistrasi;
    private javax.swing.JMenuItem menuSetting;
    // End of variables declaration//GEN-END:variables
}
