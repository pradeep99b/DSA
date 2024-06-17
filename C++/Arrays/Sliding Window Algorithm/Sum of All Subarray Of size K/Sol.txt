#include<stdio.h>
int main(){
	
	int arr[] = {1,2,3,4,5,6};
	int k =3;

	int sum =0;
	for(int i=0;i <k;i++)
		sum+=arr[i];

	for(int i =k;i<=6;i++)
	{
		printf("The current sum of %d elements is %d \n",k,sum);
		sum -= arr[i-k];
		sum += arr[i];
	
	}

	return 0;

}