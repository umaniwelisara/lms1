/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Umani Welisara
 */
public class Member_UI extends javax.swing.JFrame {

    /**
     * Creates new form member
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Member_UI() {
        initComponents();

        lblmregid.setText("");
        txtmname.setText("");
        cmbmgrade.setSelectedIndex(0);
        txtmemail.setText("");
        txtmconnum.setText("");
        cmbmstatus.setSelectedIndex(2);
        conn = DBconnect.connect();

        tableload();
    }

    public boolean tableload() {

        try {
            String sql = "select mregID as 'Member registration ID',mname as 'Member Name',mgrade as 'Grade',memail as 'Email Address',mcontactnum as 'Contact Number',mstatus as 'Status' from members";
            PreparedStatement pst = DBconnect.connect().prepareStatement(sql);
            rs = pst.executeQuery();
            tblmembers.setModel(DbUtils.resultSetToTableModel(rs));

            return true;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmemail = new javax.swing.JTextField();
        txtmname = new javax.swing.JTextField();
        cmbmgrade = new javax.swing.JComboBox<>();
        btnminsert = new javax.swing.JButton();
        btnmupdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmembers = new javax.swing.JTable();
        lblmregid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtmconnum = new javax.swing.JTextField();
        cmbmstatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnmdisable = new javax.swing.JButton();
        btnmenable = new javax.swing.JButton();
        txtmvisible = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1170, 420));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setText("LIBRARY REGISTRATION FORM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 430, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Member registration id ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Grade");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Contact number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtmemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmemail.setText("jTextField2");
        getContentPane().add(txtmemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 200, -1));

        txtmname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmname.setText("jTextField1");
        getContentPane().add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 200, -1));

        cmbmgrade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbmgrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose the grade", "6", "7", "8", "9", "10", "11", "12" }));
        cmbmgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmgradeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbmgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 200, -1));

        btnminsert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnminsert.setText("ADD");
        btnminsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnminsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 340, 40));

        btnmupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnmupdate.setText("UPDATE");
        btnmupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnmupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 340, 40));

        tblmembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblmembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmembersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmembers);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 670, 270));

        lblmregid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblmregid.setText("jLabel2");
        getContentPane().add(lblmregid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 90, 20));

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 70, 40));

        txtmconnum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmconnum.setText("jTextField2");
        getContentPane().add(txtmconnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, -1));

        cmbmstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbmstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enable", "Disable", "Select one" }));
        cmbmstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmstatusActionPerformed(evt);
            }
        });
        getContentPane().add(cmbmstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Status");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 80, -1));

        btnmdisable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnmdisable.setText("Disabled Members");
        btnmdisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmdisableActionPerformed(evt);
            }
        });
        getContentPane().add(btnmdisable, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 150, 50));

        btnmenable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnmenable.setText("Enable Members");
        btnmenable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenableMouseClicked(evt);
            }
        });
        btnmenable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenableActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenable, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 140, 50));

        txtmvisible.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtmvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 280, 30));

        setSize(new java.awt.Dimension(1196, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbmgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmgradeActionPerformed

    private void btnminsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminsertActionPerformed
        // TODO add your handling code here:
        //String id
        String name = txtmname.getText();
        String grade = cmbmgrade.getSelectedItem().toString();
        String email = txtmemail.getText();
        String phone = txtmconnum.getText();
        String status = cmbmstatus.getSelectedItem().toString();
        MemberModel m = new MemberModel(name, grade, email, phone, status);
        boolean successStatus = m.insertMember();
        if (successStatus) {
            JOptionPane.showMessageDialog(this, "Successfully inserted to db");

            tableload();

            lblmregid.setText("");
            txtmname.setText("");
            cmbmgrade.setSelectedIndex(0);
            txtmemail.setText("");
            txtmconnum.setText("");
            cmbmstatus.setSelectedIndex(2);
        } else {
            JOptionPane.showMessageDialog(this, "Error in inserting to db");
        }


    }//GEN-LAST:event_btnminsertActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new LibraryHome_UI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnmupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmupdateActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");

        if (x == 0) {
            String id =lblmregid.getText();
            String name = txtmname.getText();
            String grade = cmbmgrade.getSelectedItem().toString();
            String email = txtmemail.getText();
            String phone = txtmconnum.getText();
            String status = cmbmstatus.getSelectedItem().toString();
            
            MemberModel m = new MemberModel(id,name, grade, email, phone, status);
            boolean successStatus = m.updateMember();

            if (successStatus) {
                JOptionPane.showMessageDialog(this, "Successfully updated");
                tableload();
                lblmregid.setText("");
                txtmname.setText("");

                cmbmgrade.setSelectedIndex(0);
                txtmemail.setText("");
                txtmconnum.setText("");
                cmbmstatus.setSelectedIndex(2);

            } else {
                JOptionPane.showMessageDialog(this, "Error in updating");
            }

        }


    }//GEN-LAST:event_btnmupdateActionPerformed

    private void tblmembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmembersMouseClicked
        // TODO add your handling code here:

        int r = tblmembers.getSelectedRow();

        String regid = tblmembers.getValueAt(r, 0).toString();
        String name = tblmembers.getValueAt(r, 1).toString();
        String grade = tblmembers.getValueAt(r, 2).toString();
        String email = tblmembers.getValueAt(r, 3).toString();
        String phone = tblmembers.getValueAt(r, 4).toString();
        String status = tblmembers.getValueAt(r, 5).toString();
        lblmregid.setText(regid);
        txtmname.setText(name);
        cmbmgrade.setSelectedItem(grade);
        txtmemail.setText(email);
        txtmconnum.setText(phone);
        cmbmstatus.setSelectedItem(status);


    }//GEN-LAST:event_tblmembersMouseClicked

    private void cmbmstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmstatusActionPerformed

    private void btnmenableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenableMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnmenableMouseClicked

    private void btnmenableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenableActionPerformed
        // TODO add your handling code here:
        
       try {
            String s= "select mregID,mname,mgrade,memail,mcontactnum from members where mstatus='Enable'"; 
             pst = conn.prepareStatement(s);
            rs = pst.executeQuery();
            tblmembers.setModel(DbUtils.resultSetToTableModel(rs));
            
            txtmvisible.setText("List Of ENABLE Members");
            
        } catch (Exception e) {
            
        }
        
        
    }//GEN-LAST:event_btnmenableActionPerformed

    private void btnmdisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmdisableActionPerformed
        // TODO add your handling code here:
         try {
            String s= "select mregID,mname,mgrade,memail,mcontactnum from members where mstatus='Disable'"; 
             pst = conn.prepareStatement(s);
            rs = pst.executeQuery();
            tblmembers.setModel(DbUtils.resultSetToTableModel(rs));
            
            txtmvisible.setText("List Of DISABLED Members");
        } catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_btnmdisableActionPerformed

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
            java.util.logging.Logger.getLogger(Member_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmdisable;
    private javax.swing.JButton btnmenable;
    private javax.swing.JButton btnminsert;
    private javax.swing.JButton btnmupdate;
    private javax.swing.JComboBox<String> cmbmgrade;
    private javax.swing.JComboBox<String> cmbmstatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmregid;
    private javax.swing.JTable tblmembers;
    private javax.swing.JTextField txtmconnum;
    private javax.swing.JTextField txtmemail;
    private javax.swing.JTextField txtmname;
    private javax.swing.JLabel txtmvisible;
    // End of variables declaration//GEN-END:variables
}
