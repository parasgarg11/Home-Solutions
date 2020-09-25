/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Login.Login;
import connect.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Paras
 */
public class EFeedback extends javax.swing.JFrame {

    Connection con;    
    PreparedStatement pst;
    ResultSet rs;
     
    static String user;
    
    public EFeedback() {
        initComponents();
        con= connect.ConnectDB();
        
        user = Login.user;
    }

    public boolean check1(){
            if(bookid.getText().isEmpty() | name.getText().isEmpty() | email.getText().isEmpty() | details.getText().isEmpty()) {
            lab.setText("* Please enter into all the Fields");
            return false; 
        }
            return true;
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        lab = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Share your Feedback");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 28, 325, 60);

        details.setColumns(20);
        details.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        details.setLineWrap(true);
        details.setRows(5);
        details.setWrapStyleWord(true);
        details.setOpaque(false);
        jScrollPane1.setViewportView(details);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 267, 344, 129);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 106, 126, 28);

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(name);
        name.setBounds(244, 143, 200, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 150, 126, 28);

        bookid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(bookid);
        bookid.setBounds(244, 105, 200, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 189, 126, 28);

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(email);
        email.setBounds(244, 182, 200, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Your Feedback");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 228, 170, 33);

        submit.setBackground(new java.awt.Color(204, 204, 204));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(210, 413, 116, 38);

        lab.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lab.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(lab);
        lab.setBounds(100, 400, 190, 10);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/feedback.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 550, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        if(check1()) {
        try {
            Statement stat= con.createStatement();
            String query = "Select count(*) from feedback where username='"+user+"'";
            rs=stat.executeQuery(query);
                if(rs.next()){
                    String sql= "insert into feedback values(?,?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, user);
                    pst.setString(2, bookid.getText());
                    pst.setString(3, name.getText());
                    pst.setString(4, email.getText() );
                    pst.setString(5, details.getText()); 
                    pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Thank you for your Feedback");
                        bookid.setText("");
                        name.setText("");
                        email.setText("");
                        details.setText("");
                     
                }
            else {
                   
            JOptionPane.showMessageDialog(null, "Not Entered");
         }           
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(EFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EFeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookid;
    private javax.swing.JTextArea details;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab;
    private javax.swing.JTextField name;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
