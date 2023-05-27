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
    public String email = "";
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
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(59, 171, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJudul1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblJudul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/Proyek Baru.png"))); // NOI18N
        jPanel1.add(lblJudul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 270, 100));

        lblUsername.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblUsername.setText("Username");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 72, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 293, 27));

        lblNamaLengkap.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblNamaLengkap.setText("Nama Lengkap");
        jPanel1.add(lblNamaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel1.add(txtNamaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 293, 29));

        lblPassword.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblPassword.setText("Password");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 630, 27));

        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(cbShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel1.setText("Confirm Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));
        jPanel1.add(txtConfirmPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 630, 27));

        cbCFShowPassword1.setText("Show Password");
        cbCFShowPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCFShowPassword1ActionPerformed(evt);
            }
        });
        jPanel1.add(cbCFShowPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        bRegister.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        bRegister.setText("Register");
        bRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(bRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 263, 40));

        lblLogin.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        lblLogin.setText("you already have an account? Login now!");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, -1, -1));

        lblNoTelp.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblNoTelp.setText("Nomor Telepon");
        jPanel1.add(lblNoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));
        jPanel1.add(txtNoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 293, 27));

        lblTanggal.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblTanggal.setText("Tanggal Lahir");
        jPanel1.add(lblTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblAlamat.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblAlamat.setText("Alamat");
        jPanel1.add(lblAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));
        jPanel1.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 292, 28));

        lblRole.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblRole.setText("Role");
        jPanel1.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pegawai", "User" }));
        cbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoleActionPerformed(evt);
            }
        });
        jPanel1.add(cbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 293, 28));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 293, 31));

        lblEmail.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblEmail.setText("Email");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
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
        email = txtEmail.getText();
        
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

                String insertMemberSql = "INSERT INTO member(username, nama, tgl_lahir, email, no_telp, alamat) VALUES('" + username + "', '" + nama + "', '" + tanggal + "' , '" + email + "' , '" + noTelp + "' , '" + alamat + "')";
                boolean memberSuccess = db.Execute(insertMemberSql);

                if (userSuccess && memberSuccess) 
                {
                    JOptionPane.showMessageDialog(this, "Register Berhasil!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    
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
    private javax.swing.JLabel lblEmail;
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
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNamaLengkap;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
