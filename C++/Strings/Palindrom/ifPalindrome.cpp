#include<iostream>
#include<string>
using namespace std;


int main() {


	string s;
	cout<<"Enter a string"<<endl;
	getline(cin,s);
	int j  = s.length() -1 ;
	int i=0;

	bool flag  = true;

	while(i< (j+1)/2 ){

		if(s[i]!=s[j])
		{
			flag = false;
			break;
		}
		else{

			i++;
			j--;
		}

	}


	cout<<flag<<endl;

	return 0;

}

		