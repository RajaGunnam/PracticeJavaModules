package javaStrings;

import java.util.Scanner;

public class RevOfAString {
    public static void main(String[] args) {
//        // Create a Scanner object for input
//        Scanner scanner = new Scanner(System.in);
//        
//        // Prompt the user to enter a string
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//        
//        // Reverse the string using StringBuilder
//        String reversed = new StringBuilder(input).reverse().toString();
//        
//        // Display the reversed string
//        System.out.println("Reversed string: " + reversed);
//        
//        // Close the scanner to avoid resource leak
//        //scanner.close();
        
        
    
    	   
    	        String str = "Sun rises in the east";
    	        
    	        // Split the string into an array of words
    	        String[] words = str.split(" ");
    	        
    	        // Create a StringBuilder to store the result
    	        StringBuilder reversedStr = new StringBuilder();
    	        
    	        // Loop through the words array in reverse order
    	        for (int i = words.length - 1; i >= 0; i--) {
    	            reversedStr.append(words[i]);
    	            if (i != 0) { // Add space between words, but not after the last word
    	                reversedStr.append(" ");
    	            }
    	        }
    	        
    	        // Convert the StringBuilder to a string
    	        String output = reversedStr.toString();
    	        
    	        // Output the result
    	        System.out.println(output); // Output: "east in rises Sun"
    	

        
    }
}
