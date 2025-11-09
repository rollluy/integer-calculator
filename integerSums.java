/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a3_radwanrola;

/**
 *
 * @author rolly
 */
public class integerSums extends javax.swing.JFrame {
    int[] numList = new int[20];
    int currentIndex = 0;

    public integerSums() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outputField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        numInput = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        sumAll = new javax.swing.JButton();
        sumEven = new javax.swing.JButton();
        sumOdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Integer Sums");

        outputField.setEditable(false);
        outputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputFieldActionPerformed(evt);
            }
        });

        displayArea.setEditable(false);
        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane2.setViewportView(displayArea);

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel1.setText("Integer Sums");

        numInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numInputActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        subtractButton.setText("Subtract");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        sumAll.setText("Sum All");
        sumAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumAllActionPerformed(evt);
            }
        });

        sumEven.setText("Sum Even");
        sumEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumEvenActionPerformed(evt);
            }
        });

        sumOdd.setText("Sum Odd");
        sumOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOddActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter a positive number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9)
                                .addComponent(numInput, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtractButton)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumAll, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumEven)
                            .addComponent(sumOdd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton)
                    .addComponent(subtractButton)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sumAll)
                        .addGap(18, 18, 18)
                        .addComponent(sumEven)
                        .addGap(18, 18, 18)
                        .addComponent(sumOdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numInputActionPerformed
    }//GEN-LAST:event_numInputActionPerformed

    private void outputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputFieldActionPerformed
    }//GEN-LAST:event_outputFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String numAsString = numInput.getText();
        String v = "";
        outputField.setText("");
        try {
            int numAsInt = Integer.parseInt(numAsString);
            if (currentIndex == 20) {
                outputField.setText("You have reached capacity.");
                numInput.setText("");

            } else if (numAsInt <= 0) {
                outputField.setText("Number must be positive.");
                numInput.setText("");

            } else {
                numList[currentIndex] = numAsInt;
                currentIndex++;
                for (int a = 0; a < currentIndex; a++) {

                    v += numList[a] + "\n";
                }

                displayArea.setText(v);
            }

        } catch (Exception e) {
            outputField.setText("You must enter an integer number.");
            numInput.setText("");
            e.printStackTrace();
        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void sumAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumAllActionPerformed
        int z = 0;
        for (int a = 0; a < currentIndex; a++) {
            z += numList[a];
        }

        outputField.setText(Integer.toString(z));
    }//GEN-LAST:event_sumAllActionPerformed

    private void sumEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumEvenActionPerformed
        int z = 0;
        for (int a = 0; a < currentIndex; a++) {
            if (numList[a] % 2 == 0) {
                z += numList[a];
            }
        }
        outputField.setText(Integer.toString(z));
    }//GEN-LAST:event_sumEvenActionPerformed

    private void sumOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumOddActionPerformed
        int z = 0;
        for (int a = 0; a < currentIndex; a++) {
            if (numList[a] % 2 != 0) {
                z += numList[a];
            }
        }
        outputField.setText(Integer.toString(z));
    }//GEN-LAST:event_sumOddActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        outputField.setText("");
        String numAsString = numInput.getText(), v = "";
        try {
            int numAsInt = Integer.parseInt(numAsString);
            boolean numInList = false;
            
            for (int i=0; i<currentIndex; i++){
                if (numList[i] == numAsInt){
                    numInList = true;
                    numList[i] = 0;
                    break;
                }
            }
            
            if (numInList){
                for (int i=1; i<currentIndex; i++){
                    if (numList[i-1]==0){
                        numList[i-1] = numList[i];
                        numList[i] = 0;
                    }
                }
                if (currentIndex>0){
                currentIndex--;
                    for (int i=0; i<currentIndex; i++){
                        v += numList[i] + "\n";
                        displayArea.setText(v);
                    }
                }
            }else {
                outputField.setText("Number is not in the list.");
                numInput.setText("");
            }
            if (currentIndex == 0){
                displayArea.setText("");
            }
        }catch (Exception e){
            outputField.setText("You must enter an integer number.");
            numInput.setText("");
            e.printStackTrace();
        }
    }//GEN-LAST:event_subtractButtonActionPerformed

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
            java.util.logging.Logger.getLogger(integerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(integerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(integerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(integerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new integerSums().setVisible(true);
            }
        });
    }

    private javax.swing.JButton addButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numInput;
    private javax.swing.JTextField outputField;
    private javax.swing.JButton subtractButton;
    private javax.swing.JButton sumAll;
    private javax.swing.JButton sumEven;
    private javax.swing.JButton sumOdd;
    // End of variables declaration//GEN-END:variables
}
