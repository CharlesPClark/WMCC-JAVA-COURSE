//Homework Part 3
//By Charles Clark
//12-21-2015
//Beginner's Java

import java.io.*;
import java.util.*;

public class CardReader {

	private String LineHolder = "";
	private String Finder = "";
	private String[] lines;
	private String AccountBalance;
	private String AccountNumber;
	private int BalanceSearch;
	private int CardSearch = 0;
	private int CardBalanceSearch = 0;

    public CardReader() {

    }
    public boolean hasFunds(int card2, int amount2) {

    	int CardSearch = 0;
		boolean Confirmation = false;

   		do {
   			Finder = lines[CardSearch];
   			if (Integer.parseInt(Finder) == card2) {

   				Confirmation = true;
   				BalanceSearch = CardSearch + 1;
   				AccountBalance = lines[BalanceSearch];

   			}
   			++CardSearch;

   		} while(Confirmation != true || CardSearch < lines.length);

		if (Integer.parseInt(AccountBalance) > 0000) {
			return true;
   		}
			return false;
   	}
    public void debit(int card, int amount) {

		CardBalanceSearch = 1;
		CardSearch = 0;

		try {
			PrintWriter Writer = new PrintWriter(new FileWriter("cards.txt"));
			for(int i = 2;i<lines.length;i += 2) {
				Finder = lines[CardSearch];
				if (Integer.parseInt(Finder) == card) {
					Writer.println(card + "," + amount);
				}
				else if (i <lines.length){
					Writer.println(lines[CardSearch] + "," + lines[CardBalanceSearch]);
				}
			CardBalanceSearch += 2;
			CardSearch += 2;
		}
		Writer.close();
		} catch (IOException ex) {
			System.out.println("File Not Found");
		}
    }
    public int getBalance(int card) {

    	String FinderA;
    	String BalanceHolder="";
    	String[] BalanceArray;
    	CardSearch = 0;
    	try {

   	  		BufferedReader in = new BufferedReader(new FileReader("cards.txt"));
      		String line;
      		boolean Confirmation = false;
      		int i = 0;

      		while ((line = in.readLine() ) != null) {
      		   if (i == 0) {
 					BalanceHolder += line;
 					i++;
      			}
      			else if (i == 1) {
      				BalanceHolder += "," + line;
      			}
	  		}

   		} catch (IOException ex) {
   			System.out.println("File Not Found");
   		}

   		BalanceArray = BalanceHolder.split(",");

   		do {
			FinderA = BalanceArray[CardSearch];
   			if (Integer.parseInt(FinderA) == card) {

   				BalanceSearch = CardSearch + 1;
   				AccountBalance = BalanceArray[BalanceSearch];
   				return Integer.parseInt(AccountBalance);

   			}
   			++CardSearch;

   		} while(CardSearch < lines.length);

		return 0000;
    }
    public boolean CardFinder(String strCardValidator) {

		boolean Confirmation = false;

    	try {
   	  		BufferedReader in = new BufferedReader(new FileReader("cards.txt"));

      		String line;

      		int i = 0;

      		while ((line = in.readLine() ) != null) {

      			if (i == 0) {
 					LineHolder += line;
 					i++;
      			}
      			else if (i == 1) {
      				LineHolder += "," + line;
      			}
	  		}

   		} catch (IOException ex) {
   			System.out.println("File Not Found");
   		}

   		lines = LineHolder.split(",");

   		do {
   			Finder = lines[CardSearch];
   			if (Integer.parseInt(Finder) == Integer.parseInt(strCardValidator)) {

   				Confirmation = true;
   				AccountNumber = lines[CardSearch];

   				BalanceSearch = CardSearch + 1;
   				AccountBalance = lines[BalanceSearch];

   			}
   			++CardSearch;

   		} while(Confirmation != true || CardSearch < lines.length);

   		if (Confirmation == true) {
   			return true;
   		}
   		else if(Confirmation == false) {
   			return false;
   		}
   		return false;

    }
    public int[] CardInformation() {

   		int[] Info = {Integer.parseInt(AccountNumber),Integer.parseInt(AccountBalance)};
   		return Info;

    }
    public boolean LengthValidator(String strCardValidator) {
    	if ((strCardValidator.length() > 9) || (strCardValidator.length() < 9)) {
    		return false;
    	}
    	else {
    		return true;
    	}
	}
}
