import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 2) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            } else {
                int count = 0;
                int i = 2;
                while (i * i <= number) {
                    count++;
                    if (number % i == 0) {
                        System.out.println("false " + count);
                        break;
                    }
                    i++;
                }
                if (i * i > number) {
                    count++;
                    System.out.println("true " + count);
                }
            }
        }
        else {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
    }
}
