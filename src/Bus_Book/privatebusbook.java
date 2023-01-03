/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author VIRAJ
 */
public class privatebusbook extends javax.swing.JFrame {

    /**
     * Creates new form privatebusbook
     */
    DefaultTableModel model;
    
    public privatebusbook() {
        initComponents();
        setTable();
    }

     public privatebusbook(String Name,String Phone,String from1,String arrival1,String Date2,String Date3,String Seat2,String Condn) {
        initComponents();
        Name_Lab_Sec_3.setText(Name);
        Phone_Lab_Sec_3.setText(Phone);
        Name_Lab_Sec_3.setVisible(true);
        Phone_Lab_Sec_3.setVisible(true);
        privatebusbook_from.setText(from1);
        privatebusbook_arrival.setText(arrival1);
        Number_Of_Seats_Val_2.setText(Seat2);
        Ac_Non_Lab_1.setText(Condn);
        
        pub_from_1.setText(from1);
        pub_from_1.setVisible(false);
        pub_to_1.setText(arrival1);
        pub_to_1.setVisible(false);
        pub_ac_1.setText(Condn);
        pub_ac_1.setVisible(false);
        Addition_1.setText(Seat2);
        Addition_1.setVisible(false);
    }
     
//        public privatebusbook(String Name,String Phone){
//        initComponents();
//        
//    }
     
