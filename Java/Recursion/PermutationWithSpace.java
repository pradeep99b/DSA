public class PermutationWithSpace{

	
	static void func(String input, String output){


		if(input.equals("")){
			System.out.println(output);
			return ; 
		}

		String remainingInput = input.substring(1);		
	
		func(remainingInput, output + "_" + input.charAt(0));
		func(remainingInput, output + input.charAt(0));
	


	}

	public static void main(String[] args){


		System.out.println("abc");
		func("bc","a");

	}

}