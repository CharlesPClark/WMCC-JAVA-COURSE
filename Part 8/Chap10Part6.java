public class Chap10Part6 {
        
    public static void main(String[] args) {
    	//Original Value
    	int number = 12;
    	//Will Make A Copy of the arguement to pass into square
    	System.out.println("number squared: " + square(number));
    	//Will print original number
    	System.out.println("original number: " + number);
    }
    //This is a parameter that is a copy of number
    static int square(int num) {
    	num *= num;
    	System.out.println("num in square method: " + num);
    	return num;
    }
}
