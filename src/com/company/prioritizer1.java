package com.company;
import com.company.prioritizerInterface;
import java.util.ArrayList;

public class prioritizer1<T> implements prioritizerInterface<T>
{

    private boolean isInInsertion = true;
    private int topOfStack = 0;
    public int sizeOfStack;
    public ArrayList<T> arrayElementList = new ArrayList<T>();



    // code to insert an element into an array
    @Override
    public void insert(T elementValue) {
        if(isInInsertion)
        {
            // get the length of an array first and later compare for the topOfStack
            int lengthOfArray = arrayElementList.size();
            if (lengthOfArray >= sizeOfStack) {
                System.out.println("Stack overflown ! Cannot Add more elements to this stack");
             }
            else
            {
                topOfStack = lengthOfArray;
                arrayElementList.add(elementValue);
                //System.out.println("The top of the stack is :"+topOfStack);
            }
        }else {
            System.out.println("Please change the stack to INSERTION mode ");
        }
    }

    // code to Change the phase of a stack
    @Override
    public void changePhase()
    {
        isInInsertion = !isInInsertion;
        if (isInInsertion) {
            System.out.println("Phase changed to Insert Phase");
        }
        else{
            System.out.println("Phase changed to Delete Phase");
        }

    }

    // code to remove a top element from an array
    public void removeNextInOrder()
    {
        if (isInInsertion) {
            System.out.println("Cannot delete in this phase");
        }
        else{
            if (topOfStack <0 )
                System.out.println("Stack Underflow");
            else {
                arrayElementList.remove(topOfStack);
                topOfStack = topOfStack - 1;
            }
        }
    }

    // code to remove any element from an array
    public void removeAny()
    {
        System.out.println("The Prioritizer is in the ");
    }

    // code to get the size of the stack/arrayList
    @Override
    public void sizeOfStack()
    {
        System.out.println(arrayElementList.size());
    }

    // code to check if the stack is in insertion phase?
    @Override
    public void isInInsertionPhase()
    {
        if (isInInsertion == true)
        {
            System.out.println("The stack is in the Insertion Phase");
        }
        else
        {
            System.out.println("The stack is in the Removal Phase");
        }
    }

    @Override
    public void displayElements()
    {
        String individualElement="";
        for ( int i=0;i<arrayElementList.size();i++)
        {
            individualElement+= arrayElementList.get(i)+" ";
        }
        System.out.println(individualElement);
    }

}
