#include<iostream>
using namespace std;

int findLength(char *p){

	int length=0;

	while(*p != '\0'){
		length++;
		p++;
	}



	return length;


}



int main(){

	char s[] = "pradeep";
	int length = findLength(s);
	
	cout<<"The length of the string is "<<length<<endl;
	
	return 0;
}

	