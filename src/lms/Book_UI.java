/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.awt.event.KeyEvent;
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
public class Book_UI extends javax.swing.JFrame {

    /**
     * Creates new form Book_UI
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Book_UI() {
        initComponents();

        txtbname.setText("");
        txtbauthor.setText("");
        cmbbcategory.setSelectedIndex(0);
        txtbqty.setText("");

        conn = DBconnect.connect();

        tableload();
    }

    //table
    public boolean tableload() {

        try {
            String sql = "select bid as 'Book ISBN',bname as 'Book Name',bauthor as 'Author',bcategory as 'Book Category',bqty as 'Book Quantity'from books";
            PreparedStatement pst = DBconnect.connect().prepareStatement(sql);
            rs = pst.executeQuery();
            tblbooks.setModel(DbUtils.resultSetToTableModel(rs));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtbname = new javax.swing.JTextField();
        txtbauthor = new javax.swing.JTextField();
        cmbbcategory = new javax.swing.JComboBox<>();
        lblbid = new javax.swing.JLabel();
        btnbdelete = new javax.swing.JButton();
        btnbinsert = new javax.swing.JButton();
        btnbupdate = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        btnbsearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtbqty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbooks = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("MANAGE BOOKS INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 310, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Book ISBN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Book name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Author");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Category");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtbname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbname.setText("jTextField1");
        getContentPane().add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, -1));

        txtbauthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbauthor.setText("jTextField1");
        getContentPane().add(txtbauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 210, -1));

        cmbbcategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose book category", "Science", "Maths", "English", "History", "Art", "Commerce", "Tamil", "Health", "Bio", "Chemestry", "Com. Maths", "Physics" }));
        cmbbcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbcategoryActionPerformed(evt);
            }
        });
        getContentPane().add(cmbbcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 210, -1));

        lblbid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lblbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 20));

        btnbdelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbdelete.setText("Delete");
        btnbdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnbdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 310, 40));

        btnbinsert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbinsert.setText("Insert");
        btnbinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbinsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnbinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 310, 40));

        btnbupdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbupdate.setText("Update");
        btnbupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnbupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 310, 40));

        txtsearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 490, 30));

        btnbsearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbsearch.setText("Search");
        btnbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnbsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 180, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Qty");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtbqty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbqty.setText("jTextField1");
        txtbqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbqtyKeyTyped(evt);
            }
        });
        getContentPane().add(txtbqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, -1));

        tblbooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblbooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbooks);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 800, 290));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Book Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 84, -1, 20));

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 50, 40));

        setSize(new java.awt.Dimension(1196, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbinsertActionPerformed
        // TODO add your handling code here:

        String name = txtbname.getText();
        String author = txtbauthor.getText();
        String category = cmbbcategory.getSelectedItem().toString();
        String qty = txtbqty.getText();

       //required fields------------------------------------------------------------------------------------------------------
    if(txtbname.getText() == null || txtbauthor.getText()== null || txtbqty.getText() == null ||
                cmbbcategory.getSelectedItem() == "Choose book category" ){
        JOptionPane.showMessageDialog(null, "Please fill the required fields","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
         //qty validation-------------------------------------------------------------------------------
        int num = Integer.parseInt(qty);
        if(num > 15 || num < 1){
            JOptionPane.showMessageDialog(null, "Please enter quantity between 1 - 15", "Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
    
       //.....................................................................................................
        
        
        BookModel b = new BookModel(name, author, category, qty);
        boolean successStatus = b.insertBook();
         if (successStatus) {
            JOptionPane.showMessageDialog(this, "Successfully inserted to db");
            tableload();
            lblbid.setText("");
            txtbname.setText("");
            txtbauthor.setText("");
            cmbbcategory.setSelectedIndex(0);
            txtbqty.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error in inserting to db");
        }
    }//GEN-LAST:event_btnbinsertActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void tblbooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbooksMouseClicked
        // TODO add your handling code here:

        int r = tblbooks.getSelectedRow();

        String bid = tblbooks.getValueAt(r, 0).toString();
        String bname = tblbooks.getValueAt(r, 1).toString();
        String bauthor = tblbooks.getValueAt(r, 2).toString();
        String bcategory = tblbooks.getValueAt(r, 3).toString();
        String bqty = tblbooks.getValueAt(r, 4).toString();

        lblbid.setText(bid);
        txtbname.setText(bname);
        txtbauthor.setText(bauthor);
        cmbbcategory.setSelectedItem(bcategory);
        txtbqty.setText(bqty);


    }//GEN-LAST:event_tblbooksMouseClicked

    private void btnbupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbupdateActionPerformed
        // TODO add your handling code here:

        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");

        if (x == 0) {
            String id = lblbid.getText();
            String name = txtbname.getText();
            String author = txtbauthor.getText();
            String category = cmbbcategory.getSelectedItem().toString();
            String qty = txtbqty.getText();
            
            
         //qty validation-------------------------------------------------------------------------------
        int num = Integer.parseInt(qty);
        if(num > 15 || num < 1){
            JOptionPane.showMessageDialog(null, "Please enter quantity between 1 - 15", "Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
   
       //.....................................................................................................
            
            BookModel b = new BookModel(id,name, author, category, qty);
            boolean successStatus = b.updateBook();

            if (successStatus) {
                JOptionPane.showMessageDialog(this, "Successfully updated");
                tableload();
                lblbid.setText("");
                txtbname.setText("");
                txtbauthor.setText("");
                cmbbcategory.setSelectedIndex(0);
                txtbqty.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Error in updating");
            }

        }

    }//GEN-LAST:event_btnbupdateActionPerformed

    private void btnbdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbdeleteActionPerformed
        // TODO add your handling code here:
        //................
        String bid = lblbid.getText();
//        String name = txtbname.getText();
//        String author = txtbauthor.getText();
//        String category = cmbbcategory.getSelectedItem().toString();
//        String qty = txtbqty.getText();
        BookModel b = new BookModel(bid);
        boolean successStatus = b.deleteBook();

        if (successStatus) {
//            JOptionPane.showMessageDialog(this, "Successfully inserted to db");
//            txtbname.setText("");
//            txtbauthor.setText("");
//            cmbbcategory.setSelectedIndex(0);
//            txtbqty.setText("");

            int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");

            if (x == 0) {
                tableload();
                lblbid.setText("");
                txtbname.setText("");
                txtbauthor.setText("");
                cmbbcategory.setSelectedIndex(0);
                txtbqty.setText("");
                //    String bid = lblbid.getText();
            }
//        }
        } else {
            JOptionPane.showMessageDialog(this, "Error in deleting");
        }
        //..............
//        int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
//        if(x==0){
//            String bid = lblbid.getText();
//        }
    }//GEN-LAST:event_btnbdeleteActionPerformed

    private void btnbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbsearchActionPerformed
        // TODO add your handling code here:

        String name = txtsearch.getText();
        String n = "Select bid,bname,bauthor,bcategory,bqty from books where bname like '%" + name + "%'";

        try {
            pst = conn.prepareStatement(n);
            rs = pst.executeQuery();
            tblbooks.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnbsearchActionPerformed

    private void cmbbcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbcategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new LibraryHome_UI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        
    
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtbqtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbqtyKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
        evt.consume();
        }
        
        
    }//GEN-LAST:event_txtbqtyKeyTyped

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
            java.util.logging.Logger.getLogger(Book_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbdelete;
    private javax.swing.JButton btnbinsert;
    private javax.swing.JButton btnbsearch;
    private javax.swing.JButton btnbupdate;
    private javax.swing.JComboBox<String> cmbbcategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbid;
    private javax.swing.JTable tblbooks;
    private javax.swing.JTextField txtbauthor;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbqty;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
