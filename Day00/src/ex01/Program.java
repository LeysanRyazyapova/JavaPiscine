package ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number == 2)
            System.out.println(true + " 1");
        if(number < 2)
            System.err.println("IllegalArgument");
        int limit = (int)Math.sqrt(number);
        int count = 0;
        int i = 2;
        while(i <= limit) {
            count++;
            if(number % i == 0) {
                System.out.println("false " + count);
                break;
            }
            i++;
        }
        if(i > limit && limit != 0) {
            count++;
            System.out.println("true " + count);
        }
    }
}
