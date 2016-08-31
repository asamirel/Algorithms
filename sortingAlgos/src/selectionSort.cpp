/*
#include<bits/stdc++.h>
using namespace std;

int main() {
	int n, arr[100], minI = 0;
	cin >> n;

	for(int i = 0;i < n; i++) cin >> arr[i];

	for(int i = 0;i < n - 1; i++) {
		minI = i;

		for(int j = i+1; j < n; j++) {
			if(arr[j] < arr[minI]) {
				minI = j;
			}
		}
		swap(arr[i], arr[minI]);
	}

	for(int i = 0;i < n; i++) cout << arr[i] << " ";


	return 0;
}
*/
