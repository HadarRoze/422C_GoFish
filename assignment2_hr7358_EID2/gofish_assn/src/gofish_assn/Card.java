package gofish_assn;


public class Card {
	
	public enum Suits {club, diamond, heart, spade};
	
	static int TOP_RANK = 13; //King
	static int LOW_RANK = 1; //Ace
	
	int rank;  //1 is an Ace
	Suits suit;
	
	/**
	 * Sets the new object's rank to 1, and suit to spade
	 */
	public Card() {
		rank = 1;
		suit = Suits.spade;
	}
	
	/**
	 * 
	 * @param r number to be used as the new object's rank
	 * @param s character that corresponds with the proper suit's first letter
	 */
	public Card(int r, char s) {
		rank = r;
		suit = toSuit(s);
	}
	
	/**
	 * 
	 * @param r number to be used as the new object's rank
	 * @param s suit to be used as the new object's suit
	 */
	public Card(int r, Suits s) {
		rank =r; 
		suit = s;
	}
	
	/**
	 * 
	 * @param c character that corresponds with the proper suit's first letter
	 * @return proper suit (the one that start's with the inputed character)
	 */
	private Suits toSuit(char c) {
		switch(c) {
		case 'S':
		case 's':
			return Suits.spade;
		case 'H':
		case 'h':
			return Suits.heart;
		case 'C':
		case 'c':
			return Suits.club;
		case 'D':
		case 'd': 
			return Suits.diamond;
		}
		
		return Suits.spade; //this shouldn't happen!!!! work on exception later 
	}
	
	/**
	 * 
	 * @param s suit to be converted
	 * @return suit in string format
	 */
	private String suitToString(Suits s){
		
		return "s"; //this shouldn't happen!!!! work on exception later
	}
	
	/**
	 * 
	 * @param r rank to be converted
	 * @return rank in string format
	 */
	private String rankToString(int r)	{
		return "A"; //this shouldn't happen!!!! work on exception later
	}
		
	/**
	 * 
	 * @return rank of the object
	 */
	public int getRank() {
		return rank;
	}
	
	/**
	 * 
	 * @return suit of the object
	 */
	public Suits getSuit() {
		return suit;
	}
	
	/**
	 * Prints card
	 */
	public String toString() {
		String s = "";
		
		s = s + rankToString(getRank()) + suitToString(getSuit());
		
		return s;
	}
}