    public void setTable(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
            PreparedStatement pst= con.prepareStatement("select * from privatebusbook_detail");
            ResultSet rst = pst.executeQuery();
            
            while (rst.next()){
                
                String Bus_Num= rst.getString("Bus_Num");
                String From_Dest= rst.getString("From_Dest");
                String To_Dest= rst.getString("To_Dest");
                String Type_Bus= rst.getString("Type_Bus");
                
                Object[] obj = {Bus_Num,From_Dest,To_Dest,Type_Bus};
                
                model = (DefaultTableModel) Privatebusbook_Table.getModel();
                model.addRow(obj);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public void Search(String str,String vr,String wr,String ar){
        model = (DefaultTableModel) Privatebusbook_Table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<> (model);  //Search filter code
        Privatebusbook_Table.setRowSorter(trs);
        
        trs.setRowFilter(RowFilter.regexFilter(str));
        trs.setRowFilter(RowFilter.regexFilter(vr));
        trs.setRowFilter(RowFilter.regexFilter(wr));
        trs.setRowFilter(RowFilter.regexFilter(ar));
       
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        privatebusbook_mid_pan = new javax.swing.JPanel();
        privatebusbook_next = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Privatebusbook_Table = new javax.swing.JTable();
        show_fare_2 = new javax.swing.JButton();
        privatebusbook_fare = new javax.swing.JLabel();
        privatebusbook_from = new javax.swing.JLabel();
        Num_Of_Seat_2 = new javax.swing.JLabel();
        Number_Of_Seats_Val_2 = new javax.swing.JLabel();
        Ac_Non_Lab_1 = new javax.swing.JLabel();
        privatebusbook_arrival = new javax.swing.JLabel();
        privatebusbook_to = new javax.swing.JLabel();
        privatebusbook_back = new javax.swing.JButton();
        pub_from_1 = new javax.swing.JLabel();
        pub_ac_1 = new javax.swing.JLabel();
        pub_to_1 = new javax.swing.JLabel();
        Addition_1 = new javax.swing.JLabel();
        Name_Lab_Sec_3 = new javax.swing.JLabel();
        Phone_Lab_Sec_3 = new javax.swing.JLabel();
        Extra_Lab_Sec_3 = new javax.swing.JLabel();
        PrivateBusbook_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        privatebusbook_mid_pan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        privatebusbook_mid_pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        privatebusbook_next.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        privatebusbook_next.setForeground(new java.awt.Color(255, 255, 255));
        privatebusbook_next.setText("NEXT");
        privatebusbook_next.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        privatebusbook_next.setContentAreaFilled(false);
        privatebusbook_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privatebusbook_nextActionPerformed(evt);
            }
        });
        privatebusbook_mid_pan.add(privatebusbook_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 210, 50));

        Privatebusbook_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Privatebusbook_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus No.", "From", "To", "Type"
            }
        ));
        jScrollPane2.setViewportView(Privatebusbook_Table);

        privatebusbook_mid_pan.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 660, 210));

        show_fare_2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        show_fare_2.setForeground(new java.awt.Color(255, 255, 255));
        show_fare_2.setText("Show Fare :");
        show_fare_2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        show_fare_2.setContentAreaFilled(false);
        show_fare_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_fare_2ActionPerformed(evt);
            }
        });
        privatebusbook_mid_pan.add(show_fare_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 210, 50));

        privatebusbook_fare.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        privatebusbook_fare.setForeground(new java.awt.Color(255, 255, 255));
        privatebusbook_mid_pan.add(privatebusbook_fare, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 150, 50));

        privatebusbook_from.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        privatebusbook_from.setForeground(new java.awt.Color(255, 255, 255));
        privatebusbook_from.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        privatebusbook_mid_pan.add(privatebusbook_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 190, 50));

        Num_Of_Seat_2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Num_Of_Seat_2.setForeground(new java.awt.Color(255, 255, 255));
        Num_Of_Seat_2.setText("Number of Seats :");
        privatebusbook_mid_pan.add(Num_Of_Seat_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 180, 50));

        Number_Of_Seats_Val_2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Number_Of_Seats_Val_2.setForeground(new java.awt.Color(255, 255, 255));
        Number_Of_Seats_Val_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        privatebusbook_mid_pan.add(Number_Of_Seats_Val_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 120, 50));

        Ac_Non_Lab_1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Ac_Non_Lab_1.setForeground(new java.awt.Color(255, 255, 255));
        Ac_Non_Lab_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        privatebusbook_mid_pan.add(Ac_Non_Lab_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 130, 50));

        privatebusbook_arrival.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        privatebusbook_arrival.setForeground(new java.awt.Color(255, 255, 255));
        privatebusbook_arrival.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        privatebusbook_mid_pan.add(privatebusbook_arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 180, 50));

        privatebusbook_to.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        privatebusbook_to.setForeground(new java.awt.Color(255, 255, 255));
        privatebusbook_to.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        privatebusbook_to.setText("To");
        privatebusbook_mid_pan.add(privatebusbook_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 40, 49));

        privatebusbook_back.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        privatebusbook_back.setForeground(new java.awt.Color(255, 255, 255));
        privatebusbook_back.setText("BACK");
        privatebusbook_back.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        privatebusbook_back.setContentAreaFilled(false);
        privatebusbook_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privatebusbook_backActionPerformed(evt);
            }
        });
        privatebusbook_mid_pan.add(privatebusbook_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 60));
        privatebusbook_mid_pan.add(pub_from_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 40));
        privatebusbook_mid_pan.add(pub_ac_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 30));
        privatebusbook_mid_pan.add(pub_to_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 40));
        privatebusbook_mid_pan.add(Addition_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 40));

        Name_Lab_Sec_3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Name_Lab_Sec_3.setForeground(new java.awt.Color(255, 255, 255));
        privatebusbook_mid_pan.add(Name_Lab_Sec_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 120, 50));

        Phone_Lab_Sec_3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Phone_Lab_Sec_3.setForeground(new java.awt.Color(255, 255, 255));
        privatebusbook_mid_pan.add(Phone_Lab_Sec_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 180, 50));
        privatebusbook_mid_pan.add(Extra_Lab_Sec_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 120, 50));

        PrivateBusbook_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures/Book_BG2.jpeg"))); // NOI18N
        PrivateBusbook_BG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        privatebusbook_mid_pan.add(PrivateBusbook_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 580));

        getContentPane().add(privatebusbook_mid_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void privatebusbook_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privatebusbook_backActionPerformed
        // TODO add your handling code here:
        dispose();
        
        String Name=Name_Lab_Sec_3.getText();
        String Phone=Phone_Lab_Sec_3.getText();
        new privatebus(Name,Phone).setVisible(true);
        setVisible(false);
        
//        privatebus o=new privatebus();
//        o.setVisible(true);
    }//GEN-LAST:event_privatebusbook_backActionPerformed

    private void privatebusbook_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privatebusbook_nextActionPerformed
        // TODO add your handling code here:
        
        String Valid_Fare;
        Valid_Fare = privatebusbook_fare.getText();
        if (Valid_Fare.isEmpty()){
            JOptionPane.showMessageDialog(null,"Check The Fare First !!");
        }
        else{
            
            dispose();
            String from1=pub_from_1.getText();
            String arrival1=pub_to_1.getText();
            String Condn=pub_ac_1.getText();
            String Seat2=Addition_1.getText();
            String Name=Name_Lab_Sec_3.getText();
            String Phone=Phone_Lab_Sec_3.getText();
            new paynew(Name, Phone, from1, arrival1, Condn, Seat2).setVisible(true);
            setVisible(false);
            
//        paynew ab=new paynew();
//        ab.setVisible(true);
        }
    }//GEN-LAST:event_privatebusbook_nextActionPerformed

    private void show_fare_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_fare_2ActionPerformed
        // TODO add your handling code here:
        setTable();
        
        String u,v,w,ac;
        u =(privatebusbook_from.getText());
        v = (privatebusbook_arrival.getText());
        w = (Number_Of_Seats_Val_2.getText());
        ac=(Ac_Non_Lab_1.getText());
