
package cleaning;

import connect.*;
import Frames.*;
import java.sql.*;
import java.text.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Login.*;
import java.awt.Color;
/**
 *
 * @author Paras
 */

public class ACleaning extends javax.swing.JFrame {

    Connection con;    
    PreparedStatement pst;
    ResultSet rs;
    
    static String user;
//    public Object tabbed;
       
            public ACleaning(){
                initComponents();
                con= connect.ConnectDB();
                user = Login.user;
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        javax.swing.JTabbedPane tabbed = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        quant = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        time = new javax.swing.JComboBox<>();
        bhk1 = new javax.swing.JRadioButton();
        bhk2 = new javax.swing.JRadioButton();
        bhk3 = new javax.swing.JRadioButton();
        bhk4 = new javax.swing.JRadioButton();
        city = new javax.swing.JComboBox<>();
        total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        proceed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructions = new javax.swing.JTextArea();
        type = new javax.swing.JTextField();
        ddate = new com.toedter.calendar.JDateChooser();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        quant1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        time1 = new javax.swing.JComboBox<>();
        one = new javax.swing.JRadioButton();
        two = new javax.swing.JRadioButton();
        three = new javax.swing.JRadioButton();
        four = new javax.swing.JRadioButton();
        city1 = new javax.swing.JComboBox<>();
        total1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        proceed1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        instructions1 = new javax.swing.JTextArea();
        type1 = new javax.swing.JTextField();
        ddate1 = new com.toedter.calendar.JDateChooser();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        quant2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        time2 = new javax.swing.JComboBox<>();
        city2 = new javax.swing.JComboBox<>();
        total2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        proceed2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        instructions2 = new javax.swing.JTextArea();
        type2 = new javax.swing.JTextField();
        ddate2 = new com.toedter.calendar.JDateChooser();
        seat3 = new javax.swing.JRadioButton();
        seat4 = new javax.swing.JRadioButton();
        seat5 = new javax.swing.JRadioButton();
        seat8 = new javax.swing.JRadioButton();
        seat7 = new javax.swing.JRadioButton();
        seat6 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        quant3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        time3 = new javax.swing.JComboBox<>();
        one1 = new javax.swing.JRadioButton();
        two1 = new javax.swing.JRadioButton();
        three1 = new javax.swing.JRadioButton();
        four1 = new javax.swing.JRadioButton();
        city3 = new javax.swing.JComboBox<>();
        total3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        proceed3 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        instructions3 = new javax.swing.JTextArea();
        type3 = new javax.swing.JTextField();
        ddate3 = new com.toedter.calendar.JDateChooser();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 680));
        setResizable(false);
        getContentPane().setLayout(null);

        tabbed.setBackground(new java.awt.Color(255, 255, 255));
        tabbed.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabbed.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbed.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabbed.setFocusCycleRoot(true);
        tabbed.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tabbed.setMinimumSize(new java.awt.Dimension(768, 532));
        tabbed.setPreferredSize(new java.awt.Dimension(768, 532));
        tabbed.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setOpaque(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        quant.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        quant.setText("Select Quantity");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Select Type of Service");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Select City");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Instructions");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Select Date");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Select Time");

        time.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 AM - 12 PM", "12 PM - 02 PM", "02 PM - 04 PM", "04 PM - 06 PM", "06 PM - 08 PM" }));

        buttonGroup1.add(bhk1);
        bhk1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bhk1.setText("1 BHK");
        bhk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhk1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(bhk2);
        bhk2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bhk2.setText("2 BHK");
        bhk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhk2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(bhk3);
        bhk3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bhk3.setText("3 BHK");
        bhk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhk3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(bhk4);
        bhk4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bhk4.setText("4 BHK");
        bhk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhk4ActionPerformed(evt);
            }
        });

        city.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chandigarh", "Mohali", "Zirakpur" }));

        total.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("*Inspection Charges : Rs. 250");

        proceed.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        proceed.setText("Proceed >");
        proceed.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        proceed.setDefaultCapable(false);
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setText(" Total :");

        instructions.setColumns(20);
        instructions.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        instructions.setRows(5);
        jScrollPane1.setViewportView(instructions);

        type.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        type.setText("Deep Cleaning");
        type.setEditable(false);

        ddate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(city, 0, 213, Short.MAX_VALUE)
                            .addComponent(type)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(bhk1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bhk2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bhk3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bhk4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(ddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proceed))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bhk3)
                                .addComponent(bhk4))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bhk2)
                                .addComponent(bhk1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(ddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book Service", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(null);

        jScrollPane3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane3.setName(""); // NOI18N

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("-------------------------------------------------------------------------------------------------------\nHOME DEEP CLEANING\n-------------------------------------------------------------------------------------------------------\n1 BHK (upto 700 sqft) Rs. 2000\n2 BHK (701-1200 sqft) Rs. 3400\n3 BHK (1201 - 1700 sqft) Rs. 4800\n4 BHK (1701 - 2200 sqft) Rs. 6400\nApartment/Villa\nOn Inspection\nRegular Deep Cleaning of complete home includes: \n 1. Bathroom cleaning includes cleaning of tiles, faucets, sinks, taps, pots, shelves, cabinets, mirror, windows and disinfection of bathroom.\n 2. Cleaning and mopping of the WC and Washbasin.\n 3. Wall cleaning to remove cobwebs and wiping if washable paint (no wet washing).\n 4. Moping and cleaning of the floor without moving heavy furniture.\n 5. Wiping of window panel & grooves, dusting of grills, cleaning of channels for sliding windows.\n 7. Kitchen cleaning including stove and hob cleaning (degreasing not included).\n 8. Wiping of the mirrors and glass items.\n 9. Fridge, Microwave, Fans will be cleaned from outside only.\n10. Cleaning of other appliances, sofa, mattress, carpet, curtains cost extra charges.\n");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel8.add(jScrollPane3);
        jScrollPane3.setBounds(20, 20, 460, 380);

        jTabbedPane1.addTab("  Rate Card  ", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabbed.addTab("<html><center><br> Home Deep<br>Cleaning<br><br>", jPanel1);

        jPanel2.setOpaque(false);

        jTabbedPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        quant1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        quant1.setText("Select Quantity");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Select Type of Service");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Select City");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Instructions");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Select Date");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Select Time");

        time1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        time1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 AM - 12 PM", "12 PM - 02 PM", "02 PM - 04 PM", "04 PM - 06 PM", "06 PM - 08 PM" }));

        buttonGroup1.add(one);
        one.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        buttonGroup1.add(two);
        two.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        two.setText("2 ");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        buttonGroup1.add(three);
        three.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        buttonGroup1.add(four);
        four.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        city1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        city1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chandigarh", "Mohali", "Zirakpur" }));

        total1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("*Inspection Charges : Rs. 250");

        proceed1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        proceed1.setText("Proceed >");
        proceed1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        proceed1.setDefaultCapable(false);
        proceed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel6.setText(" Total :");

        instructions1.setColumns(20);
        instructions1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        instructions1.setRows(5);
        jScrollPane2.setViewportView(instructions1);

        type1.setEditable(false);
        type1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        type1.setText("Kitchen Cleaning");
        type.setEditable(false);

        ddate1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proceed1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(city1, 0, 213, Short.MAX_VALUE)
                            .addComponent(type1)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quant1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addComponent(ddate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(type1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quant1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(two)
                            .addComponent(one)
                            .addComponent(three)
                            .addComponent(four))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(ddate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(proceed1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Book Service", jPanel9);

        jPanel10.setLayout(null);

        jScrollPane4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane4.setName(""); // NOI18N

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("---------------------------------------------------------------------------------------------------------\nKITCHEN CLEANING\n-----------------------------------------------------------------------------------------------------------\nRegular Vacuum Cleaning   Rs. 1200\nRegular Vacuum Cleaning includes:\n1. Wall cleaning to remove cobwebs and wiping if washable paint (no wet washing). \n2. Moping and cleaning of the floor without moving heavy items. \n3. Wiping of window panel & grooves, dusting of grills, cleaning of channels for sliding windows. \n4. Cupboard cleaning from outside (if not empty).\n5. Kitchen cleaning including stove and hob cleaning (degreasing not included). \n6. Wiping of the mirrors and glass items. \n7. Fridge, Microwave, Fans will be cleaned from outside only. \n8. Cleaning of other appliances is NOT INCLUDED. ");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel10.add(jScrollPane4);
        jScrollPane4.setBounds(20, 20, 460, 380);

        jTabbedPane2.addTab("  Rate Card  ", jPanel10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabbed.addTab("<html><center><br>Kitchen<br> Cleaning<br><br>", jPanel2);

        jPanel4.setOpaque(false);

        jTabbedPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jTabbedPane3.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        quant2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        quant2.setText("Select Quantity");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Select Type of Service");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Select City");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Instructions");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("Select Date");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("Select Time");

        time2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        time2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 AM - 12 PM", "12 PM - 02 PM", "02 PM - 04 PM", "04 PM - 06 PM", "06 PM - 08 PM" }));

        city2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        city2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chandigarh", "Mohali", "Zirakpur" }));

        total2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("*Inspection Charges : Rs. 250");

        proceed2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        proceed2.setText("Proceed >");
        proceed2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        proceed2.setDefaultCapable(false);
        proceed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel9.setText(" Total :");

        instructions2.setColumns(20);
        instructions2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        instructions2.setRows(5);
        jScrollPane5.setViewportView(instructions2);

        type2.setEditable(false);
        type2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        type2.setText("Sofa Cleaning");
        type.setEditable(false);

        ddate2.setDateFormatString("yyyy-MM-dd");

        buttonGroup1.add(seat3);
        seat3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        seat3.setText("3 Seats");
        seat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(seat4);
        seat4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        seat4.setText("4 Seats ");
        seat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(seat5);
        seat5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        seat5.setText("5 Seats ");
        seat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(seat8);
        seat8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        seat8.setText("8 Seats  ");
        seat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(seat7);
        seat7.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        seat7.setText("7 Seats");
        seat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(seat6);
        seat6.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        seat6.setText("6 Seats  ");
        seat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(city2, 0, 213, Short.MAX_VALUE)
                            .addComponent(type2)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quant2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddate2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seat3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seat6))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seat7)
                                    .addComponent(seat4))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seat5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seat8)))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(proceed2)
                                .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(type2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quant2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(seat5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seat4)
                                    .addComponent(seat3))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seat6)
                            .addComponent(seat7)
                            .addComponent(seat8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ddate2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(proceed2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane3.addTab("Book Service", jPanel11);

        jPanel12.setLayout(null);

        jScrollPane6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane6.setName(""); // NOI18N

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setText("--------------------------------------------------------------------------------------------------------------\nREGULAR SOFA CLEANING\n--------------------------------------------------------------------------------------------------------------\n3 Seats   Rs. 750\n4 Seats   Rs. 1000\n5 Seats   Rs. 1250\n6 Seats   Rs. 1500\n7 Seats   Rs. 1750\n8 Seats   Rs. 2000\nRegular Sofa Cleaning includes:\n1. The sofa seats are cleaned using special cleaning agents. The agent is foam based and is fabric friendly. \n2. Once thoroughly cleaned, the foam will be sucked by a special vacuum machine to dry the sofa. \n3. Foam based cleaning is not applicable for leather/rexine seats.\n ");
        jTextArea6.setWrapStyleWord(true);
        jScrollPane6.setViewportView(jTextArea6);

        jPanel12.add(jScrollPane6);
        jScrollPane6.setBounds(20, 20, 460, 380);

        jTabbedPane3.addTab("  Rate Card  ", jPanel12);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        tabbed.addTab("<html><center><br>Sofa<br> Cleaning<br><br>", jPanel4);

        jPanel3.setOpaque(false);

        jTabbedPane4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jTabbedPane4.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        quant3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        quant3.setText("Select Quantity");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel27.setText("Select Type of Service");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Select City");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setText("Instructions");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setText("Select Date");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel30.setText("Select Time");

        time3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        time3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 AM - 12 PM", "12 PM - 02 PM", "02 PM - 04 PM", "04 PM - 06 PM", "06 PM - 08 PM" }));

        buttonGroup1.add(one1);
        one1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        one1.setText("1");
        one1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(two1);
        two1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        two1.setText("2 ");
        two1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(three1);
        three1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        three1.setText("3");
        three1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(four1);
        four1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        four1.setText("4");
        four1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four1ActionPerformed(evt);
            }
        });

        city3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        city3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chandigarh", "Mohali", "Zirakpur" }));

        total3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel31.setText("*Inspection Charges : Rs. 250");

        proceed3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        proceed3.setText("Proceed >");
        proceed3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        proceed3.setDefaultCapable(false);
        proceed3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed3ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel32.setText(" Total :");

        instructions3.setColumns(20);
        instructions3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        instructions3.setRows(5);
        jScrollPane7.setViewportView(instructions3);

        type3.setEditable(false);
        type3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        type3.setText("Bathroom Cleaning");
        type.setEditable(false);

        ddate3.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proceed3))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(city3, 0, 213, Short.MAX_VALUE)
                            .addComponent(type3)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quant3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(one1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(two1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(three1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(four1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addComponent(ddate3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(type3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quant3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(two1)
                            .addComponent(one1)
                            .addComponent(three1)
                            .addComponent(four1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(ddate3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel31))
                    .addComponent(proceed3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Book Service", jPanel13);

        jPanel14.setLayout(null);

        jScrollPane8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane8.setName(""); // NOI18N

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jTextArea8.setText("------------------------------------------------------------------------------------------------------------\nBATHROOM CLEANING\n------------------------------------------------------------------------------------------------------------\n1 Bathroom    Rs. 750\n2 Bathroom    Rs. 1200\n3 Bathroom    Rs. 1800\n4 Bathroom    Rs. 2200\nBathroom Cleaning includes:\n1. Bathroom cleaning includes cleaning of tiles, faucets, sinks, taps, pots, shelves, cabinets, mirror, windows and disinfection of bathroom. \n2. Cleaning and mopping of the WC and Washbasin. \n");
        jTextArea8.setWrapStyleWord(true);
        jScrollPane8.setViewportView(jTextArea8);

        jPanel14.add(jScrollPane8);
        jScrollPane8.setBounds(20, 20, 460, 380);

        jTabbedPane4.addTab("  Rate Card  ", jPanel14);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tabbed.addTab("<html><br><center>Bathroom<br> Cleaning<br><br>", jPanel3);

        getContentPane().add(tabbed);
        tabbed.setBounds(170, 110, 670, 520);
        tabbed.getAccessibleContext().setAccessibleDescription("");

        jPanel6.setBackground(new java.awt.Color(217, 35, 45));

        jLabel21.setBackground(new java.awt.Color(217, 35, 45));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel21.setText("     HOME ");
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(217, 35, 45));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel22.setText("OUR SERVICES ");
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(217, 35, 45));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setText("  ABOUT US ");
        jLabel23.setOpaque(true);
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

        jLabel33.setBackground(new java.awt.Color(217, 35, 45));
        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel33.setText("  CONTACT");
        jLabel33.setOpaque(true);
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel23)
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 1030, 80);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bg cleann.jpeg"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, -20, 1050, 710);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bhk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhk3ActionPerformed
        // TODO add your handling code here:
        if(bhk3.isSelected()) {
            total.setText("4800");
            quantity = "3";
        }
    }//GEN-LAST:event_bhk3ActionPerformed

    private void bhk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhk1ActionPerformed
        // TODO add your handling code here:
        if(bhk1.isSelected()){
            total.setText("2000");
            quantity="1";
        } 
    }//GEN-LAST:event_bhk1ActionPerformed

    private void bhk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhk4ActionPerformed
        // TODO add your handling code here:
        if(bhk4.isSelected()){
            total.setText("6400");
            quantity ="4";
        }    
    }//GEN-LAST:event_bhk4ActionPerformed

    private void bhk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhk2ActionPerformed
        // TODO add your handling code here:
        if(bhk2.isSelected()){
            total.setText("3400");
            quantity ="2";
        }
        //
    }//GEN-LAST:event_bhk2ActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        // TODO add your handling code here:
        if(user==null){
            JOptionPane.showMessageDialog(null, "Please Login first");
        }
        try { 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/home", "root", "");
            String sql= "insert into services(username,city,type,quantity,instructions,date,time,total) values(?,?,?,?,?,?,?,?) ";
            
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, city.getSelectedItem().toString());
            pst.setString(3, "Deep Cleaning");
            pst.setString(4, quantity);
            pst.setString(5, instructions.getText()); 
            pst.setString(6, ((JTextField)ddate.getDateEditor().getUiComponent()).getText() );  
            pst.setString(7, time.getSelectedItem().toString());
            pst.setString(8, total.getText());
            int i=pst.executeUpdate();
            if(i>0) {
                   JOptionPane.showMessageDialog(null, "Details Entered");
                   new FPersonalDetails().setVisible(true);
                   this.dispose();
            }
            else {
                   JOptionPane.showMessageDialog(null, "Details Not Entered");
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_proceedActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        if(one.isSelected()){
            total1.setText("1200");
            quantity1 ="1";
        }
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        if(two.isSelected()){
            total1.setText("2400");
            quantity1 ="2";
        }
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        if(three.isSelected()){
            total1.setText("3600");
            quantity1 ="3";
        }
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        if(four.isSelected()){
            total1.setText("4800");
            quantity1 ="4";
        }
    }//GEN-LAST:event_fourActionPerformed

    private void proceed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed1ActionPerformed
        // TODO add your handling code here:
        if(user==null){
            JOptionPane.showMessageDialog(null, "Please Login first");
        }
        try { 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/home", "root", "");
            String sql= "insert into services(username,city,type,quantity,instructions,date,time,total) values(?,?,?,?,?,?,?,?) ";
            
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, city1.getSelectedItem().toString());
            pst.setString(3, "Kitchen Cleaning");
            pst.setString(4, quantity1);
            pst.setString(5, instructions1.getText()); 
            pst.setString(6, ((JTextField)ddate1.getDateEditor().getUiComponent()).getText() );  
            pst.setString(7, time1.getSelectedItem().toString());
            pst.setString(8, total1.getText());
            int i=pst.executeUpdate();
            if(i>0) {
                   JOptionPane.showMessageDialog(null, "Details Entered");
                   new FPersonalDetails().setVisible(true);
                   this.dispose();
            }
            else {
                   JOptionPane.showMessageDialog(null, "Details Not Entered");
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_proceed1ActionPerformed

    private void seat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat3ActionPerformed
        // TODO add your handling code here:
        if(seat3.isSelected()){
            total2.setText("750");
            quantity2 ="3 Seats";
        }
    }//GEN-LAST:event_seat3ActionPerformed

    private void seat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat4ActionPerformed
        // TODO add your handling code here:
        if(seat4.isSelected()){
            total2.setText("1000");
            quantity2 ="4 Seats";
        }
    }//GEN-LAST:event_seat4ActionPerformed

    private void seat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat5ActionPerformed
        // TODO add your handling code here:
        if(seat5.isSelected()){
            total2.setText("1250");
            quantity2 ="5 Seats";
        }
    }//GEN-LAST:event_seat5ActionPerformed

    private void seat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat8ActionPerformed
        // TODO add your handling code here:
        if(seat8.isSelected()){
            total2.setText("2000");
            quantity2 ="8 Seats";
        }
    }//GEN-LAST:event_seat8ActionPerformed

    private void seat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat7ActionPerformed
        // TODO add your handling code here:
        if(seat7.isSelected()){
            total2.setText("1750");
            quantity2 ="7 Seats";
        }
    }//GEN-LAST:event_seat7ActionPerformed

    private void seat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat6ActionPerformed
        // TODO add your handling code here:
        if(seat6.isSelected()){
            total2.setText("1500");
            quantity2 ="6 Seats";
        }
    }//GEN-LAST:event_seat6ActionPerformed

    private void proceed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed2ActionPerformed
        // TODO add your handling code here:
        if(user==null){
            JOptionPane.showMessageDialog(null, "Please Login first");
        }
        try { 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/home", "root", "");
            String sql= "insert into services(username,city,type,quantity,instructions,date,time,total) values(?,?,?,?,?,?,?,?) ";
            
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, city2.getSelectedItem().toString());
            pst.setString(3, "Sofa Cleaning");
            pst.setString(4, quantity2);
            pst.setString(5, instructions2.getText()); 
            pst.setString(6, ((JTextField)ddate2.getDateEditor().getUiComponent()).getText() );  
            pst.setString(7, time2.getSelectedItem().toString());
            pst.setString(8, total2.getText());
            int i=pst.executeUpdate();
            if(i>0) {
                   JOptionPane.showMessageDialog(null, "Details Entered");
                   new FPersonalDetails().setVisible(true);
                   this.dispose();
            }
            else {
                   JOptionPane.showMessageDialog(null, "Details Not Entered");
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_proceed2ActionPerformed

    private void one1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one1ActionPerformed
        // TODO add your handling code here:
        if(one1.isSelected()){
            total3.setText("750");
            quantity3 ="1";
        }
    }//GEN-LAST:event_one1ActionPerformed

    private void two1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two1ActionPerformed
        // TODO add your handling code here:
        if(two1.isSelected()){
            total3.setText("1200");
            quantity3 ="2";
        }
    }//GEN-LAST:event_two1ActionPerformed

    private void three1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three1ActionPerformed
        // TODO add your handling code here:
        if(three1.isSelected()){
            total3.setText("1800");
            quantity3 ="3";
        }
    }//GEN-LAST:event_three1ActionPerformed

    private void four1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four1ActionPerformed
        // TODO add your handling code here:
        if(four1.isSelected()){
            total3.setText("2200");
            quantity3 ="4";
        }
    }//GEN-LAST:event_four1ActionPerformed

    private void proceed3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed3ActionPerformed
        // TODO add your handling code here:
        if(user==null){
            JOptionPane.showMessageDialog(null, "Please Login first");
        }
         try { 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/home", "root", "");
            String sql= "insert into services(username,city,type,quantity,instructions,date,time,total) values(?,?,?,?,?,?,?,?) ";
            
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, city3.getSelectedItem().toString());
            pst.setString(3, "Bathroom Cleaning");
            pst.setString(4, quantity3);
            pst.setString(5, instructions3.getText()); 
            pst.setString(6, ((JTextField)ddate3.getDateEditor().getUiComponent()).getText() );  
            pst.setString(7, time3.getSelectedItem().toString());
            pst.setString(8, total3.getText());
            int i=pst.executeUpdate();
            if(i>0) {
                   JOptionPane.showMessageDialog(null, "Details Entered");
                   new FPersonalDetails().setVisible(true);
                   this.dispose();
            }
            else {
                   JOptionPane.showMessageDialog(null, "Details Not Entered");
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_proceed3ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        new AHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        // TODO add your handling code here:
        jLabel21.setBackground(Color.decode("#B91E26"));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
        jLabel21.setBackground(Color.decode("#D9232D"));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        new BServices().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
        jLabel22.setBackground(Color.decode("#B91E26"));
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
        jLabel22.setBackground(Color.decode("#D9232D"));
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        new CAboutUs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
        jLabel23.setBackground(Color.decode("#B91E26"));
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
        jLabel23.setBackground(Color.decode("#D9232D"));
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        new DContact().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
       jLabel33.setBackground(Color.decode("#B91E26"));
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        // TODO add your handling code here:
        jLabel33.setBackground(Color.decode("#D9232D"));
    }//GEN-LAST:event_jLabel33MouseExited

    
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
            java.util.logging.Logger.getLogger(ACleaning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACleaning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACleaning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACleaning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ACleaning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bhk1;
    private javax.swing.JRadioButton bhk2;
    private javax.swing.JRadioButton bhk3;
    private javax.swing.JRadioButton bhk4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JComboBox<String> city1;
    private javax.swing.JComboBox<String> city2;
    private javax.swing.JComboBox<String> city3;
    private com.toedter.calendar.JDateChooser ddate;
    private com.toedter.calendar.JDateChooser ddate1;
    private com.toedter.calendar.JDateChooser ddate2;
    private com.toedter.calendar.JDateChooser ddate3;
    private javax.swing.JRadioButton four;
    private javax.swing.JRadioButton four1;
    private javax.swing.JTextArea instructions;
    private javax.swing.JTextArea instructions1;
    private javax.swing.JTextArea instructions2;
    private javax.swing.JTextArea instructions3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JRadioButton one;
    private javax.swing.JRadioButton one1;
    private javax.swing.JButton proceed;
    private javax.swing.JButton proceed1;
    private javax.swing.JButton proceed2;
    private javax.swing.JButton proceed3;
    private javax.swing.JLabel quant;
    private javax.swing.JLabel quant1;
    private javax.swing.JLabel quant2;
    private javax.swing.JLabel quant3;
    private javax.swing.JRadioButton seat3;
    private javax.swing.JRadioButton seat4;
    private javax.swing.JRadioButton seat5;
    private javax.swing.JRadioButton seat6;
    private javax.swing.JRadioButton seat7;
    private javax.swing.JRadioButton seat8;
    private javax.swing.JRadioButton three;
    private javax.swing.JRadioButton three1;
    private javax.swing.JComboBox<String> time;
    private javax.swing.JComboBox<String> time1;
    private javax.swing.JComboBox<String> time2;
    private javax.swing.JComboBox<String> time3;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total1;
    private javax.swing.JLabel total2;
    private javax.swing.JLabel total3;
    private javax.swing.JRadioButton two;
    private javax.swing.JRadioButton two1;
    private javax.swing.JTextField type;
    private javax.swing.JTextField type1;
    private javax.swing.JTextField type2;
    private javax.swing.JTextField type3;
    // End of variables declaration//GEN-END:variables
private String quantity;
private String quantity1;
private String quantity2;
private String quantity3;
}
