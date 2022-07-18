import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] students = new String[10];
        int i = 0;
        if(str.length() > 10) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        students[i] = str;
        while(!(".".equals(str))) {
            if(scanner.hasNext()) {
                str = scanner.nextLine();
                i++;
                if(str.length() > 10) {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                if(i == 10) {
                    System.out.println("Only 10 students. Please enter courses.");
                    break;
                }
                students[i] = str;
            }
        }
        int[] time = new int[10];
        String[] weekdays = new String[10];


    }
}
