

package Login;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import connect.*;
import Frames.*;
import java.awt.Color;

/**
 *
 * @author Paras
 */
public class Signup extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst=null;
    PreparedStatement pst1=null;
    
    ResultSet rs;
    
        public Signup() {
            initComponents();
            con= connect.ConnectDB();
    }

        public boolean check1(){
            if(username.getText().isEmpty() | uname.getText().isEmpty() | upass.getText().isEmpty() | uans.getText().isEmpty()) {
            label.setText("*Please enter into all the Fields");
            return false; 
        }
            return true;
        }
        
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        spassword = new javax.swing.JLabel();
        security = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        susername = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        signin = new javax.swing.JLabel();
        upass = new javax.swing.JPasswordField();
        sname = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        uans = new javax.swing.JTextField();
        usecurity = new javax.swing.JComboBox<>();
        ans = new javax.swing.JLabel();
        signin1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 380));
        setPreferredSize(new java.awt.Dimension(475, 400));
        setResizable(false);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 500));
        jPanel1.setLayout(null);

        spassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        spassword.setForeground(new java.awt.Color(255, 255, 255));
        spassword.setText("Password");
        jPanel1.add(spassword);
        spassword.setBounds(50, 156, 139, 30);

        security.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        security.setForeground(new java.awt.Color(255, 255, 255));
        security.setText("Security Question");
        jPanel1.add(security);
        security.setBounds(50, 196, 139, 30);

        signup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup);
        signup.setBounds(50, 285, 335, 32);

        susername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        susername.setForeground(new java.awt.Color(255, 255, 255));
        susername.setText("Username");
        jPanel1.add(susername);
        susername.setBounds(50, 75, 139, 30);

        uname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(uname);
        uname.setBounds(184, 116, 200, 30);

        signin.setBackground(new java.awt.Color(255, 255, 255));
        signin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText(" Sign In  ");
        signin.setToolTipText("");
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinMouseExited(evt);
            }
        });
        jPanel1.add(signin);
        signin.setBounds(260, 320, 66, 30);
        jPanel1.add(upass);
        upass.setBounds(184, 156, 200, 30);

        sname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sname.setForeground(new java.awt.Color(255, 255, 255));
        sname.setText("Name");
        jPanel1.add(sname);
        sname.setBounds(50, 119, 139, 30);

        username.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(username);
        username.setBounds(184, 76, 200, 30);

        uans.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(uans);
        uans.setBounds(184, 236, 200, 30);

        usecurity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your Nickname?", "What is your school name?", "What is your childhood friend?", "What is your mother's name?", "What is your pet name?" }));
        jPanel1.add(usecurity);
        usecurity.setBounds(184, 196, 200, 30);

        ans.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ans.setForeground(new java.awt.Color(255, 255, 255));
        ans.setText("Answer");
        jPanel1.add(ans);
        ans.setBounds(50, 236, 139, 30);

        signin1.setBackground(new java.awt.Color(255, 255, 255));
        signin1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signin1.setForeground(new java.awt.Color(255, 255, 255));
        signin1.setText("Aready hava an account !   ");
        signin1.setToolTipText("");
        jPanel1.add(signin1);
        signin1.setBounds(100, 320, 167, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 10, 130, 50);

        lbl.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl);
        lbl.setBounds(387, 77, 80, 30);

        label.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        label.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(label);
        label.setBounds(185, 270, 199, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/signup.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-30, -10, 500, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signinMouseClicked

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
    if(check1()) {
         try {
            String userInput= username.getText();
            String query = "SELECT username FROM login where username=?";
            pst = con.prepareStatement(query);
            pst.setString(1, userInput);

            rs = pst.executeQuery();

        if(rs.next()) {
            lbl.setText("!Already Exists");
        }
        else {
            String sql = "insert into login values(?,?,?,?,?)";   //(username,name,password,security, answer)
            pst1 = con.prepareStatement(sql);
            pst1.setString(1, userInput); 
            pst1.setString(2, uname.getText());
            pst1.setString(3, upass.getText());
            pst1.setString(4, (String) usecurity.getSelectedItem());
            pst1.setString(5, uans.getText());
            pst1.execute();
            JOptionPane.showMessageDialog(null, "Signup Successfully");
            new Login().setVisible(true);
            this.dispose();
        }
     } catch (Exception e) {
            e.printStackTrace();
        }
    }     
    }//GEN-LAST:event_signupActionPerformed
    
    private void signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseEntered
        // TODO add your handling code here:
        signin.setForeground(Color.BLUE);
    }//GEN-LAST:event_signinMouseEntered

    private void signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseExited
        // TODO add your handling code here:
        signin.setForeground(Color.WHITE);
    }//GEN-LAST:event_signinMouseExited

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel security;
    private javax.swing.JLabel signin;
    private javax.swing.JLabel signin1;
    private javax.swing.JButton signup;
    private javax.swing.JLabel sname;
    private javax.swing.JLabel spassword;
    private javax.swing.JLabel susername;
    private javax.swing.JTextField uans;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upass;
    private javax.swing.JComboBox<String> usecurity;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
