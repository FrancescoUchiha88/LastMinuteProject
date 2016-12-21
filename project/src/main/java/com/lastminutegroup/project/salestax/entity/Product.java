package com.lastminutegroup.project.salestax.entity;
    
    /**
     *
     * @author Francesco Lucci
     */

public abstract class Product {

    private int Product_ID;
    private String name;
    private double price;
    private String description;
    private String type;
    private String imported;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Product(int product_id, String name, double d, String description, String type, String imported) {
        // TODO Auto-generated constructor stub
        this.Product_ID = product_id;
        this.setName(name);
        this.setPrice(d);
        this.setDescription(description);
        this.setType(type);
        this.imported = imported;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double calculateTax();

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setImported(String imported) {
        this.imported = imported;
    }

    public String isImported() {
        return imported;
    }

    public int getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(int Product_ID) {
        this.Product_ID = Product_ID;
    }
}
