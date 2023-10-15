package practice.queston06;

public class Card {
	
	public static int serialNum = 1000;
	int cardID; 
	String customName; 
	
	public Card(){
		serialNum++; 
		cardID=serialNum; 
	}

	public int getCardID() {
		return cardID;
	}

	public void setCardID(int cardID) {
		this.cardID = cardID;
	}

	public String getCustomName() {
		return customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}
	
		
	
	

}
