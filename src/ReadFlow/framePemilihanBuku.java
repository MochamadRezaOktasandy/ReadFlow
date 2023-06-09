package ReadFlow;

import com.mysql.jdbc.ResultSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class framePemilihanBuku extends JDialog {

    protected DB db = new DB();
    
    private String valBukuID = "";
    private String valLokasi = "";
    
    public framePemilihanBuku() {
        initComponents();
        
        setModal(true);
        
        showTable("");
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCariBuku = new javax.swing.JTextField();
        lblJudul = new javax.swing.JLabel();
        lblCariBuku = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        bPilih = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 171, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCariBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariBukuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariBukuKeyTyped(evt);
            }
        });
        jPanel1.add(txtCariBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 63, 159, -1));

        lblJudul.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblJudul.setText("Pemilihan Buku");
        jPanel1.add(lblJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 6, -1, -1));

        lblCariBuku.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblCariBuku.setText("Cari Buku");
        jPanel1.add(lblCariBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, -1, -1));

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "buku_id", "Nama Buku", "Pengarang", "Penerbit", "Tahun", "Kategori", "Lokasi"
            }
        ));
        tblBuku.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblBuku);
        tblBuku.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblBuku.getColumnModel().getColumnCount() > 0) {
            tblBuku.getColumnModel().getColumn(0).setResizable(false);
            tblBuku.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 592, 210));

        bPilih.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        bPilih.setText("PILIH");
        bPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPilihActionPerformed(evt);
            }
        });
        jPanel1.add(bPilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        bCancel.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        bCancel.setText("CANCEL");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });
        jPanel1.add(bCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/buku.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 140, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Proyek Baru.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 230, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCariBukuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariBukuKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCariBukuKeyPressed

    private void txtCariBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariBukuKeyTyped
        // TODO add your handling code here:
        String cariBuku = txtCariBuku.getText();
        showTable(cariBuku);
        
    }//GEN-LAST:event_txtCariBukuKeyTyped

    private void bPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPilihActionPerformed
        //https://stackoverflow.com/questions/29345792/java-jtable-getting-the-data-of-the-selected-row
        int baris =  tblBuku.getSelectedRow();
        valBukuID = String.valueOf(tblBuku.getValueAt(baris, 0));
        valLokasi = String.valueOf(tblBuku.getValueAt(baris, 6));
        this.dispose();
    }//GEN-LAST:event_bPilihActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    public String[] getInfo()
    {
        String hasil[] =  {valBukuID, valLokasi};
        return hasil;
    }
    
    private void showTable(String s)
    {
        try 
        {
            DefaultTableModel model = (DefaultTableModel) tblBuku.getModel();
            model.setRowCount(0); //Hilangkan Baris Sebelumnya Di dalam Table
            
            String sql = "SELECT * FROM buku WHERE judul LIKE '%"+s+"%'"; //Ambil Semua Record Buku Yang Judulnya ...s...
            ResultSet rs = (ResultSet) db.getRS(sql);
            while (rs.next())
            {
                String id = rs.getString("buku_id");
                String judul = rs.getString("judul");
                String pengarang = rs.getString("pengarang");
                String penerbit = rs.getString("penerbit");
                String tahun = rs.getString("tahun");
                String kategori = rs.getString("kategori");
                String lokasi = rs.getString("lokasi");
                model.addRow(new Object[]{id, judul, pengarang, penerbit, tahun, kategori, lokasi});
            }
        } 
        catch (Exception e) 
        {
        }
    }
    
   
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
            java.util.logging.Logger.getLogger(framePemilihanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePemilihanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePemilihanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePemilihanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePemilihanBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bPilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCariBuku;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtCariBuku;
    // End of variables declaration//GEN-END:variables
}
