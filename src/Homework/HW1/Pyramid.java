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
     *    1 1
    ***   3 2
   *****  5 3
  ******* 7 4

     ask user how tall they want their pyramid
     calculate width based on height

     loop for every layer
        find center of layer
        fill layer with asterisks
        print layer
*/

public class Pyramid {
    public static void main(String[] args){
        System.out.println("Enter height of pyramid: ");
        Scanner Scan = new Scanner(System.in); //create scanner object

        int height = Scan.nextInt(); //get user input
        int width = (height * 2) - 1;    //width is a function of height
        char layer[] = new char[width]; //size of layer will have a max size of width

        Arrays.fill(layer, ' '); //fills layer with spaces

        for(int i = 0; i < height; i++){ //loop for every layer
            int center = (width / 2);  //find center of layer
            Arrays.fill(layer, center - i, center + i + 1, '*'); //fill layer within bounds with asterisks
            System.out.println(layer);
        }
    }
}
