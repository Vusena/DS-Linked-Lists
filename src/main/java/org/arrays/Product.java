package org.arrays;

public class Product {

     private int prod_id;
     private String prod_name;

    public Product(int id, String name){
        prod_id = id;
        prod_name=name;
    }

    public int getId(){
        return prod_id;
    }
    public void setId(int id){
        this.prod_id=id;
    }
    @Override
    public String toString() {
        return "Product ID: " + prod_id + ", Product Name: " + prod_name;
    }
}
