public class Permutation{


	static void findPer(String str, String res){
		
		int n = str.length();
		if(n==0)
			System.out.println(res);
		
		else

			for(int i=0; i<n; i++)
				findPer(str.substring(0,i)+str.substring(i+1,n), res+str.charAt(i));
		

	}


	public static void main(String[] args){

		String str = "abc";
		findPer(str,"");
	}
}