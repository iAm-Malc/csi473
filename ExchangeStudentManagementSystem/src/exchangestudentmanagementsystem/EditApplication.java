/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exchangestudentmanagementsystem;

import java.util.Date;
import java.awt.Color;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BT
 */
public class EditApplication extends javax.swing.JFrame {
    private String program;
    private String createAppGender;
    Connection myConn = null;
    Statement myPstmt = null;
    ResultSet myRs = null;

    /**
     * Creates new form EditApplication
     */
    public EditApplication() {
        initComponents();
        getContentPane().setBackground(new Color(51,204,255));
        try {
            Class.forName("com.mysql.jdbc.Driver");
            myConn = DriverManager.getConnection("jdbc:mysql://10.0.19.74/db_kii03486",
                    "kii03486","kii03486");  
            int user = Constants.usernameOnline;
            String query = "SELECT * FROM `csi473Application` WHERE `StudentID`="+user;
            myPstmt = myConn.prepareStatement(query);
            myRs = myPstmt.executeQuery(query);
           
            Statement programs = myConn.createStatement();
            String progs = "SELECT ProgramCode FROM csi473Program";
            ResultSet rs = programs.executeQuery(progs);
            
            while(rs.next())
            {
                createAppProgram.addItem(rs.getString("ProgramCode"));
            }
//            
            while(myRs.next()){
               String Name = myRs.getString("Name");
               String reviewprogram = myRs.getString("ProgramCode");
               String age = myRs.getString("Age");
               String reviewgender = myRs.getString("Gender");
               Date dob = myRs.getDate("DOB");
               int studentID = myRs.getInt("StudentID");
               String addr = myRs.getString("PostalAddress");
               String hostCntry = myRs.getString("HostCountry");
               String hostInst = myRs.getString("HostUniversity");
               String fos = myRs.getString("FieldOfStudy");
               String los = myRs.getString("LevelOfStudy");
               String motiv = myRs.getString("MotivationalLetter");
               
               createAppName.setText(Name);
               createAppDOB.setText(dob.toString());
               createAppStudID.setText(String.valueOf(studentID));
               createAppPostAddr.setText(addr);
               createAppAge.setText(String.valueOf(age));
               createAppProgram.setSelectedItem(reviewprogram);
               if (reviewgender.equals("M") ){
                   createAppMale.setSelected(true); 
               } 
               else {
                    createAppFemale.setSelected(true); 
               } 
               createAppHostCountry.setText(hostCntry);
               createAppHostInst.setText(hostInst);
               createAppFOS.setText(fos);
               createAppLOS.setText(los);
               createAppMotivLetter.setText(motiv);
    }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAppHostInst = new javax.swing.JTextField();
        createAppHostCountry = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        createAppFOS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        createAppLOS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        createAppProgram = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        createAppName = new javax.swing.JTextField();
        createAppAge = new javax.swing.JTextField();
        createAppStudID = new javax.swing.JTextField();
        createAppDOB = new javax.swing.JTextField();
        createAppPostAddr = new javax.swing.JTextField();
        createAppMale = new javax.swing.JRadioButton();
        createAppFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        createAppMotivLetter = new javax.swing.JTextArea();
        cancel = new javax.swing.JButton();
        createAppSubmit = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("EXCHANGE STUDENT MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("PERSONAL INFORMATION");

        jLabel3.setText("Name:");

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setText("EXCHANGE PROGRAM");

        jLabel4.setText("DOB:");

        jLabel15.setText("Select Program:");

        jLabel5.setText("Age:");

        jLabel6.setText("Student ID:");

        createAppProgram.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Program ..." }));
        createAppProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAppProgramActionPerformed(evt);
            }
        });

        jLabel7.setText("Postal Address:");

        jLabel8.setText("Gender:");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exchangestudentmanagementsystem/UB-logo.png"))); // NOI18N

        createAppAge.setText(" ");
        createAppAge.setPreferredSize(new java.awt.Dimension(9, 23));

