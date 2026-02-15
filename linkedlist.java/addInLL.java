

import java.util.LinkedList;

public class addInLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirstt(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    public void printLL(){
        if(head==null){
            System.out.print("ll empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
     }

      public void addInMid(int idx,int data){
        if(idx==0){
        addFirstt(data);
        return;
       } 
       Node newNode = new Node(data);
        Node temp=head;
        int i=0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next=newNode;
    }
  
    public int removeFirst(){
        if(size==0){
            System.out.println("LL empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head; // prev: i=size-2
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val= prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deleteNthEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==size){
            head=head.next;
            return;
        }

        int i=0;
        int iToFind= size-n;
        Node prev=head;
        while (i<iToFind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node miNode = findMid(head);
        Node prev=null;
        Node curr=miNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
  
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
        addInLL ll=new addInLL();
        ll.addFirstt(1);
        ll.addFirstt(2);
        ll.addFirstt(2);
        ll.addFirstt(1);
        ll.printLL();
       System.out.println(ll.checkPalindrome());

}

}

