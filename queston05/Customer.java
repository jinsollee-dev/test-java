package practice.queston05;

public class Customer {
	String customerName; 
	int money; 

	public Customer(String customerName, int money) {
		this.customerName = customerName; 
		this.money = money; 
	}
	
	public void cafe(Star star){
      	 star.take(4000);
	    this.money = money-4000;}
		
	public void cafe(Kong kong) {
		kong.take(4500); 
		this.money =money-4500; 
		
	}
		
//		 Kong kong = new Kong(); 
//		  kong.take(4500); 
//		  this.money= money-4500

	

	public void showInfo(){
		
	  System.out.println(customerName + "님의 남은 돈은" + money + "입니다.");
	}
}


//customer = 여러명...  
//cafe = starcafe, kongcafe, ... 
//coffee = Americano, Cafelatte, ... 
