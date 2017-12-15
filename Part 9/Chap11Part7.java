import java.util.Random;
import java.util.ArrayList;

public class Chap11Part7 {

    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 100; ++i)
        	numbers.add((rand.nextInt(101)));
      /*if (numbers.indexOf(100) >= 0)
        	System.out.println("100 was found at position " + numbers.indexOf(100)); */
        	
      /*if (numbers.contains(100) == true)
        	System.out.println("100 was found at position " + numbers.indexOf(100));
        else
        	System.out.println("100 was not found in numbers."); */
       int min = 0;
       for (int i = 0; i < numbers.size(); ++i)
         if (numbers.get(i) < numbers.get(min))
         	min = i;
       System.out.println("The minimun value is numbers is " + numbers.get(min));
       
    }
}
