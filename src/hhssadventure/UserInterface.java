package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author besem4079
 */
public class UserInterface extends javax.swing.JFrame {
    private HHSSAdventure controller;
    
    public UserInterface(HHSSAdventure c){
        this(); //calling the old constructor below
        controller = c;
        
    }
    
    /** Creates new form UserInterface */
    public UserInterface() {
        initComponents();
    }
    
    public void setForward(boolean isBlocked){
        if(isBlocked){
            forwardScene.setText("Blocked");
        }else{
            forwardScene.setText("Forward");
        }
        
    }
    
    /**
     * Sets a description of the scene in the user interface.
     * @param description the description of the current scene.
     */
    public void setDescription(String description){
        sceneDescript.setText(description);
    }
    
    /**
     * Sets a picture to display in the user interface.
     * @param image the file name of the picture to show.
     */
    public void setImage(String image){
        //initialize the scene's picture
        BufferedImage img = null;
        //imports the picture
        try{
            img = ImageIO.read(new File("images/" + image));
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        sceneImage.setImage(img);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forwardScene = new javax.swing.JButton();
        leftScene = new javax.swing.JButton();
        rightScene = new javax.swing.JButton();
        sceneDescript = new javax.swing.JLabel();
        sceneImage = new hhssadventure.PicturePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        forwardScene.setText("Forward");
        forwardScene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardSceneActionPerformed(evt);
            }
        });

        leftScene.setText("Left");
        leftScene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftSceneActionPerformed(evt);
            }
        });

        rightScene.setText("Right");
        rightScene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightSceneActionPerformed(evt);
            }
        });

        sceneDescript.setText("DESCRIPTION");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(sceneDescript, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(279, 279, 279)
                        .add(leftScene)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(forwardScene)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(rightScene)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(96, 96, 96)
                .add(sceneImage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 568, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(sceneImage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 413, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 37, Short.MAX_VALUE)
                .add(sceneDescript, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(leftScene)
                    .add(forwardScene)
                    .add(rightScene))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftSceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftSceneActionPerformed
        //move to the left
        controller.prevScene();
    }//GEN-LAST:event_leftSceneActionPerformed

    private void forwardSceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardSceneActionPerformed
        //if the area forward is blocked
        if(forwardScene.getText().equals("Blocked")){
            //do nothing
        }
        //if the area forward is not blocked
        else{
            //move forward
            controller.switchLocation();
        }
    }//GEN-LAST:event_forwardSceneActionPerformed

    private void rightSceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightSceneActionPerformed
        //move to the right
        controller.nextScene();
    }//GEN-LAST:event_rightSceneActionPerformed

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forwardScene;
    private javax.swing.JButton leftScene;
    private javax.swing.JButton rightScene;
    private javax.swing.JLabel sceneDescript;
    private hhssadventure.PicturePanel sceneImage;
    // End of variables declaration//GEN-END:variables

}
