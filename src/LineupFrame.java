
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.NumberFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Name: Edward Prenzler
 * Date: 4/28/19
 * Purpose: To construct a batting lineup app that takes input of a 
 * team name, away or home status, 9 player's names and all 9 positions.
 * This will return a list of each players name next to their respective position.
 *  
 * @author eprenzl
 */
public class LineupFrame extends javax.swing.JFrame {

    /**
     * Creates new form LineupFrame
     */
    public LineupFrame() {
        initComponents(); 
        //sets the jframe in the middle of the screen
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        //gets screensize, and then divide length in half and center to get exact location
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //I was unable to edit code in the initComponents() method for some reason
    /*The mnemonics were set to 'a' and 'x' for the accept and exit buttons, but would 
     not work on screen for me for some reason*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        teamInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        teamName = new javax.swing.JTextField();
        home = new javax.swing.JRadioButton();
        visitor = new javax.swing.JRadioButton();
        playerInfo = new javax.swing.JPanel();
        player1 = new javax.swing.JTextField();
        player2 = new javax.swing.JTextField();
        player3 = new javax.swing.JTextField();
        player4 = new javax.swing.JTextField();
        player5 = new javax.swing.JTextField();
        player6 = new javax.swing.JTextField();
        player7 = new javax.swing.JTextField();
        player8 = new javax.swing.JTextField();
        player9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        player1CB = new javax.swing.JComboBox();
        player2CB = new javax.swing.JComboBox();
        player3CB = new javax.swing.JComboBox();
        player4CB = new javax.swing.JComboBox();
        player5CB = new javax.swing.JComboBox();
        player6CB = new javax.swing.JComboBox();
        player7CB = new javax.swing.JComboBox();
        player8CB = new javax.swing.JComboBox();
        player9CB = new javax.swing.JComboBox();
        calculateLineupButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lineup");
        setResizable(false);

        teamInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Team Information")));

        jLabel1.setText("Team Name:");

        buttonGroup1.add(home);
        home.setSelected(true);
        home.setText("Home");

        buttonGroup1.add(visitor);
        visitor.setText("Visitor");

        javax.swing.GroupLayout teamInfoLayout = new javax.swing.GroupLayout(teamInfo);
        teamInfo.setLayout(teamInfoLayout);
        teamInfoLayout.setHorizontalGroup(
            teamInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(home)
                .addGap(6, 6, 6)
                .addComponent(visitor)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        teamInfoLayout.setVerticalGroup(
            teamInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teamInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home)
                    .addComponent(visitor))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        playerInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Player Information"));

        player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1ActionPerformed(evt);
            }
        });

        jLabel2.setText("1:");

        jLabel3.setText("2:");

        jLabel4.setText("3:");

        jLabel5.setText("4:");

        jLabel6.setText("5:");

        jLabel7.setText("6:");

        jLabel8.setText("7:");

        jLabel9.setText("8:");

        jLabel10.setText("9:");

        player1CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a position", "Pitcher ", "Catcher ", "First Base ", "Second Base ", "Third Base", "Short Stop ", "Left Field", "Center Field ", "Right Field" }));
        player1CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1CBActionPerformed(evt);
            }
        });

        player2CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a position", "Pitcher ", "Catcher ", "First Base ", "Second Base ", "Third Base", "Short Stop ", "Left Field", "Center Field ", "Right Field" }));
        player2CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2CBActionPerformed(evt);
            }
        });

        player3CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a position", "Pitcher ", "Catcher ", "First Base ", "Second Base ", "Third Base", "Short Stop ", "Left Field", "Center Field ", "Right Field" }));

        player4CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a position", "Pitcher ", "Catcher ", "First Base ", "Second Base ", "Third Base", "Short Stop ", "Left Field", "Center Field ", "Right Field" }));

        player5CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a position", "Pitcher ", "Catcher ", "First Base ", "Second Base ", "Third Base", "Short Stop ", "Left Field", "Center Field ", "Right Field" }));

        player6CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a position", "Pitcher ", "Catcher ", "First Base ", "Second Base ", "Third Base", "Short Stop ", "Left Field", "Center Field ", "Right Field" }));

        player7CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a position", "Pitcher ", "Catcher ", "First Base ", "Second Base ", "Third Base", "Short Stop ", "Left Field", "Center Field ", "Right Field" }));

        player8CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a position", "Pitcher ", "Catcher ", "First Base ", "Second Base ", "Third Base", "Short Stop ", "Left Field", "Center Field ", "Right Field" }));

        player9CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a position", "Pitcher ", "Catcher ", "First Base ", "Second Base ", "Third Base", "Short Stop ", "Left Field", "Center Field ", "Right Field" }));

        javax.swing.GroupLayout playerInfoLayout = new javax.swing.GroupLayout(playerInfo);
        playerInfo.setLayout(playerInfoLayout);
        playerInfoLayout.setHorizontalGroup(
            playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerInfoLayout.createSequentialGroup()
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(playerInfoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerInfoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)))
                    .addGroup(playerInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel10)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player9)
                    .addComponent(player8)
                    .addComponent(player7)
                    .addComponent(player6)
                    .addComponent(player5)
                    .addComponent(player4)
                    .addComponent(player3)
                    .addComponent(player2)
                    .addComponent(player1))
                .addGap(18, 18, 18)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player1CB, 0, 170, Short.MAX_VALUE)
                    .addComponent(player2CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player3CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player4CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player5CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player6CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player7CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player8CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player9CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        playerInfoLayout.setVerticalGroup(
            playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerInfoLayout.createSequentialGroup()
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(player1CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(player2CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(player3CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(player4CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(player5CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(player6CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(player7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(player7CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(player8CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(player9CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        calculateLineupButton.setMnemonic('a');
        calculateLineupButton.setText("Accept");
        calculateLineupButton.setToolTipText("");
        calculateLineupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateLineupButtonActionPerformed(evt);
            }
        });

        exitButton.setMnemonic('x');
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calculateLineupButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateLineupButton)
                    .addComponent(exitButton))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player1ActionPerformed

    private void player1CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player1CBActionPerformed

    private void player2CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2CBActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);//exits out of the application
    }//GEN-LAST:event_exitButtonActionPerformed

    private void calculateLineupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateLineupButtonActionPerformed
        //check which button is selected, and set to home or away
        String button;
        if (home.isSelected())
            button = " (home team)\n";
        else
            button = " (visitor team)\n";
        
        String team = teamName.getText();//get the name of the team
        
        String[] players = new String[9];
        //assign player textfields to incrementing array indexes
        players[0] = player1.getText();
        players[1] = player2.getText();
        players[2] = player3.getText();
        players[3] = player4.getText();
        players[4] = player5.getText();
        players[5] = player6.getText();
        players[6] = player7.getText();
        players[7] = player8.getText();
        players[8] = player9.getText();
        
        int[] playerPositions = new int[9];
        //get indexes 1-9 for each of the player's positions
        playerPositions[0] = player1CB.getSelectedIndex();
        playerPositions[1] = player2CB.getSelectedIndex();
        playerPositions[2] = player3CB.getSelectedIndex();
        playerPositions[3] = player4CB.getSelectedIndex();
        playerPositions[4] = player5CB.getSelectedIndex();
        playerPositions[5] = player6CB.getSelectedIndex();
        playerPositions[6] = player7CB.getSelectedIndex();
        playerPositions[7] = player8CB.getSelectedIndex();
        playerPositions[8] = player9CB.getSelectedIndex();
         
        
        String[] playerPositionStr = new String[9];
        //get the selected item of each combo box and put that in an array
        playerPositionStr[0] = (String) player1CB.getSelectedItem();
        playerPositionStr[1] = (String) player2CB.getSelectedItem();
        playerPositionStr[2] = (String) player3CB.getSelectedItem();
        playerPositionStr[3] = (String) player4CB.getSelectedItem();
        playerPositionStr[4] = (String) player5CB.getSelectedItem();
        playerPositionStr[5] = (String) player6CB.getSelectedItem();
        playerPositionStr[6] = (String) player7CB.getSelectedItem();
        playerPositionStr[7] = (String) player8CB.getSelectedItem();
        playerPositionStr[8] = (String) player9CB.getSelectedItem();
        
        
        Validations v = new Validations();
        String errorMsg = "";
        
        //concatenate errors onto errorMsg variable
        errorMsg += v.isPresent(team, "Team name is required.");
        errorMsg += v.isPopulated(players, "Player names are required.");
        errorMsg += v.isPopulated(playerPositions, "Player names are required.");
        errorMsg += v.findDuplicates(playerPositions, "Cannot assign positions to more than one player.");
        
        
        if (players.equals(null)){
            errorMsg += "Player names are required";
        }
        
        if (playerPositionStr.equals(null))
            errorMsg += "Player positions are required.";
        
        for(String player : playerPositionStr){
            if (player.equals("")){
                errorMsg += "Player positions are required.";
            }
        }
        if (errorMsg.isEmpty()) {
            String message = (team + button + "\n" + players[0] + ", " + playerPositionStr[0] + "\n" +
                            players[1] + ", " + playerPositionStr[1] + "\n" +
                            players[2] + ", " + playerPositionStr[2] + "\n" +
                            players[3] + ", " + playerPositionStr[3] + "\n" +
                            players[4] + ", " + playerPositionStr[4] + "\n" +
                            players[5] + ", " + playerPositionStr[5] + "\n" +
                            players[6] + ", " + playerPositionStr[6] + "\n" +
                            players[7] + ", " + playerPositionStr[7] + "\n" +
                            players[8] + ", " + playerPositionStr[8]);
            
            //JOptionPane.showMessageDialog(rootPane, message);
            JOptionPane.showMessageDialog(this, message, "Lineup", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, errorMsg,
                    "Invalid Data", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calculateLineupButtonActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(LineupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LineupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LineupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LineupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LineupFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculateLineupButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField player1;
    private javax.swing.JComboBox player1CB;
    private javax.swing.JTextField player2;
    private javax.swing.JComboBox player2CB;
    private javax.swing.JTextField player3;
    private javax.swing.JComboBox player3CB;
    private javax.swing.JTextField player4;
    private javax.swing.JComboBox player4CB;
    private javax.swing.JTextField player5;
    private javax.swing.JComboBox player5CB;
    private javax.swing.JTextField player6;
    private javax.swing.JComboBox player6CB;
    private javax.swing.JTextField player7;
    private javax.swing.JComboBox player7CB;
    private javax.swing.JTextField player8;
    private javax.swing.JComboBox player8CB;
    private javax.swing.JTextField player9;
    private javax.swing.JComboBox player9CB;
    private javax.swing.JPanel playerInfo;
    private javax.swing.JPanel teamInfo;
    private javax.swing.JTextField teamName;
    private javax.swing.JRadioButton visitor;
    // End of variables declaration//GEN-END:variables
}
