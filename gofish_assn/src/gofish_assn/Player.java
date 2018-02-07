package gofish_assn;

import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> hand = new ArrayList<Card>();
	ArrayList<Card> book = new ArrayList<Card>();
	String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void addCardToHand(Card c) {
	
	}
	
	public Card removeCardFromHand(Card c) {
		Card retCard = new Card();
		
		return retCard;
	}
	
	public String getName() {
		return name;
	}
	
	public String handToString() {
		String s = new String();
	
		return s;
	}
	
	public String bookToString() {
		String s = new String();
		
		return s;
	}
	
	public int getHandSize() {
		return 0;
	}
	
	
	public int getBookSize() {
		return 0;
	}
	
	
	//Here are som ideas for additional functionality that you may want/need
	//OPTIONAL
    // comment out if you decide to not use it
    //this function will check a players hand for a pair. 
    //If a pair is found, it moves the cards to the book and returns true

    public boolean checkHandForBook() {
    	return false; //stubbed
    }

    //OPTIONAL
    // comment out if you decide to not use it    
    //Does the player have a card with the same rank as c in her hand?
    public boolean rankInHand(Card c) {
    	return false; //stubbed
    }
    
    //uses some strategy to choose one card from the player's
    //hand so they can say "Do you have a 4?"
    public Card chooseCardFromHand() {
    	Card c = new Card();
    	
    	return c;
    }
    
    //Does the player have the card c in her hand?
    public boolean cardInHand(Card c) {
    	return false; //stubbed
    }
    

    //OPTIONAL
    // comment out if you decide to not use it    
    //Does the player have a card with the same rank as c in her hand?
    //e.g. will return true if the player has a 7d and the parameter is 7c
    
    public boolean sameRankInHand(Card c) {
    	return false; //stubbed
    }

}
