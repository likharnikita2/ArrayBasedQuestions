package Array_Integer_Questions;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int array[] = new int[length];

        for(int i =0; i < length; i++){
            array[i] = sc.nextInt();
        }
        reverseOfArray(array, length);
        sc.close();
    }
    public static void reverseOfArray(int array[], int length){
        for(int i =length-1; i >= 0; i--){
            System.out.print(array[i]+" ");
            // System.out.print("'"+ array[i]+"'"+ " ");
        }
    }
}
