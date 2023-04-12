/*
Question : Write a program to print power of given number.
 */
import java.util.Scanner;
public class Main {
    static int PowerFunction(int number, int powerDigit){
        if (powerDigit == 0)return 1;
        int smallans = PowerFunction(number,powerDigit/2);
        if(powerDigit % 2 == 0){
            return smallans * smallans;
        }
        return number * smallans * smallans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,powerDigit;
        System.out.println("Enter the number :");
        number = sc.nextInt();
        System.out.println("Enter the power of that number :");
        powerDigit = sc.nextInt();
        System.out.println("Printing the result of : " + number + "^" + powerDigit);
        System.out.println(PowerFunction(number,powerDigit));
    }
}