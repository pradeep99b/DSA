#include<iostream>
#include<cstring>
using namespace std;

void revstr(char *str1) {

	int i, len, temp;
	len = strlen(str1);


	for(int i=0; i<len/2 ; i++){

		temp = str1[i];
		str1[i] = str1[len-i-1];
		str1[len-i-1] = temp;

	}

}

int main(){


	char str[50] = "HelloWorld";
	int arr[5] = {12,3,4,5,6};
	cout<<"The reverse of string " <<str<<" is ";

	revstr(str);

	cout<<str<<endl;
	cout<<arr<<endl;
	
	return 0;

}