package MinNoOfSquaresPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.awt.Point;

public class MinNoOfSquareInBFSMethod {
    public static void main(String[] args) {
        System.out.println(numSquares(6));

    }

    private static int numSquares(int n) {
        // Creating visited vector
        // of size n + 1
        boolean visited[] = new boolean[n + 1];
        // Queue of pair to store node
        // and number of steps
        Queue<Point> q = new LinkedList<>();
        int ans = Integer.MAX_VALUE;

        q.add(new Point(n, 0)); // root node
        visited[n] = true;
        // System.out.println(q.size());
        while (q.size() != 0) {
            Point p = q.peek();
            System.out.println("before p.x=  "+p.x+"       p.y=   "+p.y );
            q.poll();
            System.out.println("after p.x=  "+p.x+"       p.y=   "+p.y );

            if (p.x == 0) {
                ans = Math.min(ans, p.y);
            }
            for (int i = 1; i * i <= p.x; i++) {
                int path = p.x - (i * i);
                System.out.println("path =    "+path);
                if (path >= 0 && (visited[path] == false || path == 0)) {
                    visited[path] = true;
                    q.add(new Point(path, p.y + 1));
                }
            }
            System.out.println("q.size() =    "+q.size());
        }
        return ans;

    }

}
