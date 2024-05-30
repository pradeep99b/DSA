import java.util.ArrayList;
public class PermutationWithCase{



	static ArrayList<String> func(String input, String output, ArrayList<String> al){


		
			if(input.length()==0)
			{
				al.add(output);
				return al;
			}



			String remainingString = input.substring(1);	
			
			func(remainingString, output + Character.toUpperCase(input.charAt(0)),al);
			func(remainingString, output + Character.toLowerCase(input.charAt(0)),al);


			return al;



	}


	public static void main(String[] args){

		ArrayList<String> al = new ArrayList<>();
		func("abc","",al);
		System.out.print(al);

	}
}