public class Chap16Part3 {
    /*
    
    do {
        set of statements; -> At least one time
    } while(relational expression);
    
    */    
    public static void main(String[] args) {
        int number = 1;
        do {
        	System.out.println(number);
        	++number;
        } while (number < 11); 
        
    }
}
