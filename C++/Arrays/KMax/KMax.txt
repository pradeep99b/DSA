#include<iostream>
using namespace std;

int[] valuek(int arr[],int n, int k){

	int temp[n];
	for(int i=0;i<n;i++)
		temp[i]=arr[i];
	
	
	for(int i=0;i<n;i++){

		for(int j =i+1;j<n;j++){
		
			if(temp[i] > temp[j]){

				int a = temp[i];
				temp[i] = temp[j];
				temp[j] = a;

			}


		}
	}

	int sol[2] = {temp[k-1], temp[n-k+1]};

	return sol;


}

int main(){

	int arr[] = { 1,23,4,5,6,3,4,5};
	
	int n = sizeof(arr)/sizeof(arr[0]);
	
	int k ;

	cout<<"Enter a value"<<endl;
	cin>>k;


	int sol[2] = valuek(arr,n,k);

	cout<<sol[0]<<sol[1]<<endl;
}