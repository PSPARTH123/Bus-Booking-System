/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Book;

import java.util.regex.*;
import javax.swing.JPasswordField;


import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author viraj
 */
public class Welcom_Form extends javax.swing.JFrame {

    /**
     * Creates new form Welcom_Form
     */
    public Welcom_Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcom_Panel = new javax.swing.JPanel();
        New_Registration = new javax.swing.JButton();
        LogIn_Press = new javax.swing.JButton();
        Close_Form = new javax.swing.JButton();
        Wlecome_Lable = new javax.swing.JLabel();
        Welcom_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Welcom_Panel.setBackground(new java.awt.Color(51, 51, 51));
        Welcom_Panel.setPreferredSize(new java.awt.Dimension(675, 540));
        Welcom_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        New_Registration.setBackground(new java.awt.Color(204, 204, 255));
        New_Registration.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        New_Registration.setText("New Registration");
        New_Registration.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        New_Registration.setContentAreaFilled(false);
        New_Registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_RegistrationActionPerformed(evt);
            }
        });
        Welcom_Panel.add(New_Registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 270, 60));

        LogIn_Press.setBackground(new java.awt.Color(204, 204, 255));
        LogIn_Press.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        LogIn_Press.setText("Log-In");
        LogIn_Press.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        LogIn_Press.setContentAreaFilled(false);
        LogIn_Press.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_PressActionPerformed(evt);
            }
        });
        Welcom_Panel.add(LogIn_Press, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 270, 60));

        Close_Form.setBackground(new java.awt.Color(204, 204, 255));
        Close_Form.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        Close_Form.setText("Cancel");
        Close_Form.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        Close_Form.setContentAreaFilled(false);
        Close_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_FormActionPerformed(evt);
            }
        });
        Welcom_Panel.add(Close_Form, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 270, 60));

        Wlecome_Lable.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        Wlecome_Lable.setForeground(new java.awt.Color(51, 51, 51));
        Wlecome_Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wlecome_Lable.setText("..Welcom to BUS-Cap..");
        Wlecome_Lable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Wlecome_LableKeyReleased(evt);
            }
        });
        Welcom_Panel.add(Wlecome_Lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 610, 64));

        Welcom_BG.setBackground(new java.awt.Color(255, 255, 255));
        Welcom_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures/old-yellow-vintage-bus-on-the-foggy-prairie-road-wall-mural_1.jpg"))); // NOI18N
        Welcom_Panel.add(Welcom_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcom_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcom_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogIn_PressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn_PressActionPerformed
        // TODO add your handling code here:
         dispose();
        Log_In c=new Log_In();
        c.setVisible(true);
    }//GEN-LAST:event_LogIn_PressActionPerformed

    private void New_RegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_RegistrationActionPerformed
        // TODO add your handling code here:
        dispose();
        Registration_Form b=new Registration_Form();
        b.setVisible(true);
    }//GEN-LAST:event_New_RegistrationActionPerformed

    private void Close_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_FormActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_Close_FormActionPerformed

    private void Wlecome_LableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Wlecome_LableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Wlecome_LableKeyReleased

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
            java.util.logging.Logger.getLogger(Welcom_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcom_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcom_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcom_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcom_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close_Form;
    private javax.swing.JButton LogIn_Press;
    private javax.swing.JButton New_Registration;
    private javax.swing.JLabel Welcom_BG;
    private javax.swing.JPanel Welcom_Panel;
    private javax.swing.JLabel Wlecome_Lable;
    // End of variables declaration//GEN-END:variables
}
