/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import timer.TimerEventManager;
import timer.TimerNotificationIntf;

/**
 *
 * @author zhanglianghui
 */
public class Combat extends javax.swing.JPanel implements TimerNotificationIntf {

    /**
     * Creates new form Combat
     */
    private int myHp = 100;
    private int enemyHp = 30;
    private int damage = 5;
    private String actionPerformed = "";
    private TimerEventManager timerEventManager;
    private final String ENEMY_ATTACK_EVENT = "enemy_attack_event";
    
    public Combat() {
        initComponents();

        //put this code in to instantiate the timer event manager
        timerEventManager = new TimerEventManager();
        this.jlblBattleHistory.setText("Your turn");
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
        jbtnAttack = new javax.swing.JButton();
        jbtnBackpack = new javax.swing.JButton();
        jbtnPet = new javax.swing.JButton();
        jbtnDenfence = new javax.swing.JButton();
        jbtnRun = new javax.swing.JButton();
        jbtnSkill = new javax.swing.JButton();
        myPicture = new javax.swing.JPanel();
        enemyPicture = new javax.swing.JPanel();
        jtxtBattleHistory = new javax.swing.JTextField();
        jlblBattleHistory = new javax.swing.JLabel();

        jbtnAttack.setText("Attack");
        jbtnAttack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAttackMouseClicked(evt);
            }
        });

        jbtnBackpack.setText("Backpack");
        jbtnBackpack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackpackActionPerformed(evt);
            }
        });

        jbtnPet.setText("Pet");

        jbtnDenfence.setText("Defence");

        jbtnRun.setText("Run Away");

        jbtnSkill.setText("Skill");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnBackpack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnDenfence, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jbtnAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnPet, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAttack)
                    .addComponent(jbtnPet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDenfence)
                    .addComponent(jbtnSkill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBackpack)
                    .addComponent(jbtnRun))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout myPictureLayout = new javax.swing.GroupLayout(myPicture);
        myPicture.setLayout(myPictureLayout);
        myPictureLayout.setHorizontalGroup(
            myPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        myPictureLayout.setVerticalGroup(
            myPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout enemyPictureLayout = new javax.swing.GroupLayout(enemyPicture);
        enemyPicture.setLayout(enemyPictureLayout);
        enemyPictureLayout.setHorizontalGroup(
            enemyPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        enemyPictureLayout.setVerticalGroup(
            enemyPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        jtxtBattleHistory.setText("What will you do?");

        jlblBattleHistory.setText("Start");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(myPicture, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtBattleHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(enemyPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlblBattleHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enemyPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtBattleHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblBattleHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBackpackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackpackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnBackpackActionPerformed
    
    private void jbtnAttackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAttackMouseClicked
        if (this.jlblBattleHistory.getText() == "Your turn") {
            this.enemyHp = this.enemyHp - damage;
            System.out.println("enemyHp = " + this.enemyHp);
            this.actionPerformed = "Attack!";
            this.jlblBattleHistory.setText("Enemy's turn");
            this.jtxtBattleHistory.setText(actionPerformed + " Enemy HP left = " + this.enemyHp);
            
            if (this.enemyHp <= 0) {
                this.jtxtBattleHistory.setText("You Win!");
                this.jlblBattleHistory.setText("End of Combat");
                
            } else if (this.myHp <= 0) {
                this.jtxtBattleHistory.setText("You Lose!");
                this.jlblBattleHistory.setText("End of Combat");
                
            } else {
                //register an attack event: I used 3000 milliseconds, because I think 3 seconds
                //is a better wait time than 5 seconds...
                if (timerEventManager != null) {
                    timerEventManager.registerTimerEvent(this, ENEMY_ATTACK_EVENT, 3000);
                    
                }
            }
            
            
        }
    }//GEN-LAST:event_jbtnAttackMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel enemyPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAttack;
    private javax.swing.JButton jbtnBackpack;
    private javax.swing.JButton jbtnDenfence;
    private javax.swing.JButton jbtnPet;
    private javax.swing.JButton jbtnRun;
    private javax.swing.JButton jbtnSkill;
    private javax.swing.JLabel jlblBattleHistory;
    private javax.swing.JTextField jtxtBattleHistory;
    private javax.swing.JPanel myPicture;
    // End of variables declaration//GEN-END:variables

    @Override
    public void TimerEvent(String eventType) {
        if (eventType.equals(ENEMY_ATTACK_EVENT)) {
            this.myHp = this.myHp - damage;
            
            System.out.println("myHp = " + this.myHp);
            this.actionPerformed = "Enemy Attack!";
            this.jtxtBattleHistory.setText(actionPerformed + " Your HP left = " + this.myHp);
            this.jlblBattleHistory.setText("Your turn");
        }
    }
}
