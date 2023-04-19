package com.kiwi.angularbackend;

public class Database {
    User user1 = new User();
    User user2 = new User();
    User user3 = new User();

    User[] data = { user1 };

    public int newIndex() {
        return data.length + 1;
    }


}