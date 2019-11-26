package com.itmo.patterns;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by xmitya on 03.12.16.
 */
public class Decorator {
    private final static String[] NAMES = {"Nick", "Fred", "Jack", "Michael", "Robert", "Paul"};

    public static void main(String[] args) {
        // Допустим, здесь приходит набор пользователей
        Collection<User> users = getUsers();
        System.out.println(users);
        // Декорируем и сортируем
        users = decorate(users);
        System.out.println(users);
    }

    private static Collection<User> decorate(Collection<User> users) {
        Collection<User> sortedUsers = new TreeSet<>();

        for (User user : users)
            // Добавляем функционал декорированием.
            sortedUsers.add(new SortedUser(user));

        return sortedUsers;
    }

    private static Collection<User> getUsers() {
        Collection<User> users = new ArrayList<>(NAMES.length);

        for (int i = 0; i < NAMES.length; i++)
            users.add(new User(NAMES[i], NAMES[NAMES.length - i - 1] + "son"));

        return users;
    }


    public static class User {
        private final static DateFormat FORMAT = new SimpleDateFormat("yyyy-dd-MM HH:mm");

        private final String name;
        private final String surname;
        private final long registered;

        public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
            registered = System.currentTimeMillis();
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return name + " " + surname + " " + FORMAT.format(new Date(registered));
        }
    }

    public static class SortedUser extends User implements Comparable<User> {
        private final User user;

        public SortedUser(User user) {
            super(null, null);
            if (user == null)
                throw new NullPointerException("user cannot be null");

            this.user = user;
        }

        @Override
        public int compareTo(User o) {
            if (o == null) return 1;
            int surnameCmp = compareStrings(getSurname(), o.getSurname());
            if (surnameCmp != 0) return surnameCmp;
            return compareStrings(getName(), o.getName());
        }

        private int compareStrings(String str1, String str2) {
            if (str1 == null && str2 == null) return 0;
            if (str1 != null && str2 == null) return 1;
            if (str1 == null) return -1;

            return str1.compareTo(str2);
        }

        @Override
        public String getName() { return user.getName(); }

        @Override
        public String getSurname() { return user.getSurname(); }

        @Override
        public String toString() { return user.toString(); }
    }



}
