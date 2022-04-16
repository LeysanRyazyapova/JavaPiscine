package ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        while(number != 42) {
            if(isPrime(sumOfDigits(number)))
                count++;
            number = scanner.nextInt();
        }
        System.out.println("Count of coffee-request - " + count);
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while(number/10 != 0) {
            sum += number % 10;
            number /= 10;
        }
        sum += number;
        return sum;
    }
    public static Boolean isPrime(int number) {
        if(number == 2)
            return true;
        if(number < 2)
            return false;
        int limit = (int)Math.sqrt(number);
        int i = 2;
        while(i <= limit) {
            if(number % i == 0)
                return false;
            i++;
        }
        if(i > limit && limit != 0) {
            return true;
        }
        return true;
    }
}
