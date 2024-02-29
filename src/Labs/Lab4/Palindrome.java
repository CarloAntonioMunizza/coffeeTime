package Labs.Lab4;

import java.util.Scanner;
/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/
/*
	This program takes a word from the user and determines if it is a palindrome.
	asks the user for a word
	if string equals "quit" the program ends
	then calls the isPalindrome method
	isPalindrome method checks if the word is a palindrome by comparing the first and last letter
	then the second and second to last letter and so on
	prints the result
*/
public class Palindrome {
	public static void main(String[] args) {
		String str = "";
		while(true){
			System.out.println("Type a word to check if it is a palindrome: ");
			Scanner scanner = new Scanner(System.in);
			str = scanner.nextLine();
			if(str.equals("quit") == true){
				break;
			}
			System.out.println(isPalindrome(str));
		}
	}

	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
