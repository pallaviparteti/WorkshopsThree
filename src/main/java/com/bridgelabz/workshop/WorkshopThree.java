package com.bridgelabz.workshop;

//import java.util.ArrayList;
//import java.util.stream.Collectors;
java.util.ArrayList;

public class WorkshopThree {
	public static void main(String args[]){
		int size = 500;
		int array[] = new int[size];
		for (int i = 1; i <= array.length; i++ ) {
			if(i % 2 == 0) {
				System.out.println(i + " number is prime");
			}
			else {
				System.out.println(i + "number is not prime");

        try {
			for(int i = 1; i <=array.length; i++) {
				System.out.println(array[i]);
			}
		}
		catch(Exception e) {
			System.out.println("ArrayIndexOutOfboundException");

		}
		System.out.println("exception handeled");
		*/

	}
}
/*	ArrayList<Integer> list = new ArrayList<Integer>(500);
		
		ArrayList<Integer> = list.stream()
				.map(i -> i%2 == 0)
				.collect(Collectors.toList());
	}
	*/

