package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService useService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
       // useService.cleanUsersTable();

        useService.saveUser("Аделина", "Хайдарова", (byte) 22);
        useService.saveUser("Василий", "Пупкин", (byte) 56);
        useService.saveUser("Иван", "Петров", (byte) 15);
        useService.saveUser("Петр", "Иванов", (byte) 37);

        useService.removeUserById(2);
        useService.getAllUsers();
        useService.cleanUsersTable();
        useService.dropUsersTable();
    }
}
