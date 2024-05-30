public class Prime{


	static Boolean isPrime(int a , int i){

		
		if(a<=2)
			return ((a==2)?true:false);

		if(a%i==0)
			return false;
		if(i*i>a)
			return true;

	
		return isPrime(a,i+1);



	}


	public static void main(String[] args){


		System.out.print(isPrime(37,2));

	}

}