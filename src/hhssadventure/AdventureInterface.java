/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;



/**
 *
 * @author janaj4926
 */
public class AdventureInterface extends javax.swing.JFrame {
    
    private HHSSAdventure controller;
    private PicturePanel setImage;
    
    public AdventureInterface(HHSSAdventure c){
        this();
        controller = c;
    }
    
    /**
     * Creates new form AdventureInterface
     */
    public AdventureInterface() {
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

        picturePanel1 = new hhssadventure.PicturePanel();
        Forward = new javax.swing.JButton();
        Left = new javax.swing.JButton();
        Rigth = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Forward.setText("Forward");
        Forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForwardActionPerformed(evt);
            }
        });
        picturePanel1.add(Forward);
        Forward.setBounds(210, 200, 73, 23);

        Left.setText("Left");
        Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftActionPerformed(evt);
            }
        });
        picturePanel1.add(Left);
        Left.setBounds(0, 200, 51, 23);

        Rigth.setText("Right");
        Rigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RigthActionPerformed(evt);
            }
        });
        picturePanel1.add(Rigth);
        Rigth.setBounds(420, 200, 57, 23);

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        picturePanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 220, 482, 73);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picturePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picturePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftActionPerformed
        controller.turnLeft();
    }//GEN-LAST:event_LeftActionPerformed

    private void RigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RigthActionPerformed
        controller.turnRight();
    }//GEN-LAST:event_RigthActionPerformed

    private void ForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForwardActionPerformed
        controller.goForward();
    }//GEN-LAST:event_ForwardActionPerformed

    //set the description of the scene
    public void setDescription(String Description){
        description.setText(Description);
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
            java.util.logging.Logger.getLogger(AdventureInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdventureInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdventureInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdventureInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdventureInterface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Forward;
    private javax.swing.JButton Left;
    private javax.swing.JButton Rigth;
    private javax.swing.JTextArea description;
    private javax.swing.JScrollPane jScrollPane1;
    private hhssadventure.PicturePanel picturePanel1;
    // End of variables declaration//GEN-END:variables
}
