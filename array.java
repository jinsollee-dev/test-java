package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
//		 //배열실습문제1-Q1. 
//		Scanner scan1 = new Scanner(System.in);
//		String a1 =  scan1.next();
//		char c= a1.charAt(0);   
//		for(int i = 97; i<=c; i++) {
//			for(int j = i; j<=c; j++) {
//				System.out.print((char)j);
//				} System.out.println();
//		   }
//
//		  //배열실습문제1-Q2. 
//		   Scanner scan2 = new Scanner(System.in);
//		  
//		   
//		   int[] arr = new int[10]; 
//		   for(int i =0; i<arr.length; i++) {
//			   int input = scan2.nextInt();
//			    arr[i] = input;
//			    if(arr[i]%3==0) {
//			    	System.out.print(arr[i]+ " ");
//			    }  
//			   
//		   }
//			
//		   //배열실습문제1-Q3. 
//		   Scanner scan3 = new Scanner(System.in);
//		   int input = scan3.nextInt(); 
//		   if(input % 2 == 0) {
//			   System.out.println("짝수");
//		   }else 
//		      System.out.println("수를 입력하지 않아 종료합니다.");
//			  System.exit(0);
//		   
//		  //배열실습문제1-Q5. 
//		  Scanner scan4 = new Scanner(System.in);
//		  
//		  int[] arr2 = new int[10];
//		  for(int i = 0; i<arr2.length; i++) {
//			  int input2 = scan4.nextInt(); 
//			  arr2[i] = input2; 
//			  
//		  }
//		   Arrays.sort(arr2); 
//		   System.out.println(Arrays.toString(arr2));
//		  
		  //배열실습문제2-Q1. 
//		   System.out.println("금액을 입력하세요.");
//		   Scanner scan5 = new Scanner(System.in); 
//		   int put = scan5.nextInt(); 
//		   int[] money = new int[10]; 
//		   int a = put/50000; //5만원짜리 갯수
//		    money[0] = a; 
//		    put = put-(50000 * a); 
//		   
//		    int b = put/10000; 
//		    money[1] = b; //1만원 
//		    put = put-(10000 *b); 
//		    
//		    int c= put/5000; 
//		    money[2] = c; 
//		    put = put-(5000*c); 
//		    
//		    int d = put/1000; 
//		    money[3] = d;
//		    put = put - (1000*c);
//		    
//		    int e = put/500; 
//		    money[4] = e;
//		    put = put - (500*e); 
//		    
//		    int f = put/100; 
//		    money[5] = f; 
//		    put = put - (100*f); 
//		    
//		    int g = put/50; 
//		    money[6] = g; 
//            put = put - (50*g); 
//            
//            int h = put/10; 
//            money[7] = h; 
//            put = put - (10*h); 
//            
//            int i = put/5; 
//            money[8]= i; 
//            put = put- (5*i); 
//		   
//            money[9] = put; 
//           		      
//		    for(int arr : money) {
//		    	System.out.print(arr+" ");
//		   
//		    } 
//		
		    //배열실습문제2-Q2. 
		     Scanner scan6 = new Scanner(System.in);
		     int input3 = scan6.nextInt(); 
		     // 0<input3 < 100 
		         int st = input3/ 10; 
		         int sec= input3 % 10 ;
		        
		        if((st == 3 || st ==  6 || st == 9) && (sec == 3 || sec==  6 || sec== 9)) {
		    		 System.out.println("박수짝짝");
		    	}  else if (st == 3 || st ==  6 || st == 9) {
		    	     System.out.println("박수짝");
		    	 } else if (sec == 3 || sec==  6 || sec== 9) {
		    		 System.out.println("박수짝");
		    	 } else System.out.println("1과 99까지의 정수 입력해주세요.");
		  
		
		     
		     
		     
		     
		
		
		
		
 }
}
