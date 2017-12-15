class CardTest {

    //  Testing class
    //  Main Method
    public static void main(String[] args) {

    //  Create card using object member access operators
    Card card2 = new Card();
    card2.rank = 4;
    card2.suit = 3;
    System.out.println(card2.toString());

    //  Create card specifing values in object constructor
    int num1 = 3;  //  Rank value
    int num2 = 2;  //  Suit value
    Card card = new Card(num1, num2);  //  card(rank, suit)
    System.out.println(card.getRank() + " of " + card.getSuit());
    System.out.println(card.toString());

    //  Obtain class constant values
    Card card3 = new Card();
    System.out.println("Club suit value = " + card3.CLUBS + " and King value = " + card3.KING);
    }
}