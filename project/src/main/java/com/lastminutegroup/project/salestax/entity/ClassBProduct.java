/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lastminutegroup.project.salestax.entity;

/**
 *
 * @author Administrator
 */
public class ClassBProduct extends Product {

    public ClassBProduct(int product_id, String name, double d, String description, int quantity, String type, String imported) {
        super(product_id, name, d, description, quantity, type, imported);
    }

    public double calculateTax() {

        double tempTax;
        double tax;

        tempTax = this.getPrice() * 10/ 100;
        tempTax = tempTax * 100;
        tempTax = (int) ((tempTax / 5) + 0.5) * 5;
        // tempTax = tempTax * Math.pow(10, -3);
        tempTax = tempTax / 100;

        return tempTax * super.getQuantity();
    }

}
