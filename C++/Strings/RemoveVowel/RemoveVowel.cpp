#include<iostream>
using namespace std;

int main(){


	string s = "HelloWorld";
	string temp = "";

	for(int i =0;i<s.length(); i++)
	{

		if(s[i]=='a' || s[i]=='e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i]=='A' || s[i]=='E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U' ){
		}
		else
		temp += s[i];

	}

	s = temp;
	cout<<s<<endl;

	return 0;

}
