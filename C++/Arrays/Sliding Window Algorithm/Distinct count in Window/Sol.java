import java.util.*;

class Solution {

    public static ArrayList<Integer> countDistinct(int A[], int n, int k) {

        ArrayList<Integer> result = new ArrayList<>();

        if(n == 0 || k > n)
            return result;

        HashMap<Integer, Integer> map = new HashMap<>();
        int distinctCount = 0;

        // Initialize the first window
        for(int i = 0; i < k; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            if(map.get(A[i]) == 1)
                distinctCount++;
        }

        result.add(distinctCount);

        // Slide the window
        for(int i = k; i < n; i++) {
            // Remove the outgoing element
            int outElement = A[i - k];
            if(map.get(outElement) == 1) {
                distinctCount--;
            }
            map.put(outElement, map.get(outElement) - 1);
            if(map.get(outElement) == 0) {
                map.remove(outElement);
            }

            // Add the new element
            int inElement = A[i];
            map.put(inElement, map.getOrDefault(inElement, 0) + 1);
            if(map.get(inElement) == 1) {
                distinctCount++;
            }

            result.add(distinctCount);
        }

        return result;
    }
}

public class Sol {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of test cases");
        int t = sc.nextInt();
        while(t > 0) {

	    System.out.println("Enter the size of array");
            int n = sc.nextInt();
	    System.out.println("Enter the size of window");
            int k = sc.nextInt();
            int a[] = new int[n];
	    System.out.println("Enter the elements of array");
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            Solution solution = new Solution();
            ArrayList<Integer> ans = solution.countDistinct(a, n, k);

            for(Integer val : ans) 
                System.out.print(val + " ");
            System.out.println();

            t--;
        }

        sc.close();

    }

}
