package chapter5;

public class CardCompany {

		private static CardCompany instance = new CardCompany();
		
		private CardCompany() {}
		
		
		public static CardCompany getInstance() {
			if(instance == null) {
				instance = new CardCompany();
			}
			return instance;
		}
		
		public Card createCard() {
			Card newCard = new Card();
			//newCard.newCard();
			return newCard;
		}
	
	
	// ����� ��
	/*
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {}
	public static CardCompany getInstance() {
		if(instance == null )
			instance = new CardCompany();
		return instance;
	}
	public Card createCard() {
		
		Card card = new Card();
		return card;
	}*/
}
