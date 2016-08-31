package sorting;

import java.util.Scanner;

public class bubbleSorting {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int[] arr = new int[100];
		int n; // no of elements
		boolean swapped = true;
		int noSwaps = 0, j = 0;
		
		n = cin.nextInt();
		
		for(int i = 0; i < n; i++) arr[i] = cin.nextInt();
		
		while(swapped) {
			swapped = false;
			j++;
			int tmp;
	        for(int i = 0; i < n - j; i++) { // n-j : as every new time if we entered the loop, the "new" last element will be in the correct position
	        	if(arr[i] > arr[i+1]) {
	        		tmp = arr[i];
	        		arr[i] = arr[i+1];
	        		arr[i+1] = tmp;
	        		noSwaps++;
	        		swapped = true;
	        	}
	        }
		}
	 
		//printing
		for(int i = 0;i < n; i++) System.out.print(arr[i] + "  ");
		System.out.print("\n");
		System.out.print("no of swaps = " + noSwaps);
		
	}

}
