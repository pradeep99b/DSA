#include<iostream>
#include<string>
using namespace std;

bool ifrotated(string s1, string s2){

	int a = s1.length();
	int b =s2.length();

	int i=0,j=0;

	while(j<a){

		if(s1[i]==s2[j])
			i++;
		
		else{

			i=0;
			if(s1[i]==s2[j])
				i++;			

		}


		j++;

	}

	if(i==0)
		return false;

	j=0;

	while(i<a){

		if(s1[i]==s2[j]){
			i++;
			j++;		
		}
		else
			return false;


	}


	return true;



}

int main(){


	string s1 = "geeksforgeeks";
	string s2 = "forgeeksgeeks";

	cout<<ifrotated(s1,s2);

}