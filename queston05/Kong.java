package practice.queston05;

public class Kong {
    int customerCount; 
    int income; 
    

    
    public void take(int income) {
    	this.income += income; 
    	customerCount++; 
    	
    }
    
    public void showInfo() {
    	System.out.println("콩다방의 " + "고객은"+customerCount+"명이고"+ "수입은"+income+"입니다.");
    	
    }
      
    
    
    
    
    
    
}
