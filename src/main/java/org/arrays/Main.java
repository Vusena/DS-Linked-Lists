package org.arrays;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Array newarray= new Array();
//
//        newarray.array = new int[] {10,20,30,40,60,70};
//        newarray.print();
//        newarray.reverse();
//        newarray.print();
//        int sum = newarray.sum();
//        System.out.println(sum);

        Product newProduct=new Product(1,"Hair Oil");
//        System.out.println(newProduct.prod_id);
//        int id=newProduct.getId();
//         newProduct.setId(2);
//        System.out.println(id);
//         id=newProduct.getId();
//        System.out.println(id);

        Product[] array = new Product[5];
        array[0]=new Product(1,"Hair Oil");
        array[1]=new Product(2,"Conditioner");
        array[2]=new Product(3,"LeavenIn Treatment");
        array[3]=new Product(4,"Hair Brush");
        array[4]=new Product(5,"Shampoo");

//      for( int i=0; i<array.length; i++){
//          Product result=array[i];
//          System.out.println(result.toString());
//      }
      for(Product p:array){
          System.out.println(p);
      }

      Product[] newArray= new Product[array.length+1];
      newArray[0]=new Product(8, "Hair Dye");
      for(int i=0; i<array.length; i++){
          newArray [i+1]=array[i];
      }
      for(Product p:newArray){
          System.out.println(p);
      }
    }
}
