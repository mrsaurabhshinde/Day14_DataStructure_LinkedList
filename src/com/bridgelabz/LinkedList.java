package com.bridgelabz;

public class LinkedList
{
    Node head;

    // create node class

    /*
     * class Node that hold data and a reference/link
     * to the next Node in the list
     */
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    /*
     * Method to add a node at the beginning of the list
     */

    public Node insert(int data) {

        /*
         * Create a new node
         */
        Node newNode = new Node(data);

        /*
         * Check if the list is empty
         */
        if (head == null) {

            /*
             * Make the new node as head
             */
            head = newNode;

        } else {
            Node temp = head;

            /*
             * traverse to the end of the list
             */
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return newNode;
    }

    /*
     * create a print method
     */
    public void print() {

        /*
         * head store in temp variable
         */
        Node temp = head;

        /*
         * While loop using
         *
         * If temp is not equal to null then print in sout data
         */
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }

    }
    /*
     * create a push method for adding new node and passing parameter
     */
    public void push ( int data){
        /*
         * Create a new node
         */
        Node newNode = new Node(data);
        /*
         * new node is head
         */
        newNode.next = head;
        head = newNode;

    }
}
