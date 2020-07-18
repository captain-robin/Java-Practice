
    class abc
{  int maxDiff(int arr[], int arr_size)
    { 
        int max_diff = arr[1] - arr[0];  
        for (int i = 0; i < arr_size; i++) { 
            for (int j = i + 1; j < arr_size; j++){ 
                if (arr[j] - arr[i] > max_diff) 
                    max_diff = arr[j] - arr[i]; 
            } 
        } 
        return max_diff; 
    } 
    public static void main(String[] args)  
    { 
        abc maxdif = new abc(); 
        int arr[] = { 2, 3, 11, 6, 4, 8, 1}; 
        System.out.println("Maximum differnce is " +  
                                maxdif.maxDiff(arr, 7)); 
    } 
} 
    
