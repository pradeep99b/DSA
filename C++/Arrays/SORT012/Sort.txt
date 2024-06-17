#include<iostream>
using namespace std;

int main(){

	int arr[] = {1,2,1,2,1,1,1,0,0,0,0};

	int one=0;
	int two=0;
	int zero=0;

	
	int n = sizeof(arr)/sizeof(arr[0]);

	for(int i =0;i<n; i++){


		if(arr[i]==0)
			zero++;
		else if(arr[i]==1)
			one++;
		else
			two++;
	}

	for(int i=0;i<n;i++)
	{
		if(i<zero)
			arr[i]=0;
		else if(i<zero+one)
			arr[i]=1;
		else
			arr[i]=2;		
	}

	
	for(int i=0;i<n;i++)
		cout<<arr[i];


	

}
