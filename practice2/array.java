package practice2;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		  //Q1. 
//		Scanner scan = new Scanner(System.in);
//		String a1 =  scan.next();
//		char c= a1.charAt(0);   
//		for(int i = 97; i<=c; i++) {
//			for(int j = i; j<=c; j++) {
//				System.out.print((char)j);
//				} System.out.println();
//		   }

		  //Q2. 
		   Scanner scan2 = new Scanner(System.in);
		  
		   
		   int[] arr = new int[10]; 
		   for(int i =0; i<arr.length; i++) {
			    int input = scan2.nextInt();
			    arr[i] = input;
			    if(arr[i]%3==0) {
			    	System.out.print(arr[i]+ " ");
			    }  
			   
		   }
			

		
		
		
		
		
		
		
		
 }
}
