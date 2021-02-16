package hacker_rank_30_days.Day_25;

import java.util.HashSet;
import java.util.Scanner;

public class Day25LinkedListMore {
    static  LinkedLIstNode removeDuplicates( LinkedLIstNode head) {       
             /* Pick elements one by one */
             LinkedLIstNode current = head;
             LinkedLIstNode prev = null;
             HashSet<Integer> hs = new HashSet<>();             
             while (current != null) 
             {
                 int curval = current.data;                  
                  // If current value is seen before
                 if (hs.contains(curval)) {
                     prev.next = current.next;
                 } else {
                     hs.add(curval);
                     prev = current;
                 }
                 current = current.next;
             }
             return head;
     
      }


   public static   LinkedLIstNode insert(LinkedLIstNode head,int data)
    {
        LinkedLIstNode p = new  LinkedLIstNode(data);			
       if(head==null)
           head=p;
       else if(head.next==null)
           head.next=p;
       else
       {
        LinkedLIstNode start=head;
           while(start.next!=null)
               start=start.next;
           start.next=p;
       }
       return head;
   }
   public static void display( LinkedLIstNode head)
   {
    LinkedLIstNode start=head;
         while(start!=null)
         {
             System.out.print(start.data+" ");
             start=start.next;
         }
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedLIstNode head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head); 
    }    
}
