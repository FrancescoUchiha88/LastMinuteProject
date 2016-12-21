/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lastminutegroup.project.salestax.engine;

import com.lastminutegroup.project.salestax.entity.ClassAProduct;
import com.lastminutegroup.project.salestax.entity.ClassBProduct;
import com.lastminutegroup.project.salestax.entity.ClassCProduct;
import com.lastminutegroup.project.salestax.entity.ClassDProduct;
import com.lastminutegroup.project.salestax.entity.Product;

/**
 *
 * @author Francesco Lucci
 */
public class EvaluateProduct {

    public static Product evaluateProduct(int product_id, String name, double d, String description, String type, String imported) {
        boolean iSNotundertax = (type.equalsIgnoreCase("book")) | (type.equalsIgnoreCase("food")) | (type.equalsIgnoreCase("medical"));
        boolean iSimported = imported.equalsIgnoreCase("y");

        if (iSimported == false && iSNotundertax == true) {
            return new ClassAProduct(product_id, name, d, description, type, imported);
        } else if (iSimported == false && iSNotundertax == false) {
            return new ClassBProduct(product_id, name, d, description, type, imported);
        } else if (iSimported == true && iSNotundertax == true) {
            return new ClassCProduct(product_id, name, d, description, type, imported);
        } else if (iSimported == true && iSNotundertax == false) {
            return new ClassDProduct(product_id, name, d, description, type, imported);
        }
        return null;
    }
}
