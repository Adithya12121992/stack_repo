package com.company;
import com.company.prioritizer1;
import com.company.Prioritizer2;
import com.company.PrioritizerImpl3;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1.) Prioritizer1 (With Sorting only at remove in order )\n2.) Prioritizer2 (With Sorting at Insertion phase)\n3.) Prioritizer3 (Without Sorting)");
        Scanner scan2 = new Scanner(System.in);
        int pSelection = scan2.nextInt();



        System.out.println("Enter the size of the Prioritizer");
        Scanner scan = new Scanner(System.in);
        int newPsize = scan.nextInt();
        if( pSelection == 1) {
            prioritizer1 newOBJ = new prioritizer1(scan.nextInt());

            while (true) {
                System.out.println("Operations:\n1.)Insert\t2.)Remove in Ascending order\t3.)RemoveAny\t4.)CheckPhase\t5.)Size of Prioritizer\t6.)Exit");
                int selection = scan.nextInt();
                switch (selection) {
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
                        newOBJ.sizeOfPrioritizer();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Wrong entry, please try again");
                }
            }// End of while
        }//Prioritizer1
        else if (pSelection==2)
        {
            Prioritizer2 newOBJ = new Prioritizer2(newPsize);
            while (true) {
                System.out.println("\nOperations:\n1.)Insert\t2.)Remove in Ascending order\t3.)RemoveAny\t4.)CheckPhase\t5.)Size of Prioritizer\t6.)Exit");
                int selection = scan.nextInt();
                switch (selection) {
                    case 1:

                        //System.out.println("Enter an element to insert into the Prioritizer");
                        newOBJ.insert(newPsize);
                        newOBJ.displayElements();
                        break;
                    case 2:
                        newOBJ.removeNextInOrder();
                        break;
                    case 3:
                        newOBJ.removeAny();
                        break;
                    case 4:
                        newOBJ.isInInsertionPhase();
                        break;
                    case 5:
                        newOBJ.sizeOfPrioritizer();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Wrong entry, please try again");
                }
            }//End of while
        }//Prioritizer 2
        else if (pSelection==3)
        {
            PrioritizerImpl3 newOBJ = new PrioritizerImpl3(scan.nextInt());
            while (true) {
                System.out.println("\nOperations:\n1.)Insert\t2.)Remove in Ascending order\t3.)RemoveAny\t4.)CheckPhase\t5.)Size of Prioritizer\t6.)Exit");
                int selection = scan.nextInt();
                switch (selection) {
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
                        newOBJ.sizeOfPrioritizer();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Wrong entry, please try again");
                }
            }//End of while
        }//Prioritizer 3
    }//End of main function
}// End of main class
