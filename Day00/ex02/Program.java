import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int count = 0;
            while (number != 42) {
                if (isPrime(sumOfDigits(number)))
                    count++;
                number = scanner.nextInt();
            }
            System.out.println("Count of coffee-request - " + count);
        } else {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        if(number < 0) {
            number = -number;
        }
        while(number/10 != 0) {
            sum += number % 10;
            number /= 10;
        }
        sum += number;
        return sum;
    }
    public static Boolean isPrime(int number) {
        if(number < 2) {
            System.err.println();
            return false;
        }
        int i = 2;
        while(i * i <= number) {
            if(number % i == 0) {
                return false;
            }
            i++;
        }
        if(i * i > number) {
            return true;
        }
        return true;
    }
}
