package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheApp {

    public static void main(String[] args) {

        // creating list
        List<Person> friends = new ArrayList<>();

        friends.add(new Person("Emma", "Collins", 28));
        friends.add(new Person("Liam", "Martinez", 34));
        friends.add(new Person("Sophia", "Nguyen", 22));
        friends.add(new Person("Jackson", "Lee", 41));
        friends.add(new Person("Ava", "Thompson", 30));
        // adding person with same last name to test
        friends.add(new Person("Kayla", "Lee", 25));
        friends.add(new Person("Brenda", "Nguyen", 21));

        Collections.sort(friends);

        for (Person friend : friends) {
            System.out.println(friend);
        }
    }
}
