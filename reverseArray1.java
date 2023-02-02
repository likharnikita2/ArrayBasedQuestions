package Array_Integer_Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseArray1 {

    // Using arrayList
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Integer  array[] = new Integer [length];

        for(int i =0; i < length; i++){
            array[i] = sc.nextInt();
        }
        reverseOfArray(array);
        sc.close();
    }
    public static void reverseOfArray(Integer [] array){

        Collections.reverse(Arrays.asList(array)); 
        System.out.println("Reversed Array:" + Arrays.asList(array)); 
    }
}
