package com.company;

//Interface code starts here, interface will contain only the definition but not declaration of a variable.
interface prioritizerInterface<T> {

    default public void insert(T element){
            boolean isInInsertion=true; // setting the isInInsertion to true every time whenever we want to insert an element
            System.out.println("Changed to the Insertion Phase");
    } //for addition of elements into the Stack

    public void changePhase(); //for changing the phase of the stack operation

    int compareTo(Object o);

    default public void removeNextInOrder(){
        changePhase(); //Calling the function ChangePhase to change the phase form InsertPhase
    }  //for removal of elements form the Stack

    default public void removeAny(){
        changePhase(); //Calling the function ChangePhase to change the phase form InsertPhase
    } //for removal of elements form the Stack
    public void sizeOfPrioritizer(); //for displaying the size of the Stack
    public void isInInsertionPhase(); //for getting the phase of the Stack
    public void displayElements(); //for displaying the elements
}
