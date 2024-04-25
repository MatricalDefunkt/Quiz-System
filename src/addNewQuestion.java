import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PRIYANSHI BHARGAVA
 */
public class addNewQuestion extends javax.swing.JFrame {

    /**
     * Creates new form addNewQuestion
     */
    public addNewQuestion() {
        initComponents();
        try{
            Connection con=ConnectionProvider.getConn();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select count(id) from question");
            if(rs.next()){
                int id=rs.getInt(1);
                id=id+1;
                String str=String.valueOf(id);
                jLabel4.setText(str);
            }
            else{
                jLabel4.setText("1");
            }
        }
        catch(Exception e){
        JFrame jf=new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf,e);
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 183));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 68, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setText("Add New Question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 0, -1, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1452, 19, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 1552, 11));

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        jLabel3.setText("Question ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 121, 141, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("00");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 121, 40, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        jLabel5.setText("Question: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 159, -1, 28));

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        jLabel6.setText("Option 1:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 117, 24));

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        jLabel7.setText("Option 2:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 117, 24));

        jLabel8.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        jLabel8.setText("Option 3:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 117, 24));

        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        jLabel9.setText("Option 4:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 117, 24));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 701, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 700, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 700, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 700, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 700, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        jLabel10.setText("Answer:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 97, 22));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 700, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 414, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 414, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index_nice_bg.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        adminHome.open=0;
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id=jLabel4.getText();
        String name=jTextField1.getText();
        String opt1=jTextField2.getText();
        String opt2=jTextField3.getText();
        String opt3=jTextField4.getText();
        String opt4=jTextField5.getText();
        String answer=jTextField6.getText();
        try{
            Connection con=ConnectionProvider.getConn();
            PreparedStatement ps=con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
            ps.setString(1,id);
            ps.setString(2,name);
            ps.setString(3,opt1);
            ps.setString(4,opt2);
            ps.setString(5,opt3);
            ps.setString(6,opt4);
            ps.setString(7,answer);
            ps.executeUpdate();
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop (true);
            JOptionPane.showMessageDialog(jf, "Successfully Updated");
            setVisible (false);
            new addNewQuestion().setVisible(true);
            
        }
        catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop (true);
            JOptionPane.showMessageDialog(jf, e);
        
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(addNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
