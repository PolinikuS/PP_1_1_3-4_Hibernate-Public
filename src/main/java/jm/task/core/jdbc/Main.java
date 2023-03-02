package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl usi = new UserServiceImpl();

        usi.createUsersTable();
        usi.saveUser("Polina", "Serdyukova", (byte) 23);
        System.out.println("User с именем – Polina добавлен в базу данных");

        usi.saveUser("Olga", "Petrova", (byte) 55);
        System.out.println("User с именем – Olga добавлен в базу данных");

        usi.saveUser("Nikolay", "Ivanov", (byte) 37);
        System.out.println("User с именем – Nikolay добавлен в базу данных");

        usi.saveUser("Karina", "Elizarova", (byte) 18);
        System.out.println("User с именем – Karina добавлен в базу данных");
        usi.getAllUsers();
        usi.cleanUsersTable();
        usi.dropUsersTable();
    }
}
