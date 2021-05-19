package lab2Assignments;

	// Java program to find smallest and second smallest elements
	 
	public class SecondSmallestNumber {
	    //Function to print first smallest and second smallest elements
	    static void getSecondSmallest(int A[])
	    {
	        int first, second;
	 
	        first = second = A[0];
	        for (int i = 0; i <A.length ; i ++)
	        {
	            /* If current element is smaller than first then update
	        	both first to current element and second to first element */ 
	            if (A[i] < first)
	            {
	                second = first;
	                first = A[i];
	            }
	 
	            /* If A[i] is in between first and second
	               then update second  */
	            else if (A[i]<second) {
	                second = A[i];
	            }
	        }
	            System.out.println("The second Smallest Element is:" + second);
	    }
	 
	    //main method to store the array and call the get second smallest method
	    public static void main (String[] args)
	    {
	        int A[] = {12, 13, 2, 10, 34, 1};
	        getSecondSmallest(A);
	    }
	}

