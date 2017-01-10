import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //StringBuilder is mutable so they can change their values
        Scanner in = new Scanner(System.in);
        StringBuilder input = new StringBuilder(in.nextLine());
     
        int i = 0; 
        //input.length changes with each loop
        while(i<input.length()-1){
            if (input.charAt(i) == input.charAt(i+1)){
                //.delete is a StringBuilder method (inc, exc)
                   input = input.delete(i, i+2);
                   i = 0;
            }else{
                i++;
            } 
        }
       //side cases
       //convert answer to String
       if (input.length() == 0){
            System.out.println("Empty String");
        }else{
            System.out.println(input.toString());
        }
        
    }
}