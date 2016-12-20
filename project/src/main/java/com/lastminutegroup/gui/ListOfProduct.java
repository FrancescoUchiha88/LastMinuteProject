/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lastminutegroup.gui;

import java.util.ArrayList;

/**
 *
 * @author Lucci
 */
public class ListOfProduct {

    private ArrayList<String> Basket;

    private ArrayList<String> ProductIDs;

    public ListOfProduct() {
        Basket = new ArrayList<String>();
        ProductIDs = new ArrayList<String>();
    }

    public ArrayList<String> getBasket() {
        return Basket;
    }

    public void setBasket(ArrayList<String> Basket) {
        this.Basket = Basket;
    }

    public ArrayList<String> getProductIDs() {
        return ProductIDs;
    }

    public void setProductIDs(ArrayList<String> ProductIDs) {
        this.ProductIDs = ProductIDs;
    }

    public void addToBasket(String string) {
    
        this.Basket.add(string);

    }
    
    public void addToProductIDs(String string){
    
        this.ProductIDs.add(string);
        
    }

    int size() {
        return this.Basket.size();
    }

    void clear() {
        this.Basket.clear();
        this.ProductIDs.clear();
    }

    void remove(int selectedIndex) {
        this.Basket.remove(selectedIndex);
        this.ProductIDs.remove(selectedIndex);
    }
    

}
