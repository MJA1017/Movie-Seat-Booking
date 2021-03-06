/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import static AppPackage.HomePage.page;
import static AppPackage.HomePage.sched1;
import static AppPackage.HomePage.sched2;
import static AppPackage.HomePage.sched3;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class Seats extends javax.swing.JFrame {
    
    private int count =  0;
    private List<List<String>> newgrid = new ArrayList<>();
    private String path = "";
    private String title,time;
    private int price = 30;
    /**
     * Creates new form Seats
     */
    private ArrayList<ArrayList<Integer>> book = new ArrayList<ArrayList<Integer>>();
    private ArrayList<String> seats = new ArrayList<String>();
    
    public Seats() {
        initComponents();
    }
    
    public Seats(String[][] grid, String filepath,String title,String time){
        this.title = title;
        this.time = time;
        initComponents();
        path = filepath;
        
        //adding each row of the csv into a list of strings.
        for(String[] rows: grid){
            List<String> temp = new ArrayList<>();
            for(String i:rows){
                temp.add(i);
            }
            newgrid.add(temp);
        }
        //initializing the buttons array in the form of the seating grid.
        JButton[][] buttons = {{A1,A2,A3,A4},{B1,B2,B3,B4},{C1,C2,C3,C4}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!(grid[i][j].equals("empty"))){
                    buttons[i][j].setEnabled(false);
                }
            }
        }
        
    }
    
    
    
    public void close(){
        WindowEvent closeWindow  = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        back = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        submit = new javax.swing.JButton();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        back.setText("GO BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        A1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        A1.setText("A1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        A2.setText("A2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        A3.setText("A3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        A4.setText("A4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        B1.setText("B1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        B2.setText("B2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        B3.setText("B3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        B4.setText("B4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        C1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        C1.setText("C1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        C2.setText("C2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        C3.setText("C3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        C4.setText("C4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Javanese Text", 1, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("screen");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        submit.setText("CONFIRM");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(311, 311, 311)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        close();
        if(page == 1){
            sched1.setVisible(true);
            sched1.setLocation(0,0);
        }
        else if(page ==2){
            sched2.setVisible(true);
            sched2.setLocation(0,0);
        }
        else{
            sched3.setVisible(true);
            sched3.setLocation(0,0);
        }
        
        
        
    }//GEN-LAST:event_backActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        A2.setBackground(Color.blue);
        
        //when a seat is pressed, appened its co-ordinates in the grid into the book arraylist
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(0,1));
        book.add(pos);
        seats.add("A2");
    }//GEN-LAST:event_A2ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
        A4.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(0,3));
        book.add(pos);
        seats.add("A4");
    }//GEN-LAST:event_A4ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        A1.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(0,0));
        book.add(pos);
        seats.add("A1");
    }//GEN-LAST:event_A1ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        A3.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(0,2));
        book.add(pos);
        seats.add("A3");
    }//GEN-LAST:event_A3ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        B1.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(1,0));
        book.add(pos);
        seats.add("B1");
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        B2.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(1,1));
        book.add(pos);
        seats.add("B2");
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        B3.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(1,2));
        book.add(pos);
        seats.add("B3");
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        B4.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(1,3));
        book.add(pos);
        seats.add("B4");
    }//GEN-LAST:event_B4ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        C1.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(2,0));
        book.add(pos);
        seats.add("C1");
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        C2.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(2,1));
        book.add(pos);
        seats.add("C2");
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        C3.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(2,2));
        book.add(pos);
        seats.add("C3");
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
        C4.setBackground(Color.blue);
        ArrayList<Integer> pos = new ArrayList<Integer>(
		Arrays.asList(2,3));
        book.add(pos);
        seats.add("C4");
    }//GEN-LAST:event_C4ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        //updating the value of the cell in the List version of grid(newgrid)
        
        //getting the total price of the seats booked.
        price = price*book.size();
        
        for(int i=0;i<book.size();i++){
            //getting each booked seat's co-ordinates
            int row = book.get(i).get(0);
            int col = book.get(i).get(1);
            
            //changing the value of the cell with the co-ordinate in the grid to "booked"
            newgrid.get(row).set(col, "booked");
        }
        try{
            //writting the updated information into a csv.
            FileWriter csvWriter = new FileWriter(path);
            
            for(List<String> rows : newgrid){
                csvWriter.append(String.join(",", rows));
                csvWriter.append("\n");
            }
            
            csvWriter.flush();
            csvWriter.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        //create the ticket
        try{
            
            FileWriter csvWriter = new FileWriter("ticket.txt");
           
            csvWriter.append(title);
            csvWriter.append("\n");
            csvWriter.append(time);
            csvWriter.append("\n");
            
            csvWriter.append("Seats booked: ");
            for(int i=0;i<seats.size();i++){
                csvWriter.append(seats.get(i) + " ");
            }
            csvWriter.append("\n");
            
            csvWriter.append("Total Price: " + price);
            csvWriter.append("\n");
            
            csvWriter.flush();
            csvWriter.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
       
        close();
        HomePage n = new HomePage();
        n.setVisible(true);
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton back;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
