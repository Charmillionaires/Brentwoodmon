/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import java.awt.Image;

/**
 *
 * @author zhanglianghui
 */
public class Item {
    
    public Item(String name, String description){
        this.name = name;
        this.description = description;
       
    }
    
    private String name = "";
    private String description = "";
    private Image image;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
     public String getDisplay() {
        return name + " " + description;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }
    
}
