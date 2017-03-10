package reverseWords;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;

public class main {
	static String startSentence = "this is my sample";

	public static void main(String[] args) throws IOException {
		separateSentence(startSentence);
	}

	public static void separateSentence(String sentence) throws IOException{
		String[] splitSentence = sentence.split(" ");
		printArray(splitSentence);
		printArrayBackwards(splitSentence, createOutputFile());
	}
	
	
	public static PrintWriter createOutputFile() throws IOException{
	File outFile = new File ("output.txt");
	FileWriter fWriter = new FileWriter (outFile);
	PrintWriter pWriter = new PrintWriter (fWriter);
	return pWriter;
	}


	public static void printArray(String[] myArray){
		for (int i=0; i < myArray.length; i++ ) {
			System.out.println(myArray[i]);
		}
	}
	
	public static void printArrayBackwards(String[] myArray, PrintWriter outputWriter){
		for (int i= (myArray.length-1); i > -1; i-- ) {
			System.out.print(myArray[i] + " ");
			outputWriter.print(myArray[i] + " ");
		}
	}

}