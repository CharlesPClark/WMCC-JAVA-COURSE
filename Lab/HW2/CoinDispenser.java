//Homework Part 2 Coin Dispenser
//By Charles Clark
//12-21-2015
//Beginner's Java

public class CoinDispenser {
	
	private int numNickels;
	private int numDimes;
	private int numQuarters;
	private int numDollars;

	private int MaxTotal;
	
	public int getNickels() {
		return numNickels;
	}
	public int getDimes() {
		return numDimes;
	}
	public int getQuarters() {
		return numQuarters;
	}
	public int getDollars() {
		return numDollars;
	}
	
    public CoinDispenser() {
    	numNickels = 10;
    	numDimes = 10;
    	numQuarters = 10;
    	numDollars = 10;
    }
    
    public void addNickels(int n) {
    	numNickels += n;
    }
    
    public void addDimes(int d) {
    	numDimes += d;
    }
    
    public void addQuarters(int q) {
    	numQuarters += q;	
    }
    
    public void addDollars(int dO) {
    	numDollars += dO;
    }
    
	//Checks If it can even make change
    public boolean canMakeChange(int amount) {
    	
    	MaxTotal = (numNickels * 5) + (numDimes * 10) + (numDollars * 100) + (numQuarters * 25);	
    	
    	if (amount < MaxTotal) {
    		return true;
    	}
    	else if (amount > MaxTotal) {
    		return false;
    	}
    		return false;
    		
    }
    
	//Make Change For User
    public int[] makeChange(int amount) {
    	
    	int returnDollars = 0;
		int returnDimes = 0;
		int returnQuarters = 0;
		int returnNickels = 0;
		
		do {	
    		if ((amount >= 100) && (numDollars!=0)) {
    			amount = amount - 100;	
    			--numDollars;
    			++returnDollars;
    		}
    		else if ((amount >= 25) && (numQuarters!=0)) {
    			amount = amount - 25;
    			--numQuarters;
    			++returnQuarters;	
    		}
    		else if ((amount > 10) && (numDimes!=0)) {
    			amount = amount - 10;
    			--numDimes;
    			++returnDimes;		
    		}
    		else if ((amount >= 5) && (numNickels!=0)) {
    			amount = amount - 5;
    			--numNickels;
    			++returnNickels;
    		}
		} while (amount != 0);
    	
    	
    	int[] Change = {returnDollars,returnQuarters,returnDimes,returnNickels};
    	return Change;
    }
    
    //Empties Vending Machine Coins
    public int[] empty() {
    	
    	int numTotal;
    	
    	
    	int emptyDollars = 0;
		int emptyDimes = 0;
		int emptyQuarters = 0;
		int emptyNickels = 0;
    	 
    	do {
    		
    		numTotal = numDimes + numDollars + numNickels + numQuarters;
    		
    		if (numNickels != 0) {
    			--numNickels;
    			++emptyNickels;
    		}
    		else if (numDimes != 0) {
    			--numDimes;
    			++emptyDimes;
    		}
    		else if (numQuarters != 0) {
    			--numQuarters;
    			++emptyQuarters;
    		}
    		else if (numDollars != 0) {
    			--numDollars;
    			++emptyDollars;
    		}
    		
    	} while (numTotal != 0);
    	
    	int[] Empty = {emptyDollars,emptyQuarters,emptyDimes,emptyNickels};
    	return Empty;
    	
    }
    
    
}