public class LCM{

	static int gcd(int a, int b){

		if(a%b==0)
			return b;

		return gcd(b,a%b);


	}

		


	static int lcm(int a, int b){

		return ((a*b)/gcd(a,b));


	}

	public static void main(String[] args){

		
		System.out.print(lcm(4,13));
		
	}
}
