#include<iostream>
using namespace std;

void move(int arr[], int n){
	
	int left =0;
	int right=n-1;

	while(left<right){



		if(arr[left]<0)
			left++;
		else if(arr[right]>=0)
			right--;
		else{

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;

		}

	}


}

int main(){

	int arr[] = { 0,2,-2,0};

	int n = sizeof(arr)/sizeof(arr[0]);

	for(int i=0;i<n;i++)
		cout<<arr[i]<<" ";
	cout<<endl;
		
	move(arr,n);
	for(int i=0;i<n;i++)
		cout<<arr[i]<<" ";
	cout<<endl;

	return 0;

}