/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author A C E R
 */
public class MainFrame extends javax.swing.JFrame {

    dbOperation dbo = new dbOperation();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtEmployeeID = new javax.swing.JTextField();
        cBoxPosition = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospitality Management System");
        setMinimumSize(new java.awt.Dimension(1250, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Position");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 60, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N
        jPanel2.setOpaque(false);

        btnLogin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        txtEmployeeID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        cBoxPosition.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cBoxPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctor", "Nurse", "accountant", "admin" }));
        cBoxPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPositionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Password");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Employee ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(cBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnLogin)
                .addGap(62, 62, 62))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 370, 310));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aaa.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      
        int x = dbo.checkEmployeeId(txtEmployeeID.getText());//check Employeeid is exist
        boolean ok = false;
        if (x == 0) {//if Employee id is exist x=0
            int y = dbo.checkPasswordForParticularUsername(txtPassword.getText(), txtEmployeeID.getText());//chck username &password  match
            if (y == 0) {//y=0 ,when username &password are match
                System.out.println("login ok");
                ok = true;
            } else if (y == 1) {//y=1 , when username&password does not match
                JOptionPane.showMessageDialog(this, "username or password is incorrect !");//display massage
            } else {
                JOptionPane.showMessageDialog(this, "error occur while checking password !");//if error occur while run checkPasswordForParticularUsername method show this error massage 
            }
        } else if (x == 1) {//if Employee id does not  x=1
            JOptionPane.showMessageDialog(this, "username or password is incorrect !");// display this error massage
        } else {
            JOptionPane.showMessageDialog(this, "error occur while checking username !");// if x= other one ,show this error massage because error occure while checking checkPasswordForParticularUsername  method
        }
        if (ok) {//when password &username are all correct ok =true 
            String position = (String) cBoxPosition.getSelectedItem();
            System.out.println(txtEmployeeID.getText() + position);
            int xx = dbo.check_Whether_Given_Employee_ID_is_equal_given_state(txtEmployeeID.getText(), position);
            if (xx == 0 && (position == "Doctor")) {//if user doctor 
                consultents con = new consultents();
                con.setConsultent_id(Integer.parseInt(txtEmployeeID.getText()));
                con.setVisible(true);
                this.dispose();
            } else if (xx == 0 && (position == "Nurse")) {//if user Nurse
                Nurse nrs = new Nurse();
                nrs.setNurseId(Integer.parseInt(txtEmployeeID.getText()));
                nrs.setVisible(true);
                this.dispose();
            } else if (xx == 0 && (position == "accountant")) {//if user accountant
                accountant ac = new accountant();
                ac.setAccountent_id(Integer.parseInt(txtEmployeeID.getText()));
                ac.setVisible(true);
                this.dispose();

            } else if (xx == 0 && (position == "admin")) {//if user doctor 
                Admin ad=new Admin();
                ad.setAdmin_id(Integer.parseInt(txtEmployeeID.getText()));
                ad.setVisible(true);
                this.dispose();
            } else if (xx == 1) {//when user given position is not display massage 
                JOptionPane.showMessageDialog(this, "position is not match !");
            } else if (xx == 2) {//if error occur while exicute check_Whether_Given_Employee_ID_is_equal_given_state method display massage
                JOptionPane.showMessageDialog(this, "error occur while excute database query !");
            }

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cBoxPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxPositionActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox cBoxPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
