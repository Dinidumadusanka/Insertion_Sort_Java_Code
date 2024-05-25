import java.util.Scanner;
public class InsertionSort {
	  void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;

	         
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }

	  
	    static void printArray(int arr[])
	    {
	    	System.out.println("..................................................................");
	    	System.out.println("After Insertionsort");
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	        	
	           System.out.print(arr[i] + " ");
	        
	       
	        System.out.println();
	    }

	   
	    public static void main(String args[])
	    {
	    	int m;  
	    	Scanner sc=new Scanner(System.in);  
	    
	    	System.out.print("Enter the number of elements you want to store: ");  
	    	  
	    	m=sc.nextInt();  
	    	System.out.println("..................................................................");
	    	int[] arr = new int[m];  
	    	System.out.println("Enter the elements of the array: ");  
	    	for(int i=0; i<m; i++)  
	    	{  
	    	  
	    	arr[i]=sc.nextInt();  
	    	}  
	    	System.out.println("..................................................................");
	    	System.out.println("Array elements are: ");  
	    	
	    	for (int i=0; i<m; i++)   
	    	{  
	    	System.out.println(arr[i]);  
	    	}  

	        InsertionSort ob = new InsertionSort();
	        ob.sort(arr);

	        printArray(arr);
	    }
}
