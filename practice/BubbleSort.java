package practice;

public class BubbleSort implements Sort {

	@Override
	public int[] asceding(int[] arr) {
		System.out.println("BubbleSort asceding");
		return arr;
	}

	@Override
	public int[] descending(int[] arr) {
		System.out.println("BubbleSort desceding");
		return arr;
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println( "BubblSort입니다.");
	}

}
