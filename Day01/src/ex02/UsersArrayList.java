package ex02;

import java.util.Arrays;

public class UsersArrayList implements UserList{
    private User[] users = new User[10];
    private Integer size = 0;
    private Integer capacity = 10;
    @Override
    public void addUser(User user) {
        if (size == capacity) {
            capacity *= 2;
            User[] tmp = new User[capacity];
            for (int i = 0; i < size; i++) {
                tmp[i] = users[i];
            }
            tmp[size] = user;
            size++;
            users = tmp;
        } else {
            this.users[this.size] = user;
            size++;
        }

    }

    @Override
    public User getUserById(Integer id) {
        for(int i = 0; i < size; i++) {
            if(id == users[i].getId())
                return users[i];
        }
        return null;
    }

    @Override
    public User getUserByIndex(Integer index) {
        if(index < size)
            return users[index];
        return null;
    }

    @Override
    public Integer numberOfUsers() {
        return size;
    }
}