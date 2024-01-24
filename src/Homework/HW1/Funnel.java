/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/
package Homework.HW1;
import java.util.Arrays;
import java.util.Scanner;

/*

  ******* 7 4
   *****  5 3
    ***   3 2
     *    1 1

     ask user how tall they want their funnel
     calculate width based on height
     build top of funnel

     loop for every layer
        carve out left side of funnel
        carve out right side of funnel
        print layer
*/

public class Funnel {
    public static void main(String[] args) {
        System.out.println("Enter height of funnel: ");
        Scanner scan = new Scanner(System.in); // create scanner object

        int height = scan.nextInt(); // get user input
        int width = (height * 2) - 1; // width is a function of height
        char layer[] = new char[width]; // size of layer will have a max size of width

        Arrays.fill(layer, '*'); // fills layer with asterisks
        System.out.println(layer); //prints top of funnel

        for (int i = 0; i < height; i++) { // loop for every layer
            layer[i] = ' '; // shape left side of funnel
            layer[width - i - 1] = ' '; // shape right side of funnel
            System.out.println(layer);
        }
    }
}
