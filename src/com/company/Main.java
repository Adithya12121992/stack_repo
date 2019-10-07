package com.company;
import com.company.prioritizer1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        prioritizer1 newOBJ = new  prioritizer1();
        newOBJ.sizeOfStack = 10;
        newOBJ.isInInsertionPhase();
        newOBJ.insert(9);
        newOBJ.insert(8);
        newOBJ.insert(10);
        newOBJ.insert(9);
        newOBJ.insert(8);
        newOBJ.insert(10);
        newOBJ.insert(9);
        newOBJ.insert(8);
        newOBJ.insert(10);
        newOBJ.insert(9);
        newOBJ.insert(8);
        newOBJ.insert(10);
        newOBJ.displayElements();
        newOBJ.changePhase();
        newOBJ.sizeOfStack();
        newOBJ.removeNextInOrder();
        newOBJ.displayElements();
        //newOBJ.changePhase();
        newOBJ.sizeOfStack();
        newOBJ.removeNextInOrder();
        newOBJ.displayElements();
        //newOBJ.changePhase();
        newOBJ.sizeOfStack();
        newOBJ.removeNextInOrder();
        newOBJ.displayElements();
        //newOBJ.sizeOfStack();
        //newOBJ.changePhase();
        //newOBJ.insert(10);
        //newOBJ.changePhase();
        //newOBJ.insert(10);
        //newOBJ.sizeOfStack();
        //newOBJ.diaplayElements();
        //newOBJ.changePhase();
        //newOBJ.removeNextInOrder();
        //newOBJ.diaplayElements();
        //newOBJ.removeNextInOrder();
        //newOBJ.diaplayElements();
        //newOBJ.removeNextInOrder();
        //newOBJ.diaplayElements();
    }
}
