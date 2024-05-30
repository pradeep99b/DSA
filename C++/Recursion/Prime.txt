#include<iostream>
using namespace std;

bool isPrime(int a , int i){


	if(a<=2)
		return a==2?true:false;

	if(a%2==0)
		return false;
	if(i*i>a)
		return true;

	return isPrime(a,i+1);
}

int main(){


	cout<<isPrime(37,2);
	return 0;
}