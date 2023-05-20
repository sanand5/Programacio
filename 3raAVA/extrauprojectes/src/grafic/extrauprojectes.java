/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grafic;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;


/**
 *
 * @author Andreuet
 */
public class extrauprojectes extends javax.swing.JFrame {

    /**
     * Creates new form extrauprojectes
     */
    public extrauprojectes() {
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

        jFilechooser = new javax.swing.JFileChooser();
        fileOrigenjLabel = new javax.swing.JLabel();
        filedestijLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        origenjButton = new javax.swing.JButton();
        origenjLabel = new javax.swing.JLabel();
        destijLabel = new javax.swing.JLabel();
        destijButton = new javax.swing.JButton();
        generarjButton = new javax.swing.JButton();

        fileOrigenjLabel.setText("jLabel1");

        filedestijLabel.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        origenjButton.setText("Seleccionar Origen");
        origenjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenjButtonActionPerformed(evt);
            }
        });

        origenjLabel.setText("Origen");

        destijLabel.setText("Desti");

        destijButton.setText("Seleccionar Desti");
        destijButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destijButtonActionPerformed(evt);
            }
        });

        generarjButton.setText("Generar");
        generarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(origenjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(destijButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(origenjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(destijLabel)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(generarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenjLabel)
                    .addComponent(destijLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenjButton)
                    .addComponent(destijButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generarjButton)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void origenjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenjButtonActionPerformed
        // TODO add your handling code here:
        int seleccion = jFilechooser.showSaveDialog(this);
        jFilechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            fileOrigenjLabel.setText(jFilechooser.getSelectedFile().getAbsolutePath());
            origenjLabel.setText(jFilechooser.getSelectedFile().getName());
        }
    }//GEN-LAST:event_origenjButtonActionPerformed

    private void destijButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destijButtonActionPerformed
        // TODO add your handling code here:
        int seleccion = jFilechooser.showSaveDialog(this);
        jFilechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            filedestijLabel.setText(jFilechooser.getSelectedFile().getAbsolutePath());
            destijLabel.setText(jFilechooser.getSelectedFile().getName());
        }
    }//GEN-LAST:event_destijButtonActionPerformed

    private void generarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarjButtonActionPerformed
        // TODO add your handling code here:
        File origen = new File(fileOrigenjLabel.getText());
        File desti = new File(filedestijLabel.getText());
        desti.mkdir();
        try {
            if (!origen.exists()) {
                throw new FileNotFoundException();
            }
            buscar2(origen, desti, ".java");
            System.out.println("Tot bé :)");
        } catch (FileNotFoundException e) {
            System.out.println("***Err : El fitcher no eistei");
        }

    }//GEN-LAST:event_generarjButtonActionPerformed

    public static void buscar2(File f, File d, String extensio) {
        for (File lf : f.listFiles()) {
            if (lf.isDirectory()) {
                File[] list = lf.listFiles();
                String nom;
                int fjava = 0;

                for (File file : list) {
                    if (file.isFile()) {
                        if (file.getName().split("\\.")[file.getName().split("\\.").length - 1].equals("java")) {
                            fjava++;
                        }
                    }
                }

                if (fjava > 1) {
                    nom = lf.getName();
                    File carpetacreada = new File(d, nom);
                    carpetacreada.mkdir();
                    buscar2(lf, carpetacreada, extensio);
                } else {
                    buscar2(lf, d, extensio);
                }
            } else if (lf.getName().contains(extensio)) {
                try {
                    copia(lf, d, extensio);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

    }

    public static void copia(File file, File desti, String extensio) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(file);

        String nom = file.getName().split(extensio)[0];
        String important = "";
        String id = "";

        File copia = new File(desti, nom + extensio);

        FileWriter fw = new FileWriter(copia, true);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.contains("important") || line.contains("Important") || line.contains("IMPORTANT")) {
                important = "*";
            }
            if (line.contains("id :") || line.contains("Id :") || line.contains("ID :") || line.contains("id:") || line.contains("Id:") || line.contains("ID:")) {
                id = "_" + line.split(": ")[1].replace(" ", "-");
            }
            fw.write(line + "\n");
        }
        copia.renameTo(new File(copia.getParent(), important + nom + id + extensio));
        sc.close();
        fw.close();
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
            java.util.logging.Logger.getLogger(extrauprojectes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(extrauprojectes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(extrauprojectes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(extrauprojectes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new extrauprojectes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton destijButton;
    private javax.swing.JLabel destijLabel;
    private javax.swing.JLabel fileOrigenjLabel;
    private javax.swing.JLabel filedestijLabel;
    private javax.swing.JButton generarjButton;
    private javax.swing.JFileChooser jFilechooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton origenjButton;
    private javax.swing.JLabel origenjLabel;
    // End of variables declaration//GEN-END:variables
}
