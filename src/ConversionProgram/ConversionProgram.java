/*
 * Aliza Huynh
 * ConversionProgram.java
 * This program takes the user's inputted value
 * and converts it to a desired unit of measurement
 */

package ConversionProgram;

/**
 *
 * @author alhuy9821
 */
import java.text.DecimalFormat;
public class ConversionProgram extends javax.swing.JFrame {

    /**
     * Creates new form ConversionProgram
     */
    public ConversionProgram() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FinalOutput = new javax.swing.JLabel();
        ChoiceInput = new javax.swing.JTextField();
        ValueInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(131, 124, 182));

        jLabel1.setFont(new java.awt.Font("FuturaTEEMed", 1, 48)); // NOI18N
        jLabel1.setText("Linear Conversion");

        jLabel2.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel2.setText("1. Inches to centimeters");

        jLabel3.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel3.setText("3. Feet to centimeters");

        jLabel4.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel4.setText("5. Yards to meters");

        jLabel5.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel5.setText("7. Miles to kilometers");

        jLabel6.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel6.setText("Enter conversion choice (1-8):");

        jLabel7.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel7.setText("Enter value to be converted:");

        FinalOutput.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel8.setText("2. Centimeters to inches");

        jLabel9.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel9.setText("4. Centimeters to feet");

        jLabel10.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel10.setText("6. Meters to yards");

        jLabel11.setFont(new java.awt.Font("FuturaTEEMed", 1, 18)); // NOI18N
        jLabel11.setText("8. Kilometers to miles");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FinalOutput)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChoiceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ChoiceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addComponent(FinalOutput)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //declaration of varables
        int UnitConversion = Integer.parseInt(ChoiceInput.getText());
        
        double value = Double.parseDouble(ValueInput.getText());
        DecimalFormat x = new DecimalFormat("#.##");
        
        //depending on the user's conversion choice (1-8) the value will be converted accordingly
        switch(UnitConversion)
        {
            case 1:
                inchesToCentimeters(value);
                break;
            case 2: 
                centimetersToInches(value);
                break;
            case 3:
                feetToCentimeters(value);
                break;
            case 4:
                centimetersToFeet(value);
                break;
            case 5:
                yardsToMeters(value);
                break;
            case 6:
                metersToYards(value);
                break;
            case 7:
                milesToKilometers(value);
                break;
            case 8:
                kilometersToMiles(value);
                break;
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed
/**
      * 
      * pre: measurement in inches (x inches)
      * post: measurement in centimeters (converted value)(x centimeters)
      * final message displays converted measurement in centimeters
      * @param value
      * @return
      */
    private void inchesToCentimeters(double value) {
        double inches;
        double centimeters;
        String EndMessage;
        
        inches = Integer.parseInt(ValueInput.getText());
        centimeters = inches * 2.54;
        
        EndMessage = inches + " Inches = " + Math.round(centimeters) + " centimeters.";
        FinalOutput.setText(EndMessage);
        
    }
    /**
      * if selected, a measurement in centimeters will be converted into inches
      * pre: measurement in centimeters
      * post: measurement in inches (converted value)
      * final message displays converted measurement in centimeters to inches
      * @param value
      * @return
      */
    private void centimetersToInches(double value) {
        double centimeters;
        double inches;
        String EndMessage;
        
        centimeters = Integer.parseInt(ValueInput.getText());
        inches = centimeters * 0.3937;
        
        EndMessage = centimeters + " Centimeters = " + Math.round(inches) + " inches.";
        FinalOutput.setText(EndMessage);
    }
    /**
      * if selected, user inputted value in feet will be converted into centimeters
      * pre: measurement in feet (user inputted)
      * post: measurement in centimeters (converted value)
      * final message displays converted measurement in feet to centimeters
      * @param value
      * @return
      */
    private void feetToCentimeters(double value) {
        double feet;
        double centimeters;
        String EndMessage;
        
        feet = Integer.parseInt(ValueInput.getText());
        centimeters = feet * 30;
        
        EndMessage = feet + " feet = " + Math.round(centimeters) + " centimeters.";
        FinalOutput.setText(EndMessage);
             
    }
    /**
      * if selected, this converts a measurement in cm into a measurement in feet
      * pre: measurement in centimeters (user inputted)
      * post: measurement in feet (converted value)
      * final message displays converted measurement in centimeters into feet
      * @param value
      * @return
      */
    private void centimetersToFeet(double value) {
        double centimeters;
        double feet;
        String EndMessage;
        
        centimeters = Integer.parseInt(ValueInput.getText());
        feet = centimeters * 0.0328;
        
        EndMessage = centimeters + " centimeters = " + Math.round(feet) + " feet.";
        FinalOutput.setText(EndMessage);
    }
    /**
      * if selected, this converts an inputted value in yards into meters
      * pre: measurement in yards (user inputted)
      * post: measurement in meters (converted value)
      * final message displays converted measurement in  yards into meters
      * @param value
      * @return
      */
    private void yardsToMeters(double value){
        double yards;
        double meters;
        String EndMessage;
        
        yards = Integer.parseInt(ValueInput.getText());
        meters = yards * 0.91;
        
        EndMessage = yards + " yards = " + Math.round(meters) + " meters.";
        FinalOutput.setText(EndMessage);
    }
    /**
     * This converts meters (user inputted value) to yards
     * pre: measurement in meters
     * post: measurement in yards
     * Final message states converted measurement in yards
     * @param value
      * @return
     */        
    private void metersToYards(double value){
        double meters;
        double yards;
        String EndMessage;
        
        meters = Integer.parseInt(ValueInput.getText());
        yards = meters * 1.093;
        
        EndMessage = meters + " meters = " + Math.round(yards) + " yards.";
        FinalOutput.setText(EndMessage);
    }
    /**
     * if selected, this converts miles to kilometers
     * pre: measurement in miles (user inputted)
     * post: measurement in kilometers (converted value)
     * @param value
      * @return
     */
    private void milesToKilometers(double value){
        double miles;
        double kilometers;
        String EndMessage;
        
        miles = Integer.parseInt(ValueInput.getText());
        kilometers = miles * 1.6;
        
        EndMessage = miles + " miles = " + Math.round(kilometers) + " kilometers.";
        FinalOutput.setText(EndMessage);
    }
    /**
     * if selected, this converts a measurement given in km into a measurement in miles
     * pre: measurement in kilometers (user inputted)
     * post: measurement in miles (converted value)
     * @param value
      * @return
     */
    private void kilometersToMiles(double value){
        double kilometers;
        double miles;
        String EndMessage;
        
        kilometers = Integer.parseInt(ValueInput.getText());
        miles = kilometers * 0.621;
        
        EndMessage = kilometers + " kilometers = " + Math.round(miles) + " miles.";
        FinalOutput.setText(EndMessage);
    }
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
            java.util.logging.Logger.getLogger(ConversionProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversionProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversionProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversionProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversionProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ChoiceInput;
    private javax.swing.JLabel FinalOutput;
    private javax.swing.JTextField ValueInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
