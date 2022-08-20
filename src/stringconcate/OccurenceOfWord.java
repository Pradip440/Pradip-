package stringconcate;

import java.util.Scanner;

//Java program to count the number of occurrence of a word in the given string
public class OccurenceOfWord {

	static int countOccurrences(String str, String word){
		
		String a[] = str.split(" ");  // split the string by spaces in a

		int count = 0;
		for (int i = 0; i < a.length; i++){
			if (word.equals(a[i])) // if match found increase count
				count++;
		}
		return count;
	}
	
		
	public static void main(String args[]){
		OccurenceOfWord v=new OccurenceOfWord();
		String str = "i am pradip chuadhari am ";
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a word :");
		String word = sc1.nextLine();
		System.out.println("Occurence of word in count is : " + countOccurrences(str, word));
	}
}
