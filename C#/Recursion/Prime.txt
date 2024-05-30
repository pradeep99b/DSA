using System;
namespace Prime{

	class Prime{

		static void Main(string[] args){
			
			int number = 37;
			bool result = isPrime(number,2);
			Console.WriteLine(result);

		}

		static bool isPrime(int n, int i){

			if(n<=2)
				return n==2?true:false;

			if(n%i==0)
				return false;


			if(i*i>n)
				return true;

			return isPrime(n,i+1);	

		}
	}
}