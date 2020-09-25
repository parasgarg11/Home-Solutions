package Frames;

import AFrames.Aahome;
import Login.*;
import Frames.*;
import Login.*;
import cleaning.*;
import java.awt.Color;
import javax.swing.BorderFactory;
    

public class AHome extends javax.swing.JFrame {
    
    String user;
    
    public AHome() {
        super("Home Solutions");
        initComponents();
    }
   
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        complaint1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        city = new javax.swing.JComboBox<>();
        service = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 685));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(1000, 100));
        jPanel7.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Logo.png"))); // NOI18N
        jPanel7.add(jLabel5);
        jLabel5.setBounds(40, -20, 110, 160);

        jLabel13.setBackground(new java.awt.Color(185, 30, 38));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("      HOME      ");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);
        jPanel7.add(jLabel13);
        jLabel13.setBounds(517, 59, 98, 33);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("  ABOUT US  ");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel7.add(jLabel19);
        jLabel19.setBounds(752, 59, 95, 33);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(" OUR SERVICES ");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel7.add(jLabel23);
        jLabel23.setBounds(621, 59, 125, 33);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("   CONTACT");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel7.add(jLabel24);
        jLabel24.setBounds(853, 59, 97, 33);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Phone_24px.png"))); // NOI18N
        jLabel27.setText("9876543210");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        jPanel7.add(jLabel27);
        jLabel27.setBounds(840, 20, 111, 30);

        complaint1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        complaint1.setForeground(new java.awt.Color(255, 255, 255));
        complaint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/mail.png"))); // NOI18N
        complaint1.setText("Book Complaint");
        complaint1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        complaint1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                complaint1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                complaint1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                complaint1MouseExited(evt);
            }
        });
        jPanel7.add(complaint1);
        complaint1.setBounds(690, 20, 137, 30);

        logout.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons8_User_30px_1.png"))); // NOI18N
        logout.setText("Log out");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel7.add(logout);
        logout.setBounds(580, 20, 100, 30);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 0, 1000, 110);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        city.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City", "Chandigarh", "Mohali ", "Zirakpur" }));
        city.setAlignmentX(0.0F);
        city.setAlignmentY(0.0F);
        city.setBorder(null);
        city.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        city.setFocusCycleRoot(true);
        city.setOpaque(false);
        jPanel5.add(city);
        city.setBounds(1, 1, 130, 40);

        service.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What service are you looking for?", "Home Deep Cleaning", "Electrical", "Plumbing", "Carpentry", "AC Installation & Repair", "Pest Control", "Appliances Repair", "Sofa Cleaning", "Kitchen Cleaning", "Bathroom Cleaning" }));
        service.setToolTipText("");
        service.setAlignmentX(0.0F);
        service.setAlignmentY(0.0F);
        service.setBorder(null);
        service.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        service.setFocusCycleRoot(true);
        service.setOpaque(false);
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });
        jPanel5.add(service);
        service.setBounds(130, 1, 370, 40);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(280, 340, 500, 42);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/A.gif"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 700));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        new BServices().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        new CAboutUs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        new DContact().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
        jLabel23.setForeground(Color.decode("#B91E26"));
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
        jLabel23.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        // TODO add your handling code here:
        jLabel19.setForeground(Color.decode("#B91E26"));
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        // TODO add your handling code here:
        jLabel24.setForeground(Color.decode("#B91E26"));
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        // TODO add your handling code here:
        jLabel24.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        // TODO add your handling code here:
        jLabel27.setForeground(Color.decode("#B91E26"));
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        // TODO add your handling code here:
        jLabel27.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel27MouseExited

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
        // TODO add your handling code here:
        if(city.getSelectedIndex()==0){
            city.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        }
        else{
        int ind = service.getSelectedIndex();
        if(ind==1){
            new ACleaning().setVisible(true);
        }
        if(ind==2) {
            new BHomeRepair().setVisible(true);
        }
        if(ind==3) {
            new BHomeRepair().setVisible(true);
        }
        if(ind==4) {
            new BHomeRepair().setVisible(true);
        }
        if(ind==5) {
            new BHomeRepair().setVisible(true);
        }
        if(ind==6) {
            new DPest().setVisible(true);
        }
        if(ind==7) {
            new CAppliances().setVisible(true);
        }
        if(ind==8) {
            new ACleaning().setVisible(true);
        }
        if(ind==9)  {
            new ACleaning().setVisible(true);
        }
        if(ind==10) {
            new ACleaning().setVisible(true);
        }
        }
    }//GEN-LAST:event_serviceActionPerformed

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        logout.setForeground(Color.WHITE);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        logout.setForeground(Color.decode("#B91E26"));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void complaint1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaint1MouseClicked
        // TODO add your handling code here:
        new EFeedback().setVisible(true);
    }//GEN-LAST:event_complaint1MouseClicked

    private void complaint1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaint1MouseEntered
        // TODO add your handling code here:
        complaint1.setForeground(Color.decode("#B91E26"));
    }//GEN-LAST:event_complaint1MouseEntered

    private void complaint1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaint1MouseExited
        // TODO add your handling code here:
        complaint1.setForeground(Color.WHITE);
    }//GEN-LAST:event_complaint1MouseExited

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
            java.util.logging.Logger.getLogger(AHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> city;
    private javax.swing.JLabel complaint1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JLabel logout;
    private javax.swing.JComboBox<String> service;
    // End of variables declaration//GEN-END:variables
}
