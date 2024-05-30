#include<iostream>
using namespace std;

int main(){


	string s = "PradeEp";

	for(int i=0;i<s.length(); i++){


		if(s[i] >= 97)
			s[i] -= 32;
		else
			s[i] +=32;

	}

	cout<<s<<endl;
	return 1;

}