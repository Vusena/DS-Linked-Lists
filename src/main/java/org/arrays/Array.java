package org.arrays;

public class Array {

    int[] array;
    int sum=0;

    public void print() {
        for (int x : array) {
            System.out.println(x);
        }
    }

//SUM
        public int sum() {
            for (int i : array) {
                sum += i;
            }
            return sum;
        }

    //REVERSING AN ARRAY
    public void reverse(){
        for(int i=0; i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-1];
            array[array.length-1-i]=temp;

        }
    }
    }


