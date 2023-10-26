package lambda;

interface PrintString{
	void showString(String str); 
	
}


public class TestLambda {
	public static void main(String[] args) {
	 PrintString lambdaStr =  s->System.out.println(s); 
	 lambdaStr.showString("Hello lamda_1");
	 showMyString(lambdaStr); 
	 

	}

	
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}

}
