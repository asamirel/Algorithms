/*
#include<bits/stdc++.h>
using namespace std;

int main() {
	int n, arr[100], j;
	cin >> n;

	//input
    for(int i = 0; i < n; i++) cin >> arr[i];

    for(int i = 1; i < n; i++) {
    	j = i;
    	while(j > 0 && arr[j-1] > arr[j]) {
    		swap(arr[j-1], arr[j]);
    		j--;
    	}
    }

	for(int i = 0;i < n; i++) cout << arr[i] << " ";

	return 0;
}
*/
