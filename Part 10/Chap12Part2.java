public class Chap12Part2 {
        
    public static void main(String[] args) {
        Time theTime = new Time(9,1,0);
        System.out.println(theTime.toString());
        System.out.println(theTime.display());
        theTime.increment(59);
        System.out.println(theTime.display());	
    }
}
