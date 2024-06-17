#include<iostream>
#include<string.h>
using namespace std;

string trim(string s){

	for(int i =0; i<s.length(); i++){

		if(s[i] == ' '){

			s.erase(i,1);
			i--;

		}
	}

	return s;
}

int main(){

	string s = "Datte Bayo ";
	cout<<trim(s)<<endl;

	return 0;

}