//        Search(u, v, w, ac);
        /*Search(v);
        Search(w);
        Search(ac);*/
        if(ac=="NON AC"){
       if(u=="Dadar" && v=="Mahabaleshwar"){
           int l=900;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Dadar" && v=="Raigad Fort"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Dadar" && v=="Matheran"){
           int l=650;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Dadar" && v=="Lonavala"){
           int l=600;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Dadar" && v=="Ellora Caves"){
           int l=400;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Mahabaleshwar"){
           int l=950;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Raigad Fort"){
           int l=750;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Matheran"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Lonavala"){
           int l=650;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Ellora Caves"){
           int l=450;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Mahabaleshwar"){
           int l=1000;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Raigad Fort"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Matheran"){
           int l=750;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Lonavala"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Ellora Caves"){
           int l=500;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Mahabaleshwar"){
           int l=850;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Raigad Fort"){
           int l=650;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Matheran"){
           int l=600;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Lonavala"){
           int l=550;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Ellora Caves"){
           int l=350;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Mahabaleshwar"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Raigad Fort"){
           int l=600;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Matheran"){
           int l=550;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Lonavala"){
           int l=500;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Ellora Caves"){
           int l=350;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
        }
        else if (ac=="AC"){
            if(u=="Dadar" && v=="Mahabaleshwar"){
           int l=1100;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Dadar" && v=="Raigad Fort"){
           int l=900;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Dadar" && v=="Matheran"){
           int l=850;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Dadar" && v=="Lonavala"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Dadar" && v=="Ellora Caves"){
           int l=600;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Mahabaleshwar"){
           int l=1150;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Raigad Fort"){
           int l=950;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Matheran"){
           int l=900;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Lonavala"){
           int l=850;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Borivali" && v=="Ellora Caves"){
           int l=650;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Mahabaleshwar"){
           int l=1200;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Raigad Fort"){
           int l=1000;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Matheran"){
           int l=950;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Lonavala"){
           int l=900;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Vasai" && v=="Ellora Caves"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Mahabaleshwar"){
           int l=1050;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Raigad Fort"){
           int l=850;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Matheran"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Lonavala"){
           int l=750;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Worli" && v=="Ellora Caves"){
           int l=550;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Mahabaleshwar"){
           int l=1000;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Raigad Fort"){
           int l=800;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Matheran"){
           int l=750;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Lonavala"){
           int l=700;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
       else if(u=="Bhayander" && v=="Ellora Caves"){
           int l=550;
            int o = Integer.parseInt(w);
            int mult1=o*l;
            String y=Integer.toString(mult1);
            privatebusbook_fare.setText(y);
       }
        }
    }//GEN-LAST:event_show_fare_2ActionPerformed

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
            java.util.logging.Logger.getLogger(privatebusbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(privatebusbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(privatebusbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(privatebusbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new privatebusbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ac_Non_Lab_1;
    private javax.swing.JLabel Addition_1;
    public javax.swing.JLabel Extra_Lab_Sec_3;
    public javax.swing.JLabel Name_Lab_Sec_3;
    private javax.swing.JLabel Num_Of_Seat_2;
    private javax.swing.JLabel Number_Of_Seats_Val_2;
    public javax.swing.JLabel Phone_Lab_Sec_3;
    private javax.swing.JLabel PrivateBusbook_BG;
    private javax.swing.JTable Privatebusbook_Table;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel privatebusbook_arrival;
    private javax.swing.JButton privatebusbook_back;
    private javax.swing.JLabel privatebusbook_fare;
    private javax.swing.JLabel privatebusbook_from;
    private javax.swing.JPanel privatebusbook_mid_pan;
    private javax.swing.JButton privatebusbook_next;
    private javax.swing.JLabel privatebusbook_to;
    private javax.swing.JLabel pub_ac_1;
    private javax.swing.JLabel pub_from_1;
    private javax.swing.JLabel pub_to_1;
    private javax.swing.JButton show_fare_2;
    // End of variables declaration//GEN-END:variables
}