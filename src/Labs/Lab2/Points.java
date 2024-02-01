/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

package Labs.Lab2;
import java.util.Scanner;
import java.util.ArrayList;

/*
	create scanner object
	create index variable
	create sum variable
	create array list

	loop forever
		ask user for a number and add it to array list
		check if number is -1
			if it is break
		add number to sum
	print sum
*/

public class Points{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in); //create scanner object

		int sum = 0; //create sum variable
		int index = 0; //create index variable

		ArrayList<Integer> grades = new ArrayList<Integer>(); //create array list

		System.out.println("Enter a all your grades: ");

		while(true){ //loop forever
		    grades.add(index, S.nextInt()); //get user input
			if(grades.get(index) == -1) break; //if user enters -1 break
			sum += grades.get(index); //add number to sum
		}

		System.out.printf("Total Points: %d\n", sum); //print sum
	}
}
