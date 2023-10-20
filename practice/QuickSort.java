package practice;

public class QuickSort implements Sort {

	@Override
	public int[] asceding(int[] arr) {
		System.out.println("QuickSort asceding");
		return arr;
	}

	@Override
	public int[] descending(int[] arr) {
		System.out.println("QuickSort desceding");
		return arr;
	}
    @Override
    public void description() {
    	// TODO Auto-generated method stub
    	Sort.super.description();
    	System.out.println( "QuickSort입니다.");
    }
}
