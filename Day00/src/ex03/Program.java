package ex03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] weeks = new int[18];
        int[] grades = new int[18];
        int j = 0;
        while(!("42".equals(str)) && j != 18) {
            weeks[j] = scanner.nextInt();
            int min = scanner.nextInt();
            int value = min;
            int i = 1;
            while (i < 5) {
                value = scanner.nextInt();
                if (value < min)
                    min = value;
                i++;
            }
            grades[j] = min;
            j++;
            str = scanner.next();
        }
        for(int i = 1; i < 19; i++) {
            for(int k = 0; k < 18; k++) {
                if(weeks[k] == i) {
                    System.out.print("Week " + i + " ");
                    for(int l = 0; l < grades[k]; l++)
                        System.out.print("=");
                    System.out.println(">");
                }
            }
        }
    }

}
