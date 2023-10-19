package polymorphism;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer lee = new Customer(); 
		lee.setCustomerID(10010);
		lee.setCustomerName("이순신"); 
		lee.bonusPoint = 1000;
		System.out.println(lee.showCustomerInfo());

		
	
		Customer kim = new VIPCustomer(10020, "김유신", 12345); 
		kim.bonusPoint= 1000;
		
		System.out.println(kim.showCustomerInfo());
		System.out.println("===========할인율과 보너스 포인트 계산===========");
		
		int price = 10000;
		int leePrice = lee.calcPrice(price);
		int kimPrice = kim.calcPrice(price); 
		System.out.println(lee.getCustomerName()+" 님 이"+ leePrice+"원 지불하셨습니다.");
		System.out.println(lee.showCustomerInfo());
		System.out.println(kim.getCustomerName()+" 님 이"+ kimPrice+"원 지불하셨습니다.");
		System.out.println(kim.showCustomerInfo());	
		
		showCustomer(lee, 5000); 
		
	}
	public static void showCustomer(Customer customer, int price) {
		System.out.println(customer.getCustomerName()+" 님 이"+ customer.calcPrice(price)+"원 지불하셨습니다.");
		
	}

}
