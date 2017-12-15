//Homework Part 3
//By Charles Clark
//12-21-2015
//Beginner's Java

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class HW3 {

    public static void main(String[] args) {

    	//Declaration of Object Classes
    	Scanner input = new Scanner(System.in);
    	Scanner inputPrice = new Scanner(System.in);
    	DecimalFormat DecimalFormatter = new DecimalFormat("##.##");
    	CoinDispenser CoinManager = new CoinDispenser();
    	CardReader ReaderManager = new CardReader();

    	//Declaration of Variables
    	String strSoldOut = "SOLD OUT";

    	String strPosition1 = "Sour Patch";
    	String strPosition2 = "Milky Way";
    	String strPosition3 = "LAYs Potato Chips";
    	String strPosition4 = "KitKat";
    	String strPosition5 = "Swedish Fish";
    	String strPosition6 = "Skittles";
    	String strPosition7 = "Junior Mints";
    	String strPosition8 = "Great Value Tortilla Chips";
    	String strPosition9 = "Cheetos";
    	String strPosition10 = "Fritos";
    	String strPosition11 = "Doritos";
    	String strPosition12 = "Santitas";

    	double dblPosition1 = 1.00;
    	double dblPosition2 = 1.00;
    	double dblPosition3 = 1.00;
    	double dblPosition4 = 1.00;
    	double dblPosition5 = 1.00;
    	double dblPosition6 = 1.00;
    	double dblPosition7 = 1.00;
    	double dblPosition8 = 1.00;
    	double dblPosition9 = 1.00;
    	double dblPosition10 = 1.00;
    	double dblPosition11 = 1.00;
    	double dblPosition12 = 1.00;

    	double dblPriceChange = 0;
    	double dblPriceCheck = 0;

    	int intTotalPosition1 = 10;
    	int intTotalPosition2 = 10;
    	int intTotalPosition3 = 0;
    	int intTotalPosition4 = 10;
    	int intTotalPosition5 = 10;
    	int intTotalPosition6 = 10;
    	int intTotalPosition7 = 10;
    	int intTotalPosition8 = 0;
    	int intTotalPosition9 = 0;
    	int intTotalPosition10 = 0;
    	int intTotalPosition11 = 0;
    	int intTotalPosition12 = 0;

    	final double NICKEL = .05;
    	int intAmountNCredit = 0;
    	int intAmountNTotal = 0;

    	final double DIME = .10;
    	int intAmountDCredit = 0;
    	int intAmountDTotal = 0;

    	final double QUARTER = .25;
    	int intAmountQCredit = 0;
    	int intAmountQTotal = 0;

    	final double DOLLAR = 1.00;
    	int intAmountDOCredit = 0;
    	int intAmountDOTotal = 0;

    	double dblCurrentCredit = 0.00;

    	int[] intAAcount;
    	int intAccount = 000000000;
    	int intTotalDebit = 0000;
    	String strValidator;
    	double dblCardBalance = 0.00;
    	boolean Confirmation = false;


    	int intChoice = 0;

    	int[] intAChange;
    	int RemainderDo;
    	int RemainderDi;
    	int RemainderNi;
    	int RemainderQu;

		do {
			System.out.println("-----------------------------------------------");
			System.out.println("Welcome to the Charles Clark Vending Machine.");
			if (intTotalPosition1 == 0)
				System.out.println("1. " + strSoldOut);
			else {
				System.out.print("1. " + strPosition1 + " --- Price: $");
				System.out.printf("%.2f", dblPosition1);
				System.out.println();
			}
			if (intTotalPosition2 == 0)
				System.out.println("2. " + strSoldOut);
			else {
				System.out.print("2. " + strPosition2 + " --- Price: $");
				System.out.printf("%.2f", dblPosition2);
				System.out.println();
			}
			if (intTotalPosition3 == 0)
				System.out.println("3. " + strSoldOut );
			else {
				System.out.print("3. " + strPosition3 + " --- Price: $");
				System.out.printf("%.2f", dblPosition3);
				System.out.println();
			}
			if (intTotalPosition4 == 0)
				System.out.println("4. " + strSoldOut);
			else {
				System.out.print("4. " + strPosition4 + " --- Price: $");
				System.out.printf("%.2f", dblPosition4);
				System.out.println();
			}
			if (intTotalPosition5 == 0)
				System.out.println("5. " + strSoldOut);
			else {
				System.out.print("5. " + strPosition5 + " --- Price: $");
				System.out.printf("%.2f", dblPosition5);
				System.out.println();
			}
			if (intTotalPosition6 == 0)
				System.out.println("6. " + strSoldOut);
			else {
				System.out.print("6. " + strPosition6 + " --- Price: $");
				System.out.printf("%.2f", dblPosition6);
				System.out.println();
			}
			if (intTotalPosition7 == 0)
				System.out.println("7. " + strSoldOut);
			else {
				System.out.print("7. " + strPosition7 + " --- Price: $");
				System.out.printf("%.2f", dblPosition7);
				System.out.println();
			}
			if (intTotalPosition8 == 0)
				System.out.println("8. " + strSoldOut);
			else {
				System.out.print("8. " + strPosition8 + " --- Price: $");
				System.out.printf("%.2f", dblPosition8);
				System.out.println();
			}
			if (intTotalPosition9 == 0)
				System.out.println("9. " + strSoldOut);
			else {
				System.out.print("9. " + strPosition9 + " --- Price: $");
				System.out.printf("%.2f", dblPosition9);
				System.out.println();
			}
			if (intTotalPosition10 == 0)
				System.out.println("10. " +strSoldOut);
			else {
				System.out.print("10. " + strPosition10 + " --- Price: $");
				System.out.printf("%.2f", dblPosition10);
				System.out.println();
			}
			if (intTotalPosition11 == 0)
				System.out.println("11. " + strSoldOut);
			else {
				System.out.print("11. " + strPosition11 + " --- Price: $");
				System.out.printf("%.2f", dblPosition11);
				System.out.println();
			}
			if (intTotalPosition12 == 0)
				System.out.println("12. " + strSoldOut);
			else {
				System.out.print("12. " + strPosition12 + " --- Price: $");
				System.out.printf("%.2f", dblPosition12);
				System.out.println();
			}
			System.out.println();
			System.out.print("Current Credit: $");
			System.out.printf("%.2f", dblCurrentCredit);
			System.out.println();
			if (dblCardBalance == 0.00) {
				System.out.println("Card Balance: INSERT CARD");
			}
			else {
				System.out.print("Card Balance: $");
				System.out.printf("%.2f", dblCardBalance);
				System.out.println();
			}
			System.out.println("ADDITIONAL STATUS INFORMATION HERE");
			System.out.println("-----------------------------------------------");
			System.out.println("Main Menu");
			System.out.println();
			System.out.println("1)Deposit Coin" + "\n" + "2)Insert Card"+ "\n" + "3)Purchase item"+ "\n" + "4)Cancel"+ "\n" + "5)Service Mode"+ "\n" + "6)End");
			System.out.print("Choose The Following Options:");
			intChoice = input.nextInt();
			//Insert Credit
			if (intChoice == 1) {
				do {
					intChoice = 0;
					System.out.println("-----------------------------------------------");
					System.out.println("Insert Coin Menu");
					System.out.println();
					System.out.println("1)Nickel");
					System.out.println("2)Dime");
					System.out.println("3)Quarter");
					System.out.println("4)Dollar");
					System.out.println("5)Return To Main Menu");
					System.out.println();
					System.out.print("Current Credit: $");
					System.out.printf("%.2f", dblCurrentCredit);
					System.out.println();
					System.out.print("Choose The Following Options:");

					intChoice = input.nextInt();

					if (intChoice == 1) {
						++intAmountNCredit;
						dblCurrentCredit += NICKEL;
						CoinManager.addNickels(1);
					}
					else if (intChoice == 2) {
						++intAmountDCredit;
						dblCurrentCredit += DIME;
						CoinManager.addDimes(1);
					}
					else if (intChoice == 3) {
						++intAmountQCredit;
						dblCurrentCredit += QUARTER;
						CoinManager.addQuarters(1);
					}
					else if (intChoice == 4) {
						++intAmountDOCredit;
						dblCurrentCredit += DOLLAR;
						CoinManager.addDollars(1);
					}

				} while (intChoice != 5);
			}
			//Debit Card Reader
			else if (intChoice == 2) {
				System.out.println("-----------------------------------------------");
				System.out.println("Debit Card Reader");
				if (Confirmation == false) {
					System.out.print("Please enter a valid Debit Card:");
					strValidator = input.next();
					if (ReaderManager.LengthValidator(strValidator) == false) {
						System.out.println("We are sorry...The Debit Card is Invalid!");
					}
					else if (ReaderManager.LengthValidator(strValidator)== true) {
						if (ReaderManager.CardFinder(strValidator)==true) {
							Confirmation = true;
							intAAcount = ReaderManager.CardInformation();
							dblCardBalance = (((double)intAAcount[1])/100);
							System.out.println("Your Account Number is: " + intAAcount[0]);
							System.out.print("Your Balance is: $");
							System.out.printf("%.2f", dblCardBalance);
							intAccount = intAAcount[0];
						}
						else {
							System.out.println("We're Sorry!We can't find your Debit Card!");
						}

					}
				}
				else if (Confirmation == true) {
					System.out.println("1)Yes");
					System.out.println("2)No");
					System.out.print("Do you wish to Log Out?");
					intChoice = input.nextInt();
						if (intChoice == 1) {
							Confirmation = false;
							intAccount = 0;
							dblCardBalance = 0.00;
						}
						else if (intChoice == 2) {
							System.out.println();
							System.out.println("1)Yes");
							System.out.println("2)No");
							System.out.println("Do you wish to get balance?");
							intChoice = input.nextInt();
								if (intChoice == 1) {
									intTotalDebit = ReaderManager.getBalance(intAccount);
									dblCardBalance = (((double)intTotalDebit)/100);
									System.out.print("Your Balance: $");
									System.out.printf("%.2f", dblCardBalance);
								}
						}

				}
				try {
					Thread.sleep(2000);
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}

			}
			//Decide to Choose A purchase
			else if (intChoice == 3) {
				intChoice = 0;
				System.out.print("Please Choose a Purchase:");
				intChoice = input.nextInt();
				boolean CheckFunds = false;
				CheckFunds = (ReaderManager.hasFunds(intAccount,((int)((dblCardBalance)*100))));
				if (intChoice == 1) {
					if (intTotalPosition1 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition1;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition1;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition1) {
							dblCurrentCredit -= dblPosition1;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition1;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 2) {
					if (intTotalPosition2 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition2;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition2;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition2) {
							dblCurrentCredit -= dblPosition2;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition2;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 3) {
					if (intTotalPosition3 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition3;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition3;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition3) {
							dblCurrentCredit -= dblPosition3;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition3;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 4) {
					if (intTotalPosition4 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition4;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition4;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition4) {
							dblCurrentCredit -= dblPosition4;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition4;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 5) {
					if (intTotalPosition5 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition5;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition5;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition5) {
							dblCurrentCredit -= dblPosition5;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition5;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
									Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 6) {
					if (intTotalPosition6 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition6;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition6;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition6) {
							dblCurrentCredit -= dblPosition6;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition6;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 7) {
					if (intTotalPosition7 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition7;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition7;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition7) {
							dblCurrentCredit -= dblPosition7;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition7;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 8) {
					if (intTotalPosition8 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition8;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition8;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
								}
							}
							else if (dblCurrentCredit >= dblPosition8) {
								dblCurrentCredit -= dblPosition8;
								System.out.println("Thank You For Your Purchase!");
								--intTotalPosition8;
								try {
									Thread.sleep(2000);
								} catch(InterruptedException ex) {
									Thread.currentThread().interrupt();
								}

							}
							else {
								System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 9) {
					if (intTotalPosition9 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition9;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition9;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition9) {
							dblCurrentCredit -= dblPosition9;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition9;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 10) {
					if (intTotalPosition10 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition10;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition10;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						if (dblCurrentCredit >= dblPosition10) {
							dblCurrentCredit -= dblPosition10;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition10;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 11) {
					if (intTotalPosition11 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition11;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition11;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition11) {
							dblCurrentCredit -= dblPosition11;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition11;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
				else if (intChoice == 12) {
					if (intTotalPosition12 != 0) {
						if (CheckFunds==true) {
							dblCardBalance -= dblPosition12;
							intTotalDebit = ((int)((dblCardBalance)*100));
							ReaderManager.debit(intAccount,intTotalDebit);
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition12;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
						else if (dblCurrentCredit >= dblPosition12) {
							dblCurrentCredit -= dblPosition12;
							System.out.println("Thank You For Your Purchase!");
							--intTotalPosition12;
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}

						}
						else {
							System.out.println("Error! Not enough Credit!");
							try {
								Thread.sleep(2000);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}
						}
					}
					else {
						System.out.println("Sold Out! We are Sorry!");
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}
					}
				}
			}
			//Cancel Credit
			else if (intChoice == 4) {
				if (CoinManager.canMakeChange((int)(dblCurrentCredit*100)) == true) {
					System.out.println("Giving Credit Back.");
					intAChange = CoinManager.makeChange(((int)(dblCurrentCredit*100)));
					dblCurrentCredit = 0.00;

					RemainderDo = intAChange[0];
					RemainderQu = intAChange[1];
					RemainderDi = intAChange[2];
					RemainderNi = intAChange[3];

					System.out.println("Returned Dollars: " + RemainderDo);
					System.out.println("Returned Quarters: " + RemainderQu);
					System.out.println("Returned Dimes: " + RemainderDi);
					System.out.println("Returned Nickels: " + RemainderNi);
				}
				else if (CoinManager.canMakeChange((int)(dblCurrentCredit*100)) == false) {
					System.out.println("We are sorry...We can't make change at the moment. Pleae Report to Maintenance.");
				}

				try {
					Thread.sleep(2000);
				} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
				}
			}
			//Service Menu
			else if (intChoice == 5) {
				do {

					intChoice = 0;
					System.out.println("-----------------------------------------------");
					System.out.println("Service Mode");
					System.out.println();
					System.out.println("1)Loard Coin");
					System.out.println("2)Empty Coins");
					System.out.println("3)Load Item");
					System.out.println("4)Set Price");
					System.out.println("5)Finish");
					System.out.print("Choose The Following Options:");

					intChoice = input.nextInt();

					if (intChoice == 1) {

						do {
							intChoice = 0;
							System.out.println("-----------------------------------------------");
							System.out.println("Vending Machine Coin Storage");
							System.out.println("1)Nickels: " + CoinManager.getNickels());
							System.out.println("2)Dimes: " + CoinManager.getDimes());
							System.out.println("3)Quarters: " + CoinManager.getQuarters());
							System.out.println("4)Dollars: " + CoinManager.getQuarters());
							System.out.println("5)Cancel Coin Restock");
							System.out.print("Choose which coin to restock:");
							intChoice = input.nextInt();

							if (intChoice == 1) {
							System.out.print("How many nickels do you want to add:");
							intChoice = input.nextInt();
							CoinManager.addNickels(intChoice);
							}

							else if (intChoice == 2) {
							System.out.print("How many dimes do you want to add:");
							intChoice = input.nextInt();
							CoinManager.addDimes(intChoice);
							}

							else if (intChoice == 3) {
							System.out.print("How many quarters do you want to add:");
							intChoice = input.nextInt();
							CoinManager.addQuarters(intChoice);
							}

							else if (intChoice == 4) {
							System.out.print("How many dollars do you want to add:");
							intChoice = input.nextInt();
							CoinManager.addDollars(intChoice);
							}

						} while (intChoice != 5);

					}
					else if(intChoice == 2) {
						System.out.println();
						System.out.println("Emptying Coins From Vending Machine...");
						intAChange = CoinManager.empty();
						System.out.println("Total Dollars Emptied: " + intAChange[0]);
						System.out.println("Total Quarters Emptied: " + intAChange[1]);
						System.out.println("Total Dimes Emptied: " + intAChange[2]);
						System.out.println("Total Nickels Emptied: " + intAChange[3]);
						try {
							Thread.sleep(2000);
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						}

					}

					else if(intChoice == 3) {
						do {
							System.out.println();
							System.out.println("-----------------------------------------------");
							System.out.println("Vending Machine Stock");

							System.out.println("1)" + strPosition1 + " - Total:" + intTotalPosition1);
							System.out.println("2)" + strPosition2 + " - Total:" + intTotalPosition2);
							System.out.println("3)" + strPosition3 + " - Total:" + intTotalPosition3);
							System.out.println("4)" + strPosition4 + " - Total:" + intTotalPosition4);
							System.out.println("5)" + strPosition5 + " - Total:" + intTotalPosition5);
							System.out.println("6)" + strPosition6 + " - Total:" + intTotalPosition6);
							System.out.println("7)" + strPosition7 + " - Total:" + intTotalPosition7);
							System.out.println("8)" + strPosition8 + " - Total:" + intTotalPosition8);
							System.out.println("9)" + strPosition9 + " - Total:" + intTotalPosition9);
							System.out.println("10)" + strPosition10 + " - Total:" + intTotalPosition10);
							System.out.println("11)" + strPosition11 + " - Total:" + intTotalPosition11);
							System.out.println("12)" + strPosition12 + " - Total:" + intTotalPosition12);
							System.out.println("13) Cancel To Restock Items");
							System.out.print("Choose an Item to Load Into Vending Machine:");
							intChoice = 0;
							intChoice = input.nextInt();

							if (intChoice == 1) {
								++intTotalPosition1;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 2) {
								++intTotalPosition2;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 3) {
								++intTotalPosition3;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 4) {
								++intTotalPosition4;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 5) {
								++intTotalPosition5;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 6) {
								++intTotalPosition6;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 7) {
								++intTotalPosition7;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 8) {
								++intTotalPosition8;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 9) {
								++intTotalPosition9;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 10) {
								++intTotalPosition10;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 11) {
								++intTotalPosition11;
								System.out.println("Please Wait...Loading...");
							}
							else if (intChoice == 12) {
								++intTotalPosition12;
								System.out.println("Please Wait...Loading...");
							}
						} while (intChoice != 13);
					}
					else if(intChoice == 4) {

						intChoice = 0;
						System.out.println("-----------------------------------------------");
						System.out.println("Vending Machine Pricing");
						System.out.println();
						System.out.print("1)" + strPosition1 + " - Price: $");
						System.out.printf("%.2f", dblPosition1);
						System.out.println();
						System.out.print("2)" + strPosition2 + " - Price: $");
						System.out.printf("%.2f", dblPosition2);
						System.out.println();
						System.out.print("3)" + strPosition3 + " - Price: $");
						System.out.printf("%.2f", dblPosition3);
						System.out.println();
						System.out.print("4)" + strPosition4 + " - Price: $");
						System.out.printf("%.2f", dblPosition4);
						System.out.println();
						System.out.print("5)" + strPosition5 + " - Price: $");
						System.out.printf("%.2f", dblPosition5);
						System.out.println();
						System.out.print("6)" + strPosition6 + " - Price: $");
						System.out.printf("%.2f", dblPosition6);
						System.out.println();
						System.out.print("7)" + strPosition7 + " - Price: $");
						System.out.printf("%.2f", dblPosition7);
						System.out.println();
						System.out.print("8)" + strPosition8 + " - Price: $");
						System.out.printf("%.2f", dblPosition8);
						System.out.println();
						System.out.print("9)" + strPosition9 + " - Price: $");
						System.out.printf("%.2f", dblPosition9);
						System.out.println();
						System.out.print("10)" + strPosition10 + " - Price: $");
						System.out.printf("%.2f", dblPosition10);
						System.out.println();
						System.out.print("11)" + strPosition11 + " - Price: $");
						System.out.printf("%.2f", dblPosition11);
						System.out.println();
						System.out.print("12)" + strPosition12 + " - Price: $");
						System.out.printf("%.2f", dblPosition12);
						System.out.println();
						System.out.println("13)Cancel Price Change");

						System.out.println();

						System.out.print("Choose Product to Change Price:");
						intChoice = input.nextInt();

						if (intChoice == 1) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition1 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition1);
							System.out.println();
							System.out.println("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 2) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition2 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition2);
							System.out.println();
							System.out.println("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 3) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition3 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition3);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 4) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition4 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition4);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 5) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition5 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition5);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 6) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition6 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition6);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 7) {
							System.out.println("-----------------------------------------------");
							System.out.print("1)" + strPosition7 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition7);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 8) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition8 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition8);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 9) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition9 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition9);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 10) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition10 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition10);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}
						else if (intChoice == 11) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition11 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition11);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;

						}
						else if (intChoice == 12) {
							System.out.println("-----------------------------------------------");
							System.out.print(strPosition12 + " - Original Price: $");
							System.out.printf("%.2f", dblPosition12);
							System.out.println();
							System.out.print("Please Change Price:$");
							dblPriceCheck = inputPrice.nextDouble();
							dblPriceCheck = Double.parseDouble((DecimalFormatter.format(dblPriceCheck)));
							dblPosition1 = dblPriceCheck;
							System.out.println("Please Wait...Loading...");
						}

					}

					try {
						Thread.sleep(2000);
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					}


				} while (intChoice != 5);
			}

		}	while (intChoice != 6);


    }
}



