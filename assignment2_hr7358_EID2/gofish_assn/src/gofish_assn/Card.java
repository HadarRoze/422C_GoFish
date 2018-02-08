package gofish_assn;

public class Card {
	
	public enum Suits {club, diamond, heart, spade};
	
	static int TOP_RANK = 13; //King
	static int LOW_RANK = 1; //Ace
	
	int rank;  //1 is an Ace
	Suits suit;
	
	public Card() {
		rank = 1;
		suit = Suits.spade;
	}
	
	public Card(int r, char s) {

	}
	
	public Card(int r, Suits s) {

	}
	
	private Suits toSuit(char c) {
		return Suits.spade; //dummy
	}
	
	private String suitToString(Suits s)
	{
		return "s"; //dummy
	}
	
	private String rankToString(int r)
	{
		return "A"; //dummy
	}
		
	
	public int getRank() {
		return rank;
	}
	
	public Suits getSuit() {
		return suit;
	}
	
	public String toString() {
		String s = "";
		
		s = s + rankToString(getRank()) + suitToString(getSuit());
		
		return s;
	}
}
