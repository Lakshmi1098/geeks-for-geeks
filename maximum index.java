import java.io.*;
import java.util.*;
import java.lang.*;
class FindMaximum 
{ 
	/* For a given array arr[], returns the maximum j-i such that 
	arr[j] > arr[i] */
	int maxIndexDiff(int arr[], int n) 
	{ 
		int maxDiff = -1; 
		int i, j; 

		for (i = 0; i < n; ++i) 
		{ 
			for (j = n - 1; j > i; --j) 
			{ 
				if (arr[j] > arr[i] && maxDiff < (j - i)) 
					maxDiff = j - i; 
			} 
		} 

		return maxDiff; 
	} 

	/* Driver program to test above functions */
	public static void main(String[] args) 
	{ 
	
		Scanner lp=new Scanner(System.in);
		int t=lp.nextInt();
		for(int k=0;k<t;k++)
		{
		    FindMaximum max = new FindMaximum();    
		    int n=lp.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=lp.nextInt();
		    }
	        if(n==1)
	        {
	            System.out.println(0);
	            break;
	        }
		int maxDiff = max.maxIndexDiff(arr, n); 
		System.out.println(maxDiff); 
		}
	} 
} 
