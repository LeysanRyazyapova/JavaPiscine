//package ex00;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        String[] str = args[0].split("=");

        int numberOfRepeat = 0;

        if(str[1].matches("[+-]?\\d+")) {
            numberOfRepeat = Integer.parseInt(str[1]);
        }

        int finalNumberOfRepeat = numberOfRepeat;

        Thread myThread1 = new Thread(new Runnable(){

            @Override
            public void run() {

                for (int i = 0; i < finalNumberOfRepeat; i++) {
                    System.out.println("Egg");
                }

            }
        });

        Thread myThread2 = new Thread(new Runnable(){

            @Override
            public void run() {

                for (int i = 0; i < finalNumberOfRepeat; i++) {
                    System.out.println("Hen");
                }

            }
        });

        myThread1.start();
        myThread2.start();
        myThread2.join();
        myThread1.join();

        for (int i = 0; i < finalNumberOfRepeat; i++) {
            System.out.println("Human");
        }

    }
}
