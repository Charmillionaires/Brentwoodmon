/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author zhanglianghui
 */
public class PlayerCustomization extends javax.swing.JPanel {

    /**
     * Creates new form PlayerCustomization
     */
    private Image snorlax;
    private Image shaq;
    private Image hero;
    private final PlayerCustomizationIntf responseHandler;
    private Image myImage;
    private String type;

    public PlayerCustomization(Image snorlax, Image shaq, Image hero, PlayerCustomizationIntf responseHandler) {
        initComponents();

        this.snorlax = snorlax;
        this.shaq = shaq;
        this.hero = hero;

        this.responseHandler = responseHandler;
        this.myImage = snorlax;
    }

    public void close() {
        this.getParent().setVisible(false);
        ((JFrame) this.getTopLevelAncestor()).dispose();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtCustomizedName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jlblMyImage = new javax.swing.JLabel();
        jbtnShaq = new javax.swing.JButton();
        jbtnSnorlax = new javax.swing.JButton();
        jlblInstructionOne = new javax.swing.JLabel();
        jbtnHero = new javax.swing.JButton();
        jbtnBull = new javax.swing.JButton();
        jlblInstructionTwo = new javax.swing.JLabel();
        jbtnConfirm = new javax.swing.JToggleButton();

        jtxtCustomizedName.setText(" ");

        jlblMyImage.setText(" ");

        jbtnShaq.setFont(new java.awt.Font("华文隶书", 0, 24)); // NOI18N
        jbtnShaq.setText("Shaq");
        jbtnShaq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnShaqMouseClicked(evt);
            }
        });

        jbtnSnorlax.setFont(new java.awt.Font("华文隶书", 0, 24)); // NOI18N
        jbtnSnorlax.setText("Snorlax");
        jbtnSnorlax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnSnorlaxMouseClicked(evt);
            }
        });

        jlblInstructionOne.setFont(new java.awt.Font("华文隶书", 0, 24)); // NOI18N
        jlblInstructionOne.setText("Please Select A Character:");

        jbtnHero.setFont(new java.awt.Font("华文隶书", 0, 24)); // NOI18N
        jbtnHero.setText("Hero");
        jbtnHero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnHeroMouseClicked(evt);
            }
        });

        jbtnBull.setFont(new java.awt.Font("华文隶书", 0, 24)); // NOI18N
        jbtnBull.setText("Bull");
        jbtnBull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBullMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblInstructionOne, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbtnBull, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jbtnHero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnShaq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnSnorlax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblMyImage, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlblMyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlblInstructionOne, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSnorlax, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnShaq, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnHero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBull, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlblInstructionTwo.setFont(new java.awt.Font("华文隶书", 0, 24)); // NOI18N
        jlblInstructionTwo.setText("Please Enter Your Name:");

        jbtnConfirm.setFont(new java.awt.Font("华文隶书", 0, 24)); // NOI18N
        jbtnConfirm.setText("Confirm");
        jbtnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnConfirmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblInstructionTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtCustomizedName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jbtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblInstructionTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jtxtCustomizedName))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSnorlaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSnorlaxMouseClicked
        jlblMyImage.setIcon(new ImageIcon(snorlax.getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        this.myImage = snorlax;
        this.type = CharacterType.SNORLAX;
    }//GEN-LAST:event_jbtnSnorlaxMouseClicked

    private void jbtnShaqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnShaqMouseClicked
        jlblMyImage.setIcon(new ImageIcon(shaq.getScaledInstance(200, 250, Image.SCALE_SMOOTH)));
        this.myImage = shaq;
        this.type = CharacterType.SHAQ;
    }//GEN-LAST:event_jbtnShaqMouseClicked

    private void jbtnHeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHeroMouseClicked
        jlblMyImage.setIcon(new ImageIcon(hero.getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        this.myImage = hero;
        this.type = CharacterType.HERO;
    }//GEN-LAST:event_jbtnHeroMouseClicked

    private void jbtnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnConfirmMouseClicked
        if (responseHandler != null) {
            responseHandler.handlePlayerCustomizationResponse(this.jtxtCustomizedName.getText(), myImage, this.type);
            close();
        }
    }//GEN-LAST:event_jbtnConfirmMouseClicked

    private void jbtnBullMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBullMouseClicked
        jlblMyImage.setIcon(new ImageIcon(hero.getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        this.myImage = hero;
        this.type = CharacterType.BULL;
    }//GEN-LAST:event_jbtnBullMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnBull;
    private javax.swing.JToggleButton jbtnConfirm;
    private javax.swing.JButton jbtnHero;
    private javax.swing.JButton jbtnShaq;
    private javax.swing.JButton jbtnSnorlax;
    private javax.swing.JLabel jlblInstructionOne;
    private javax.swing.JLabel jlblInstructionTwo;
    private javax.swing.JLabel jlblMyImage;
    private javax.swing.JTextField jtxtCustomizedName;
    // End of variables declaration//GEN-END:variables
}
