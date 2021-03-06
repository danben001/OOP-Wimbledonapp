/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wimbledonapp;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * BSHC 1A
 * Group 2
 * Student number: 13114310
 * @author Dagnija Kaulina-Brante
 * section more
 * 
 *  Referenced to video from Youtube.com. Link: https://www.youtube.com/watch?v=lMbfAyFYkDM
 */
public class WeatherForecast extends javax.swing.JFrame {

    /**
     * Creates new form WeatherForecast
     */
    public WeatherForecast() {
        initComponents();
        WeatherDate();
    }
private void WeatherDate(){                  /* Referenced to video from Youtube.com. Link: https://www.youtube.com/watch?v=lMbfAyFYkDM*/
    Calendar cal = new GregorianCalendar();
    int month = cal.get(Calendar.MONTH);
    int year = cal.get(Calendar.YEAR);
    int day = cal.get(Calendar.DAY_OF_MONTH);
    dayLB.setText("Todays date: "+year+"/"+(month+1)+"/"+day);
    
    
    int second = cal.get(Calendar.SECOND);
    int minute = cal.get(Calendar.MINUTE);
    int hour = cal.get(Calendar.HOUR);
    timeLB.setText("Time: "+hour+":"+minute+":"+second);
    
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        wPanel = new javax.swing.JPanel();
        futureCBoxLB = new javax.swing.JLabel();
        futureCBox = new javax.swing.JComboBox();
        dayLB = new javax.swing.JLabel();
        weatherPanel = new javax.swing.JPanel();
        timeLB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        homeLB = new javax.swing.JLabel();
        logoLB = new javax.swing.JLabel();
        backLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homePanel.setBackground(new java.awt.Color(98, 25, 122));
        homePanel.setPreferredSize(new java.awt.Dimension(365, 500));

        wPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Weather", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(51, 102, 0)), "Weather Forecast", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(51, 102, 0))); // NOI18N

        futureCBoxLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        futureCBoxLB.setText("Weather for next week");

        futureCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enter day...", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        futureCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                futureCBoxActionPerformed(evt);
            }
        });

        dayLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dayLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout weatherPanelLayout = new javax.swing.GroupLayout(weatherPanel);
        weatherPanel.setLayout(weatherPanelLayout);
        weatherPanelLayout.setHorizontalGroup(
            weatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        weatherPanelLayout.setVerticalGroup(
            weatherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        timeLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        timeLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/todaysweather.JPG"))); // NOI18N

        javax.swing.GroupLayout wPanelLayout = new javax.swing.GroupLayout(wPanel);
        wPanel.setLayout(wPanelLayout);
        wPanelLayout.setHorizontalGroup(
            wPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wPanelLayout.createSequentialGroup()
                .addGroup(wPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wPanelLayout.createSequentialGroup()
                        .addComponent(dayLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wPanelLayout.createSequentialGroup()
                        .addComponent(futureCBoxLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(futureCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wPanelLayout.createSequentialGroup()
                        .addGroup(wPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(wPanelLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel2))
                            .addGroup(wPanelLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(weatherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        wPanelLayout.setVerticalGroup(
            wPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wPanelLayout.createSequentialGroup()
                .addGroup(wPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dayLB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(wPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(futureCBoxLB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(futureCBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weatherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        homeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/home1.jpg"))); // NOI18N
        homeLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLBMouseClicked(evt);
            }
        });

        logoLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/logologo1.jpg"))); // NOI18N

        backLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/back real.png"))); // NOI18N
        backLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLB)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(backLB)
                        .addGap(46, 46, 46)
                        .addComponent(homeLB))
                    .addComponent(wPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addComponent(backLB)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addComponent(homeLB)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBMouseClicked
        // TODO add your handling code here:
         MainProject myMainProjectGUI= new MainProject();
        myMainProjectGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeLBMouseClicked

    private void futureCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_futureCBoxActionPerformed
        // TODO add your handling code here:
        if(futureCBox.getSelectedItem().equals("Monday")){
             WeatherForecast.weatherPanel.removeAll();
            WeatherForecast.weatherPanel.setVisible(false);
            Monday mo= new Monday();
            mo.setBounds(0,0,120,110);
            WeatherForecast.weatherPanel.add(mo);
            WeatherForecast.weatherPanel.setVisible(true);
            
            
        }
        else if(futureCBox.getSelectedItem().equals("Tuesday")){
              WeatherForecast.weatherPanel.removeAll();
            WeatherForecast.weatherPanel.setVisible(false);
            Tuesday t= new Tuesday();
            t.setBounds(0,0,120,110);
            WeatherForecast.weatherPanel.add(t);
            WeatherForecast.weatherPanel.setVisible(true);
            
        }
        else if(futureCBox.getSelectedItem().equals("Wednesday")){
               WeatherForecast.weatherPanel.removeAll();
            WeatherForecast.weatherPanel.setVisible(false);
            Wednesday w= new Wednesday();
            w.setBounds(0,0,120,110);
            WeatherForecast.weatherPanel.add(w);
            WeatherForecast.weatherPanel.setVisible(true);
        }
        else if(futureCBox.getSelectedItem().equals("Thursday")){
            WeatherForecast.weatherPanel.removeAll();
            WeatherForecast.weatherPanel.setVisible(false);
            Thursday th= new Thursday();
            th.setBounds(0,0,120,110);
            WeatherForecast.weatherPanel.add(th);
            WeatherForecast.weatherPanel.setVisible(true);
        }
        else if(futureCBox.getSelectedItem().equals("Friday")){
               WeatherForecast.weatherPanel.removeAll();
            WeatherForecast.weatherPanel.setVisible(false);
            Friday fi= new Friday();
            fi.setBounds(0,0,120,110);
            WeatherForecast.weatherPanel.add(fi);
            WeatherForecast.weatherPanel.setVisible(true);
            
        }
        else if(futureCBox.getSelectedItem().equals("Saturday")){
               WeatherForecast.weatherPanel.removeAll();
            WeatherForecast.weatherPanel.setVisible(false);
            Saturday sa= new Saturday();
            sa.setBounds(0,0,120,110);
            WeatherForecast.weatherPanel.add(sa);
            WeatherForecast.weatherPanel.setVisible(true);
        }
        
     
            
    }//GEN-LAST:event_futureCBoxActionPerformed

    private void backLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBMouseClicked
        // TODO add your handling code here:
        More myMoreGUI= new More();
        myMoreGUI.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_backLBMouseClicked

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
            java.util.logging.Logger.getLogger(WeatherForecast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherForecast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherForecast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherForecast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherForecast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLB;
    private javax.swing.JLabel dayLB;
    private javax.swing.JComboBox futureCBox;
    private javax.swing.JLabel futureCBoxLB;
    private javax.swing.JLabel homeLB;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logoLB;
    private javax.swing.JLabel timeLB;
    private javax.swing.JPanel wPanel;
    private static javax.swing.JPanel weatherPanel;
    // End of variables declaration//GEN-END:variables
}
