
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author sanand id : calculadora
 */
public class uf12_03 extends javax.swing.JFrame {

    /**
     * Creates new form uf12_02
     */
    public uf12_03() {
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

        calculadorabuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        AjTextField = new javax.swing.JTextField();
        BjTextField = new javax.swing.JTextField();
        resultatjLabel = new javax.swing.JLabel();
        productoriojRadioButton = new javax.swing.JRadioButton();
        exponencialjRadioButton = new javax.swing.JRadioButton();
        calcularjButton = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        AjTextField.setBackground(new java.awt.Color(153, 204, 255));
        AjTextField.setFont(new java.awt.Font("Andika", 0, 13)); // NOI18N
        AjTextField.setText("A");
        AjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjTextFieldActionPerformed(evt);
            }
        });

        BjTextField.setBackground(new java.awt.Color(0, 204, 153));
        BjTextField.setFont(new java.awt.Font("Gargi", 2, 13)); // NOI18N
        BjTextField.setText("B");

        resultatjLabel.setBackground(new java.awt.Color(255, 255, 0));
        resultatjLabel.setFont(new java.awt.Font("Pagul", 1, 13)); // NOI18N
        resultatjLabel.setForeground(new java.awt.Color(255, 255, 0));
        resultatjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultatjLabel.setText("Resultat");
        resultatjLabel.setToolTipText("");
        resultatjLabel.setAlignmentX(0.5F);
        resultatjLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resultatjLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        calculadorabuttonGroup.add(productoriojRadioButton);
        productoriojRadioButton.setText("Productorio");
        productoriojRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoriojRadioButtonActionPerformed(evt);
            }
        });

        calculadorabuttonGroup.add(exponencialjRadioButton);
        exponencialjRadioButton.setText("Exponencial");
        exponencialjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponencialjRadioButtonActionPerformed(evt);
            }
        });

        calcularjButton.setText("Calcular");
        calcularjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularjButtonActionPerformed(evt);
            }
        });

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(AjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultatjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productoriojRadioButton)
                            .addComponent(exponencialjRadioButton)
                            .addComponent(jRadioButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(calcularjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productoriojRadioButton)
                .addGap(30, 30, 30)
                .addComponent(exponencialjRadioButton)
                .addGap(31, 31, 31)
                .addComponent(calcularjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(resultatjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AjTextFieldActionPerformed

    private void productoriojRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoriojRadioButtonActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_productoriojRadioButtonActionPerformed

    private void exponencialjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponencialjRadioButtonActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_exponencialjRadioButtonActionPerformed

    private void calcularjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularjButtonActionPerformed
        // TODO add your handling code here:
        try {

            int a = Integer.parseInt(AjTextField.getText());
            int b = Integer.parseInt(BjTextField.getText());
            int suma = 0;
            if (jRadioButton1.isSelected()) {
                for (int i = a; i <= b; i++) {
                    suma += i;
                }
                resultatjLabel.setText(suma + "");
            } else if (productoriojRadioButton.isSelected()) {
                suma++;
                for (int i = a; i <= b; i++) {
                    suma *= i;
                }
                resultatjLabel.setText(suma + "");
            } else if (exponencialjRadioButton.isSelected()) {
                double exp = Math.pow(a, b);
                resultatjLabel.setText(exp + "");
            }else throw new Exception("No hay nada seleccionado");
        } catch (Exception e) {
            resultatjLabel.setText(e.getMessage());
            JOptionPane.showMessageDialog(this, e, "Missatge de error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calcularjButtonActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(uf12_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uf12_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uf12_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uf12_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uf12_03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AjTextField;
    private javax.swing.JTextField BjTextField;
    private javax.swing.ButtonGroup calculadorabuttonGroup;
    private javax.swing.JButton calcularjButton;
    private javax.swing.JRadioButton exponencialjRadioButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton productoriojRadioButton;
    private javax.swing.JLabel resultatjLabel;
    // End of variables declaration//GEN-END:variables
}