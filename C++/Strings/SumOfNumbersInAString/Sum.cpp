#include<iostream>
using namespace std;

int sum(string s){


	int res = 0;
	int count = 0;

	for(int i =0; i < s.length(); i++){

		if(s[i]>='0' && s[i] <= '9')
			count =  count*10 + (s[i]-'0');	
		
		else{
			res += count;
			count= 0;
		}

	}
	res = res+count;

	return res;

}

int main(){


	string s ="Hello12WOrld23";
	
	cout<<sum(s);
	
	return 0;

}