package interfaceex;

public interface Calc {
	double PI = 3.14; 
	int ERROR = -999999;
	
	int add(int num1, int num2); 
	int substract(int num1, int num2); 
	int times(int num1, int num2); 
	int divide(int num1, int num2); 
	int square(int num);

	default void description() {  
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();} //default 메서드 
	
	static int total(int[] arr) {   //정적 메서드 어디서나 사용 
		int total = 0; 
		
		for(int i : arr) {
			total += i; 
		}                   //myMethod는 실행안됨 인스턴스 생성할때 생성됨 
		myStaticMethod();  //myStaticMethod는 static 붙어서 사용가능 
		return total; 
	   }
		
		private void myMethod() {
		  System.out.println("private 메서드 입니다.");
		}
		
		private static void myStaticMethod() {
			System.out.println("private static 메서드입니다.");
			
		}
	}
