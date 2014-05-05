/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brentwoodmon;

import java.util.ArrayList;

/**
 *
 * @author zhanglianghui
 */
public class ItemList {
    {
        items = new ArrayList<>();
    }
    
    private ArrayList<Item> items;

    /**
     * @return the items
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
