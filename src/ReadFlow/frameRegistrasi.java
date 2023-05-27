package ReadFlow;

import com.mysql.jdbc.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class frameRegistrasi extends frameMaster {

    public String username = "";
    public String nama = "";
    public String noTelp = "";
    public String tanggal = "";
    public String alamat = "";
    public String role = "";
    public String password = "";
    public String conPassword = "";
    
    public frameRegistrasi() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblJudul1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblNamaLengkap = new javax.swing.JLabel();
        txtNamaLengkap = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtConfirmPassword1 = new javax.swing.JPasswordField();
        cbCFShowPassword1 = new javax.swing.JCheckBox();
        bRegister = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblNoTelp = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();
        lblTanggal = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        cbRole = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        lblJudul1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblJudul1.setText("LIBRARY SOZ");

        lblUsername.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblUsername.setText("Username");

        lblNamaLengkap.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblNamaLengkap.setText("Nama Lengkap");

        lblPassword.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblPassword.setText("Password");

        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel1.setText("Confirm Password");

        cbCFShowPassword1.setText("Show Password");
        cbCFShowPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCFShowPassword1ActionPerformed(evt);
            }
        });

        bRegister.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        bRegister.setText("Register");
        bRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        lblLogin.setText("you already have an account? Login now!");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        lblNoTelp.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblNoTelp.setText("Nomor Telepon");

        lblTanggal.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblTanggal.setText("Tanggal Lahir");

        lblAlamat.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblAlamat.setText("Alamat");

        lblRole.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblRole.setText("Role");

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pegawai", "User" }));
        cbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(bRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(lblLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(lblJudul1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTanggal)
                                .addComponent(lblNoTelp)
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNamaLengkap)
                                .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblAlamat)
                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPassword)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                        .addComponent(cbShowPassword)
                        .addComponent(jLabel1)
                        .addComponent(txtConfirmPassword1)
                        .addComponent(cbCFShowPassword1)
                        .addComponent(lblRole))
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJudul1)
                        .addGap(18, 18, 18)
                        .addComponent(lblNamaLengkap)
                        .addGap(1, 1, 1)
                        .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNoTelp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAlamat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbShowPassword)
                        .addGap(30, 30, 30)
                        .addComponent(txtConfirmPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbCFShowPassword1)
                        .addGap(8, 8, 8)
                        .addComponent(lblRole)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addComponent(bRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
        // TODO add your handling code here:
        Date date = jDateChooser1.getDate();
        if (date != null) 
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            tanggal = df.format(date);
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Tanggal tidak boleh kosong!", "Coba Lagi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        username = txtUsername.getText();
        nama = txtNamaLengkap.getText();
        noTelp = txtNoTelp.getText();
        alamat = txtAlamat.getText();
        password = new String(txtPassword.getPassword());
        conPassword =  new String(txtConfirmPassword1.getPassword());
        role = cbRole.getSelectedItem().toString();
        
        if (username.isEmpty() || password.isEmpty() || nama.isEmpty() || noTelp.isEmpty() || alamat.isEmpty())
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong!", "Message", JOptionPane.INFORMATION_MESSAGE);
            
        else if(password.length() < 8)
            JOptionPane.showMessageDialog(this, "Password Harus Memiliki Minimal 8 Karakter", "Message", JOptionPane.INFORMATION_MESSAGE);    
        
        else if (!password.equals(conPassword))
            JOptionPane.showMessageDialog(this, "Password Tidak Sama!", "Message", JOptionPane.INFORMATION_MESSAGE);
        
        else
        {
            //cek username sudah dipakai?
           try 
           {
                String checkUsernameSql = "SELECT username FROM user WHERE username = '" + username + "'";
                ResultSet rs = (ResultSet) db.getRS(checkUsernameSql);
                if (rs.last()) 
                {
                    int rows = rs.getRow();
                    if (rows == 1) 
                    {
                        JOptionPane.showMessageDialog(this, "Username ini sudah digunakan!", "Warning", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                String insertUserSql = "INSERT INTO user(username, password, role) VALUES('" + username + "', '" + hashPassword(password) + "', '" + role + "')";
                boolean userSuccess = db.Execute(insertUserSql);

                String insertMemberSql = "INSERT INTO member(username, nama, tgl_lahir, no_telp, alamat) VALUES('" + username + "', '" + nama + "', '" + tanggal + "' , '" + noTelp + "' , '" + alamat + "')";
                boolean memberSuccess = db.Execute(insertMemberSql);

                if (userSuccess && memberSuccess) 
                {
                    JOptionPane.showMessageDialog(this, "Register Berhasil!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    frameLogin login = new frameLogin();
                    login.main(null);
                    this.dispose();
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this, "Register Gagal!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                }
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_bRegisterActionPerformed

    public String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hashedBytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));

            StringBuilder stringBuilder = new StringBuilder();
            for (byte hashedByte : hashedBytes) {
                stringBuilder.append(String.format("%02x", hashedByte));
            }

            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        // TODO add your handling code here:
        if (cbShowPassword.isSelected()) 
        {
            txtPassword.setEchoChar((char) 0); // Mengatur karakter echo ke 0 untuk menampilkan teks biasa
        } 
        else 
        {
            txtPassword.setEchoChar('*'); // Mengatur karakter echo ke '*' untuk menyembunyikan teks
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void cbCFShowPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCFShowPassword1ActionPerformed
        // TODO add your handling code here:
        if (cbCFShowPassword1.isSelected()) 
        {
            txtConfirmPassword1.setEchoChar((char) 0); // Mengatur karakter echo ke 0 untuk menampilkan teks biasa
        } 
        else 
        {
            txtConfirmPassword1.setEchoChar('*'); // Mengatur karakter echo ke '*' untuk menyembunyikan teks
        }
    }//GEN-LAST:event_cbCFShowPassword1ActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // TODO add your handling code here:
        frameLogin login = new frameLogin();
        login.main(null);
        this.dispose();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void cbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRoleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbRoleActionPerformed

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
            java.util.logging.Logger.getLogger(frameRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameRegistrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegister;
    private javax.swing.JCheckBox cbCFShowPassword1;
    public javax.swing.JComboBox<String> cbRole;
    private javax.swing.JCheckBox cbShowPassword;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblJudul1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNamaLengkap;
    private javax.swing.JLabel lblNoTelp;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JPasswordField txtConfirmPassword1;
    private javax.swing.JTextField txtNamaLengkap;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
