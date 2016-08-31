package sorting;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int[] arr = new int[100];
		int n, j;

		//input
		n = cin.nextInt();
		for(int i = 0; i < n; i++) arr[i] = cin.nextInt();
		
		for(int i = 1; i < n; i++) {
			j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int tmp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = tmp;
				j--;
			}
		}
		
		//printing
		for(int i = 0;i < n; i++) System.out.print(arr[i] + "  ");
	}

}
