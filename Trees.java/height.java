import java.util.*;
public class height {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int count(Node root){
        if(root==null) return 0;
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;

    }

    public static int dia2(Node root){
        if(root==null) return 0;
        int lh= height(root.left);
        int rh= height(root.right);
        int ldia= dia2(root.left);
        int rdia= dia2(root.right);
        int self= lh+rh+1;
        return Math.max(self,Math.max(ldia,rdia)); 


    }
   static class info{
    int ht;
    int dia;
    public info(int ht,int dia){
        this.ht=ht;
        this.dia=dia;
    }
   }
    public static info dia(Node root){
       if(root==null) return new info(0,0);
       info leftInfo = dia(root.left);
       info rightInfo = dia(root.right);
       int diam= Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.ht+rightInfo.ht+1);
       int height = Math.max(leftInfo.ht,rightInfo.ht)+1;
       return new info(height, diam);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        System.out.println(dia(root).dia);
        System.out.println(dia(root).ht);
    }
}
