package org.linkedlists;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    int length;

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head" + " " + head.value);
    }

    public void getTail() {
        System.out.println("Tail" + " " + tail.value);
    }

    public void getLength() {
        System.out.println(length);
    }

    //APPEND
    public void append(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head=newNode;
            tail=newNode;
    }
        else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;

        }
            length++;
    }

    //REMOVE LAST
    public Node removeLast(){
        if (head==null) return null;
        Node temp=tail;
        if (length == 1) {
            head=null;
            tail=null;
                    }
        else {
        tail=tail.prev;
        tail.next=null;
        temp.next=null;
        }
        length--;
        return temp;
    }

    //PREPEND
    public void prepend(int value){
        Node newNode = new Node(value);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
                    }
        length++;
    }

    //REMOVE FIRST
    public Node removeFirst(){
        if (head==null) return null;
        Node temp=head;
        if (length == 1) {
            head=null;
            tail=null;
        }
        else {
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
        length--;
        return temp;
    }

    //GET
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    //SET
    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    //INSERT
    public boolean insert(int index, int value){
        if (index<0 || index>length) return false;

        if(index==0){
            prepend(value);
            return true;
        }
        else if(index==length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;

    }

    //REMOVE
    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

    //DELETE A LIST
    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

}