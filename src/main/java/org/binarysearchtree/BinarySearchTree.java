package org.binarysearchtree;

public class BinarySearchTree {
   Node root;

    public class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value=value;

        }
    }

    //INSERT
    public boolean insert(int value){
        Node newNode=new Node(value);
        if(root==null){
            root=newNode;
            return true;
        }
        Node temp=root;
        while(true){
            if(newNode.value==temp.value)return false;
            if(newNode.value<temp.value){
                if(temp.left==null){
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }
            if (newNode.value>temp.value){
                if(temp.right==null){
                    temp.right=newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    //CONTAINS
    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }


}
