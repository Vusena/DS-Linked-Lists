package org.linkedlists;

public class Main {
    public static void main(String[] args) {
        System.out.println();

//        LinkedList list=new LinkedList(7);
//        list.getHead();
//        list.getTail();
//        list.getLength();

        //APPEND
//        list.append(18);
//        list.append(35);
//
//        list.printList();
        //REMOVE NODE
        // (2) Items - Returns 2 Node
//        System.out.println(list.removeLast().value);
        // (1) Item - Returns 1 Node
//        System.out.println(list.removeLast().value);
        // (0) Items - Returns null
//        System.out.println(list.removeLast());

        //APPEND
//        System.out.println("Before prepend():");
//        System.out.println("-----------------");
//        list.getHead();
//        list.getTail();
//        list.getLength();
//
//        System.out.println("\nLinked List:");
//        list.printList();
//
//        list.prepend(1);
//        System.out.println("\nLinked List after prepend():");
//        list.printList();
//
//        System.out.println("\n\nAfter prepend():");
//        System.out.println("----------------");
//        list.getHead();
//        list.getTail();
//        list.getLength();

        //GET AND SET
//          System.out.println(list.get(2).value);
//            System.out.println(list.set(2,59));
//            list.printList();

        //INSERT INTO LIST
//        list.insert(1, 57);
//        list.printList();

        //REMOVE LIST
//        list.remove(1);
//        list.printList();

        //REVERSE
//        System.out.println("LL before reverse():");
//        list.printList();

//        list.reverse();

//        System.out.println("\nLL after reverse():");
//        list.printList();


        //  DOUBLE LINKED LIST
DoubleLinkedList dLL=new DoubleLinkedList(6);
//dLL.printList();
//dLL.getHead();
//dLL.getTail();
//dLL.getLength();

        //APPEND
        dLL.append(2);
        dLL.append(3);
        dLL.append(4);
        dLL.append(5);
//        dLL.printList();

        //REMOVE LAST
        // (2) Items - Returns 2 Node
//        System.out.println(dLL.removeLast().value);
        // (1) Item - Returns 1 Node
//        System.out.println(dLL.removeLast().value);
        // (0) Items - Returns null
//        System.out.println(dLL.removeLast());

      //PREPEND
//        dLL.prepend(8);
//        dLL.printList();

        //REMOVE FIRST
        // (2) Items - Returns 2 Node
//        System.out.println(dLL.removeFirst().value);
        // (1) Item - Returns 1 Node
//        System.out.println(dLL.removeFirst().value);
        // (0) Items - Returns null
//        System.out.println(dLL.removeFirst());

        //GET
//        System.out.println(dLL.get(0).value);

        //SET
//        dLL.set(0,69);
//        dLL.printList();

        //INSERT
//        System.out.println("DLL before insert():");
//        dLL.printList();//
//        dLL.insert(1, 2);//
//        System.out.println("\nDLL after insert(2) in middle:");
//        dLL.printList();//
//        dLL.insert(0, 0);//
//        System.out.println("\nDLL after insert(0) at beginning:");
//        dLL.printList();//
//        dLL.insert(4, 4);
//        System.out.println("\nDLL after insert(4) at end:");
//        dLL.printList();

//        System.out.println("DLL before remove():");
//        dLL.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(dLL.remove(2).value);
//        System.out.println("DLL after remove() in middle:");
//        dLL.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(dLL.remove(0).value);
//        System.out.println("DLL after remove() of first node:");
//        dLL.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(dLL.remove(2).value);
//        System.out.println("DLL after remove() of last node:");
//        dLL.printList();

//        //DELETING A LIST
////        dLL.clear();
//        dLL.printList();


    }





}