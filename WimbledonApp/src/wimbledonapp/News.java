package wimbledonapp;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x13548867
 */

import java.util.Calendar;
import java.util.GregorianCalendar;


public final class News extends javax.swing.JFrame {

    /**
     * Creates new form News
     */
    public News() {
        initComponents();
        CurrentDate();
    }

   public void CurrentDate () {
       Calendar cal = new GregorianCalendar();
       int month =cal.get(Calendar.MONTH);
       int year =cal.get(Calendar.YEAR);
       int day =cal.get(Calendar.DAY_OF_MONTH);
       date.setText(year+"/"+(month+1)+"/"+day);
    
    
    
    
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        BackgroundImage = new javax.swing.JLabel();
        LinkScore = new javax.swing.JButton();
        LinkSchedule = new javax.swing.JButton();
        LinkNewsletter = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        News = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Home = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(98, 25, 100));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel10.setBackground(new java.awt.Color(98, 25, 122));
        jPanel10.setMaximumSize(new java.awt.Dimension(400, 500));
        jPanel10.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/WimbledonTennisBallNet.jpg"))); // NOI18N
        jPanel10.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 410, 300));

        LinkScore.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LinkScore.setText("Score");
        LinkScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel10.add(LinkScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 107, 30));

        LinkSchedule.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LinkSchedule.setText("Schedule");
        LinkSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkScheduleActionPerformed(evt);
            }
        });
        jPanel10.add(LinkSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 112, 30));

        LinkNewsletter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LinkNewsletter.setText("NewsLetter");
        LinkNewsletter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(LinkNewsletter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 120, 30));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/logologo1.jpg"))); // NOI18N
        jPanel10.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        News.setBackground(new java.awt.Color(1, 103, 55));
        News.setMaximumSize(new java.awt.Dimension(340, 60));
        News.setPreferredSize(new java.awt.Dimension(340, 60));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("News");

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout NewsLayout = new javax.swing.GroupLayout(News);
        News.setLayout(NewsLayout);
        NewsLayout.setHorizontalGroup(
            NewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewsLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        NewsLayout.setVerticalGroup(
            NewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewsLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel10.add(News, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 80));

        Home.setBackground(new java.awt.Color(1, 103, 55));
        Home.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/home1.jpg"))); // NOI18N
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel10.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        NewsLetter myNewsLetter= new NewsLetter();
        myNewsLetter.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Scores1 myScores1= new Scores1();
        myScores1.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       
        MainProject myMainProjectGUI= new MainProject();
        myMainProjectGUI.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_jLabel12MouseClicked

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        MainProject myMainProjectGUI= new MainProject();
        myMainProjectGUI.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_HomeActionPerformed
 
    
    private void LinkScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkScheduleActionPerformed
       Schedule1 mySchedule1= new Schedule1();
        mySchedule1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LinkScheduleActionPerformed

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
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new News().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JButton Home;
    private javax.swing.JButton LinkNewsletter;
    private javax.swing.JButton LinkSchedule;
    private javax.swing.JButton LinkScore;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel News;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables

   
    
        }
