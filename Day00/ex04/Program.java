import java.util.Scanner;

public class Program {
    private static final int MAX_SYMBOLS_COUNT = 10;
    private static final int SYMBOLS_IN_UNICODE = 65536;
    private static final int BAR_COUNT = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if(str.length()!= 0) {
                int[] array = new int[SYMBOLS_IN_UNICODE];
                char[] str2 = str.toCharArray();
                for (int i = 0; i < str.length(); i++) {
                    array[(int) str2[i]]++;
                }
                int j = 0;
                int[] countOfSymbols = new int[MAX_SYMBOLS_COUNT];
                char[] symbols = new char[MAX_SYMBOLS_COUNT];
                while (j < MAX_SYMBOLS_COUNT) {
                    int max = array[0];
                    for (int i = 0; i < SYMBOLS_IN_UNICODE; ++i) {
                        if (max < array[i]) {
                            max = array[i];
                            symbols[j] = (char) i;
                        }
                    }
                    countOfSymbols[j] = max;
                    array[(int) symbols[j]] = 0;
                    j++;
                }
                paintGraph(symbols, countOfSymbols);
            } else {
                System.err.println("Empty string");
                System.exit(-1);
            }
        } else {
            System.err.println("Empty string");
            System.exit(-1);
        }

    }
    public static void paintGraph(char[] symbols, int[] countOfSymbols){
        int max = countOfSymbols[0];
        System.out.println();
        System.out.println();
        for(int i = 0; i < MAX_SYMBOLS_COUNT; i++) {
            if(countOfSymbols[i] * BAR_COUNT / max == 10) {
                System.out.print(countOfSymbols[i] + "\t");
            }
        }
        System.out.println();
        for (int i = MAX_SYMBOLS_COUNT; i > 0; i--) {
            for (int j = 0; j < MAX_SYMBOLS_COUNT; j++) {
                if(countOfSymbols[j] != 0) {
                    if (countOfSymbols[j] * BAR_COUNT / max >= i) {
                        System.out.print("#\t");
                    }
                    if (countOfSymbols[j] * BAR_COUNT / max == i - 1) {
                        System.out.print(countOfSymbols[j] + "\t");
                    }
                }
            }
            System.out.println();
        }
        for(int i = 0; i < MAX_SYMBOLS_COUNT; i++) {
            if(countOfSymbols[i] != 0) {
                System.out.print(symbols[i] + "\t");
            }
        }
    }
}
