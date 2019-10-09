package com.company;

//Interface code starts here, interface will contain only the definition but not declaration of a variable.
interface prioritizerInterface<T> {

    default public void insert(T element){
            boolean isInInsertion=true; // setting the isInInsertion to true every time whenever we want to insert an element
    } //for addition of elements into the Stack

    public void changePhase(); //for changing the phase of the stack operation

    default public void removeNextInOrder(){
        changePhase(); //Calling the function ChangePhase to change the phase form InsertPhase
    }  //for removal of elements form the Stack

    public void removeAny(); //for removal of elements form the Stack
    public void sizeOfStack(); //for displaying the size of the Stack
    public void isInInsertionPhase(); //for getting the phase of the Stack
    public void displayElements(); //for displaying the elements
}
