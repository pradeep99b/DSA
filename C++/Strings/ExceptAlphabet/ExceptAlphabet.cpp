#include<iostream>
#include<string>

using namespace std;

string extracted(string s){
	

	for(int i=0 ;i<s.length(); i++){

		if( (s[i] >= 'a' && s[i] <= 'z') || (s[i] >='A' && s[i] <= 'Z')	){
		}
		else{
			s.erase(i,1);
			i--;
		}
	}


	return s;
}


int main(){


	string s = "wkjk38239283kjehfl;lasv";
	
	cout<<extracted(s)<<endl;

	return 0;
}