#include<iostream>
using namespace std;

string trim(string s){


	int count = 0;
	for(int i =0; i< s.length(); i++){


		if(s[i]== ' '){
			s[count]=s[i+1];
			i++;
		}

		else
			s[count]=s[i];


		count++;

		

	}

	s[count] = '\0';

	return s;



}

int main(){


	string s = "Hello World";

	cout<<trim(s);

	return 0;

}
