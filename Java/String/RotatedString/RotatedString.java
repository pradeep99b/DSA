public class RotatedString{

	static boolean ifRotated(String s1, String s2){

	int a = s1.length();
	int b =s2.length();

	int i=0,j=0;

	while(j<a){

		if(s1.charAt(i)==s2.charAt(j))
			i++;
		
		else{

			i=0;
			if(s1.charAt(i)==s2.charAt(j))
				i++;			

		}


		j++;

	}

	if(i==0)
		return false;

	j=0;

	while(i<a){

		if(s1.charAt(i)==s2.charAt(j)){
			i++;
			j++;		
		}
		else
			return false;


	}


	return true;



}

public static void main(String[] args){


	String s1= "geeksforgeeks";
	String s2="forgeeksgeeks";

	System.out.print(ifRotated(s1,s2));

}

}