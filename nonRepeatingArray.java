package Array_Integer_Questions;

public class nonRepeatingArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,5,6,7,78,19, 10, 1,2,3, 19, 18 };
        int n = arr.length;
 
        System.out.print(firstNonRepeating(arr, n));
    }

    public static int firstNonRepeating(int arr[], int n)
    {
        // Loop for checking each element
        for (int i = 0; i < n; i++) {
            int j;
            // Checking if ith element is present in array
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            // if ith element is not present in array
            // except at ith index then return element
            if (j == n)
                return arr[i];
        }
 
        return -1;
    }
}
