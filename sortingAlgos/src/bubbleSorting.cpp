/*
#include <bits/stdc++.h>
using namespace std;

int main() {
	int arr[1000], j = 0;
	bool swapped = true;

	int noSwaps; // no of swaps done

	int n; //no of elements
	cin >> n;

	//input
	for(int i = 0; i < n; i++) cin >> arr[i];

	while(swapped) {
		j++;
		swapped = false;
		int tmp;
		for(int i = 0; i < n - j; i++) {
			if(arr[i] > arr[i+1]) {
				tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
				swapped = true;
				noSwaps++;
			}
		}
	}

	//printing
	for(int i = 0; i < n; i++)
		cout << arr[i] << " ";

    cout << "\n";
	cout << "no of swaps = " << noSwaps;

	return 0;
}
*/
