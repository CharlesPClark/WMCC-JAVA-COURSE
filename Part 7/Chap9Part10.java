import java.util.Scanner;

public class Chap9Part10 {
        
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String sentence = "";
       int numVowels = 0;
       System.out.print("Enter a sentence: ");
       sentence = input.nextLine();
       for(int pos = 0; pos < sentence.length(); ++pos) {
          if (sentence.charAt(pos)== 'a')
          	++numVowels;
          if (sentence.charAt(pos)== 'e')
          	++numVowels;
          if (sentence.charAt(pos)== 'i')
          	++numVowels;
          if (sentence.charAt(pos)== 'u')
          	++numVowels;	
          if (sentence.charAt(pos)== 'o')
          	++numVowels;
       }
       System.out.println("There are " + numVowels + " vowels in the sentence. ");
    }
}
