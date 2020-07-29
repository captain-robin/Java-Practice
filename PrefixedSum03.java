// Java program to find equilibrium 
// index of an array 

class PrefixedSum03 { 
	int equilibrium(int arr[], int n) 
	{ 
		int sum = 0; // initialize sum of whole array 
		int leftsum = 0; // initialize leftsum 

		/* Find sum of the whole array */
		for (int i = 0; i < n; ++i) 
			sum += arr[i]; 

		for (int i = 0; i < n; ++i) { 
			sum -= arr[i]; // sum is now right sum for index i 

			if (leftsum == sum) 
				return i; 

			leftsum += arr[i]; 
		} 

		/* If no equilibrium index found, then return 0 */
		return -1; 
	} 

// Driver code 
	public static void main(String[] args) 
	{ 
		PrefixedSum03 equi = new PrefixedSum03(); 
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
		int arr_size = arr.length; 
		System.out.println("First PrefixedSum index is " + 
						equi.equilibrium(arr, arr_size)); 
	} 
} 

