package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class prioritizer1Array<T> implements prioritizerInterface<T>
{
    public boolean isInInsertion = true;
    private int topOfStack = 0;
    public int sizeOfStack;
    private T arrayElementList[];
    //public ArrayList<T> arrayElementList = new ArrayList<T>();
    //Queue<T> arrayElementList = new LinkedList<T>();


    public prioritizer1Array(int nextInt) {
        sizeOfStack = nextInt;
        arrayElementList = (T[]) new Object[sizeOfStack];
    }

    @Override
    public void insert(T elementValue) {
        // get the length of an array first and later compare for the topOfStack
        try {
            int lengthOfArray = arrayElementList.length;
            arrayElementList[topOfStack++] = elementValue;
        }
        catch(Exception e){
            System.out.println("Prioritizer overflown !! Cannot add more elements to the Prioritizer");
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

    /*private void compare(Queue<T> arrayElementList) {
        int array_length = this.arrayElementList.size();
        String return_type = this.arrayElementList.element().getClass().getName();

        if(return_type == "java.lang.Integer") {
            int size_of_queue = arrayElementList.size();
            int i=0,j=size_of_queue;
            //System.out.println(size_of_queue);
            int[] arrayElementArray = new int[size_of_queue];
            for ( T item : arrayElementList) {
                if (i < j)
                {
                    arrayElementArray[i] = (int) item;
                    i++;
                }
            }
            Arrays.sort(arrayElementArray);
            int element_to_remove = arrayElementArray[0];
            arrayElementList.remove(element_to_remove);

        }
        else if (return_type == "java.lang.Double") {
            //Call function for Double Sort
            int size_of_queue = arrayElementList.size();
            int i=0,j=size_of_queue;
            //System.out.println(size_of_queue);
            double[] arrayElementArray = new double[size_of_queue];
            for ( T item : arrayElementList) {
                if (i < j)
                {
                    arrayElementArray[i] = (double) item;
                    i++;
                }
            }
            Arrays.sort(arrayElementArray);
            double element_to_remove = arrayElementArray[0];
            arrayElementList.remove(element_to_remove);
        }
        else if(return_type == "java.lang.String") {
            //Call function for String Sort
            int size_of_queue = arrayElementList.size();
            int i=0,j=size_of_queue;
            //System.out.println(size_of_queue);
            String[] arrayElementArray = new String[size_of_queue];
            for ( T item : arrayElementList) {
                if (i < j)
                {
                    arrayElementArray[i] = (String) item;
                    i++;
                }
            }
            Arrays.sort(arrayElementArray);
            String element_to_remove = arrayElementArray[0];
            arrayElementList.remove(element_to_remove);
        }
    }*/

    public void removeNextInOrder()
    {
            //compare(arrayElementList);
            //compareTo((T) arrayElementList);
            //Arrays.sort(arrayElementList);
        for(int i=0;i<arrayElementList.length;i++)
            System.out.println(arrayElementList[i]);
        topOfStack = topOfStack - 1;
    }

    // code to remove any element from an array
    public void removeAny()
    {

    }

    // code to get the size of the stack/arrayList
    @Override
    public void sizeOfStack()
    {
        System.out.println(arrayElementList.length);
    }

    // code to check if the stack is in insertion phase?
    @Override
    public void isInInsertionPhase()
    {
        if (isInInsertion)
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
        individualElement+= arrayElementList+" ";
        System.out.println(individualElement);
    }

    /*@Override
    public int compareTo(T t) {
        System.out.println(t.);
    }*/
}


