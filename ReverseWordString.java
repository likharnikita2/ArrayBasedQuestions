package Array_Integer_Questions;

import java.util.Scanner;

public class ReverseWordString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed =reverseWord(str);
        System.out.println("The reversed string is: " + reversed); 

        sc.close();
    }

    public static String reverseWord(String str){  
        String words[]=str.split("\\s");  
        String reverseWord="";  
        for(String w:words){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse();  
            reverseWord+=sb.toString()+" ";  
        }  
        return reverseWord.trim();  
    }  
}
