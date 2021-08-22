package com1.marksog;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printList(){
        Node list = head;
        while(list != null){
            System.out.println(list.data + "=====>");
            list = list.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
	LinkedList n = new LinkedList();
	n.head = new Node(1);
	Node node2 = new Node(2);
	Node node3 = new Node(3);
	Node node4 = new Node(4);
	Node node5 = new Node(5);

	//linking the node together

        n.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        n.printList();

    }
}

// to reverse a list
// Node current = boxInQuesiotn;
//Node previous = null;
//Node next = null;

// the logic

// node current = head;
// Node previous = null;
// Node next = null;
// while(current != null){

// next =  current.next;
// current.next =  previous;
// previous = current;
// current = next;