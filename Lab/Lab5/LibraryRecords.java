/**
 * @(#)LibraryRecords.java
 *
 * @Jeff Schall
 * @CS 2370
 * @Lab 5, Part 3 - Library Records
 * @version 1.00 2009/6/25
 *
 * @Program Description
 *  Java program to implement a class called LibraryRecord that includes the
 *  following entries:
 *  	Fields for:
 *			Title (String - title)
 *			Author (String - author)
 *			Catalog Number (String - catalogNum)
 *			Publisher (String - publisher)
 *			Publication Year (int - year)
 *			Ciculation (boolean - isCirculating)
 *		Create constructor that takes in all six values and initilizes object
 *		Create constructor that takes in the first five values and initialize to circulate
 *		Appropriately named getter methods for all six fields
 *		Create a setter method of the isCirculating field
 *		Create a toString method that prints out library record information
 */

public class LibraryRecords {

    //  Testing class
    //  Main Method
    public static void main(String[] args) {
	boolean b=true;
    //  Create card using object member access operators
    LibraryRecord record = new LibraryRecord();
    record.title = "Steve From Minecraft";
    record.author = "Steve";
    System.out.println(record.toString());

    /**  Create card specifing values in object constructor
    int num1 = 3;  //  Rank value
    int num2 = 2;  //  Suit value
    Card card = new Card(num1, num2);  //  card(rank, suit)
    System.out.println(card.getRank() + " of " + card.getSuit());
    System.out.println(card.toString());

    //  Obtain class constant values
    Card card3 = new Card();
    System.out.println("Club suit value = " + card3.CLUBS + " and King value = " + card3.KING);
    */
    }
}

//  Define LibraryRecord class with two constructors with getter and setter methods
