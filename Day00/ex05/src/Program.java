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
                if(i == 10 && !(".".equals(str = scanner.nextLine()))) {
                    System.out.println("Only 10 courses. Please enter attendance.");
                }
                if(!".".equals(str))
                    students[i] = str;
            }
        }
        int[] time = new int[10];
        String[] weekdays = new String[10];
        i = 0;
        if(scanner.hasNextInt()) {
            time[i] = scanner.nextInt();
            weekdays[i] = scanner.next();
            i++;
        }
        while(scanner.hasNextInt() && i != 10) {
            if(scanner.hasNextInt()) {
                time[i] = scanner.nextInt();
                weekdays[i] = scanner.next();
                if(time[i] < 1 || time[i] > 6) {
                    System.err.println("Time have to be between 1 and 6");
                    System.exit(-1);
                }
                i++;
            }
        }
        str = scanner.next();
        if(i == 10 && !(scanner.hasNext() && ".".equals(str))) {
            System.out.println("Only 10 courses. Please enter attendance.");
        }
        if(i < 10 && !(".".equals(str))) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        String[] dates = createDates(time, weekdays);
        str = scanner.next();
        while(!(".".equals(str))) {
            if(!studInArray(students, str)) {
                System.err.println("Student not in the students list");
                System.exit(-1);
            }
            int readTime = scanner.nextInt();
            int readWeekDay = scanner.nextInt();
            if(readTime < 1 || readTime > 6 || readWeekDay < 1 || readWeekDay > 30) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            if(!courseInArray(time, weekdays, readTime, readWeekDay)) {
                System.err.println("No classes at this time");
                System.exit(-1);
            }
            String tmpStr = readTime + ":00 " + weekdays + " " +
        }


    }
    public static Boolean studInArray(String[] students, String name) {
        for(String stud: students) {
            if(name.equals(stud))
                return true;
        }
        return false;
    }
    public static Boolean courseInArray(int[] time, String[] weekdays, int t, int day) {
        String[] daysOfWeek = new String[]{"MO", "TU", "WE", "TH", "FR", "SA", "SU"};
        int date = day % 7;
        String weekday = daysOfWeek[date];
        for(int i = 0; i < 10; i++) {
            if(time[i] == 0)
                break;
            if(t == time[i] && weekdays[i].equals(weekday) ) {
                return true;
            }
        }
        return false;
    }
    public static String[] createDates(int[] time, String[] weekdays) {
        int count = 0;
        String[] daysOfWeek = new String[]{"MO", "TU", "WE", "TH", "FR", "SA", "SU"};
        for(int j = 0; j < 10; j++) {
            if(time[j] == 0)
                break;
            for (int i = 1; i < 31; i++) {
                if (weekdays[j].equals(daysOfWeek[i % 7])) {
                    count++;
                    i+=6;
                }
            }
        }
        String[] dates = new String[count];
        int k = 0;
        for(int j = 0; j < 10; j++) {
            if(time[j] == 0)
                break;
            for (int i = 1; i < 31; i++) {
                if (weekdays[j].equals(daysOfWeek[i % 7])) {
                    dates[k] = time[j] + ":00 " + weekdays[j] + " " + i;
                    i += 6;
                }
            }
        }
        return dates;
    }
}
