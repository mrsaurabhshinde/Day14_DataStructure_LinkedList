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
    public void push(int data) {
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

    /*
     *  create a method for Insert 30 between 56 and 70
     */
    public void insertAfter(Node prevNode, int value) {
        /*
         * condition is checked
         */
        if (prevNode == null) {
            System.out.println("Prev Node should not be null");
            return;
        }
        //56 ->70
        //56 -> 30 -> 70

        /*
         * create new node inserting 30 btwn 56 and 70
         */
        Node newNode = new Node(value);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

    }

    /*
     * creat a method name as pop
     * in pop method used for deleting element
     * here this is used for delete 1st element in linked list
     */
    public int pop() {
        //variable
        int popData = 0;

        /*
         * check the condition
         */
        if (head == null) {
            System.out.println("Stack over flow ");
        }
        popData = head.data;
        head = head.next;

        return popData;

    }
    /*
     * create a method name as popLast
     * this is used here to delete last element in linked list
     */
    public void popLast() {

        /*
         * condition is checked
         */
        if (head == null) {
            System.out.println("Stack is empty");
        }
        if (head == null) {
            System.out.println(head.data);
            head = null;
        }
        /*
         * head is stored in temp variable
         */
        Node temp = head;

        /*
         * while loop is used
         */
        while (temp.next.next != null) {
            temp = temp.next;

        }
        temp.next = null;
        System.out.println("Delete last node::");
    }

    /*
     * create method name as search passing parameter name as int val.
     * in this operation Search linked list to find Node with Value
     */
    public int search ( int val){
        /*
         * check list empty or not
         */
        if (head == null) {
            System.out.println("List is Empty");
            return -1;
        }
        int index = 1;
        Node newNode = head;
        /*
         * while loop is used
         * newNod is not empty
         */
        while (newNode != null) {
            /*
             * condition checked if condition is true then break this loop
             * position of 30 is 2
             */
            if (newNode.data == val) {
                break;
            }
            index++;
            newNode = newNode.next;
        }
        return index;
    }

    /*
     * Method to add a node at the specified position in the list
     */
    public void insertelement(int position, int data) {

        /*
         * Create a new node
         */
        Node node = new Node(data);

        // Point the new node's next to head
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            Node previous = head;
            int count = 1; // position - 1

            /*
             *while loop is used
             */
            while (count < position - 1) {
                /*
                 *update prev to point to new node
                 */
                previous = previous.next;
                count++;
            }

            Node temp = previous.next;
            previous.next = node;
            node.next = temp;
        }
    }
    /*
     * create a method deleteNode and passing parameter.
     */
    public void deleteANode(int value) {
        /*
         * Check if the list is empty
         */
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }

        /*
         * in TempNode is head
         */
        Node tempNode = head;
        /*
         * using while loop
         */
        while (tempNode.next.data != value) {
            tempNode = tempNode.next;
        }
        Node previousNode = tempNode;
        Node nextNode = tempNode.next.next;
        previousNode.next = nextNode;
    }
    /*
     * create sort method
     */
    public void sort() {
        Node initialStart = head, index = null;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (initialStart != null) {
            index = initialStart.next;
            while (index != null) {
                if (initialStart.data > index.data) {
                    int temp = initialStart.data;
                    initialStart.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            initialStart = initialStart.next;
        }
    }

}




//>> main

