package ex03;

import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList{
    private Node first;
    private Node last;
    private Integer size;

    private class Node {
        Transaction transaction;
        Node next;
        Node prev;
        Node(Node prev, Transaction transaction, Node next) {
            this.transaction = transaction;
            this.next = next;
            this.prev = prev;
        }
    }
    public TransactionsLinkedList(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    @Override
    public void addTransaction(Transaction transaction) {
        if(first == null) {
            this.first = new Node(null, transaction, null);
            this.last = first;
            this.size++;
        } else {
            this.last = new Node(this.last, transaction, null);
            this.size++;
        }
    }

    @Override
    public void removeTransactionById(UUID identifier) {

    }

    @Override
    public void toArray(Transaction[] transactions) {

    }




    public void print() {
        Node tmp = first;
        while(tmp != null && tmp.next != null) {
            System.out.println(tmp.transaction.toString());
            tmp = tmp.next;
        }
    }
}
