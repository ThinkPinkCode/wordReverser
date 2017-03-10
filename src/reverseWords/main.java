package reverseWords;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		Scanner myScanner = loadFile();
		int myNumOfCases = pullCaseNumber (myScanner) + 1;

		for (int i=0; i < myNumOfCases; i++) {
			String mySentence = pullSentence(myScanner);
			separateSentence(mySentence);
		}
	}

	public static Scanner loadFile() throws IOException{
		File incomingFile = new File("B-small-practice.txt");
		Scanner scan = new Scanner(incomingFile);
		return scan;
	}

	public static int pullCaseNumber(Scanner scan){
		int numOfCases = scan.nextInt();
		System.out.println("Number of cases:" + numOfCases);
		return numOfCases;
	}

	public static String pullSentence( Scanner scan ){
		String nextSentence = scan.nextLine();
		return nextSentence;
	}

	public static void separateSentence(String sentence) throws IOException{
		String[] splitSentence = sentence.split(" ");
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