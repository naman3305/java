import java.util.*;

public class IterativeBSTsearch
{
   static boolean search(Node root,int x)
   {
    while(root!=null)
    {
        if(root.key==x)
            return true;
        else if(root.key<x)
            root=root.right;
        else
            root=root.left;
    }
    return false;
   }    
   public static void main(String args[])
   {
        Node root=new Node(10);
       root.left=new Node(20);
       root.right=new Node(30);
       root.right.left=new Node(40);
       root.right.right=new Node(50);
       root.right.left.left=new Node(60);
       root.right.right.left=new Node(70);
        root.right.right.right=new Node(80);
        if(search(root,80)==true)
        System.out.println("present");
        else
        System.out.println("Not present");
   }
}
