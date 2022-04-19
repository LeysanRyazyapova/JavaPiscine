package ex01;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Amanda", 500);
        User user2 = new User("Miranda", 1000);
        User user3 = new User("Boris", 7000);
        System.out.println("Name: " + user1.getName() + " id: " + user1.getId() + " balance: " + user1.getBalance());
        System.out.println("Name: " + user2.getName() + " id: " + user2.getId() + " balance: " + user2.getBalance());
        System.out.println("Name: " + user3.getName() + " id: " + user3.getId() + " balance: " + user3.getBalance());
    }
}
