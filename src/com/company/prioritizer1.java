package com.company;

import java.util.*;
import java.util.Random;
public class prioritizer1<T> implements prioritizerInterface<T>,Comparator<T>
{
    public boolean isInInsertion = true;
    private int topOfStack = 0;
    public int sizeOfStack;

    // Queue declaration
    Queue<T> arrayElementList = new LinkedList<T>();

    //Constructor for prioritizer1
    public prioritizer1(int nextInt) {
        sizeOfStack = nextInt;
    }
    // code to insert an element into an array
    @Override
    public void insert(T elementValue) {
        // get the length of an array first and later compare for the topOfStack
        int lengthOfArray = arrayElementList.size();

        // Checking for the overflow condition
        if (lengthOfArray >= sizeOfStack) {
            System.out.println("Prioritizer overflown ! Cannot Add more elements to this Prioritizer");
        }
        else
        {
            topOfStack = lengthOfArray;
            arrayElementList.add(elementValue);
            //System.out.println("The top of the stack is :"+topOfStack);
        }
    }

    // code to Change the phase of a stack
    @Override
    public void changePhase()
    {
        System.out.println(isInInsertion);
        isInInsertion = !isInInsertion;
        if (isInInsertion) {
            System.out.println("Phase changed to Insert Phase");
        }
        else{
            //System.out.println(sort_elements(arrayElementList));
            System.out.println("Phase changed to Delete Phase "+arrayElementList);
        }
    }

    public void compare(Queue<T> arrayElementList){
        T[] arrayElementListArray = (T[]) new Object[sizeOfStack];
        int size_of_queue = arrayElementList.size();
        //System.out.println(size_of_queue);
        int i=0,j=size_of_queue;
        for (T item:arrayElementList){
            if (i < j)
            {
                arrayElementListArray[i] = item;
                i++;
            }
        }
        try {
            ArraySort(arrayElementListArray);
        }
        catch (Exception e){
            //System.out.println(e);
        }
        T element_name = arrayElementListArray[0];
        arrayElementList.remove(element_name);
    }

    public void ArraySort(T arrayelements[])
    {
        for (int i = 0; i <= topOfStack; i++)
        {
            for (int j = i + 1; j <= topOfStack; j++)
            {
                if (compare(arrayelements[i], arrayelements[j])>0)
                {
                    T tempVariable = arrayelements[i];
                    arrayelements[i] = arrayelements[j];
                    arrayelements[j] = tempVariable;
                }
            }
        }
    }

    @Override
    public int compare(T t, T t1) {
        String return_type = t.getClass().getName();
        if(return_type == "java.lang.Double" || return_type == "java.lang.Integer")
        {
            double intDouble1 = (double)t;
            double intDouble2 = (double)t1;
            if(intDouble1>intDouble2)
                return 1;
            else if(intDouble1==intDouble2)
                return 0;
            else
                return -1;
        }
        else if(return_type == "java.lang.String")
        {
            String String1 = (String)t;
            String String2 = (String)t1;
            return String1.compareTo(String2);
        }
        else
            return 0;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public void removeNextInOrder()
    {
        try {
            if (arrayElementList.peek() == null)
                System.out.println("Prioritizer has no elements to be removed");
            else {

                compare(arrayElementList);
                topOfStack = topOfStack - 1;
            }
        }
        catch (Exception e){
            System.out.println("Could not delete the element"+ e.getLocalizedMessage() );
        }
    }

    public void removeElement( int randInt){
        T[] arrayElementListArray1 = (T[]) new Object[sizeOfStack];
        int size_of_queue = arrayElementList.size();
        int i=0,j=size_of_queue;
        for (T item:arrayElementList){
            if (i < j)
            {
                arrayElementListArray1[i] = item;
                i++;
            }
        }
        T element_name = arrayElementListArray1[randInt];
        System.out.println(element_name);
        arrayElementList.remove(element_name);
    }
    // code to remove any element from an array
    public void removeAny()
    {
        try {
            Random randINt = new Random();
            if (arrayElementList.peek() != null) {
                int randInt = randINt.nextInt(((arrayElementList.size()-1)- 0) + 1);
                System.out.println(randInt);
                removeElement(randInt);
            } else
                System.out.println("Prioritizer has no elements to be removed");
        }
        catch (Exception e){
            System.out.println("Cannot delete the element");
        }
    }

    // code to get the size of the stack/arrayList
    @Override
    public void sizeOfPrioritizer()
    {
        System.out.println(arrayElementList.size());
    }

    // code to check if the stack is in insertion phase?
    @Override
    public void isInInsertionPhase()
    {
        if (isInInsertion)
        {
            System.out.println("The Prioritizer is in the Insertion Phase");
        }
        else
        {
            System.out.println("The Prioritizer is in the Removal Phase");
        }
    }


    @Override
    public void displayElements()
    {
        String individualElement="";
        individualElement+= arrayElementList+" ";
        System.out.println(individualElement);
    }
}


