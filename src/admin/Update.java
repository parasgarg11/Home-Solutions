/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

public class Update extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs =  null;
    
    public Update() {
        initComponents();
        showTableData();
    }


//insert

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            String sql = "INSERT INTO idusjavanew"
                    +"(fname, lname, address)"
                    +"VALUES (?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/idusjavanew","root","");
            pst = con.prepareStatement(sql);
//            pst.setString(1,fname.getText());
//             pst.setString(2,lname.getText());
//              pst.setString(3,add.getText());
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null, "inserted successfully");
            
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
    }                                        


//delete
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            String sql = "DELETE FROM idusjavanew WHERE Rollno =?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/idusjavanew","root","");
            pst = con.prepareStatement(sql);
//            pst.setString(1,Rollno.getText());
            pst.executeUpdate();
              JOptionPane.showMessageDialog(null, "delete  successfully");
            
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
    }                                        

//update
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
            String sql = "UPDATE idusjavanew SET fname=?,lname=?,address=? WHERE Rollno=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/idusjavanew","root","");
            pst = con.prepareStatement(sql);
//            pst.setString(4, Rollno.getText());
//            pst.setString(1,fname.getText());
//            pst.setString(2,lname.getText());
//            pst.setString(3,add.getText());
            pst.executeUpdate();
              JOptionPane.showMessageDialog(null, "updated successfully");
            
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
    }


//connect database with jtable

//Before writing the below code make sure that you have download the rs2xml.jar file and add that file in libraries folder of your project. For more watch the following video.      
                            
 public void showTableData(){
     try{
         con = DriverManager.getConnection("jdbc:mysql://localhost/idusjavanew","root","");
         String sql = "SELECT * FROM idusjavanew";
         pst = con.prepareStatement(sql);
         rs=pst.executeQuery();
//         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
 }
     catch(Exception ex){
         JOptionPane.showMessageDialog(null, ex);
         
     }


 }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
