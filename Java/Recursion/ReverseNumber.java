public class ReverseNumber{


	static int reverse(int n, int rev){

		if(n<10)
			return 10*rev + n;

		rev = 10*rev + n%10;
		
		return  reverse(n/10,rev);
		
		

	}


	public static void main(String[] args){

	
		int n = 234;
		System.out.print(reverse(n,0));
	}

}