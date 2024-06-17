#include<iostream>
#include<cstring>


using namespace std;

int main(){



	string rev = "";
	string original = "HelloWorld";


	int n = original.length();
	int i = n-1;
	
	while(i>=0){

		rev += original[i];
		i--;
	}

	cout<<rev<<endl;

	return 0;
	

}