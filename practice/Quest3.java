package practice;

public class Quest3 {

	public static void main(String[] args) {
		int[] evenArr = new int[5]; 
		int sum = 0; 
		for(int i=0; i<evenArr.length; i++) {
			evenArr[i] = 2 *(i+1); 
			sum= sum+evenArr[i];  
		}
       System.out.println(sum);
	}

}
