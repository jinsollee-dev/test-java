package inheritance;

public class VIPCustomer extends Customer {
	  private int agentID; 
	  double saleRatio; 
	  
	  public VIPCustomer() {
		   customerGrade = "VIP"; //CustomerGrade는 private로 설정해서 다른 클래스에서는 접근x 
		   bonusRatio = 0.05; 
		   saleRatio = 0.1; 
		   //System.out.println("VIPCustomer() 생성자 호출");
	  }
	  
	  public VIPCustomer(int customerID, String customerName, int agentID) {
		   super(customerID, customerName); 
		   customerGrade = "VIP";  
		   bonusRatio = 0.05; 
		   saleRatio = 0.1; 
		   this.agentID = agentID; 
		   //System.out.println("VIPCustomer(int, string,int) 생성자 호출");
	  }
	  
	  @Override
	  public int calcPrice(int price) {
		  bonusPoint += price* bonusRatio; 
		  return price - (int)(price * saleRatio);
	
	}
	  
	  public String showVIPInfo() {
		   return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID+"입니다."; 
		  
	  }
	  
	  public int getAgentID() {
		  return agentID; 
	  }
	  
}
