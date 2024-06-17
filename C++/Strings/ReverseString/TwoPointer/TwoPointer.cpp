#include<iostream>
using namespace std;


string reverse(string s){

	int i =0;
	int j= s.length()-1;

	char temp;
	while(i < (j+1/2)){
		
		temp = s[i];
		s[i] = s[j];
		s[j] = temp;

		i++;
		j--;
	}

	return s;

}

		
	


int main(){

	char s[] = "HelloWorld";
	cout<<reverse(s)<<endl;

	return 0;


}