/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wimbledonapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *BSHC 1A
 * Group 2
 * Student number: 13114310
 * @author Dagnija KAulina-Brante
 */
public class BookTickets extends javax.swing.JFrame {

    private String event, name1, email;
    private int numberAdults, numberBaby, numberKids, total;

    /**
     * Creates new form BookTickets
     * @param userName
     * @param userSurname
     * @param userEmail
     */
    public BookTickets(String userName, String userSurname, String userEmail) {

        initComponents();
      
        nameLB.setText(userName+" "+userSurname);
        emailLB.setText(userEmail);

    }

    private BookTickets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        homePanel = new javax.swing.JPanel();
        bookPanel = new javax.swing.JPanel();
        welcomeLB = new javax.swing.JLabel();
        eventLB = new javax.swing.JLabel();
        eventCBox = new javax.swing.JComboBox();
        seatPlaceLB = new javax.swing.JLabel();
        vipRB = new javax.swing.JRadioButton();
        standartRB = new javax.swing.JRadioButton();
        economicRB = new javax.swing.JRadioButton();
        ticketPriceLB = new javax.swing.JLabel();
        ticketPriceTF = new javax.swing.JTextField();
        totalAmountLB = new javax.swing.JLabel();
        totalAmountTF = new javax.swing.JTextField();
        bookBT = new javax.swing.JButton();
        nameLB = new javax.swing.JLabel();
        emailLB = new javax.swing.JLabel();
        nrAdultsLB = new javax.swing.JLabel();
        nrBabyLB = new javax.swing.JLabel();
        nrKidsLB = new javax.swing.JLabel();
        adultsCBox = new javax.swing.JComboBox();
        babyCBox = new javax.swing.JComboBox();
        kidsCBox = new javax.swing.JComboBox();
        childrenLB = new javax.swing.JLabel();
        adultsLB = new javax.swing.JLabel();
        ticketPriceKidsTF = new javax.swing.JTextField();
        printBT = new javax.swing.JButton();
        logoLB = new javax.swing.JLabel();
        homeLB = new javax.swing.JLabel();
        backButtonLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homePanel.setBackground(new java.awt.Color(98, 25, 122));
        homePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homePanel.setMaximumSize(new java.awt.Dimension(400, 500));
        homePanel.setPreferredSize(new java.awt.Dimension(400, 500));

        bookPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Tickets", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(51, 102, 0))); // NOI18N
        bookPanel.setPreferredSize(new java.awt.Dimension(314, 349));

        welcomeLB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        welcomeLB.setText("Welcome!!!");

        eventLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eventLB.setText("Event");

        eventCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Week 1", "Week 2" }));
        eventCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventCBoxActionPerformed(evt);
            }
        });

        seatPlaceLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        seatPlaceLB.setText("Seating area");

        buttonGroup1.add(vipRB);
        vipRB.setText("VIP");
        vipRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(standartRB);
        standartRB.setText("Standart");
        standartRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standartRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(economicRB);
        economicRB.setText("Economic");
        economicRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                economicRBActionPerformed(evt);
            }
        });

        ticketPriceLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ticketPriceLB.setText("Price for single ticket");

        ticketPriceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketPriceTFActionPerformed(evt);
            }
        });

        totalAmountLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totalAmountLB.setText("Total price");

        totalAmountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalAmountTFActionPerformed(evt);
            }
        });
        totalAmountTF.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                totalAmountTFPropertyChange(evt);
            }
        });

        bookBT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bookBT.setText("Book YourTicket's");
        bookBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBTActionPerformed(evt);
            }
        });

        nameLB.setFont(new java.awt.Font("Trajan Pro 3", 1, 14)); // NOI18N

        emailLB.setFont(new java.awt.Font("Trajan Pro 3", 2, 12)); // NOI18N

        nrAdultsLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nrAdultsLB.setText("Nr. of Adults");

        nrBabyLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nrBabyLB.setText("Nr. of children under 5");

        nrKidsLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nrKidsLB.setText("Nr. of children 5-12");

        adultsCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        adultsCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultsCBoxActionPerformed(evt);
            }
        });

        babyCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        babyCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                babyCBoxActionPerformed(evt);
            }
        });

        kidsCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        kidsCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidsCBoxActionPerformed(evt);
            }
        });

        childrenLB.setText("Children 5-12:");

        adultsLB.setText("Adults:");

        printBT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        printBT.setText("Print Your Booking");
        printBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookPanelLayout = new javax.swing.GroupLayout(bookPanel);
        bookPanel.setLayout(bookPanelLayout);
        bookPanelLayout.setHorizontalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPanelLayout.createSequentialGroup()
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(childrenLB))
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addComponent(ticketPriceLB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(adultsLB)))
                                .addGap(18, 18, 18)
                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ticketPriceTF, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(ticketPriceKidsTF)))
                            .addGroup(bookPanelLayout.createSequentialGroup()
                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(emailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seatPlaceLB)
                                            .addComponent(eventLB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bookPanelLayout.createSequentialGroup()
                                                .addComponent(vipRB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(standartRB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(economicRB))
                                            .addComponent(welcomeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eventCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addComponent(nrKidsLB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kidsCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addComponent(nrAdultsLB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adultsCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addComponent(nrBabyLB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(babyCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addComponent(totalAmountLB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 37, Short.MAX_VALUE))))
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookBT, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(printBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bookPanelLayout.setVerticalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPanelLayout.createSequentialGroup()
                .addComponent(welcomeLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventLB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatPlaceLB)
                    .addComponent(vipRB)
                    .addComponent(standartRB)
                    .addComponent(economicRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketPriceLB)
                    .addComponent(ticketPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adultsLB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childrenLB)
                    .addComponent(ticketPriceKidsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrAdultsLB)
                    .addComponent(adultsCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrBabyLB)
                    .addComponent(babyCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrKidsLB)
                    .addComponent(kidsCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAmountLB)
                    .addComponent(totalAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printBT)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        logoLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/logologo1.jpg"))); // NOI18N

        homeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/home1.jpg"))); // NOI18N
        homeLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLBMouseClicked(evt);
            }
        });

        backButtonLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/back real.png"))); // NOI18N
        backButtonLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonLBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLB)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(backButtonLB)
                        .addGap(63, 63, 63)
                        .addComponent(homeLB))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(logoLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButtonLB)
                    .addComponent(homeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLBMouseClicked
        // TODO add your handling code here:
        MainProject myMainProjectGUI = new MainProject();
        myMainProjectGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeLBMouseClicked

    private void bookBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBTActionPerformed
        // TODO add your handling code here:
   
         numberAdults = Integer.parseInt((String)adultsCBox.getSelectedItem()); 
         numberKids = Integer.parseInt((String)kidsCBox.getSelectedItem());
         numberBaby = Integer.parseInt((String)babyCBox.getSelectedItem()); 
    
         if((numberAdults== 0 && numberBaby >0)||(numberAdults== 0 && numberKids >0)){  
    
                            JOptionPane.showMessageDialog(null, "ERROR! At least one adult should be booked!");
         }
         else if(!vipRB.isSelected()&&!standartRB.isSelected()&&!economicRB.isSelected()){  
                            JOptionPane.showMessageDialog(null,"Select type of tickets!");
         }
         else if(numberAdults==0 && numberBaby==0 && numberKids==0){
             JOptionPane.showMessageDialog(null, "Please select tickets");
         }
         else{       
        
             int userInput = JOptionPane.showConfirmDialog(null, "Would You like to proceed with booking?"); 
                 if(userInput == JOptionPane.YES_OPTION){
                     JOptionPane.showMessageDialog(null, "Thank You for booking tickets! \nYour details:\n    Name: " +nameLB.getText()+"\n    Email: "+emailLB.getText()+ "\nTotal amount to pay on arrival is: " + totalAmountTF.getText()+" EUR");
                 }
         }
          
  
        File outFile;
        FileWriter fw;
        BufferedWriter bw;
        String nameFull = nameLB.getText();
        String emailFull= emailLB.getText();
        String eventFull=(String)eventCBox.getSelectedItem();
        String adultTicket=(String)adultsCBox.getSelectedItem();
        String babyTickets= (String)babyCBox.getSelectedItem();
        String kidsTickets= (String)kidsCBox.getSelectedItem();
        String fullPrice= totalAmountTF.getText();
        

        try {
            outFile = new File("booking.txt");
            fw = new FileWriter(outFile);
            bw = new BufferedWriter(fw);

            bw.write(nameFull);
            bw.newLine();
            bw.write(emailFull);
            bw.newLine();
            bw.write(eventFull);
            bw.newLine();
            bw.write(adultTicket);
            bw.newLine();
            bw.write(babyTickets);
            bw.newLine();
            bw.write(kidsTickets);
            bw.newLine();
            bw.write(fullPrice);
            bw.newLine();
            bw.close();
           
        } 
        catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }
    }//GEN-LAST:event_bookBTActionPerformed

    private void backButtonLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonLBMouseClicked
        // TODO add your handling code here:
        More myMoreGUI = new More();
        myMoreGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonLBMouseClicked

    private void eventCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventCBoxActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_eventCBoxActionPerformed

    private void vipRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vipRBActionPerformed
        // TODO add your handling code here:

        if (eventCBox.getSelectedItem().equals("Week 1")&&vipRB.isSelected()) {
                        ticketPriceTF.setText(Integer.toString(62));
                        ticketPriceKidsTF.setText(Integer.toString(48));
        } 
        else if (eventCBox.getSelectedItem().equals("Week 2")&&vipRB.isSelected()) {
                        ticketPriceTF.setText(Integer.toString(60));
                        ticketPriceKidsTF.setText(Integer.toString(40));
        }

        updatePrice();
    }//GEN-LAST:event_vipRBActionPerformed

    private void standartRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standartRBActionPerformed
        // TODO add your handling code here:
        if (eventCBox.getSelectedItem().equals("Week 1")) {
                         ticketPriceTF.setText(Integer.toString(52));
                         ticketPriceKidsTF.setText(Integer.toString(41));

        } 
        else if (eventCBox.getSelectedItem().equals("Week 2")) {
                        ticketPriceTF.setText(Integer.toString(50));
                        ticketPriceKidsTF.setText(Integer.toString(35));
        }
        updatePrice();
    }//GEN-LAST:event_standartRBActionPerformed

    private void updatePrice() {
        int price = Integer.parseInt(ticketPriceTF.getText());
        int price1 = Integer.parseInt(ticketPriceKidsTF.getText());
        numberAdults = Integer.parseInt((String) adultsCBox.getSelectedItem());
        numberKids = Integer.parseInt((String) kidsCBox.getSelectedItem());
        numberBaby = Integer.parseInt((String) babyCBox.getSelectedItem());
        total = (price * numberAdults) + (price1 * numberKids);
        totalAmountTF.setText(Integer.toString(total));

    }
    private void totalAmountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalAmountTFActionPerformed
        // TODO add your handling code here:
         updatePrice();
    }//GEN-LAST:event_totalAmountTFActionPerformed

    private void totalAmountTFPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_totalAmountTFPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_totalAmountTFPropertyChange

    private void economicRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_economicRBActionPerformed
        // TODO add your handling code here:
        if (eventCBox.getSelectedItem().equals("Week 1")) {

            ticketPriceTF.setText(Integer.toString(46));
            ticketPriceKidsTF.setText(Integer.toString(38));

        } else if (eventCBox.getSelectedItem().equals("Week 2")) {
            ticketPriceTF.setText(Integer.toString(40));
            ticketPriceKidsTF.setText(Integer.toString(30));
        }
        updatePrice();
    }//GEN-LAST:event_economicRBActionPerformed


    private void ticketPriceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketPriceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketPriceTFActionPerformed

    private void adultsCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultsCBoxActionPerformed
        // TODO add your handling code here:
        updatePrice();

    }//GEN-LAST:event_adultsCBoxActionPerformed

    private void babyCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_babyCBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_babyCBoxActionPerformed

    private void kidsCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidsCBoxActionPerformed
        // TODO add your handling code here:
        updatePrice();
    }//GEN-LAST:event_kidsCBoxActionPerformed

    private void printBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBTActionPerformed
        // TODO add your handling code here:
        String nameFull, emailFull, eventFull, adultTickets, kidsTickets, babyTickets, fullPrice;
         File inFile;
         FileReader fr;
         BufferedReader br;
         try{
                inFile= new File("booking.txt");
                fr= new FileReader(inFile);
                br= new BufferedReader(fr);
                nameFull= br.readLine();
                emailFull= br.readLine();
                eventFull= br.readLine();
                adultTickets= br.readLine();
                kidsTickets= br.readLine();
                babyTickets= br.readLine();
                fullPrice= br.readLine();
       
            while(nameFull != null){
                   JOptionPane.showMessageDialog(null, "Name: "+ nameFull+ "\nEmail: "+ emailFull+"\nEvent in: "+eventFull+"\nTotal price: "+ fullPrice+" EUR\nYou had been booked tickets for:\n      "+adultTickets+" Adults;\n      "+kidsTickets+" Kids;\n      "+babyTickets+ " Childrens under age of 5 ");
                   nameFull= br.readLine();
                   emailFull= br.readLine();
            }
                    br.close();
         }
         catch(IOException e){
                System.out.println(e);
         }
        
         
    }//GEN-LAST:event_printBTActionPerformed

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
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox adultsCBox;
    private javax.swing.JLabel adultsLB;
    private javax.swing.JComboBox babyCBox;
    private javax.swing.JLabel backButtonLB;
    private javax.swing.JButton bookBT;
    private javax.swing.JPanel bookPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel childrenLB;
    private javax.swing.JRadioButton economicRB;
    private javax.swing.JLabel emailLB;
    private javax.swing.JComboBox eventCBox;
    private javax.swing.JLabel eventLB;
    private javax.swing.JLabel homeLB;
    private javax.swing.JPanel homePanel;
    private javax.swing.JComboBox kidsCBox;
    private javax.swing.JLabel logoLB;
    private javax.swing.JLabel nameLB;
    private javax.swing.JLabel nrAdultsLB;
    private javax.swing.JLabel nrBabyLB;
    private javax.swing.JLabel nrKidsLB;
    private javax.swing.JButton printBT;
    private javax.swing.JLabel seatPlaceLB;
    private javax.swing.JRadioButton standartRB;
    private javax.swing.JTextField ticketPriceKidsTF;
    private javax.swing.JLabel ticketPriceLB;
    private javax.swing.JTextField ticketPriceTF;
    private javax.swing.JLabel totalAmountLB;
    private javax.swing.JTextField totalAmountTF;
    private javax.swing.JRadioButton vipRB;
    private javax.swing.JLabel welcomeLB;
    // End of variables declaration//GEN-END:variables
}