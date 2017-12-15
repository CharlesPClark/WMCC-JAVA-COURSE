//Results Controlled While Loops

public class Chap9Part4 {

    public static void main(String[] args) {
		double balance = 5000;
		double rate = 1.02;
		int year = 0;
		while (balance <= 100000) {
			balance *= rate;
			++year;
		}
		System.out.println("It will take " + year + " years to reach 100000.");
    }
}
