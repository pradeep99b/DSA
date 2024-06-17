#include<stdio.h>
int main(){

	int arr[] = {-8, 2, 3, -6, 10};
	int k = 2;
	
	int neg = 0;

	for(int i=0; i<6-k; i++)
	{
		int m =0;
		int flag =0;
		while(m<k){
		
			if(arr[i+m]<0)
			{
				printf("%d ",arr[i+m]);
				flag=1;
				break;
			}
			m++;

		}
		if(!flag)
			printf("%d ",0);
		
	}
	return 0;
}