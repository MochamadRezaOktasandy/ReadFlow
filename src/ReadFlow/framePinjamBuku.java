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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        bListTambah.setText("List Tambah");
        bListTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListTambahActionPerformed(evt);
            }
        });

        jLabel4.setText("form peminjaman buku");

        bPinjam.setText("PINJAM");
        bPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPinjamActionPerformed(evt);
            }
        });

        bClose.setText("CLOSE");

        bKembalikan.setText("KEMBALIKAN");
        bKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKembalikanActionPerformed(evt);
            }
        });

        bHitungBuku.setText("Hitung Buku");
        bHitungBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungBukuActionPerformed(evt);
            }
        });

        bListKembalikan.setText("List Kembalikan");
        bListKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListKembalikanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel4)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bKembalikan)
                .addGap(18, 18, 18)
                .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bClose)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bListTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bListKembalikan)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBukuID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBukuYangDipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bHitungBuku)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBukuYangDipinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bHitungBuku))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBukuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bListTambah)
                            .addComponent(bListKembalikan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bKembalikan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(bClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
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
        // TODO add your handling code here:
        hariIni = new Date();
        txtTanggal.setDate(hariIni);// Mengatur tanggal hari ini
        txtTanggal.setEnabled(false);//Menonaktifkan jDateChooser agar tidak bisa diklik

        model = (DefaultTableModel) tblBuku.getModel();
        model.setRowCount(0); //Hilangkan Baris Sebelumnya Di dalam Table
        
        txtBukuYangDipinjam.setEditable(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void bPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPinjamActionPerformed
        // TODO add your handling code here:
        
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

    private int hitungDenda(Date tglKembali)
    {
        int denda = 0;
                
        try 
        {
            //dapatkan denda perhari
            int dendaPerHari = Integer.parseInt(db.getSettingValue("DENDA_1HARI"));
            long selisih = Math.abs(tglKembali.getTime() - hariIni.getTime());
            
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
        // TODO add your handling code here:
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
            
            this.totalDenda = 0;
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
                    
                    //Hitung Denda
                    int denda = hitungDenda(tglKembali);
                    this.totalDenda += denda;
                    
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
        // TODO add your handling code here:
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
        // TODO add your handling code here:
        buku_id = txtBukuID.getText();
        username = txtUsername.getText();
        
        try 
        {
            String sql = "SELECT pinjam_id FROM pinjam WHERE username = '" + username + "' AND buku_id = " + buku_id + " AND tgl_actual_kembali is NULL";
            ResultSet rs = (ResultSet) db.getRS(sql);
            if (rs.next())
            {
                int pinjamId = rs.getInt("pinjam_id");
                tambahBaris(buku_id);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Username Tersebut Tidak Meminjam Buku Yang Di input!");
            }
        } 
        catch (Exception e) {
        }
        
        
        
        
    }//GEN-LAST:event_bListKembalikanActionPerformed

    
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
    public javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtBukuID;
    public javax.swing.JTextField txtBukuYangDipinjam;
    public javax.swing.JTextField txtDenda;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
