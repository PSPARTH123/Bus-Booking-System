/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author viraj
 */
public class Detail_1 extends javax.swing.JFrame {

    /**
     * Creates new form Detail_1
     */
    public Detail_1() {
        initComponents();
    }
    
   public Detail_1(String Name,String Phone) {
       initComponents(); 
       Contact_Auto_Lab.setText(Phone);
       Name_Auto_Lab.setText(Name);
       
    }
    /*
    public Detail_1(String Phone_1) {
        initComponents();
        Contact_Auto_Lab.setText(Phone_1);
    }*/
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Detail_1_BG_Panel = new javax.swing.JPanel();
        Deatil1_Panel_1 = new javax.swing.JPanel();
        Deatail_1_Head_Lab = new javax.swing.JLabel();
        c_First_name = new javax.swing.JLabel();
        Contact_Lab = new javax.swing.JLabel();
        Address_Lab = new javax.swing.JLabel();
        Scroll_Panel_Customer = new javax.swing.JScrollPane();
        Address_Text_Area = new javax.swing.JTextArea();
        Landmark_Lab = new javax.swing.JLabel();
        Landmark_Field = new javax.swing.JTextField();
        First_Name_Warn = new javax.swing.JLabel();
        Contact_Warn = new javax.swing.JLabel();
        Address_Warn = new javax.swing.JLabel();
        Landmark_Warn = new javax.swing.JLabel();
        Proceed_Button = new javax.swing.JButton();
        Reset_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Name_Auto_Lab = new javax.swing.JLabel();
        Contact_Auto_Lab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Detail_1_BG_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Detail_1_BG_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Deatil1_Panel_1.setBackground(new java.awt.Color(255, 255, 255));
        Deatil1_Panel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Deatail_1_Head_Lab.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        Deatail_1_Head_Lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Deatail_1_Head_Lab.setText(".. Customer Details ..");
        Deatil1_Panel_1.add(Deatail_1_Head_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 692, 70));

        c_First_name.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        c_First_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        c_First_name.setText("Name :");
        Deatil1_Panel_1.add(c_First_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 147, 50));

        Contact_Lab.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Contact_Lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Contact_Lab.setText("Contact :");
        Deatil1_Panel_1.add(Contact_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 147, 50));

        Address_Lab.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Address_Lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Address_Lab.setText("Address :");
        Deatil1_Panel_1.add(Address_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 147, 50));

        Address_Text_Area.setColumns(20);
        Address_Text_Area.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Address_Text_Area.setRows(5);
        Address_Text_Area.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Address_Text_Area.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Address_Text_AreaKeyReleased(evt);
            }
        });
        Scroll_Panel_Customer.setViewportView(Address_Text_Area);

        Deatil1_Panel_1.add(Scroll_Panel_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 250, 85));

        Landmark_Lab.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Landmark_Lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Landmark_Lab.setText("Landmark :");
        Deatil1_Panel_1.add(Landmark_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 147, 50));

        Landmark_Field.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Landmark_Field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Landmark_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Landmark_FieldActionPerformed(evt);
            }
        });
        Landmark_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Landmark_FieldKeyReleased(evt);
            }
        });
        Deatil1_Panel_1.add(Landmark_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 250, 50));

        First_Name_Warn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        First_Name_Warn.setForeground(new java.awt.Color(255, 0, 51));
        Deatil1_Panel_1.add(First_Name_Warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 190, 50));

        Contact_Warn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Contact_Warn.setForeground(new java.awt.Color(255, 0, 51));
        Deatil1_Panel_1.add(Contact_Warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 190, 50));

        Address_Warn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Address_Warn.setForeground(new java.awt.Color(255, 0, 51));
        Address_Warn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Deatil1_Panel_1.add(Address_Warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 280, 85));

        Landmark_Warn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Landmark_Warn.setForeground(new java.awt.Color(255, 0, 51));
        Landmark_Warn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Deatil1_Panel_1.add(Landmark_Warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 280, 50));

        Proceed_Button.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        Proceed_Button.setText("Proceed");
        Proceed_Button.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        Proceed_Button.setContentAreaFilled(false);
        Proceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proceed_ButtonActionPerformed(evt);
            }
        });
        Deatil1_Panel_1.add(Proceed_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 155, 65));

        Reset_Button.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        Reset_Button.setText("Reset");
        Reset_Button.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        Reset_Button.setContentAreaFilled(false);
        Reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_ButtonActionPerformed(evt);
            }
        });
        Deatil1_Panel_1.add(Reset_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 155, 65));

        Back_Button.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        Back_Button.setText("Back");
        Back_Button.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        Back_Button.setContentAreaFilled(false);
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });
        Deatil1_Panel_1.add(Back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 155, 65));

        Name_Auto_Lab.setBackground(new java.awt.Color(255, 255, 255));
        Name_Auto_Lab.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Deatil1_Panel_1.add(Name_Auto_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 150, 251, 50));

        Contact_Auto_Lab.setBackground(new java.awt.Color(255, 255, 255));
        Contact_Auto_Lab.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Deatil1_Panel_1.add(Contact_Auto_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 230, 251, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures/b15.gif"))); // NOI18N
        Deatil1_Panel_1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 630, 620));

        Detail_1_BG_Panel.add(Deatil1_Panel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 810, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Detail_1_BG_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Detail_1_BG_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Landmark_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Landmark_FieldActionPerformed
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9.,/@&*#]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Landmark_Field.getText());
        if(!match.matches()){
            Landmark_Warn.setText("!! Invalid Landmark !!");
        }
        else
        {
            Landmark_Warn.setText(null);
        }
    }//GEN-LAST:event_Landmark_FieldActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        
        String Name=Name_Auto_Lab.getText();
        String Phone=Contact_Auto_Lab.getText();
        new Bookings_2(Name,Phone).setVisible(true);
        setVisible(false); 
   
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Proceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proceed_ButtonActionPerformed
        // TODO add your handling code here:
        
            
        
        
        if(Address_Text_Area.getText().trim().isEmpty() && Landmark_Field.getText().trim().isEmpty()){
            Address_Warn.setText("!! Enter Address !!");
            Landmark_Warn.setText("!! Enter Landmark !!");
        }
        else if(Address_Text_Area.getText().trim().isEmpty()){
            Address_Warn.setText("!! Enter Address !!");
        }
         else if(Landmark_Field.getText().trim().isEmpty()){
            Landmark_Warn.setText("!! Enter Landmark !!");
        }
         else{
             
             dispose();
                 try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
            String Cus="insert into customer_detail_private_1 values(?,?,?,?)";
            PreparedStatement Cus_det=con.prepareStatement(Cus);
            Cus_det.setString(1,Name_Auto_Lab.getText());
            Cus_det.setString(2,Contact_Auto_Lab.getText());
            Cus_det.setString(3,Address_Text_Area.getText());
            Cus_det.setString(4,Landmark_Field.getText());
            Cus_det.executeUpdate();
            JOptionPane.showMessageDialog(null,"inserted Successfully");
            con.close();
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            } 
             
        String Name=Name_Auto_Lab.getText();
        String Phone=Contact_Auto_Lab.getText();
        new privatebus(Name,Phone).setVisible(true);
        setVisible(false);
        
        
        
