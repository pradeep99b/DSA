#include<iostream>
using namespace std;

int larges(int arr[], int n){

	int sum=0;
	int res=0;

	for(int i=0;i<n;i++){

		if(sum+arr[i] > sum)
			sum += arr[i];
		else if(sum+arr[i] > 0){
			res = res<sum?sum:res;
			sum += arr[i];
		}
		else
			sum=0;

	}
	
	return res;

}

int main(){


	int arr[] = {2,4,-5,-6,2,34,-4,32};

	int sum=0;
	int n = sizeof(arr)/sizeof(arr[0]);

	cout<<larges(arr,n);
	return 0;
	
}
	
	