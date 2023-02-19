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
         * we press 1 then they print inserting data
         */

        System.out.println("Welcome to DataStructure Program\n\n"
                + "Choose your option:\n"
                + "1. Create a simple LinkedList\n" );


        int option = sc.nextInt();
        System.out.println();

        /*
         * using switch case,they check the condition if they got condition is true then the stop searching
         * and break it.
         */
        switch (option) {

            case 1:

                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);

                linkedList.print();
                break;
        }
    }
}
