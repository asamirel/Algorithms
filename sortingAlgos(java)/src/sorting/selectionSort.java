package sorting;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n, minI;
		int[] arr = new int[100];
		
		n = cin.nextInt();
		for(int i = 0; i < n ; i++) arr[i] = cin.nextInt();
		
		for(int i = 0; i < n - 1; i++) {
			minI = i;
			
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minI]) {
					minI = j;
				}
			}
			
			int tmp = arr[i];
			arr[i] = arr[minI];
			arr[minI] = tmp;
		}
		//printing
		for(int i = 0; i < n ; i++) System.out.print(arr[i] + "  ");
	}

}
