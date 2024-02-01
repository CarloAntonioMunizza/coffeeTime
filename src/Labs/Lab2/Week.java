/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/

package Labs.Lab2;
import java.util.Scanner;

/*
	create 2d array of size days mon tue wed thu and tot and weeks
	create array average
	create scanner object

	loop for every week
		print enter scores for week
		initialize total to 0

		loop for every day - 1
			prompt user for score
			add score to total
		add total to last element of week
	print header

	loop for every week
		print week number

		loop for every day
			print score
	print average for mon tue wed thu and tot
*/

public class Week{
	public static void main(String[] args) {
		int day = 4;
		int week = 2;

		int score[][] = new int [week][day + 1]; //initialize 2d array with size of days + 1 and weeks
		float average[] = new float [day + 1]; //initialize array average with size of days + 1

		Scanner S = new Scanner(System.in); //create scanner object

		for(int i = 0; i < week; i++){ //loop for every week
			System.out.printf("Enter scores for week %d:\n", i + 1);
			int total = 0; //initialize total to 0

			for(int j = 0; j < day; j++){ //loop for every day
				score[i][j] = S.nextInt(); //prompt user for score
				total += score[i][j]; //add score to total
			}
			score[i][day] = total; //add total to last element of week
		}

		System.out.printf("%9s %4s %4s %4s %4s %4s \n", " ", "Mon", "Tue", "Wed", "Thu", "Tot");

		for(int i = 0; i < week; i++){ //loop for every week
			System.out.printf("Week %2d:", i + 1);

			for(int j = 0; j < day + 1; j++) { // loop for every day
				System.out.printf("%5d", score[i][j]);
				average[j] += score[i][j]; //add score to average
			}
			System.out.println();
		}

		System.out.printf("Average:");
		for (int i = 0; i < day + 1; i++) { //loop for every day
			System.out.printf("%5.2f", average[i] / (float)week); //print average cast week to float
		}
	}
}
