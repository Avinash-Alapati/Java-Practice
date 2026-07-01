package com.Avinash;

public class TreesBasics {
        static class Node {
            int data;
            Node left;
            Node right;

            public Node(int value) {
                this.data = value;
                this.left = null;
                this.right = null;
            }
        }
        public static void main(String[] args) {

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            System.out.println(root.data);
            System.out.println(root.left.data);
            System.out.println(root.right.data);
            System.out.println(root.left.left.data);
            System.out.println(root.left.right.data);
            System.out.println(root.right.left.data);
            System.out.println(root.right.right.data);


        }

}
