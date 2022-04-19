package ex00;

import java.util.UUID;
enum Category {
    DEBITS,
    CREDITS
}
public class Transaction {
    private UUID Identifier;
    private User Recipient;
    private User Sender;
    private Category category;
    private Integer transferAmount;

    public Transaction(UUID identifier, User recipient, User sender, Category category, Integer transferAmount) {
        if(Category.DEBITS == category && transferAmount >= 0 || Category.CREDITS == category && transferAmount < 0) {
            Identifier = identifier;
            Recipient = recipient;
            Sender = sender;
            this.category = category;
            this.transferAmount = transferAmount;
        } else {
            System.out.println("Category of transaction is wrong");
        }
    }

    public void setIdentifier(UUID identifier) {
        Identifier = identifier;
    }

    public void setRecipient(User recipient) {
        Recipient = recipient;
    }

    public void setSender(User sender) {
        Sender = sender;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTransferAmount(Integer transferAmount) {
        this.transferAmount = transferAmount;
    }

    public UUID getIdentifier() {
        return Identifier;
    }

    public User getRecipient() {
        return Recipient;
    }

    public User getSender() {
        return Sender;
    }

    public Category getCategory() {
        return category;
    }

    public Integer getTransferAmount() {
        return transferAmount;
    }
}
