public class LargestElement{



	static int largest(int arr[],int i,int max){


		if(i== arr.length-1)
			return max<arr[i]?arr[i]:max;
		
		


	
		 max = largest(arr,i+1,max);

		return arr[i]<max?max:arr[i];

	}


	public static void main(String[] args){


		int arr[] = { 1,23,45,6,6,7};
		System.out.print(largest(arr,0,arr[0]));

	}

}
	