package com.exercise10searches.app;

import java.util.Random;
import java.util.Scanner;
public class SequentialSearchNotGreedy {
	/*
	 * Also call linear search or sequential search is a method for 
	 * finding an element within a list. It sequentially checks each 
	 * element of the list until a match is found or the whole list 
	 * has been searched
	 */
	
	public static void main(String[] args) {
		// Constant declaration
		final int ELEMENTS_ARRAY = 20;
		
		// Variables declaration
		int numberToFind = 0;
		// Array declaration
		int[] myArray = new int[ELEMENTS_ARRAY];
		int indexFound = -1; 	// '-1' because 0 is a index of an array
		boolean isFound = false;
		
		// Object construction
		Scanner scan = new Scanner(System.in);
		Random randomNumbers = new Random(System.nanoTime());
		
		// Fill vector with random numbers and show 
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			myArray[i] = randomNumbers.nextInt(101);
			System.out.print(myArray[i] + " ");
		}
		
		do {
			System.out.format("\n Input the value to find insdie the array ");
			numberToFind = scan.nextInt();
			if(numberToFind < 0) {
				System.out.println("Number must be greater that or equal to ZERO!!");
			}
		}while(numberToFind < 0);
		
		for(int i = 0; i< ELEMENTS_ARRAY; i++){
			if(numberToFind ==  myArray[i]) {
				indexFound = i;
				break;
			}
		}
		
		if(indexFound != -1) {
			System.out.format("Element %d found in index %d", numberToFind, indexFound);
		}
		else {
			System.out.println("Element NOT found");
		}
		
		int index = 0;
		while(!isFound && index < ELEMENTS_ARRAY) {
			if(numberToFind == myArray[index]) {
				indexFound = index;
				isFound = true;
			}
			index++;
		}
		if(indexFound != -1) {
			System.out.format("\nElement %d found in index %d", numberToFind, indexFound);
		}
		else {
			System.out.println("Element NOT found");
		}
		
		scan.close();
	}
}
