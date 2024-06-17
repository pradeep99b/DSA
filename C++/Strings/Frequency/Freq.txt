#include<iostream>
using namespace std;


void freq(string s){

	int arr[127] = {0};
	int n = s.length();

	for(int i=0; i<n; i++)
		arr[s[i]]++;

	cout<<"The frequency of characters "<<endl;
	
	for(int i=0; i<127; i++)	
		if(arr[i] > 0 )
			cout<<(char)i<<" "<<arr[i]<<endl;
	


}

int main(){

	string s = "youknowwho";
	
	cout<<endl;
	freq(s);
	return 0;

}