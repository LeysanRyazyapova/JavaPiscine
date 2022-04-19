package ex02;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Amanda", 500);
        User user2 = new User("Miranda", 1000);
        User user3 = new User("Boris", 7000);
        UsersArrayList users = new UsersArrayList();
        users.addUser(user1);
        users.addUser(user2);
        users.addUser(user3);
        users.addUser(user1);
        users.addUser(user2);
        users.addUser(user3);
        users.addUser(user1);
        users.addUser(user2);
        users.addUser(user3);
        users.addUser(user1);
        users.addUser(user2);
        users.addUser(user3);
        users.addUser(user2);
        System.out.println(users.toString());
        System.out.println("Number of users: " + users.numberOfUsers());
        System.out.println("User with id 1: " + users.getUserById(1));
        System.out.println("User in index 5: " + users.getUserByIndex(5));
    }
}
