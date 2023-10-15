package practice.queston06;

public class CardTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		Card c1 = company.cardCreate();   //메서드에서 Car 생성
		Card c2 = company.cardCreate();
		
		c1.setCustomName("KIM MIN JU"); 
		System.out.println(c1.customName+ c1.cardID);
		
		
		c2.setCustomName("LEE SANG HO"); 
		System.out.println(c2.customName + c2.cardID);

	}

}
