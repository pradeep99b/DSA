#include<iostream>
using namespace std;

void intersectionarray( int arr1[], int m, int arr2[], int n){

	int i=0,j=0;

	while(i<m && j<n){

		if(arr1[i]==arr2[j]){

			
			cout<<arr1[i]<<" ";
			i++;
			j++;
		}

		
		else if(arr1[i]<arr2[j]){
		
			i++;

		}
		
		else if(arr1[i]>arr2[j]){
		
			j++;

		}
		

	}

}

void unionarray(int arr1[], int m, int arr2[], int n){


	int i=0,j=0;
	
	while(i<m && j<n){

		if(arr1[i]==arr2[j]){
			cout<<arr1[i]<<" ";
			i++;
			j++;
		}

		else if(arr1[i] < arr2[j]){

			cout<<arr1[i]<<" ";
			i++;
		}
		else{
			cout<<arr2[j]<<" ";
			j++;
		}


	}
	
	while(i<m){
		cout<<arr1[i]<<" ";
		i++;
	}
	while(j<n){
		cout<<arr2[j]<<" ";
		j++;
	}
		
}

int main(){


	int arr1[] = {2,3,4,5,6,7,8};
	int arr2[]  ={-1,-2,-3,4,5,6};



	int m = sizeof(arr1)/sizeof(arr1[0]);
	int n = sizeof(arr2)/sizeof(arr2[0]);

	for(int i=0;i<m;i++)
		cout<<arr1[i]<<" ";
	cout<<endl;

	for(int i=0;i<n;i++)
		cout<<arr2[i]<<" ";
	cout<<endl;

	

	unionarray(arr1,m,arr2,n);
	cout<<endl;
	intersectionarray(arr1,m,arr2,n);

	

	return 0;



}