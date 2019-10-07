package com.company;

//Interface code starts here, interface will contain only the definition but not declaration of a variable.
interface prioritizerInterface<T> {
    public void insert(T element);  //for addition of elements into the Stack
    public void changePhase(); //for chang?ing the phase of the stack operation
    public void removeNextInOrder();  //for removal of elements form the Stack
    public void removeAny(); //for removal of elements form the Stack
    public void sizeOfStack(); //for displaying the size of the Stack
    public void isInInsertionPhase(); //for getting the phase of the Stack
    public void displayElements(); //for displaying the elements
}
