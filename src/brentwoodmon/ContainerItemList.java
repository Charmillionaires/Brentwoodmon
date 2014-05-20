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
public class ContainerItemList {
    {
        items = new ArrayList<>();
    }
    
    private ArrayList<ContainerItem> items;

    /**
     * @return the items
     */
    public ArrayList<ContainerItem> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<ContainerItem> items) {
        this.items = items;
    }
}
