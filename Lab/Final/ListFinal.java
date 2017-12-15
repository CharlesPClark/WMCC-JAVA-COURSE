//Final List
//By Charles Clark
//12-21-2015
//Beginner's Java
public class ListFinal {

    public static void main(String[] args) {

        //Declaration of List
        int[] List={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //Declaration of Variable
        int ArrayHolder;

        //Does the Array Backwards, Also Get Remainder of Division 3
        for(int counter=List.length - 1; counter >= 0;counter--) {

    		ArrayHolder = List[counter];
    		System.out.println(ArrayHolder%3);

		}

    }
}



