package Login;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import connect.*;
import cleaning.ACleaning;
import Frames.AHome;
import admin.*;
import javax.swing.WindowConstants;

public class Login extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public static String user;
    
    public Login() {
        super("SignIn");
        initComponents();
        con= connect.ConnectDB();
    }
    
        
     public boolean check1(){
            if(name.getText().isEmpty() | password.getText().isEmpty()) {
            label.setText("Please enter into all the Fields");
            return false; 
        }
            return true;
     }    
                    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        signup = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        pass = new javax.swing.JLabel();
        forgot = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        signup1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(385, 270));
        setPreferredSize(new java.awt.Dimension(385, 270));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        signup.setBackground(new java.awt.Color(255, 255, 255));
        signup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign Up");
        signup.setToolTipText("");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });
        jPanel1.add(signup);
        signup.setBounds(213, 225, 47, 24);

        signin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        jPanel1.add(signin);
        signin.setBounds(40, 188, 314, 31);

        pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText(" Password");
        jPanel1.add(pass);
        pass.setBounds(40, 120, 89, 30);

        forgot.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        forgot.setForeground(new java.awt.Color(255, 51, 51));
        forgot.setText(" Forgot Password ?");
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotMouseExited(evt);
            }
        });
        jPanel1.add(forgot);
        forgot.setBounds(40, 161, 93, 21);

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Username");
        jPanel1.add(email);
        email.setBounds(40, 71, 89, 30);

        name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        name.setToolTipText("Enter username");
        name.setSelectionEnd(1);
        jPanel1.add(name);
        name.setBounds(144, 72, 210, 30);
        jPanel1.add(password);
        password.setBounds(144, 120, 210, 30);

        signup1.setBackground(new java.awt.Color(255, 255, 255));
        signup1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signup1.setForeground(new java.awt.Color(255, 255, 255));
        signup1.setText("New User? ");
        signup1.setToolTipText("");
        jPanel1.add(signup1);
        signup1.setBounds(144, 225, 68, 24);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Log In");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 115, 42);

        label.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(label);
        label.setBounds(144, 153, 210, 15);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/login1.jpeg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-40, -30, 440, 380);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 290);

        setSize(new java.awt.Dimension(401, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        // TODO add your handling code here:
        new Signup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupMouseClicked

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
        // TODO add your handling code here:
        new Forget().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_forgotMouseClicked

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        user=name.getText();
        
        if(check1()) {
        try {
             if(name.getText().equals("admin") &&  password.getText().equals("admin"))  {
                JOptionPane.showMessageDialog(null, "Welcome Admin");
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.dispose();
                new AHomeA().setVisible(true);
            }
           else {
            String sql = "select username, password from login where username=? and password=?";
            pst=con.prepareStatement(sql);
            pst.setString(1, name.getText());
            pst.setString(2, password.getText());
            rs=pst.executeQuery();
           
            if(rs.next()) {
                   JOptionPane.showMessageDialog(null, "Login Succesfully");
                   this.dispose();
                   AHome b=new AHome();
                   b.setVisible(true);
                     
               }     
              else {
                  JOptionPane.showMessageDialog(null, "Incorrect Username & Password");
              }
            }
            }
        
         catch (Exception ex) {
             ex.printStackTrace();
         } 
        }
    }//GEN-LAST:event_signinActionPerformed

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        signup.setForeground(Color.BLUE);
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        signup.setForeground(Color.white);
    }//GEN-LAST:event_signupMouseExited

    private void forgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseEntered
        // TODO add your handling code here:
        forgot.setForeground(Color.decode("#FF3333"));
    }//GEN-LAST:event_forgotMouseEntered

    private void forgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseExited
        // TODO add your handling code here:
        forgot.setForeground(Color.decode("#FF0000"));
    }//GEN-LAST:event_forgotMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JLabel forgot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    public javax.swing.JTextField name;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signin;
    private javax.swing.JLabel signup;
    private javax.swing.JLabel signup1;
    // End of variables declaration//GEN-END:variables
}
