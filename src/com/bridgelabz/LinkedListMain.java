package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain
{
    /*
     *  main method every program execute here.
     */

    public static void main(String[] args) {
        /*
          create object for linkedlist class coz no one method is static in this class
         */

        LinkedList linkedList = new LinkedList();

        /*
         * create scanner class and object
         * scanner class read java user input
         */
        Scanner sc = new Scanner(System.in);

        /*
         * in sout 1st print the welcome msg and then choose our option then if
         * 1.we press 1 then they print inserting data
         * 2.if we press 2 print adding no
         * 3.print appending order linkedlist
         * 4.inserting value btw preNote and nextNode
         * 5.press 5 then delete 1st element
         */

        System.out.println("Welcome to DataStructure Program\n\n"
                + "Choose your option:\n"
                + "1. Create a simple LinkedList\n"  //uc1
                + "2. Create Linked List by adding 30 and 56 to 70\n" //uc2
                + "3. Create Linked List by apending 30 and 70 to 56\n" //uc3
                + "4. Insert 30 between 56 & 70\n" //uc4
                + "5. Ability to delete the first element\n");//uc5



        int option = sc.nextInt();
        System.out.println();

        /*
         * using switch case,they check the condition if they got condition is true then the stop searching
         * and break it.
         */
        switch (option) {

            /*
            for uc 1
             */
            case 1:

                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);

                linkedList.print();
                break;
            /*
            for uc 2
             */

            case 2:
                linkedList.push(70);
                linkedList.push(30);
                linkedList.push(56);

                linkedList.print();
                break;

                /*
                for uc 3
                 */
            case 3:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);

                linkedList.print();
                break;

                /*
                for uc 4
                 */
            case 4:

                LinkedList.Node prevNode = linkedList.insert(56);
                linkedList.insert(70);

                linkedList.insertAfter(prevNode,  30);
                break;

                /*
                 for uc 5
                 */
            case 5:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                int pop = linkedList.pop();
                System.out.println(pop);
                linkedList.print();

                break;

        }
    }
}
