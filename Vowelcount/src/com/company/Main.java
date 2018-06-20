package com.company;
import java.util.Scanner;
/*

Count Vowels – Enter a string and the program
counts
the number of vowels in the text.
For added complexity have it report a sum of each vowel found.

 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter in a word");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count=0;
        for(int i=0; i < word.length(); i++)
        {
           if (word.charAt(i) =='i'){
               count++;
              }// end of if
            else if  (word.charAt(i) =='o'){
               count++;
           }// end of if
            else if(word.charAt(i) =='u'){
            count++;
        }// end of if

           else if(word.charAt(i) =='a'){
               count++;
           }// end of if
           else if(word.charAt(i) =='e'){
               count++;
           }// end of if

        }// end of for loop

     System.out.println("Number of vowels counted is:" +  count);
	// write your code here
    }// end of void case
}
