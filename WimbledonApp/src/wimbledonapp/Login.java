/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wimbledonapp;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.*;
/**
 *BSHC 1A
 * Group 2
 * Student number 13114310
 * @author Dagnija Kaulina-Brante
 */
public class Login extends javax.swing.JFrame {
    Connection com= null;
    ResultSet rs= null;
    PreparedStatment pst= null;
   


  
  
    /**
     * Creates new form Login
     */
    public Login() {
   
        initComponents();
        ageTF.setVisible(false);
        ageLB.setVisible(false);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginRBGroup = new javax.swing.ButtonGroup();
        homePanel = new javax.swing.JPanel();
        logoLB = new javax.swing.JLabel();
        homeLB = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        nameLB = new javax.swing.JLabel();
        surnameLB = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        emailLB = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        surnameTF = new javax.swing.JTextField();
        loginBettingBT = new javax.swing.JButton();
        loginRB = new javax.swing.JRadioButton();
        ticketsRB = new javax.swing.JRadioButton();
        ageLB = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        mainLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));

        homePanel.setBackground(new java.awt.Color(98, 25, 122));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/logologo1.jpg"))); // NOI18N
        homePanel.add(logoLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        homeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/home1.jpg"))); // NOI18N
        homeLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLBMouseClicked(evt);
            }
        });
        homePanel.add(homeLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(51, 102, 0))); // NOI18N

        nameLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nameLB.setText("Name");

        surnameLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        surnameLB.setText("Surname");

        nameTF.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                nameTFComponentMoved(evt);
            }
        });
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        emailLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emailLB.setText("E-mail");

        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        loginBettingBT.setText("Login");
        loginBettingBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBettingBTActionPerformed(evt);
            }
        });

        loginRBGroup.add(loginRB);
        loginRB.setText("Login to Betting");
        loginRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRBActionPerformed(evt);
            }
        });

        loginRBGroup.add(ticketsRB);
        ticketsRB.setText("Login to Book Tickets");
        ticketsRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketsRBActionPerformed(evt);
            }
        });

        ageLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ageLB.setText("Age:");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(loginRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketsRB)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLB)
                    .addComponent(surnameLB)
                    .addComponent(emailLB)
                    .addComponent(ageLB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(nameTF)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(surnameTF)
                        .addContainerGap())
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(loginBettingBT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageTF)
                            .addComponent(emailTF))
                        .addContainerGap())))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginRB)
                    .addComponent(ticketsRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLB)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLB)
                    .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLB)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLB)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(loginBettingBT)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        homePanel.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        mainLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/Untitled.png"))); // NOI18N
        homePanel.add(mainLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBettingBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBettingBTActionPerformed
        // TODO add your handling code here:
        String userName, userSurname, userEmail;
        int userCard, age;
                userName= nameTF.getText();
                userSurname= surnameTF.getText();
                userEmail= emailTF.getText();
                Login1 l2= new Login1(userName, userSurname, userEmail);
                l2.setUserName(userName);
                l2.setUserSurname(userSurname);
                l2.setUserEmail(userEmail);
        if(loginRB.isSelected()){
       if(!nameTF.getText().equals("") && !surnameTF.getText().equals("") && !emailTF.getText().equals("")&&!ageTF.getText().equals("")){
        age= Integer.parseInt(ageTF.getText());
           if(age>=18){
            
        
        userCard =Integer.parseInt(ageTF.getText());
        LoginBett l1= new LoginBett(userName, userSurname, userEmail, userCard);
                l1.setUserName(userName);
                l1.setUserSurname(userSurname);
                l1.setUserEmail(userEmail);
                l1.setUserCard(userCard);
        int userInput = JOptionPane.showConfirmDialog(null, l1.getDetails());{
                    if(userInput == JOptionPane.YES_OPTION){
                            Betting myBettingGUI= new Betting(userName, userSurname, userEmail);
                            myBettingGUI.setVisible(true);
                            this.dispose();  
       }}
       }
           else if(age<18){
                JOptionPane.showMessageDialog(null, "You must be age 18 and over to play betting!");
           }
       }
        else{
            JOptionPane.showMessageDialog(null, "You must enter all details!");
        }}
        else if(ticketsRB.isSelected()){
        
        
        if(!nameTF.getText().equals("") && !surnameTF.getText().equals("") && !emailTF.getText().equals("")){
       
        int userInput = JOptionPane.showConfirmDialog(null, l2.getDetails());{    
                
            
             if(userInput == JOptionPane.YES_OPTION){
                BookTickets myBookTickets= new BookTickets(userName, userSurname, userEmail);
                myBookTickets.setVisible(true);
                this.dispose();
        }}}
        else{
            JOptionPane.showMessageDialog(null, "You must enter all details!");
        }
         
        }
    }//GEN-LAST:event_loginBettingBTActionPerformed

    private void homeLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBMouseClicked
        // TODO add your handling code here:
        MainProject myMainProjectGUI= new MainProject();
        myMainProjectGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeLBMouseClicked

    private void nameTFComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_nameTFComponentMoved
        // TODO add your handling code here:
     
    }//GEN-LAST:event_nameTFComponentMoved

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
       
    
    }//GEN-LAST:event_nameTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_emailTFActionPerformed

    private void ticketsRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsRBActionPerformed
        // TODO add your handling code here:
        ageTF.setVisible(false);
        ageLB.setVisible(false);
    }//GEN-LAST:event_ticketsRBActionPerformed

    private void loginRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRBActionPerformed
        // TODO add your handling code here:
        ageTF.setVisible(true);
        ageLB.setVisible(true);
    }//GEN-LAST:event_loginRBActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLB;
    private javax.swing.JTextField ageTF;
    private javax.swing.JLabel emailLB;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel homeLB;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton loginBettingBT;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JRadioButton loginRB;
    private javax.swing.ButtonGroup loginRBGroup;
    private javax.swing.JLabel logoLB;
    private javax.swing.JLabel mainLB;
    private javax.swing.JLabel nameLB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel surnameLB;
    private javax.swing.JTextField surnameTF;
    private javax.swing.JRadioButton ticketsRB;
    // End of variables declaration//GEN-END:variables

    private static class PreparedStatment {

        public PreparedStatment() {
        }
    }
}
