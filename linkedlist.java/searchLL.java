import java.util.*;

public class searchLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
   
    public static int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll);
        System.out.println(itrSearch(3));
       
    }

}
