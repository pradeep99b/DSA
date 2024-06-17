#include<iostream>
using namespace std;


string capitalize(string s){
	

	int n = s.length();

	for( int i=0;i<n; i++){

		if(i==0 || i==(n-1)){
		
			if(s[i] >= 97)
				s[i] = s[i] - 32;
		
		}

		else{
			if(s[i] >= 65 && s[i] <= 91 )
				s[i] += 32;
			
		}



	}

	return s;

}

int main(){

	string s;
	cout<<"Enter a String"<<endl;
	getline(cin,s);
	cout<<capitalize(s);
	
	return 0;

}