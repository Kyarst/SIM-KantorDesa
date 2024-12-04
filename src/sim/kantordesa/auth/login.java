/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sim.kantordesa.auth;

import sim.kantordesa.SIMKantorDesa;
import java.sql.*;

/**
 *
 * @author manii
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelKiri = new javax.swing.JPanel();
        logodesa = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        PanelKanan = new javax.swing.JPanel();
        LOGIN = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        registertext = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        text_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        PanelKiri.setBackground(new java.awt.Color(29, 78, 216));
        PanelKiri.setPreferredSize(new java.awt.Dimension(400, 500));

        logodesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        judul.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("SIM-Desa");

        javax.swing.GroupLayout PanelKiriLayout = new javax.swing.GroupLayout(PanelKiri);
        PanelKiri.setLayout(PanelKiriLayout);
        PanelKiriLayout.setHorizontalGroup(
            PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logodesa, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelKiriLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(judul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKiriLayout.setVerticalGroup(
            PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKiriLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(logodesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(judul)
                .addGap(133, 133, 133))
        );

        jPanel1.add(PanelKiri);
        PanelKiri.setBounds(0, 0, 400, 500);

        PanelKanan.setBackground(new java.awt.Color(255, 255, 255));
        PanelKanan.setPreferredSize(new java.awt.Dimension(400, 500));

        LOGIN.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(29, 78, 216));
        LOGIN.setText("LOGIN");

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setText("Username");

        text_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password.setText("Password");

        login.setBackground(new java.awt.Color(29, 78, 216));
        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        registertext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registertext.setText("Saya belum memiliki akun");

        register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(29, 78, 216));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        text_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelKananLayout = new javax.swing.GroupLayout(PanelKanan);
        PanelKanan.setLayout(PanelKananLayout);
        PanelKananLayout.setHorizontalGroup(
            PanelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKananLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKananLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LOGIN)
                        .addGap(90, 90, 90))
                    .addGroup(PanelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(text_password)
                        .addGroup(PanelKananLayout.createSequentialGroup()
                            .addComponent(registertext)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(password)
                        .addComponent(username)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        PanelKananLayout.setVerticalGroup(
            PanelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKananLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(LOGIN)
                .addGap(52, 52, 52)
                .addComponent(username)
                .addGap(3, 3, 3)
                .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(PanelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registertext))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel1.add(PanelKanan);
        PanelKanan.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        register RegisterFrame = new register();
        RegisterFrame.setVisible(true);
        RegisterFrame.pack();
        RegisterFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String usernameIn = text_username.getText().trim();
        String passwordIn = new String(text_password.getPassword());
        
        if (usernameIn.isEmpty() || passwordIn.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Username atau Password Kosong!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            Connection conn = SIMKantorDesa.getKoneksi();
            String query = "Select password FROM users WHERE username = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, usernameIn);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                String storedPassword = rs.getString("password");
                if (storedPassword.equals(passwordIn)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Login Berhasil!", "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Password Salah!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Username tidak ditemukan!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Sistem Error!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGIN;
    private javax.swing.JPanel PanelKanan;
    private javax.swing.JPanel PanelKiri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul;
    private javax.swing.JButton login;
    private javax.swing.JLabel logodesa;
    private javax.swing.JLabel password;
    private javax.swing.JButton register;
    private javax.swing.JLabel registertext;
    private javax.swing.JPasswordField text_password;
    private javax.swing.JTextField text_username;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
