/**
 * @(#)LibraryRecord.java
 *
 *
 * @author
 * @version 1.00 2015/12/14
 */


public class LibraryRecord {

	 String title;
	 String author;
	 String catalog;
	 String publisher;
	 int year;
	 boolean circulating;
	 String answercirculate;




	//Sends Info into Library Record
    public LibraryRecord(String t, String a, String ca, String p, int y, boolean c) {

		title = t;
		author = a;
		catalog = ca;
		publisher =  p;
		year = y;
		circulating = c;

    }
	//Information without Circulating
    public LibraryRecord(String t, String a, String ca, String p, int y) {

		title = t;
		author = a;
		catalog = ca;
		publisher = p;
		year = y;

    }
	//Default Constructor
    public LibraryRecord() {

		title = "N/A";
		author = "N/A";
		catalog = "N/A";
		publisher = "N/A";
		year = 0;
		circulating = false;

    }
	//All Get Methods From Title - Circulating
    public String getTitle() {
		return title;
    }

    public String getCatalog() {
		return catalog;
    }

    public String getPublisher() {
		return publisher;
    }

    public int getYear() {
		return year;
    }

    public boolean getCirculating() {
		return circulating;
    }

    public void isCirculating(boolean c) {
		circulating = c;
    }
	//Return Everything Back to Person...
    public String toString() {

    	if (circulating == true) {
    		answercirculate = "True";
		}
    	else if (circulating == false) {
    		answercirculate = "False";
		}

		return "Title: " + title + "\n" + "Author: " + author + "\n" + "Catalog Number: " + catalog + "\n" + "Publisher: " + publisher + "\n" +"Year: " + year + "\n" + "Is Circulating: " + answercirculate;
    }


}