package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 18);
        userService.saveUser("Петр", "Петров", (byte) 25);
        userService.saveUser("Сидор", "Сидоров", (byte) 45);
        userService.saveUser("Дуня", "Толстая", (byte) 45);

        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
