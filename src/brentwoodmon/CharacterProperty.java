/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

/**
 *
 * @author zhanglianghui
 */
public class CharacterProperty {
    private int myLevel = 1;
    private int myExp;
    private int myHp = 0;
    private int myDamage = 0;

    /**
     * @return the myLevel
     */
    public int getMyLevel() {
        return myLevel;
    }

    /**
     * @param myLevel the myLevel to set
     */
    public void setMyLevel(int myLevel) {
        this.myLevel = myLevel;
    }

    /**
     * @return the myExp
     */
    public int getMyExp() {
        return myExp;
    }

    /**
     * @param myExp the myExp to set
     */
    public void setMyExp(int myExp) { 
        this.myExp = myExp;
    }

    /**
     * @param myExp the myExp to set
     */
    public void addToMyExp(int myExp) {
        if ((this.myExp < 10) && ((this.myExp + myExp) > 10)) {
            this.addToMyLevel(1);
        }
        
        this.myExp += myExp;
    }
    
    public void addToMyLevel(int myLevel) {
        this.myLevel += myLevel;
    }


    /**
     * @return the myHp
     */
    public int getMyHp() {
        if (this.myLevel> 0){
        return this.getMyLevel() * 2 + 15;
        }else{
        return myHp;
        }
    }

    /**
     * @param myHp the myHp to set
     */
    public void setMyHp(int myHp) {
        this.myHp = myHp;
    }

    /**
     * @return the myDamage
     */
    public int getMyDamage() {
        if (this.myLevel> 0) {
            return this.getMyLevel() * 2 + 10;
        }else{
        return myDamage;
        }
    }

    /**
     * @param myDamage the myDamage to set
     */
    public void setMyDamage(int myDamage) {
        this.myDamage = myDamage;
    }
    
}
