package Lab1;
import java.util.Scanner;

public class Average{
    public static void main(String[] args){

        Scanner S = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i<5; i++){
            System.out.println("Enter Number: ");
            int num = S.nextInt();
            sum += num;
        }
        float Avg = (float)sum / 5;
        System.out.println(Avg);

    }
}