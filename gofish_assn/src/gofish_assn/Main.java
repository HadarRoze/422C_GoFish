package gofish_assn;



public class Main {
	
	public static void main(String args[]) {
		System.out.println("Hello World!");
		
		Card c = new Card();
		Card c2 = new Card(4,'d');
		
		System.out.println();
		System.out.println(c.toString());
			
		Deck d = new Deck();
		
		d.printDeck();
		System.out.println();
		
		d.shuffle();
		
		System.out.println();		
		d.printDeck();

		
		c = d.dealCard();
		System.out.println(c.toString());
		
		Player p1 = new Player("Jane");
		System.out.println(p1.getName());
		
		
	}

}
