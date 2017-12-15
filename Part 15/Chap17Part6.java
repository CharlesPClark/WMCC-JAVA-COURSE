import java.io.*;

public class Chap17Part6 {
        

    public static void main(String[] args) throws IOException {
       String InputFile = "chars.txt";
       String outputFile = "chars.bak";
       FileReader inFile = new FileReader(InputFile);
       FileWriter outFile = new FileWriter(outputFile);
       int ch = 0;
       ch = inFile.read();
       while (ch != -1) {
       		outFile.write(ch);
       		ch = inFile.read();       		
       }
       outFile.close();
       inFile.close();
    }
}
