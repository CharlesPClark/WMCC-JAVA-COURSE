//For Loop Part 2

public class Chap9Part6 {
        
    public static void main(String[] args) {
       //Standard Loop
       double balance = 5000;
       double rate = 1.02;
       int i = 1;
       for(; i <= 10;) {
       	balance *= rate;
       	++i;
       }
       System.out.println("The balance after 10 year is " + balance);
    }
}
