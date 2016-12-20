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
public class ClassAProduct extends Product {

    public ClassAProduct(int product_id, String name, double d, String description, int quantity, String type, String imported) {
        super(product_id, name, d, description, quantity, type, imported);
    }

    public double calculateTax() {
        return 0;
    }
}
