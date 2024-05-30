public class StringLength{



	static int strl(String str,int length){
		
	     try{
			str.charAt(length);
			return strl(str,length+1);
		}
		catch(Exception e){
		
			return length;
		}

		


		
		

	}
	
	public static void main(String[] args){



		String str = "Pradeep";
		System.out.print(strl(str,0));

	}
}