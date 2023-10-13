package singleton;

public class Car {
	public static int serialNum = 10000; 
	public int CarNum;
	
	
	public Car() {
		serialNum++;
		CarNum = serialNum;		
	}


	public int getCarNum() {
		return CarNum;
	}


	public void setCarNum(int carNum) {
		this.CarNum = carNum;
	}
	
  
 
}
