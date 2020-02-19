/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telhaisystems;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import static telhaisystems.SQLStuff.*;

/**
 *
 * @author Nitzan
 */
public class TechnologyForm extends javax.swing.JFrame {

    /**
     * Creates new form TechnologyForm
     */
    public TechnologyForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addStuBtn = new javax.swing.JButton();
        remStuBtn = new javax.swing.JButton();
        showStuBtn = new javax.swing.JButton();
        addTeachBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        remTeachBtn = new javax.swing.JButton();
        showTeachBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Choose Your Actions:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 0, 134, 31));

        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setText("-Students-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 37, 64, -1));

        addStuBtn.setText("Add Student");
        addStuBtn.setActionCommand("addStu");
        addStuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStuBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addStuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 121, -1));

        remStuBtn.setText("Remove Student");
        remStuBtn.setActionCommand("addStu");
        remStuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remStuBtnActionPerformed(evt);
            }
        });
        getContentPane().add(remStuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 56, -1, -1));

        showStuBtn.setText("Show Students");
        showStuBtn.setActionCommand("addStu");
        showStuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStuBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showStuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 87, 121, -1));

        addTeachBtn.setText("Add Teacher");
        addTeachBtn.setActionCommand("addStu");
        addTeachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeachBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addTeachBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 56, 121, -1));

        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("-Teachers-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 37, 64, -1));

        remTeachBtn.setText("Remove Teacher");
        remTeachBtn.setActionCommand("addStu");
        remTeachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remTeachBtnActionPerformed(evt);
            }
        });
        getContentPane().add(remTeachBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 56, -1, -1));

        showTeachBtn.setText("Show Teachers");
        showTeachBtn.setActionCommand("addStu");
        showTeachBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTeachBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showTeachBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 130, -1));

        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("(Technology)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 37, 82, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telhaisystems/3b8ad2c7b1be2caf24321c852103598a-1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -40, 860, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStuBtnActionPerformed
       AddTechnologyStudentForm AddTechnologyStudentForm =new AddTechnologyStudentForm();
       AddTechnologyStudentForm.setVisible(true);
    }//GEN-LAST:event_addStuBtnActionPerformed

    private void remStuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remStuBtnActionPerformed
       RemoveTechnologyStudentForm RemoveTechnologyStudentForm = new RemoveTechnologyStudentForm();
       RemoveTechnologyStudentForm.setVisible(true);
    }//GEN-LAST:event_remStuBtnActionPerformed

    private void showStuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStuBtnActionPerformed
       ShowStudentForm stuForm =new ShowStudentForm();//mofa shel ha tavla avur student
       thTechnology thTechnology=new thTechnology();
       thTechnology.StudentList=getTechnologyStuFromSQL();
        
                DefaultTableModel model=(DefaultTableModel)stuForm.studentTable.getModel();
                Object[] rows=new Object[5];
                System.out.print("PO");
                for(int i=0;i<thTechnology.StudentList.size();i++) //himum la tavla
                {
                    rows[0]=thTechnology.StudentList.get(i).getId();//0 is id
                    rows[1]=thTechnology.StudentList.get(i).getName();//1 is name
                    rows[2]=thTechnology.StudentList.get(i).getSub();//2 is subject
                    rows[3]=thTechnology.StudentList.get(i).getCollege();//3 is whichcollege
                    rows[4]=thTechnology.StudentList.get(i).getYears();//4 is years
                    
                    model.addRow(rows);
                }
       stuForm.setVisible(true);
    }//GEN-LAST:event_showStuBtnActionPerformed

    private void addTeachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeachBtnActionPerformed
        AddTechnologyTeachForm AddTechnologyTeachForm = new AddTechnologyTeachForm();
        AddTechnologyTeachForm.setVisible(true);
    }//GEN-LAST:event_addTeachBtnActionPerformed

    private void remTeachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remTeachBtnActionPerformed
        RemoveTechnologyTeachForm RemoveTechnologyTeachForm=new RemoveTechnologyTeachForm();
        RemoveTechnologyTeachForm.setVisible(true);
    }//GEN-LAST:event_remTeachBtnActionPerformed

    private void showTeachBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTeachBtnActionPerformed
       ShowTeachForm teachForm =new ShowTeachForm();//mofa shel ha tavla avur teacher
       thTechnology thTechnology=new thTechnology();
       thTechnology.TeacherList=getTechnologyTeachFromSQL();
        
                DefaultTableModel model=(DefaultTableModel)teachForm.studentTable.getModel();
                Object[] rows=new Object[4];
                System.out.print("PO");
                for(int i=0;i<thTechnology.TeacherList.size();i++) //himum la tavla
                {
                    rows[0]=thTechnology.TeacherList.get(i).getId();//0 is id
                    rows[1]=thTechnology.TeacherList.get(i).getName();//1 is name
                    rows[2]=thTechnology.TeacherList.get(i).getSub();//2 is subject
                    rows[3]=thTechnology.TeacherList.get(i).getCollege();//3 is whichcollege
                    model.addRow(rows);
                }
       teachForm.setVisible(true);
    }//GEN-LAST:event_showTeachBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TechnologyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TechnologyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TechnologyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TechnologyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TechnologyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStuBtn;
    private javax.swing.JButton addTeachBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton remStuBtn;
    private javax.swing.JButton remTeachBtn;
    private javax.swing.JButton showStuBtn;
    private javax.swing.JButton showTeachBtn;
    // End of variables declaration//GEN-END:variables
}
