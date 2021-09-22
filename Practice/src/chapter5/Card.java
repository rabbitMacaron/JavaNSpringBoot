package chapter5;

public class Card {
	/*private static int serialNumber=10001;
	int cardNumber;
	
	public void newCard() {
		cardNumber = serialNumber;
		serialNumber++;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}*/
	
	//°­»ç´Ô ´ä
	private int cardNumber;
	private static int serialNum = 10000;
	
	Card(){
		serialNum++;
		cardNumber = serialNum;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
}
