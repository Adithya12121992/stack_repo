package com.company;

import java.util.ArrayList;//list is implemented using Arraylist
import java.util.Random;//used for removeany() function.used in random key index for obtaining random index

public class PrioritizerImpl3<T> implements prioritizerInterface<T> {//
	int sizeLimit;//limits the size of list at the beginning

	public PrioritizerImpl3(int sizeLimit) {//parameterized Constructor 
		super();
		this.sizeLimit = sizeLimit;
		// TODO Auto-generated constructor stub
	}

	boolean currentPhase = true;// true represents insertion
	public ArrayList<T> prioritizerList = new ArrayList<T>();//using Arraylist class 

	@Override
	public void changePhase() {//toggles between insertion and deletion phases
		currentPhase = !currentPhase;

	}

	@Override
	public void sizeOfPrioritizer() {
		System.out.println(prioritizerList.size());//Displays current size of list

	}

	@Override
	public void isInInsertionPhase() {
		if (currentPhase) {//checking list phase
			System.out.println("List is in Insertion Phase");
		} else {
			System.out.println("List is not in Insertion Phase");
		}
	}

	@Override
	public void displayElements() {
		for (int i = 0; i < prioritizerList.size(); i++) {
			System.out.print("\n"+prioritizerList.get(i));
		} 
	}

	@Override
	public int compareTo(Object o) {//No invariants for prioritiser 3
		return 0;
	}

	@Override
	public void insert(T element) {

		if (prioritizerList.size() < sizeLimit)//checking of limit exceeding
			prioritizerList.add(element);
		else
			System.out.println("Limit exceeded");

	}

	@Override
	public void removeNextInOrder() {
		if (prioritizerList.size() < 1)//checking for elements in the list
			System.out.println("List Empty");
		else
			prioritizerList.remove(prioritizerList.size() - 1);//removes the last element in order

	}

	@Override
	public void removeAny() {
		if (prioritizerList.size() < 1)//checking for elements in the list
			System.out.println("List Empty");
		else {
			Random rand = new Random();//creates random object
			prioritizerList.remove(rand.nextInt(prioritizerList.size()));//gives a random index value for deletion by remove function
		}
	}
}