        createAppMale.setText("M");
        createAppMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAppMaleActionPerformed(evt);
            }
        });

        createAppFemale.setText("F");
        createAppFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAppFemaleActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("EDUCATIONAL BACKGROUND");

        jLabel10.setText("Host Institution:");

        jLabel11.setText("Host Country:");

        jLabel12.setText("Field of Study:");

        jLabel13.setText("Level of Study:");

        createAppMotivLetter.setColumns(20);
        createAppMotivLetter.setRows(5);
        jScrollPane1.setViewportView(createAppMotivLetter);

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        createAppSubmit.setText("Submit");
        createAppSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAppSubmitActionPerformed(evt);
            }
        });

        jLabel16.setText("Motivational Letter:");

        jLabel18.setText("(not more than 200 words)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(createAppProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(createAppLOS))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(createAppFOS))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(createAppHostCountry))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(createAppHostInst, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel14))
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(createAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(createAppDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(createAppPostAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(createAppAge, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cancel)
                                                .addGap(27, 27, 27)
                                                .addComponent(createAppSubmit))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(createAppStudID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(createAppMale)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(createAppFemale))))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancel, createAppSubmit});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addComponent(createAppAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createAppName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6))
                            .addComponent(createAppStudID)
                            .addComponent(createAppDOB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(createAppPostAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createAppMale)
                            .addComponent(createAppFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createAppHostInst, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createAppHostCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createAppFOS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createAppLOS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createAppProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAppSubmit)
                    .addComponent(cancel))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createAppAge, createAppStudID});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createAppFOS, createAppHostCountry, createAppHostInst, createAppLOS});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAppProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAppProgramActionPerformed
        program = createAppProgram.getSelectedItem().toString();
    }//GEN-LAST:event_createAppProgramActionPerformed

    private void createAppMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAppMaleActionPerformed
        createAppMale.setActionCommand("male");
        createAppGender = "M";// TODO add your handling code here:

    }//GEN-LAST:event_createAppMaleActionPerformed

    private void createAppFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAppFemaleActionPerformed
        createAppFemale.setActionCommand("female");
        createAppGender = "F"; // TODO add your handling code here:
    }//GEN-LAST:event_createAppFemaleActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new StudentView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void createAppSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAppSubmitActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            myConn = DriverManager.getConnection("jdbc:mysql://10.0.19.74/db_kii03486",
                "kii03486","kii03486");
            int username1 = Constants.usernameOnline;
            String query = "SELECT * FROM `csi473Student` WHERE `StudentID`="+username1;
            myPstmt = myConn.prepareStatement(query);
            myRs = myPstmt.executeQuery(query);
            //
            while(myRs.next()){
                int userName = myRs.getInt("StudentID");
                String fname = myRs.getString("FirstName");
                String lname = myRs.getString("LastName");
                int credits = myRs.getInt("CreditsTaken");
                Date dob = myRs.getDate("DOB");
                int age = myRs.getInt("Age");
                
                String hostCountry = createAppHostCountry.getText();
                String hostInstitution = createAppHostInst.getText();

                String postal = myRs.getString("PostalAddress");
                String gender = myRs.getString("Gender");
                String fulName = fname +" "+lname;
                String fieldOfStudy = createAppFOS.getText();
                String levelOfStudy = createAppLOS.getText();
                String motivationalLetter = createAppMotivLetter.getText();
                String status = "Not Approved";

                //String thisYear = new SimpleDateFormat("yyyy").format(new Date());

                int doY = Integer.parseInt(new SimpleDateFormat("yyyy").format(dob));
                //int age = new SimpleDateFormat("yyyy/MM/dd") - dob;
                String sql = "INSERT INTO `csi473Application`(`Name`, `ProgramCode`, `Age`, `Gender`, `DOB`, `StudentID`, `PostalAddress`, `HostCountry`, `HostUniversity`, `FieldOfStudy`, `LevelOfStudy`, `MotivationalLetter`, `Status`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
                PreparedStatement pstmt = myConn.prepareStatement(sql);
                Statement stmt = myConn.createStatement();
                pstmt.setString(1,fulName);
                pstmt.setString(2, program);
                pstmt.setInt(3, age);
                pstmt.setString(4, createAppGender);
                pstmt.setString(5, dob.toString());
                pstmt.setInt(6, userName);
                pstmt.setString(7, postal);
                pstmt.setString(8, hostCountry);
                pstmt.setString(9, hostInstitution);
                pstmt.setString(10, fieldOfStudy);
                pstmt.setString(11, levelOfStudy);
                pstmt.setString(12, motivationalLetter);
                pstmt.setString(13, status);
                pstmt.executeUpdate();
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createAppSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField createAppAge;
    private javax.swing.JTextField createAppDOB;
    private javax.swing.JTextField createAppFOS;
    private javax.swing.JRadioButton createAppFemale;
    private javax.swing.JTextField createAppHostCountry;
    private javax.swing.JTextField createAppHostInst;
    private javax.swing.JTextField createAppLOS;
    private javax.swing.JRadioButton createAppMale;
    private javax.swing.JTextArea createAppMotivLetter;
    private javax.swing.JTextField createAppName;
    private javax.swing.JTextField createAppPostAddr;
    private javax.swing.JComboBox createAppProgram;
    private javax.swing.JTextField createAppStudID;
    private javax.swing.JButton createAppSubmit;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
