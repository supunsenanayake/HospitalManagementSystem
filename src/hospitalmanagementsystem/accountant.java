/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

/**
 *
 * @author A C E R
 */
public class accountant extends javax.swing.JFrame {
    
    String SelectedRedioBtn = "";
    private int accountent_id;
    /**
     * Creates new form accountant
     */
    public accountant() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        mygroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rBtnMakeSalary = new javax.swing.JRadioButton();
        rBtnAddAttendance = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        rBtnMakeBill = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnPatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Management System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "accountant", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel1.setOpaque(false);

        mygroup.add(rBtnMakeSalary);
        rBtnMakeSalary.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rBtnMakeSalary.setText("Make Salary ");
        rBtnMakeSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMakeSalaryActionPerformed(evt);
            }
        });

        mygroup.add(rBtnAddAttendance);
        rBtnAddAttendance.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rBtnAddAttendance.setText("Add attendance");
        rBtnAddAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnAddAttendanceActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mygroup.add(rBtnMakeBill);
        rBtnMakeBill.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rBtnMakeBill.setText("Make Bill");
        rBtnMakeBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMakeBillActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("View Profile");

        btnPatient.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnPatient.setText("Profile");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rBtnMakeBill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rBtnAddAttendance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rBtnMakeSalary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(583, 583, 583))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rBtnMakeSalary)
                .addGap(18, 18, 18)
                .addComponent(rBtnAddAttendance)
                .addGap(18, 18, 18)
                .addComponent(rBtnMakeBill)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnPatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 450, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/accountent1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rBtnAddAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnAddAttendanceActionPerformed
        // TODO add your handling code here:
        SelectedRedioBtn = "rBtnAddAttendance";

    }//GEN-LAST:event_rBtnAddAttendanceActionPerformed

    private void rBtnMakeBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMakeBillActionPerformed
        // TODO add your handling code here:
        SelectedRedioBtn = "rBtnMakeBill";
    }//GEN-LAST:event_rBtnMakeBillActionPerformed

    private void rBtnMakeSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnMakeSalaryActionPerformed
        // TODO add your handling code here:
        SelectedRedioBtn = "rBtnMakeSalary";
    }//GEN-LAST:event_rBtnMakeSalaryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // choosing  selected one

        if (SelectedRedioBtn.equals("rBtnMakeSalary")) {  
            //selecte Make salary
            salary s=new salary();
            s.setVisible(true);
            this.dispose();
        } else if (SelectedRedioBtn.equals("rBtnAddAttendance")) {
            //selected Add attendance
            attendance at=new attendance();
            at.setAccountent_id(accountent_id);
            at.setVisible(true);
            this.dispose();
        } else if (SelectedRedioBtn.equals("rBtnViewEmployee")) {
            //selected View employee attendence
            System.out.println("C");
        } else if (SelectedRedioBtn.equals("rBtnMakeBill")) {
            //selected make Bill
            MakePatientBill m=new MakePatientBill();
            m.setAccountent_id(accountent_id);
            m.setVisible(true);
            this.dispose();
        } else {
            System.out.println("Null");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Go back mainFrame jframe
        MainFrame mf=new MainFrame();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // go view profile jframe
        viewProfile vp=new viewProfile();
        System.out.println(getAccountent_id());
        vp.setEmp_id(Integer.toString(getAccountent_id()));
        vp.setEmp_state("accountant");
        vp.updateGui();
        vp.setVisible(true);
    }//GEN-LAST:event_btnPatientActionPerformed

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
            java.util.logging.Logger.getLogger(accountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.ButtonGroup mygroup;
    private javax.swing.JRadioButton rBtnAddAttendance;
    private javax.swing.JRadioButton rBtnMakeBill;
    private javax.swing.JRadioButton rBtnMakeSalary;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the accountent_id
     */
    public int getAccountent_id() {
        return accountent_id;
    }

    /**
     * @param accountent_id the accountent_id to set
     */
    public void setAccountent_id(int accountent_id) {
        this.accountent_id = accountent_id;
    }
}