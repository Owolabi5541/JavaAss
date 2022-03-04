import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hamme
 */
public class PalindromeClass {
    public static void main(String [] args){
        
         Scanner input = new Scanner(System.in);
	     System.out.println("Welcome To Palindrome Checker");
	     System.out.println("Enter Palindrome Numbers: ");
	     int inp1;
	     
	     inp1 = input.nextInt();
	     
	     int inp2 = inp1;
	     int inp3 = 0;
	     
	     while(inp1!=0) {
	    	 inp3 = inp3*10 + inp1 %10;
	    	 inp1 = inp1/10;
	     }
	     if(inp2 == inp3) {
	    	 System.out.println(inp3 + " Palindrome Number");
	     }
	     else {
	    	 System.out.println(inp3 + " Not Palindrome Number");
	     }
	    
    }
    
}
