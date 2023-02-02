package Array_Integer_Questions;

import java.util.Arrays;

public class Shuffleelements {

    // using Sweping


    static void shuffleArray(int a[], int n)
    {
        // Rotate the element to the left
        for (int i = 0, q = 1, k = n; i < n; i++, k++, q++)
            for (int j = k; j > i + q; j--) {
                // swap a[j-1], a[j]
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }
    }

    // public static void Shuffle(int[] array, int n){

    //     for(int i =0, x = 1, k = n; i < n; i ++, k++, x++){
    //         for(int j = k;  j > i+x; j--){
    //             int temp = array[j-1];   //1, 2,3,5,4,6,7,8 //1,2,5,3,4,6,7,8 
    //             array[j-1] = array[j];
    //             array[j] = temp;
    //         } 
    //     }
    // }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
 
        shuffleArray(a, a.length / 2);
 
        System.out.println(Arrays.toString(a));
    }
}
