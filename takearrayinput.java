package Array_Integer_Questions;

import java.util.Scanner;

public class takearrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int array[] = new int[length];

        for(int i =0; i < length; i++){
            array[i] = sc.nextInt();
        }
        printArray(array, length);
        sc.close();
    }

    public static void printArray(int array[], int length){
        for(int i =0; i < length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
