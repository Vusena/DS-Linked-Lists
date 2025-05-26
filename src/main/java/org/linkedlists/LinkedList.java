package org.linkedlists;

public class LinkedList {
    private Node head;
    private Node tail;
    int length;

    class Node {
         int value;
         Node next;

         public Node(int value) {
             this.value = value;
         }
    }
    public LinkedList(int value) {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

//    APPEND
    public void append(int value) {
        Node newNode=new Node(value);
        if (head == null) {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //REMOVE LAST NODE
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp; // return the removed node
    }

    //PREPEND
    public void prepend(int value) {
        Node newNode=new Node(value);
        if (length == 0) {
            head=newNode;
            tail=newNode;
        } else {
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    //REMOVE FIRST
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    //GET
    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp=head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        return temp;
    }

    //SET
    public boolean set(int index, int value) {
        Node temp=get(index);
        if(temp!=null){
        temp.value=value;
        return true;
        }
        else return false;
    }

    //INSERT
    public boolean insert(int index,int value){
        if (index<0|| index>length) return false;
        if(index==0){
            prepend(value);
            return true;
        }
        else if(index==length){
           append(value);
           return true;
        }

             Node newNode= new Node(value);
             Node temp= get(index-1);
             newNode.next=temp.next;
             temp.next=newNode;
             length++;
             return true;

        }

        //REMOVE
        public Node remove(int index) {
            if (index < 0 || index >= length) return null;
            if (index == 0) return removeFirst();
            if (index == length - 1) return removeLast();

            Node prev = get(index - 1);
            Node temp = prev.next;

            prev.next = temp.next;
            temp.next = null;
            length--;
            return temp;
        }

    //REVERSE
   public void reverse() {
     Node temp = head;
     head = tail;
     tail = temp;
     Node after = temp.next;
     Node before = null;
     for (int i = 0; i < length; i++) {
         after = temp.next;
         temp.next = before;
         before = temp;
         temp = after;
     }
 }

}

