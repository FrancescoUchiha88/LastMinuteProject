/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lastminutegroup.project.salestax.entity;

import java.util.ArrayList;

/**
 *
 * @author Lucci
 */
public class ListOfProduct {

    private ArrayList<String> Products;

    private ArrayList<String> ProductIDs;

    public ListOfProduct() {
        Products = new ArrayList<String>();
        ProductIDs = new ArrayList<String>();
    }

    public ArrayList<String> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<String> Products) {
        this.Products = Products;
    }

    public ArrayList<String> getProductIDs() {
        return ProductIDs;
    }

    public void setProductIDs(ArrayList<String> ProductIDs) {
        this.ProductIDs = ProductIDs;
    }

    public void addToProducts(String string) {
    
        this.Products.add(string);

    }
    
    public void addToProductIDs(String string){
    
        this.ProductIDs.add(string);
        
    }

    public int size() {
        return this.Products.size();
    }

    public void clear() {
        this.Products.clear();
        this.ProductIDs.clear();
    }

    public void remove(int selectedIndex) {
        this.Products.remove(selectedIndex);
        this.ProductIDs.remove(selectedIndex);
    }

    public void addAll(ListOfProduct SelectedProduct) {
        this.Products.addAll(SelectedProduct.getProducts());
        this.ProductIDs.addAll(SelectedProduct.getProductIDs());
    }
    

}
