/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import Worker.Home;
import java.awt.Color;
import connect.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class WorkerSignin extends javax.swing.JFrame {

        
    Connection con;
    PreparedStatement pst;
    ResultSet rs;    
    
    public WorkerSignin() {
        initComponents();
        con= connect.ConnectDB();
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
        signup = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        pass = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        signup1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

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
        signup.setBounds(210, 230, 47, 24);

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
        pass.setBounds(40, 130, 89, 30);

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Username");
        jPanel1.add(email);
        email.setBounds(40, 80, 89, 30);

        name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        name.setToolTipText("Enter username");
        name.setSelectionEnd(1);
        jPanel1.add(name);
        name.setBounds(140, 80, 210, 30);
        jPanel1.add(password);
        password.setBounds(140, 130, 210, 30);

        signup1.setBackground(new java.awt.Color(255, 255, 255));
        signup1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signup1.setForeground(new java.awt.Color(255, 255, 255));
        signup1.setText("New User? ");
        signup1.setToolTipText("");
        jPanel1.add(signup1);
        signup1.setBounds(140, 230, 68, 24);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Log In");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 115, 42);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(144, 153, 210, 15);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/login1.jpeg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-40, -20, 440, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        // TODO add your handling code here:
        new WorkerSignup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupMouseClicked

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        signup.setForeground(Color.BLUE);
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        signup.setForeground(Color.white);
    }//GEN-LAST:event_signupMouseExited

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        try {
            String sql = "select username, password from worker where username=? and password=?";
            pst=con.prepareStatement(sql);
            pst.setString(1, name.getText());
            pst.setString(2, password.getText());
            rs=pst.executeQuery();
            
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Succesfully");
                this.dispose();
                
               }     
            else {
                JOptionPane.showMessageDialog(null, "Incorrect Username & Password");
            }
           
        }
         catch (Exception ex) {
             ex.printStackTrace();
         }
    }//GEN-LAST:event_signinActionPerformed

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
            java.util.logging.Logger.getLogger(WorkerSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkerSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkerSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkerSignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkerSignin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField name;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signin;
    private javax.swing.JLabel signup;
    private javax.swing.JLabel signup1;
    // End of variables declaration//GEN-END:variables
}
