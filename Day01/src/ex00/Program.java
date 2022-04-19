package ex00;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        User user1 = new User(1, "Amanda", 100);
        User user2 = new User(2, "Miranda", 200);
        User user3 = new User(3, "Boris", -100);
        Transaction transaction1 = new Transaction(UUID.randomUUID(), user1, user2, Category.CREDITS, 100);
        System.out.println("User name: " + user1.getName() + " user balance: " + user1.getBalance());
        System.out.println("User name: " + user2.getName() + " user balance: " + user2.getBalance());
        System.out.println("Transaction category: " + transaction1.getCategory() + " transaction amount: " + transaction1.getTransferAmount());
    }
}
