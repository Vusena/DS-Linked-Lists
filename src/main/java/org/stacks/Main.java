package org.stacks;

public class Main {
    public static void main(String[] args) {
        System.out.println("");

        Stack myStack = new Stack(4);

//        myStack.getTop();
//        myStack.getHeight();
//        System.out.println("\nStack:");
//        myStack.printStack();

        myStack.push(11);
        myStack.pop();
        myStack.printStack();
    }





}