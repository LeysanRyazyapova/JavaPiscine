package ex04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] array = new int[65535];
        char[] str2 = str.toCharArray();
        for(int i = 0; i < str.length(); i++) {
            array[(int)str2[i]]++;
        }
        for (int i = 0; i < 65535; i++) {
            if(array[i] != 0)
                System.out.println("*" + (char)i + " " + array[i]);
        }
        int j = 0;
        int k = 0;
        int[] array2 = new int[10];
        while(j < 10) {
            int max = array[0];
            for (int i = 0; i < 65535; ++i) {
                if (max < array[i]) {
                    max = array[i];
                    k = i;
                }
            }
            array2[j] = max;
            array[k] = 0;
            j++;
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
        int[][] array3 = new int[10][10];
        for(int i = 0; i < 10; i++) {
            for(int l = 0; l < array2[i]; l++) {

            }
        }
    }
}
