package ReadFlow;

import com.mysql.jdbc.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class framePinjamBuku extends frameMaster {

    public Date hariIni = null;
    public Date tgl_actual_kembali = null;
    public String username = "";
    public String buku_id = "";
    private int jumlahBuku = 0;
    private final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    private int totalDenda = 0;
    
    DefaultTableModel model = null;
    
    
    public framePinjamBuku() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        bListTambah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        txtUsername = new javax.swing.JTextField();
        txtBukuID = new javax.swing.JTextField();
        bPinjam = new javax.swing.JButton();
        bClose = new javax.swing.JButton();
        bKembalikan = new javax.swing.JButton();
        txtDenda = new javax.swing.JTextField();
        txtBukuYangDipinjam = new javax.swing.JTextField();
        bHitungBuku = new javax.swing.JButton();
        bListKembalikan = new javax.swing.JButton();
        lblTotalDenda = new javax.swing.JLabel();
        lblTanggal = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
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

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "buku_id", "judul", "pengarang", "penerbit", "tahun"
            }
        ));
        tblBuku.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblBuku);
        tblBuku.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 157, 520, 275));

        bListTambah.setText("List Tambah");
        bListTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListTambahActionPerformed(evt);
            }
        });
        jPanel1.add(bListTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 122, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("form peminjaman buku");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 6, -1, -1));
        jPanel1.add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 57, 140, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 105, 140, -1));
        jPanel1.add(txtBukuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 81, 110, -1));

        bPinjam.setText("PINJAM");
        bPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPinjamActionPerformed(evt);
            }
        });
        jPanel1.add(bPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 467, 118, 35));

        bClose.setText("CLOSE");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });
        jPanel1.add(bClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 497, -1, 35));

        bKembalikan.setText("KEMBALIKAN");
        bKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKembalikanActionPerformed(evt);
            }
        });
        jPanel1.add(bKembalikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 467, -1, 35));
        jPanel1.add(txtDenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 473, 86, -1));
        jPanel1.add(txtBukuYangDipinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 47, 110, -1));

        bHitungBuku.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        bHitungBuku.setText("Hitung Buku");
        bHitungBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungBukuActionPerformed(evt);
            }
        });
        jPanel1.add(bHitungBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 49, -1, -1));

        bListKembalikan.setText("List Kembalikan");
        bListKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListKembalikanActionPerformed(evt);
            }
        });
        jPanel1.add(bListKembalikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        lblTotalDenda.setText("Total Denda");
        jPanel1.add(lblTotalDenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 450, -1, -1));

        lblTanggal.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblTanggal.setText("Tanggal");
        jPanel1.add(lblTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 35, 59, -1));

        lblUsername.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblUsername.setText("username");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 85, 65, -1));

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel1.setText("Total Buku");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 47, -1, -1));

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel2.setText("ID Buku");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 85, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahBaris(String bukuID)
    {
        try 
        {
            String sql = "SELECT * FROM buku WHERE buku_id = " + buku_id;
            ResultSet rs = (ResultSet) db.getRS(sql);
            if (rs.next())
            {
                model.addRow(new Object[]{
                rs.getString("buku_id"),
                rs.getString("judul"),
                rs.getString("pengarang"),
                rs.getString("penerbit"),
                rs.getString("tahun")});
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    private void bListTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListTambahActionPerformed
        buku_id = txtBukuID.getText();
        int n = model.getRowCount() + 1;
        if(jumlahBuku + n > 4)
        {
            JOptionPane.showMessageDialog(this, "Tidak Boleh Meminjam Buku Lebih Dari 4");
            return;
        }
        
        //CEK BUKUID TIDAK ADA DI TABLE. MENGHINDARI PEGAWAI KLIK 2 KALI
        if (cekBukuAdaDiTable(buku_id))
        {
            JOptionPane.showMessageDialog(this, "Buku ID Sudah Ada DiTable");
            return;
        }
        tambahBaris(buku_id);
        
    }//GEN-LAST:event_bListTambahActionPerformed

    private boolean cekBukuAdaDiTable(String bukuID)
    {
        boolean hasil = false;
        int n = model.getRowCount();
        if(n == 0)
        {
            return false;
        }
        
        for(int i = 0; i < n; i++)
        {
            String bukuIdDiTable =  model.getValueAt(i, 0).toString();
            if (bukuID.compareTo(bukuIdDiTable) == 0)
            {
                hasil = true;
                break;
            }
        }
        return hasil;
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hariIni = new Date();
        txtTanggal.setDate(hariIni);// Mengatur tanggal hari ini
        txtTanggal.setEnabled(false);//Menonaktifkan jDateChooser agar tidak bisa diklik

        model = (DefaultTableModel) tblBuku.getModel();
        model.setRowCount(0); //Hilangkan Baris Sebelumnya Di dalam Table
        
        txtBukuYangDipinjam.setEditable(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void bPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPinjamActionPerformed
        
        if(model.getRowCount() < 1)
        {
            JOptionPane.showMessageDialog(this, "Pilih Buku Untuk Dipinjam!");
            return;
        }
        
        try 
        {
            username = txtUsername.getText();
            
            for (int i = 0; i < model.getRowCount(); i++)
            {
                buku_id = tblBuku.getModel().getValueAt(i, 0).toString();
                
                //LAMA PINJAM YANG DIPERBOLEHKAN. DIAMBIL DARI SETTING DATABASE
                int lamaPinjam = Integer.parseInt(db.getSettingValue("LAMA_PINJAM")); 
                
                Calendar cal = Calendar.getInstance();
                cal.setTime(hariIni);
                cal.add(Calendar.DATE, lamaPinjam); 
                Date tglKembali = cal.getTime();
                
                String strTglKembali = df.format(tglKembali); 
                
                String strHariIni = df.format(hariIni);
                
                // Mengecek apakah username ada di database
                String sql = "SELECT username FROM user WHERE username = '" + username + "'";
                ResultSet rs = (ResultSet) db.getRS(sql);
                if (rs.next())
                {
                    sql = "INSERT INTO pinjam(tgl_pinjam, tgl_kembali, username, buku_id) "
                        + "VALUES('" + strHariIni + "' , '" + strTglKembali + "' , '" + username + "' , '" + buku_id + "')";
                    boolean succes = db.Execute(sql);
                    if (succes) 
                    {
                        String msg = "Buku ID " + buku_id + " Berhasil Dipinjam";
                        JOptionPane.showMessageDialog(this, msg);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Username Tidak Terdaftar!");
                    return;
                }
                
            }
                        
        } 
        catch (Exception e){}
        
    }//GEN-LAST:event_bPinjamActionPerformed

    private int hitungDenda(Date tglKembali) //tglKembali adalah tanggal harusnya kembali
    {
        int denda = 0;
                
        try 
        {
            //dapatkan denda perhari
            int dendaPerHari = Integer.parseInt(db.getSettingValue("DENDA_1HARI"));
            long selisih =  hariIni.getTime() - tglKembali.getTime();
             if(selisih < 0)
             {
                denda = 0;
                return denda;
             }
                
            
            //https://www.ardhi.web.id/2019/05/java-menghitung-selisih-tanggal.html
//            long diffSeconds = diff / 1000;
//            long diffMinutes = diff / (60 * 1000);
//            long diffHours = diff / (60 * 60 * 1000);
            selisih = selisih / (24 * 60 * 60 * 1000);
//            long diffMonths = (diff / (24 * 60 * 60 * 1000)) / 30;
//            long diffYears =  ((diff / (24 * 60 * 60 * 1000)) / 30) / 12;
            
            
            denda = (int) (selisih * dendaPerHari);
           
            
            //Dapatkan maksimal Denda
            int maksDenda = Integer.parseInt(db.getSettingValue("DENDA_MAKS"));
            if (denda > maksDenda)
                denda = maksDenda;
        } 
        catch (Exception e) {
        }
        return denda;
    }
    
    private void bKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembalikanActionPerformed
        if(model.getRowCount() < 1)
        {
            JOptionPane.showMessageDialog(this, "Masukkan Buku Untuk Dikembalikan!");
            return;
        }
        
        try 
        {
            username = txtUsername.getText();
            
            // Mengecek apakah username ada di database
            String sql = "SELECT username FROM user WHERE username = '" + username + "'";
            ResultSet rs = (ResultSet) db.getRS(sql);
            if (!rs.next())
            {
                JOptionPane.showMessageDialog(this, "Username Tidak Terdaftar!");
                return;
            }
            
            for (int i = 0; i < model.getRowCount(); i++)
            {
                buku_id = tblBuku.getModel().getValueAt(i, 0).toString();
                
                //Dapatkan pinjam_id
                sql = "SELECT pinjam_id, tgl_kembali FROM pinjam WHERE buku_id = '" + buku_id + "' AND username = '" + username + "' AND tgl_actual_kembali IS NULL";
                rs = (ResultSet) db.getRS(sql);
                
                if (rs.next())
                {
                    int pinjam_id = rs.getInt("pinjam_id");
                    Date tglKembali = rs.getDate("tgl_kembali");
                    
                    int denda = hitungDenda(tglKembali);
                    
                    sql = "UPDATE pinjam SET tgl_actual_kembali = '" + df.format(hariIni) + "', denda = " + denda + " WHERE pinjam_id = " + pinjam_id + "";
                    boolean succes = db.Execute(sql);
                    if (succes) 
                    {
                        String msg = "Pinjam ID " + pinjam_id + " Berhasil Dikembalikan";
                        JOptionPane.showMessageDialog(this, msg);
                    }
                }
            }
            
            txtDenda.setText(Integer.toString(this.totalDenda));
                        
        } 
        catch (Exception e){}
    }//GEN-LAST:event_bKembalikanActionPerformed

    private void bHitungBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungBukuActionPerformed
        try 
        {
            String sql = "SELECT COUNT(buku_id) AS jml_buku FROM pinjam WHERE username = '" + txtUsername.getText() + "' AND tgl_actual_kembali is NULL";
            ResultSet rs = (ResultSet) db.getRS(sql);
            rs.next();
            this.jumlahBuku = rs.getInt("jml_buku");
            txtBukuYangDipinjam.setText((Integer.toString(jumlahBuku)));
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_bHitungBukuActionPerformed

    private void bListKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListKembalikanActionPerformed
        buku_id = txtBukuID.getText();
        username = txtUsername.getText();
        
        try 
        {
            String sql = "SELECT pinjam_id, tgl_kembali FROM pinjam WHERE username = '" + username + "' AND buku_id = " + buku_id + " AND tgl_actual_kembali is NULL";
            ResultSet rs = (ResultSet) db.getRS(sql);
            if (rs.next())
            {
                int pinjamId = rs.getInt("pinjam_id");
                tambahBaris(buku_id);
                
                //Hitung Denda
                Date tglKembali = rs.getDate("tgl_kembali");
                int denda = hitungDenda(tglKembali);
                this.totalDenda += denda;
                txtDenda.setText(Integer.toString(totalDenda));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Username Tersebut Tidak Meminjam Buku Yang Di input!");
            }
        } 
        catch (Exception e) {
        }
        
        
        
        
    }//GEN-LAST:event_bListKembalikanActionPerformed

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    
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
            java.util.logging.Logger.getLogger(framePinjamBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePinjamBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePinjamBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePinjamBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePinjamBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    public javax.swing.JButton bHitungBuku;
    public javax.swing.JButton bKembalikan;
    public javax.swing.JButton bListKembalikan;
    public javax.swing.JButton bListTambah;
    public javax.swing.JButton bPinjam;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTanggal;
    public javax.swing.JLabel lblTotalDenda;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtBukuID;
    public javax.swing.JTextField txtBukuYangDipinjam;
    public javax.swing.JTextField txtDenda;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
