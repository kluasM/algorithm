package com.klaus.algorithm;

public class myLink {
    Node head=null;
    public void addNode(int d){
        Node newNode=new Node(d);
        if (head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
}
