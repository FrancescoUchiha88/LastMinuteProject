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
public class EvaluateProduct {
	
    public static Product evaluateProduct(int product_id, String name, double d, String description, int quantity, String type, String imported)
    {
    		
        boolean iSNotundertax=(type.equalsIgnoreCase("book"))|(type.equalsIgnoreCase("food"))|(type.equalsIgnoreCase("medical"));
        boolean iSimported=imported.equalsIgnoreCase("y");
        
        
        
        if(iSimported==false && iSNotundertax==true)
        {
            return new ClassAProduct(product_id,name, d, description, quantity,type,imported);
        }
        else if(iSimported==false && iSNotundertax==false)
        {
            return new ClassBProduct(product_id,name, d, description, quantity,type,imported);
        }
        else if(iSimported==true && iSNotundertax==true)
        {
            return new ClassCProduct(product_id,name, d, description, quantity,type,imported);
        }
        else if(iSimported==true && iSNotundertax==false)
        {
            return new ClassDProduct(product_id,name, d, description, quantity,type,imported);
        }
        
        return null;
               
    }

    
}
