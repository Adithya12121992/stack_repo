package com.company;
import com.company.prioritizer1;

import java.util.Scanner;
//import com.company.prioritizer1_array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        prioritizer1 newOBJ = new  prioritizer1();
        /*newOBJ.sizeOfStack = 10;
        newOBJ.isInInsertionPhase();
        newOBJ.insert(16);
        newOBJ.insert(10);
        newOBJ.insert(12);
        newOBJ.insert(1991);
        newOBJ.insert(110);
        newOBJ.insert(12222);
        newOBJ.insert(161);
        newOBJ.insert(102);
        newOBJ.insert(123);
        newOBJ.insert(116);
        newOBJ.insert(1330);
        newOBJ.insert(121);
        newOBJ.displayElements();
        newOBJ.removeNextInOrder();
        newOBJ.displayElements();
        newOBJ.removeAny();
        newOBJ.displayElements();
        newOBJ.removeAny();
        newOBJ.displayElements();
        newOBJ.removeAny();
        newOBJ.displayElements();*/
        System.out.println("Enter the size of the Prioritizer");
        Scanner scan = new Scanner(System.in);
        newOBJ.sizeOfStack = scan.nextInt();
        while (true){
            System.out.println("Operations:\n1.)Insert\t2.)Remove in Ascending order\t3.)RemoveAny\t4.)CheckPhase\t5.)Exit");
            int selection = scan.nextInt();
            switch (selection){
                case 1:
                    System.out.println("Enter an element to insert into the Prioritizer");
                    newOBJ.insert(scan.next());
                    newOBJ.displayElements();
                    break;
                case 2:
                    newOBJ.removeNextInOrder();
                    newOBJ.displayElements();
                    break;
                case 3:
                    newOBJ.removeAny();
                    newOBJ.displayElements();
                    break;
                case 4:
                    newOBJ.isInInsertionPhase();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
