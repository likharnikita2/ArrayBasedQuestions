package Array_Integer_Questions;

import java.util.Scanner;

class takeInputPrint{

    // 1. public: Access modifier. Public means that this Method will be accessible by any Class.

    // 2. static: It is a keyword in java which identifies it is class-based. main() is made static in 
    //         Java  so that it can be accessed without creating the instance of a Class.

    // 3.void: It is the return type of the method. Void defines the method which will not return
    //         any value.

    // 4. main: It is the name of the method which is searched by JVM as a starting point for an application with a particular signature only. It is the method where the main execution occurs. 

    // 5. String args[]: It is the parameter passed to the main method.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int num = sc.nextInt();

        System.out.print("Print the numbers: "+ num);

        sc.close();
    }
}

// Questions: How to take input and print the input. 