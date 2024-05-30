public class SmallestElement{



	static int smallest(int arr[],int i,int min){


		if(i== arr.length-1){
		
			return min>arr[i]?arr[i]:min;
		
		}


	
		 min = smallest(arr,i+1,min);

		return arr[i]>min?min:arr[i];

	}


	public static void main(String[] args){


		int arr[] = { 1,23,45,6,6,7};
		System.out.print(smallest(arr,0,arr[0]));

	}

}
	