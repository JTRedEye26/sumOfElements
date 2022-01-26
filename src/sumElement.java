/*
 * oct 12, 2017
 * This program will take the users in put then convert it and store it in an integer array.
 * The program then can give a full list of all stored integers and display all the even numbers or odd numbers along with the sums for each list.
 * This program also gives you the option to remove a prevouisly entered integer.
 */

/**
 *
 * @author Asus
 */
public class sumElement extends javax.swing.JFrame {

    /**
     * Creates new form Thomas_sumElement
     */
    public Thomas_sumElement() {
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

        backgroud = new javax.swing.JPanel();
        enterAnIntergerLabble = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        fullListButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        sumOfAllButton = new javax.swing.JButton();
        sumOfEvenButton = new javax.swing.JButton();
        sumOfOddButton = new javax.swing.JButton();
        scrollBar1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        scrollBar2 = new javax.swing.JScrollPane();
        integerList = new javax.swing.JTextArea();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroud.setBackground(new java.awt.Color(102, 102, 102));
        backgroud.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Interger Sums", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        enterAnIntergerLabble.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enterAnIntergerLabble.setForeground(new java.awt.Color(255, 255, 255));
        enterAnIntergerLabble.setText("Enter an interger");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        fullListButton.setText("Full List");
        fullListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullListButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        sumOfAllButton.setText("Sum of All");
        sumOfAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOfAllButtonActionPerformed(evt);
            }
        });

        sumOfEvenButton.setText("Sum of All Even");
        sumOfEvenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOfEvenButtonActionPerformed(evt);
            }
        });

        sumOfOddButton.setText("Sum of All Odd");
        sumOfOddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOfOddButtonActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        scrollBar1.setViewportView(output);

        integerList.setEditable(false);
        integerList.setColumns(20);
        integerList.setRows(5);
        scrollBar2.setViewportView(integerList);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroudLayout = new javax.swing.GroupLayout(backgroud);
        backgroud.setLayout(backgroudLayout);
        backgroudLayout.setHorizontalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(backgroudLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scrollBar1)
                    .addGroup(backgroudLayout.createSequentialGroup()
                        .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(backgroudLayout.createSequentialGroup()
                                .addComponent(enterAnIntergerLabble)
                                .addGap(18, 18, 18)
                                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollBar2))
                        .addGap(18, 18, 18)
                        .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroudLayout.createSequentialGroup()
                                .addComponent(addButton)
                                .addGap(18, 18, 18)
                                .addComponent(removeButton))
                            .addComponent(fullListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumOfAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumOfEvenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sumOfOddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(backgroudLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );
        backgroudLayout.setVerticalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroudLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterAnIntergerLabble, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroudLayout.createSequentialGroup()
                        .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(removeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fullListButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumOfAllButton)
                        .addGap(11, 11, 11)
                        .addComponent(sumOfEvenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sumOfOddButton))
                    .addComponent(scrollBar2))
                .addGap(26, 26, 26)
                .addComponent(scrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
int[]intNumber=new int[10];//This cammand creats the new integer array know aas intNumber  
int logicalSize=0,sum=0,convert=0,remainder=0;// This cammand declares all the varriesbles used though the whole program
                                              // They are at the top here beacuse I reused them for multiple buttons so it saves space to put them here

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

    String intNumberString;//This command makes the place holder I used to store the users input before it is converted and stored in the array
 
    if(logicalSize<intNumber.length){//This if structure makes sure the user can't add anymore to the array once full and also indacates if the input was successful or not in putting the entered number into the array
    
    intNumberString=input.getText();//This set of commands take the users input then converts it into a useable integer 
    intNumber[logicalSize]=Integer.parseInt(intNumberString);
    
    output.setText("Number added successfully");//This commands informes the usre if the number enterd was successfully put into the array
    logicalSize=logicalSize+1;}//This command increases the logical size of the array by one
    
    else if(logicalSize>=intNumber.length){ 
    output.setText("The array is full");}//This cammand informs the user that the array is full 
    
    input.setText("");//This cammand clears the text field that the user uses to enter in data for convenience 
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
   
     String targetString;//This command declars the string I used to store the users input before its converted into an integer   
     int target;//This command declers the integer that will hold the target number that needs to be removed
     
     targetString=input.getText();//This set of commands convert the users input into a useable integer
     target=Integer.parseInt(targetString);
     
     if(target<=10&&target>0){//This if structure makes sure the user is imputting a valid target number
     for (int i=target;i<logicalSize-1;i++){//This for loop assists in the renaming process
     intNumber[i]=intNumber[i+1];}//This cammand renames each slot in the array to the name infront of it 
     
     intNumber[logicalSize-1]=0;//This command sets the last used slot to zero
     logicalSize--;//This command reduces the logical size
     
     integerList.setText("");//This command cleas the output box that displays the array
      
     for(int i=0;i<logicalSize;i++){//This set of commands displays the new array after the number was removed
     integerList.append(+intNumber[i]+"\n");}
       
     input.setText("");}//This command clears the text field for convenience
     
     else{output.setText("Please enter a number between 1-10 to remove the slot");}//This command informs the user that they have to input a valid number
    }//GEN-LAST:event_removeButtonActionPerformed

    private void fullListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullListButtonActionPerformed
  
     integerList.setText("");//This command clears the output box where the array is displayed
     for(int i=0;i<logicalSize;i++){//This set of command displays the array into the text box
     integerList.append(intNumber[i]+"\n");}
           
    }//GEN-LAST:event_fullListButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);//This command closes the program
    }//GEN-LAST:event_closeButtonActionPerformed

    private void sumOfAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOfAllButtonActionPerformed

     for(int i=0; i<logicalSize;i++){//This set of command calculates the sum of the numbers in the array
     sum=sum+intNumber[i];}
        
     output.setText("The sum of all the numbers is "+sum);//This command displays the sum of the numbers in the array
        
     sum=0;//This command resets the sum back to zero
                
    }//GEN-LAST:event_sumOfAllButtonActionPerformed

    private void sumOfEvenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOfEvenButtonActionPerformed

     integerList.setText("");//This command cleas the output box that displays the array
    
     for(int i=0;i<logicalSize;i++){//This command sets up a loop to assist in the calculation of the even numbers
    
     remainder=intNumber[i]%2;//This cammand calculates if the number is evenly divisable by two
        
     if (remainder==0){//This set of commands is ran when the number is evenly divisable by two then displays the even numbers and calculates the sum of the even numbers
     integerList.append(intNumber[i]+"\n");
     sum=sum+intNumber[i];}
        
     output.setText("The sum of all the even numbers is "+sum);}//This command displays the sum of all the even numbers
    
     remainder=0;//This command resets the remainder
     sum=0;//This command resets the sum
    
    }//GEN-LAST:event_sumOfEvenButtonActionPerformed

    private void sumOfOddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOfOddButtonActionPerformed
    
     integerList.setText("");//This command cleas the output box that displays the array
    
     for(int i=0;i<logicalSize;i++){//This command sets up a loop to assist in the calculation of the odd numbers
    
     remainder=intNumber[i]%2;//This cammand calculates if the number is evenly divisable by two
        
     if (remainder!=0){//This set of commands is ran when the number is not evenly divisable by two then displays the odd numbers and calculates the sum of the odd numbers
     integerList.append(intNumber[i]+"\n");
     sum=sum+intNumber[i];}
        
     output.setText("The sum of all the odd numbers is "+sum);}//This command displays the sum of all the odd numbers
    
     remainder=0;//This command resets the remainder
     sum=0;//This command resets the sum
    
    }//GEN-LAST:event_sumOfOddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Thomas_sumElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thomas_sumElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thomas_sumElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thomas_sumElement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thomas_sumElement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel backgroud;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel enterAnIntergerLabble;
    private javax.swing.JButton fullListButton;
    private javax.swing.JTextField input;
    private javax.swing.JTextArea integerList;
    private javax.swing.JTextArea output;
    private javax.swing.JButton removeButton;
    private javax.swing.JScrollPane scrollBar1;
    private javax.swing.JScrollPane scrollBar2;
    private javax.swing.JButton sumOfAllButton;
    private javax.swing.JButton sumOfEvenButton;
    private javax.swing.JButton sumOfOddButton;
    // End of variables declaration//GEN-END:variables
}
