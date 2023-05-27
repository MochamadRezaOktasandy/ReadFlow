package ReadFlow;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.JOptionPane;

import org.apache.commons.io.*;
import java.io.File;
import java.io.IOException;

public class framePendaftaranBuku extends frameMaster {
    
    private String nama_file = "";
            
    public String judul = "";
    public String pengarang = "";
    public String penerbit = "";
    public String tahun = "";
    public String kategori = "";
    public String lokasi = "";
    
    
    public framePendaftaranBuku() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblJudul = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        lblPengarang = new javax.swing.JLabel();
        txtPengarang = new javax.swing.JTextField();
        lblPenerbit = new javax.swing.JLabel();
        txtPenerbit = new javax.swing.JTextField();
        lblTahun = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        lblKategori = new javax.swing.JLabel();
        lblLokasi = new javax.swing.JLabel();
        txtLokasi = new javax.swing.JTextField();
        lblSampul = new javax.swing.JLabel();
        bDaftarBuku = new javax.swing.JButton();
        cbKategori = new javax.swing.JComboBox<>();
        bUpload = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setText("Pendaftaran Buku");

        lblJudul.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblJudul.setText("Judul");

        lblPengarang.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblPengarang.setText("pengarang");

        lblPenerbit.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblPenerbit.setText("Penerbit");

        lblTahun.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblTahun.setText("Tahun");

        lblKategori.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblKategori.setText("Kategori");

        lblLokasi.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblLokasi.setText("Lokasi");

        lblSampul.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N

        bDaftarBuku.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 13)); // NOI18N
        bDaftarBuku.setText("Daftar");
        bDaftarBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDaftarBukuActionPerformed(evt);
            }
        });

        cbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bUpload.setText("UPLOAD");
        bUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUploadActionPerformed(evt);
            }
        });

        jButton1.setText("CLOSE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblKategori)
                    .addComponent(lblLokasi)
                    .addComponent(txtTahun, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(lblTahun)
                    .addComponent(txtPenerbit)
                    .addComponent(lblPenerbit)
                    .addComponent(txtPengarang)
                    .addComponent(txtJudul)
                    .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPengarang)
                    .addComponent(txtLokasi)
                    .addComponent(cbKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bUpload)
                            .addComponent(lblSampul, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(81, 81, 81))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(bDaftarBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSampul, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bUpload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPengarang)
                        .addGap(94, 94, 94)
                        .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(lblPenerbit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTahun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblKategori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLokasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bDaftarBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void bUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUploadActionPerformed
        //https://stackoverflow.com/questions/13516939/how-to-upload-and-display-image-in-jframe-using-jfilechooser
        
        JFileChooser filechooser = new JFileChooser();
        filechooser.setDialogTitle("Choose Your File");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        // below code selects the file 
        int returnval = filechooser.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File file = filechooser.getSelectedFile();
            BufferedImage bi;
            try {
                // display the image in a Jlabel
                bi = ImageIO.read(file);
                lblSampul.setIcon(new ImageIcon(bi));
                
                String dir = filechooser.getCurrentDirectory().getAbsolutePath();
                nama_file = dir + "\\" + filechooser.getSelectedFile().getName();
                
            } 
            catch(IOException e) 
            {
               e.printStackTrace(); // todo: implement proper error handeling
            }
            this.pack();
        }

    }//GEN-LAST:event_bUploadActionPerformed

    private void bDaftarBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDaftarBukuActionPerformed
        judul = txtJudul.getText();
        pengarang = txtPengarang.getText();
        penerbit = txtPenerbit.getText();
        tahun = txtTahun.getText();
        kategori = cbKategori.getSelectedItem().toString();
        lokasi = txtLokasi.getText();
        
        try 
        {
            String sql = "INSERT INTO buku(judul, pengarang, penerbit, tahun, kategori, lokasi)";
            sql += " values(?,?,?,?,?,?)";
            PreparedStatement stmt = (PreparedStatement) db.conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1,judul);
            stmt.setString(2,pengarang);
            stmt.setString(3, penerbit);
            stmt.setString(4,tahun);
            stmt.setString(5,kategori);
            stmt.setString(6,lokasi);
            stmt.executeUpdate();
            ResultSet rs = (ResultSet) stmt.getGeneratedKeys();
            rs.next();
            String buku_id = rs.getString(1);
            
            //UPDATE RECORD YANG BARU SAJA DI MASUKKAN
            String sampul = buku_id + ".jpg";
            
            try 
            {
                File source = new File(nama_file);
                File dest = new File("img/"+ sampul);
                FileUtils.copyFile(source, dest);
            }
            catch(Exception e)
            {
                
            }
            
            sql = "UPDATE buku SET sampul = '" + sampul + "' WHERE buku_id = " + buku_id;
            boolean success = db.Execute(sql);
            if (success)
            {
                JOptionPane.showMessageDialog(this, "Buku Berhasil Di Daftarkan");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Buku Gagal Di Daftarkan");
            }
            
        } 
        catch (Exception e) 
        {
            
        }
        
    }//GEN-LAST:event_bDaftarBukuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //https://stackoverflow.com/questions/17887927/adding-items-to-a-jcombobox
        String sql = "SELECT DISTINCT kategori FROM buku WHERE kategori IS NOT NULL";
        ResultSet rs = (ResultSet) db.getRS(sql);
        try 
        {
            cbKategori.removeAllItems();
            while (rs.next()) 
            {
                String kategori = rs.getString("kategori");
                cbKategori.addItem(kategori);
            }
        } 
        catch (Exception e) {
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
            java.util.logging.Logger.getLogger(framePendaftaranBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePendaftaranBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePendaftaranBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePendaftaranBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePendaftaranBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDaftarBuku;
    private javax.swing.JButton bUpload;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblLokasi;
    private javax.swing.JLabel lblPenerbit;
    private javax.swing.JLabel lblPengarang;
    private javax.swing.JLabel lblSampul;
    private javax.swing.JLabel lblTahun;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtLokasi;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
