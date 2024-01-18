package Lab1;
import java.util.Scanner;

public class Grades{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter grade 1-100: ");
        int Grade = S.nextInt();

        if(Grade >= 91){
            System.out.println("A");
        }
        else if(Grade >= 81){
            System.out.println("B");
        }
        else if(Grade >= 71){
            System.out.println("C");
        }
        else if(Grade >= 61){
            System.out.println("D");
        }
        else if(Grade >= 50){
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }
    }
}