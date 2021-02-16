package hacker_rank_30_days.Day_24;

import java.util.Scanner;
/*
A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, 
top to bottom. You are given a pointer, , pointing to the root of a binary search tree. Complete the levelOrder function 
provided in your editor so that it prints the level-order traversal of the binary search tree.
*/

public class Day24BFS {
    
    static void levelOrder(Node root) {
        // Write your code here
        // System.out.print("root value :"+root.left);
        int h = height(root); // calculating height
        System.out.println("height value  :" + h);
       
        int i;
        for (i = 1; i <= h; i++){
            printDataInEachLevel(root, i);
        }
           
    }

    /*
     * Compute the "height" of a tree -- the number of nodes along the longest path
     * from the root node down to the farthest leaf node.
     */
    static int height(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute height of each subtree */
            System.out.println(root.left + "   " + root.right);
            int lheight = height(root.left);
            int rheight = height(root.right);
            return Math.max(lheight, rheight) + 1;
        }
    }

    /* Print nodes at the given level */
    static void printDataInEachLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printDataInEachLevel(root.left, level - 1);
            printDataInEachLevel(root.right, level - 1);
        }
    }

    public static Node insert(Node root, int data) {
        // when insert. always start from the root means fist element of the tree
        if (root == null) {
            return new Node(data); // for first data
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur; // now he becomes Node
            } else {
                cur = insert(root.right, data);
                root.right = cur; // now he becomes Node
            }
            return root;
        }
    }

    public static void main(String[] args) {
        /*
         * step 1: insert the data in binary tree and create the binary tree step 2:
         * calculate height of the tree given by the tree step 3: for each tree level
         * print the root value by making level 1
         */

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }

}
