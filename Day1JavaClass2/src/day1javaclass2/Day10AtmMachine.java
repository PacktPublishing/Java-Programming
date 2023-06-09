
package day1javaclass2;

public class Day10AtmMachine extends javax.swing.JInternalFrame {

    public Day10AtmMachine() {
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Account Number :-");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "2000120200001", "2000120200002", "2000120200003", "2000120200004", "2000120200005" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setText("Account Holder Name:-");

        jTextField1.setEditable(false);

        jLabel3.setText("Select Operation: -");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Withdraw", "Deposit", "Check Balance" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel4.setText("Account Balance:-");

        jTextField2.setEditable(false);

        jLabel5.setText("Enter Amount:-");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 181, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField3))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        jLabel5.setVisible(false);
        jTextField3.setVisible(false);
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
        if(jComboBox1.getSelectedIndex()==1){
            accname="Mr. John Mishal";
            jTextField1.setText(accname);
        }
        else if(jComboBox1.getSelectedIndex()==2){
            accname="Mrs. Harry Mosh";
            jTextField1.setText(accname);
        }
        else if(jComboBox1.getSelectedIndex()==3){
            accname="Mr. Peter Parkar";
            jTextField1.setText(accname);
        }
        else if(jComboBox1.getSelectedIndex()==4){
            accname="Mrs. Elizabeth Mark";
            jTextField1.setText(accname);
        }
        else if(jComboBox1.getSelectedIndex()==5){
            accname="Mr. Marshal Benz";
            jTextField1.setText(accname);
        }
        else{
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        if(jComboBox2.getSelectedIndex()==1){
            if(jComboBox1.getSelectedIndex()==1){
                jTextField2.setText(String.valueOf(ATM.accountbal1));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==2){
                jTextField2.setText(String.valueOf(ATM.accountbal2));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==3){
                jTextField2.setText(String.valueOf(ATM.accountbal3));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==4){
                jTextField2.setText(String.valueOf(ATM.accountbal4));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==5){
                jTextField2.setText(String.valueOf(ATM.accountbal5));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
        }
        else if(jComboBox2.getSelectedIndex()==2){
            if(jComboBox1.getSelectedIndex()==1){                
                jTextField2.setText(String.valueOf(ATM.accountbal1));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==2){
                jTextField2.setText(String.valueOf(ATM.accountbal2));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==3){
                jTextField2.setText(String.valueOf(ATM.accountbal3));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==4){
                jTextField2.setText(String.valueOf(ATM.accountbal4));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==5){
                jTextField2.setText(String.valueOf(ATM.accountbal5));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
        }
        else if(jComboBox2.getSelectedIndex()==3){
            if(jComboBox1.getSelectedIndex()==1){
                jTextField2.setText(String.valueOf(ATM.accountbal1));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==2){
                jTextField2.setText(String.valueOf(ATM.accountbal2));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==3){
                jTextField2.setText(String.valueOf(ATM.accountbal3));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==4){
                jTextField2.setText(String.valueOf(ATM.accountbal4));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
            else if(jComboBox1.getSelectedIndex()==5){
                jTextField2.setText(String.valueOf(ATM.accountbal5));
                jTextField3.setVisible(true);
                jLabel5.setVisible(true);
            }
        }
        else{
            jTextField2.setText("");
            jTextField3.setVisible(false);
            jLabel5.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       long newbal=Long.parseLong(jTextField3.getText());
       if(jComboBox2.getSelectedIndex()==1){
           if(jComboBox1.getSelectedIndex()==1){
               accbal=ATM.accountbal1-newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal1=accbal;
           }
           if(jComboBox1.getSelectedIndex()==2){
               accbal=ATM.accountbal2-newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal2=accbal;
           }
           if(jComboBox1.getSelectedIndex()==3){
               accbal=ATM.accountbal3-newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal3=accbal;
           }
           if(jComboBox1.getSelectedIndex()==4){
               accbal=ATM.accountbal4-newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal4=accbal;
           }
           if(jComboBox1.getSelectedIndex()==5){
               accbal=ATM.accountbal5-newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal5=accbal;
           }
       }
       else if(jComboBox2.getSelectedIndex()==2){
           if(jComboBox1.getSelectedIndex()==1){
               accbal=ATM.accountbal1+newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal1=accbal;
           }
           if(jComboBox1.getSelectedIndex()==2){
               accbal=ATM.accountbal2+newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal2=accbal;
           }
           if(jComboBox1.getSelectedIndex()==3){
               accbal=ATM.accountbal3+newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal3=accbal;
           }
           if(jComboBox1.getSelectedIndex()==4){
               accbal=ATM.accountbal4+newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal4=accbal;
           }
           if(jComboBox1.getSelectedIndex()==5){
               accbal=ATM.accountbal5+newbal;
               jTextField2.setText(String.valueOf(accbal));
               ATM.accountbal5=accbal;
           }
       }
       jTextField3.setText("");
       jTextField3.setVisible(false);
       jLabel5.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

public String accname="";
public long accbal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
