package com.exercise10searches.app;

import java.util.Random;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// Constant declaration
		final int ELEMENTS_ARRAY = 20;
		
		// Variable declaration
		int userNumber = 0;
		int lowLimit = 0;
		int topLimit = ELEMENTS_ARRAY-1;
		int middle = 0;
		int indexFound=-1;
		int temp = 0;
		
		// Array declaration
		int[] myArray = new int[ELEMENTS_ARRAY];
		
		// Object construction
		Random randomNumber = new Random(System.nanoTime());
		Scanner scan = new Scanner(System.in);
		
		// Fill array with random numbers
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			myArray[i] =  randomNumber.nextInt(10);
			System.out.print(myArray[i] + " ");
		}
		
		// Input
		
		do {
			System.out.format("\nInput the value to find insdie the array ");
			userNumber = scan.nextInt();
			if(userNumber < 0) {
				System.out.println("An positive NUMBER my friend");
			}
		}while(userNumber < 0);
		
		// Process
		// Sort method 
		for(int i = 0; i < ELEMENTS_ARRAY-1; i++) {
			for(int j = 0; j < ELEMENTS_ARRAY-1; j++) {
				if(myArray[j] > myArray[j+1]) {
					temp = myArray[j+1];
					myArray[j+1] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		
		// Binary sort
		while(lowLimit <= topLimit) {
			middle = lowLimit + ((topLimit - lowLimit)/2);
			if(userNumber == myArray[middle]) {
				indexFound = middle;
				break;
			}
			else if(userNumber > myArray[middle]) {
				// Why '+1' to not compare again the same value
				lowLimit = middle + 1;
			}
			else if(userNumber < myArray[middle]) {
				topLimit = middle -1;
			}
			
		}
		
		// Output array
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			System.out.print(myArray[i] + " ");
		}
		if(indexFound !=-1) {
			System.out.format("\nElement found at index %d", indexFound);
		}
		else {
			System.out.format("\nElement NOT found ");
		}
		
		// Output
		
		// Termination
		scan.close();
	}

}
