/*
Carlo Munizza Cam7134@psu.edu.
I declare that what has been written in this work has been written by me and that
no part has been copied from scientific publications, the Internet or from other
online sources or was already presented in the academic field by me or by other
students.
*/
package Homework.HW1;

/*
      *     1 1
     ***    3 2
    *****   5 3
   *******  7 4
    *****   5 5
     ***    3 6
      *     1 7

        ask user how tall they want their diamond
        calculate width based on height

                * he never told us what he wanted the user to input so i assumed height
                * that turned out to have ambiguity as you see for example even numbers dont work with how he wants the diamond to look
                * so i added a check to see if height is even and if it is i add 1 to make it odd

        loop till halfway point of diamond
            fill layer with asterisks
            print layer

        loop till end of diamond
            carve out left side of diamond
            carve out right side of diamond
            print layer
*/

import java.util.Arrays;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        System.out.println("Enter height of diamond (smallest can be is 2): ");
        Scanner Scan = new Scanner(System.in); //create scanner object

        int height = Scan.nextInt(); //get user input
        if(height % 2 == 0){ //if height is even, add 1 to make it odd
            height++;
        }
        char layer[] = new char[height]; //size of layer will have a max size of width

        Arrays.fill(layer, ' '); //fills layer with spaces

        for(int i = 0; i < height / 2; i++){ //loop for every layer
            Arrays.fill(layer, (height / 2) - i, (height / 2) + i + 1, '*'); //fill layer within bounds with asterisks
            System.out.println(layer);
        }

        Arrays.fill(layer, '*'); // fills layer with asterisks
        System.out.println(layer); //prints middle of diamond

        for (int i = 0; i < height; i++) { // loop for end of diamond
            layer[i] = ' '; // shape left side of funnel
            layer[height - i - 1] = ' '; // shape right side of funnel
            System.out.println(layer);
        }
    }
}
