package hacker_rank_30_days.Day_22;

import java.util.Scanner;
/*
Task
The height of a binary search tree is the number of edges between the tree's root and
 its furthest leaf. You are given a pointer, , pointing to the root of a binary search 
 tree. Complete the getHeight function provided in your editor so that it returns 
 the height of the binary search tree.
*/

public class Day22BinarySearchTress {
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);

    }

    private static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }
        int lefth = getHeight(root.left);
        int rightth = getHeight(root.right);

        if (lefth > rightth) {
            return lefth + 1;
        } else {
            return rightth + 1;
        }
    }

}