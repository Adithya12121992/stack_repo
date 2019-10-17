package com.company;
import com.company.prioritizer1;
//import com.company.prioritizer1Array;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the size of the Prioritizer");
        Scanner scan = new Scanner(System.in);
        prioritizer1 newOBJ = new  prioritizer1(scan.nextInt());

       while (true){
            System.out.println("Operations:\n1.)Insert\t2.)Remove in Ascending order\t3.)RemoveAny\t4.)CheckPhase\t5.)Size of stack\t6.)Exit");
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
                    newOBJ.sizeOfStack();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong entry, please try again");
            }
        }
    }
}
