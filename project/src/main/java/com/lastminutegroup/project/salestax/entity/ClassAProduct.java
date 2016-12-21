/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lastminutegroup.project.salestax.entity;

/**
 *
 * @author Francesco Lucci
 */
public class ClassAProduct extends Product {

    public ClassAProduct(int product_id, String name, double d, String description, String type, String imported) {
        super(product_id, name, d, description, type, imported);
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
