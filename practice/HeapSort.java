package practice;

public class HeapSort implements Sort {

	@Override
	public int[] asceding(int[] arr) {
		System.out.println("HeapSort asceding");
     	return arr; 
	}

	@Override
	public int[] descending(int[] arr) {
		System.out.println("HeaSort desceding");
		return arr;
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println( "HeapSort입니다.");
	}

}
