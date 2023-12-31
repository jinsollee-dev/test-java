package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer lee = new Customer(); 
		lee.setCustomerID(10010);
		lee.setCustomerName("이순신"); 
		lee.bonusPoint = 1000;
		System.out.println(lee.showCustomerInfo());

		
		VIPCustomer kim = new VIPCustomer(); 
		kim.setCustomerID(10020);
		kim.setCustomerName("김유신");
		kim.bonusPoint= 10000;
		System.out.println(kim.showCustomerInfo());
		
		Customer a = new VIPCustomer(10040, "a", 2000);
		a.bonusPoint = 3000; 
		System.out.println(a.calcPrice(10000));
		
	}

}
