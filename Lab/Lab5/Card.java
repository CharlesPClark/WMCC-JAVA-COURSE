//Card
//By Charles Clark
//12-21-2015
//Beginner's Java

public class Card {


	 //Declaration of Variables
     String ReturnRank;
	 String ReturnSuit;


	 int rank;
	 int suit;


	 final int CLUBS = 1;
	 final int DIAMONDS = 2;
	 final int HEARTS = 3;
	 final int SPADES = 4;

	 final int ACE = 1;
	 final int TWO = 2;
	 final int THREE = 3;
	 final int FOUR = 4;
	 final int FIVE = 5;
	 final int SIX = 6;
	 final int SEVEN = 7;
	 final int EIGHT = 8;
	 final int NINE = 9;
     final int TEN = 10;
	 final int JACK = 11;
	 final int QUEEN = 12;
	 final int KING = 13;

	//Check Rank and Suit
	public Card(int Irank, int Isuit) {
		rank = Irank;
		suit = Isuit;

		switch(Irank) {
    		case ACE: ReturnRank = "Ace";
    		break;
    		case TWO: ReturnRank = "Two";
    		break;
    		case THREE: ReturnRank = "Three";
    		break;
    		case FOUR: ReturnRank = "Four";
    		break;
    		case FIVE: ReturnRank = "Five";
    		break;
    		case SIX: ReturnRank = "Six";
    		break;
    		case SEVEN: ReturnRank = "Seven";
    		break;
    		case EIGHT: ReturnRank = "Eight";
    		break;
    		case NINE: ReturnRank = "Nine";
    		break;
    		case TEN: ReturnRank = "Ten";
    		break;
    		case JACK: ReturnRank = "Jack";
    		break;
    		case QUEEN: ReturnRank = "Queen";
    		break;
    		case KING: ReturnRank = "King";
    		break;
    	}

    	 switch(Isuit) {
    		case CLUBS: ReturnSuit = "Clubs";
    		break;
    		case DIAMONDS: ReturnSuit = "Diamonds";
    		break;
    		case HEARTS: ReturnSuit = "Hearts";
    		break;
    		case SPADES: ReturnSuit = "Spades";
    		break;
    	}


	}

    public Card() {

    }

    //public void rank(int r) {

    	//Irank = r;

    //}

    //public void suit(int s) {

    	//Isuit = s;

    //}

	//Check Rank
    public String getRank() {

    	switch(rank) {
     		case ACE: ReturnRank = "Ace";
    		break;
    		case TWO: ReturnRank = "Two";
    		break;
    		case THREE: ReturnRank = "Three";
    		break;
    		case FOUR: ReturnRank = "Four";
    		break;
    		case FIVE: ReturnRank = "Five";
    		break;
    		case SIX: ReturnRank = "Six";
    		break;
    		case SEVEN: ReturnRank = "Seven";
    		break;
    		case EIGHT: ReturnRank = "Eight";
    		break;
    		case NINE: ReturnRank = "Nine";
    		break;
    		case TEN: ReturnRank = "Ten";
    		break;
    		case JACK: ReturnRank = "Jack";
    		break;
    		case QUEEN: ReturnRank = "Queen";
    		break;
    		case KING: ReturnRank = "King";
    		break;
    	}

			return ReturnRank;
    }

	//Check Suit
    public String getSuit() {
    	switch(suit) {
    		case CLUBS: ReturnRank = "Clubs";
    		break;
    		case DIAMONDS: ReturnRank = "Diamonds";
    		break;
    		case HEARTS: ReturnRank = "Hearts";
    		break;
    		case SPADES: ReturnRank = "Spades";
    		break;
    	}

    	return ReturnSuit;

    }

	//Return Suit and Rank
    public String toString() {

    	 switch(rank) {
     		case ACE: ReturnRank = "Ace";
    		break;
    		case TWO: ReturnRank = "Two";
    		break;
    		case THREE: ReturnRank = "Three";
    		break;
    		case FOUR: ReturnRank = "Four";
    		break;
    		case FIVE: ReturnRank = "Five";
    		break;
    		case SIX: ReturnRank = "Six";
    		break;
    		case SEVEN: ReturnRank = "Seven";
    		break;
    		case EIGHT: ReturnRank = "Eight";
    		break;
    		case NINE: ReturnRank = "Nine";
    		break;
    		case TEN: ReturnRank = "Ten";
    		break;
    		case JACK: ReturnRank = "Jack";
    		break;
    		case QUEEN: ReturnRank = "Queen";
    		break;
    		case KING: ReturnRank = "King";
    		break;
    	}

    	 switch(suit) {
    		case CLUBS: ReturnSuit = "Clubs";
    		break;
    		case DIAMONDS: ReturnSuit = "Diamonds";
    		break;
    		case HEARTS: ReturnSuit = "Hearts";
    		break;
    		case SPADES: ReturnSuit = "Spades";
    		break;
    	}
    	return ReturnRank + " of " + ReturnSuit;

    }

}