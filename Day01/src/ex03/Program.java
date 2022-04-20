package ex03;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Amanda", 500);
        User user2 = new User("Miranda", 1000);

        Transaction transaction1 = new Transaction(UUID.randomUUID(), user1, user2, Category.CREDITS, -100);
        Transaction transaction2 = new Transaction(UUID.randomUUID(), user1, user2, Category.CREDITS, -100);
        Transaction transaction3 = new Transaction(UUID.randomUUID(), user1, user2, Category.DEBITS, 200);
        Transaction transaction4 = new Transaction(UUID.randomUUID(), user1, user2, Category.DEBITS, 200);
        TransactionsLinkedList transactionsLinkedList = new TransactionsLinkedList();
        transactionsLinkedList.print();
        transactionsLinkedList.addTransaction(transaction1);
        transactionsLinkedList.addTransaction(transaction2);
        transactionsLinkedList.addTransaction(transaction3);
        transactionsLinkedList.addTransaction(transaction4);
        transactionsLinkedList.addTransaction(transaction1);
        transactionsLinkedList.print();
        //transactionsLinkedList.removeTransactionById(transaction3.getIdentifier());
        //transactionsLinkedList.print();

    }
}
