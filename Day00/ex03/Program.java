import java.util.Scanner;

public class Program {
    private static final int MAX_NUMBERS_COUNT = 18;
    private static final int MIN_GRADE = 1;
    private static final int MAX_GRADE = 9;
    private static final int TENS = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int weeks;
        long grades = 0;
        int j = 0;
        while (!("42".equals(str)) && j != 18) {
            if("Week".equals(str) && scanner.hasNextInt()) {
                weeks = scanner.nextInt();
                if (weeks != j + 1) {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                if(scanner.hasNextInt()) {
                    int value = scanner.nextInt();
                    int min = value;
					if(value < MIN_GRADE || value > MAX_GRADE) {
						System.err.println("IllegalArgumnet");
						System.exit(-1);
					}
                    int i = 1;
                    while (i < 5 && scanner.hasNextInt()) {
                        value = scanner.nextInt();
						if(value < MIN_GRADE || value > MAX_GRADE) {
							System.err.println("IllegalArgument");
							System.exit(-1);
						}
                        if (value < min) {
                            min = value;
                        }
                        i++;
                    }
                    grades = grades * TENS + min;
                    j++;
                    if(scanner.hasNext()) {
                        str = scanner.next();
                    } else {
                        System.err.println("IllegalArgument");
                        System.exit(-1);
                    }
                } else {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
            } else {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
        }
        long delimiter = 1;
        while (j > 1) {
            delimiter *= TENS;
            j--;
        }
        for (int i = 1; i <= MAX_NUMBERS_COUNT && delimiter != 0; i++) {
            int grade = (int) (grades / delimiter);
            grades %= delimiter;
            delimiter /= TENS;
            System.out.print("Week ");
			System.out.print(i);
			System.out.print(" ");
            for (int l = 0; l < grade; l++) {
                System.out.print("=");
            }
            System.out.println(">");
        }
    }
}
