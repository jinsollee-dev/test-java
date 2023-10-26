package practice.lambda;

public class CalcTest {

	public static void main(String[] args) {
		Calc test = (x, y) -> {return x+ y;};
		
		System.out.println(test.add(10, 20));

	}

}
