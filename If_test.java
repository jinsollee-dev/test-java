package practice;

import java.util.Scanner;

public class If_test {

	public static void main(String[] args) {
//		//Q1.
//		System.out.println("두 정수를 입력하세요.");
//		Scanner scanner = new Scanner(System.in); 
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		System.out.println(a+"+"+b+"은 "+(a+b));
	    	
//		//Q2. 
//		Scanner scanner = new Scanner(System.in); 
//		int state = scanner.nextInt();
//		int height = state * 5; 
//		System.out.println(height+"m"+" 입니다.");
//		
//	    	
//		//Q3. 
//		System.out.println("X값을 입력하세요.");
//		Scanner s1 = new Scanner(System.in);
//		int x = s1.nextInt();
//		int y = (x*x)-3*x+7; 
//		System.out.println("x="+x+", "+ "y="+y);
//	
//		//Q5. 
//		System.out.println("논리 연산을 입력하세요.");
//		 Scanner s1 = new Scanner(System.in);
//			boolean a = s1.nextBoolean();
//			String op = s1.next();
//			boolean b = s1.nextBoolean(); 
//			switch(op){
//				case "AND": 
//				if (a == true && b == true){
//					System.out.println("true");
//				} System.out.println("false");
//					break; 
//				case "OR" : 
//					if (a== false && b == false) {
//						System.out.println("false");
//					  }System.out.println("true");
//					break;} 				
//				
			
//			switch(op){
//			case "AND" : System.out.println(a && b);break; 
//			case "OR" : System.out.println(a || b); break; 
//			}	
		
		//Q6. 
//		Scanner s1 = new Scanner(System.in);
//			int a = s1.nextInt();
//			int b = a/50000;   //5만원짜리 갯수 
//			int c = (a%50000)/10000;    // 1만원짜리 갯수 
//			int d = ((a%50000)%10000)/5000; //5천원짜리 갯수
//			int e = (((a%50000)%10000)%5000)/1000; //1원짜리 갯수 
//			int f = ((((a%50000)%10000)%5000)%1000)/500; // 500원짜리 갯수  
//			int g = (((((a%50000)%10000)%5000)%1000)%500)/100; //100원짜리 갯수 
//			int h = (((((((a%50000)%10000)%5000)%1000)%500))%100)/10;  // 10원짜리갯수 
//			int i = (((((((a%50000)%10000)%5000)%1000)%500))%100)%10;   //1원짜리 갯수 
//			
//			System.out.println(b);
//			System.out.println(c);
//			System.out.println(d);
//			System.out.println(e);
//			System.out.println(f);
//			System.out.println(g);
//			System.out.println(h);
//			System.out.println(i);
			
//			int b = a/50000;   //5만원짜리 갯수 
//			int c = (a%50000)/10000;  //1만원짜리 갯수 
//			int d = ((a%50000)%10000)/1000; // 1천원 갯수 
//			int e = (((a%50000)%10000)%1000)/500; //500원 갯수 
//			int f = ((((a%50000)%10000)%1000)%500)/100; //100원짜리 갯수 
//			int g = ((((((a%50000)%10000)%1000)%500))%100)/10;  // 10원짜리갯수 
//			int h = ((((((a%50000)%10000)%1000)%500))%100)%10;   //1원짜리 갯수 
//			
//			System.out.print("오만원" + b+"개,");
//			System.out.print(" 만원" + c+"개,");
//			System.out.print(" 천원" + d+"개,");
//			System.out.print(" 500원" +e+"개,");
//			System.out.print(" 100원" +f+"개,");
//			System.out.print(" 10원" + g+"개,");
//			System.out.print(" 1원" + h+"개,");
//				
			 //Q7. 
//			Scanner s1 = new Scanner(System.in); 
//			String score = s1.next();
//			String result = ""; 
//			switch (score) {
//			case "A": result = "Excellent"; break;
//			case "B": result = "Excellent"; break;
//			case "C" :  result = "Good"; break; 
//			case "D" : result = "Good"; break;
//			default : result = "bye";
//			}
//
//			System.out.println(result);
//					 
			//Q8. 
			System.out.println("커피 주문하세요");
			//음료수종류 수 -> 가격 출력 
			//if문 활용 
//			Scanner s1 = new Scanner(System.in);
//			String order = s1.next(); 
//			int number = s1.nextInt();
//			int price = 0; 
//			if(order.equals("에스프레소")) {
//				price = 2000*number; 
//			}
//			if(order.equals("아메리카노")) {
//				price = 2500*number; 
//			}
//			if(order.equals("카푸치노")) {
//				price = 3000*number; 
//			}
//			if(order.equals("카페라떼")) {
//				price = 3500*number; 
//			}
//			System.out.println(price+"원입니다.");

			//switch문 활용 
			Scanner s1 = new Scanner(System.in); 
			String coffee = s1.next();
			int number = s1.nextInt();
			int price = 0; 
			switch(coffee) {
			case "에스프레소" : price = 2000*number; break; 
			case "아메리카노" : price = 2500*number; break;
			case "카푸치노" : price = 3000*number; break; 
			case "카페라떼" : price = 3500*number; break; 
			default : System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println(price + "원 입니다");
			
		
		
			
	}	
}
