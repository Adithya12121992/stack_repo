package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prioritizer2<T> implements prioritizerInterface<T> {

	
	private T[] elements;
	private int top=0;
	private int number;
	private boolean isInInsertion;
	private T[] array;
	private int index;
	int p=0;
	@SuppressWarnings("unchecked")
	public Prioritizer2(int i) {
		// TODO Auto-generated constructor stub
	    elements= (T[]) new Object[i];
	    array = (T[]) new Object[i];
	}


	@SuppressWarnings("unchecked")
	public void insert(T element){
        //boolean isInInsertion=true; // setting the isInInsertion to true every time whenever we want to insert an element
        System.out.println("Changed to the Insertion Phase");
       // System.out.println("Enter the numbers of elements you want into array: ");
        //Scanner sc=new Scanner(System.in);
        //number=s.nextInt();
       // elements=element;
		int n = Integer.parseInt((String) element);
		//int n = (int) element;
        for (int i = 0; i < n; i++) {
        System.out.println("Enter " + i + "th Element");
        @SuppressWarnings("resource")
        Scanner number = new Scanner(System.in);
        Object e = (Object) number.nextInt();
        elements[top++] = (T) e;
        }
        Arrays.sort(elements);
      //  for (int i = 0; i < elements.length; i++) {
        //System.out.println(elements[i]);
        //}
        
      
       
	}
	
	public void changePhase() {
		// TODO Auto-generated method stub
		System.out.println("in removal phase");
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	public void removeNextInOrder(){
	    changePhase(); 
	    System.out.println("Before Removing element");
	    for (int i = 0; i <elements.length; i++)
	    {
	    System.out.print("\n"+elements[i]);
	  }
	    // Create another array of size one less
	    for (int i = 0; i <elements.length; i++) {
	    if (i == p) 
	    {
	    array = (T[]) new Object[elements.length - 1];
	    for (int j = 0; j < i; j++) {
	    array[j] = elements[j];
	    }
	    for (int k = i; k <elements.length - 1; k++) {
	    array[k] = elements[k + 1];
	    }
	    break;
	    }
	    }

	    System.out.println("\nAfter removing element " +p);
	    p++;

	    for (int i = 0; i <array.length; i++) {

	    System.out.println(array[i]);
	    }

	    }
	

	
	public void removeAny(){
		isInInsertion=false;
		changePhase(); 
	    
		Random random=new Random();
		int randomnumber=random.nextInt(((elements.length-1)-0)+1);
		System.out.println(randomnumber);
		
		/*int j =0;
                 
		for( int i=0; i<elements.length;i++) 
		{
			
			if(i==randomnumber)
			{
				continue;
			}
				else
			{
				array[j]=elements[i];
				j=j+1;
			}
		}
		*/
		
		
		T[] array = (T[]) new Object[elements.length - 1];
	    
	    for(int i=0;i<elements.length;i++)
	    {
	    	System.out.println("Elements before removing are: "+elements[i]);
	    }
	    
	    for (int i = 0, k = 0; i < elements.length; i++) { 
	    	  
            // if the index is 
            // the removal element index 
            if (i == index) { 
                continue; 
            } 
  
            // if the index is not 
            // the removal element index 
            array[k++] = elements[i]; 
        } 
  
	   //return array;
	    for(int i=0;i<array.length;i++)
	    {
	    	System.out.println("Elements after removing are: "+array[i]);
	    }
	 	
	    }

	
	public void sizeOfPrioritizer() {
		// TODO Auto-generated method stub
		System.out.println(top);
	}

	
	public void isInInsertionPhase() {
		// TODO Auto-generated method stub
		
        	
		System.out.println(isInInsertion);
		
		
	}

	
	public void displayElements() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<elements.length;i++)
		{
			System.out.println("The Inserted Elements are: "+elements[i]);
		}
	}
	
	
	
	
}
