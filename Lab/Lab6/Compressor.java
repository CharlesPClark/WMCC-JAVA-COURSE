//Compressor Lab 6
//By Charles Clark
//12-21-2015
//Beginner's Java

public class Compressor {

    private int counter = 1;
 	//Compress Word Method
	public String compressWord(String Word) {

 		StringBuffer Name = new StringBuffer();

 		char[] charARRAY = Word.toCharArray();

 		char chrLastLetter = charARRAY[0];
		//Checks and Condense CharArray;\
 		for(int i = 1; i  < charARRAY.length; i++){

 			if(charARRAY[i] == chrLastLetter){
 			counter++;
 			}
 				else {
 					if (counter > 1) {
 					Name.append(counter + (chrLastLetter + ""));
 					chrLastLetter = charARRAY[i];
 					counter = 1;
 				}
 				else {
 					Name.append((chrLastLetter + ""));
 					chrLastLetter = charARRAY[i];
 					counter = 1;
 				}


			}
 		}

 		Name.append(counter + (chrLastLetter + ""));

 		if(Name.toString().length() <= Name.length())
 			return Name.toString();
 		else
 			return Word;

}

}
