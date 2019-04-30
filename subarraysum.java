import java.io.*;
import java.lang.*;
import java.util.*;
class SubarraySum 
{ 
	/* Returns true if the there is a subarray of arr[] with sum equal to 
	'sum' otherwise returns false. Also, prints the result */
	int subArraySum(int arr[], int n, int sum) 
	{ 
		int curr_sum, i, j; 

		// Pick a starting point 
		for (i = 0; i < n; i++) 
		{ 
			curr_sum = arr[i]; 

			// try all subarrays starting with 'i' 
			for (j = i + 1; j <= n; j++) 
			{ 
				if (curr_sum == sum) 
				{ 
					int p = j ; 
					System.out.println(i+1+" "+p); 
							
					return 1; 
				} 
				if (curr_sum > sum || j == n) 
					break; 
				curr_sum = curr_sum + arr[j]; 
			} 
		} 

		System.out.println(-1); 
		return 0; 
	} 

	public static void main(String[] args) 
	{ 
	    Scanner lp=new Scanner(System.in).useDelimiter("[,\\s+]");
	
		int t=lp.nextInt();
		for(int k=0;k<t;k++)
		{
		    int n=lp.nextInt();
		    int sum=lp.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=lp.nextInt();
		    }
		SubarraySum arraysum = new SubarraySum(); 
		arraysum.subArraySum(arr, n, sum); 
		}
	} 
} 

// This code has been contributed by Mayank Jaiswal(mayank_24) 
