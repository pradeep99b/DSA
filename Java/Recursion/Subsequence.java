public class Subsequence{


	static void sub(String str, String res){

		System.out.println(res);
		int n = str.length();
		
		if(n > 0)
			for(int i=0;i<n;i++)
				sub(str.substring(i+1,n), res + str.charAt(i));

		

		
		
	}

	public static void main(String[] args){


		sub("abc","");
	}
}