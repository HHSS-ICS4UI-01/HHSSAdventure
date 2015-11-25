
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class AdventureFrame extends javax.swing.JFrame {

    private HHSSAdventure Controller;
    
    /**
     * Creates new form AdventureFrame
     */
    public AdventureFrame(HHSSAdventure Controller) {
        this.Controller = Controller;     
        initComponents();
    }



    
    public void setLocationName(String name){
      
       locationName.setText(name);
    }
    
    public void setDirection(String D){
        Direction.setText(D);
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
        Advance = new javax.swing.JButton();
        Right = new javax.swing.JButton();
        Left = new javax.swing.JButton();
        locationName = new javax.swing.JLabel();
        Direction = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Advance.setText("Advance");
        Advance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvanceActionPerformed(evt);
            }
        });

        Right.setText("Right");
        Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightActionPerformed(evt);
            }
        });

        Left.setText("Left");
        Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftActionPerformed(evt);
            }
        });

        locationName.setText("jLabel1");

        Direction.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Left)
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(locationName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Advance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Right, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Direction, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Direction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Advance)
                    .addComponent(Right)
                    .addComponent(Left)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftActionPerformed
    Controller.turnLeft();
    }//GEN-LAST:event_LeftActionPerformed

    private void AdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvanceActionPerformed

    }//GEN-LAST:event_AdvanceActionPerformed

    private void RightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightActionPerformed
    Controller.turnRight();
    }//GEN-LAST:event_RightActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Advance;
    private javax.swing.JLabel Direction;
    private javax.swing.JButton Left;
    private javax.swing.JButton Right;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locationName;
    // End of variables declaration//GEN-END:variables
}