//        privatebus k=new privatebus();
//        k.setVisible(true);
         }
        
    }//GEN-LAST:event_Proceed_ButtonActionPerformed

    private void Address_Text_AreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Address_Text_AreaKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9.,/@&*#]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Address_Text_Area.getText());
        if(!match.matches()){
            Address_Warn.setText("!! Invalid Address !!");
        }
        else
        {
            Address_Warn.setText(null);
        }
        
    }//GEN-LAST:event_Address_Text_AreaKeyReleased

    private void Landmark_FieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Landmark_FieldKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9.,]{0,15}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(Landmark_Field.getText());
        if(!match.matches()){
            Landmark_Warn.setText("!! Invalid Landmark !!");
        }
        else
        {
            Landmark_Warn.setText(null);
        }
    }//GEN-LAST:event_Landmark_FieldKeyReleased

    private void Reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_ButtonActionPerformed
        // TODO add your handling code here:
        Address_Text_Area.setText("");
        Landmark_Field.setText("");
    }//GEN-LAST:event_Reset_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Detail_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detail_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detail_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detail_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detail_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_Lab;
    private javax.swing.JTextArea Address_Text_Area;
    private javax.swing.JLabel Address_Warn;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel Contact_Auto_Lab;
    private javax.swing.JLabel Contact_Lab;
    private javax.swing.JLabel Contact_Warn;
    private javax.swing.JLabel Deatail_1_Head_Lab;
    private javax.swing.JPanel Deatil1_Panel_1;
    private javax.swing.JPanel Detail_1_BG_Panel;
    private javax.swing.JLabel First_Name_Warn;
    private javax.swing.JTextField Landmark_Field;
    private javax.swing.JLabel Landmark_Lab;
    private javax.swing.JLabel Landmark_Warn;
    private javax.swing.JLabel Name_Auto_Lab;
    private javax.swing.JButton Proceed_Button;
    private javax.swing.JButton Reset_Button;
    private javax.swing.JScrollPane Scroll_Panel_Customer;
    private javax.swing.JLabel c_First_name;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
