/*package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    private static final Connection connection = (Connection) Util.getConnection();
    public UserDaoJDBCImpl() {
    }

    //Создание таблицы для User(ов)
    public void createUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users " +
//                    "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), lastname VARCHAR(255), age INT)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            //System.out.println("Таблица для User создана CREAT TABLE для User");
//        }
    }

    //Удаление таблицы User(ов)
    public void dropUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("DROP TABLE IF EXISTS users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    //Добавление User в таблицу
    public void saveUser(String name, String lastName, byte age) {
//        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name, lastname, age) VALUES (?, ?, ?)")) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    //Удаление User из таблицы ( по id )
    public void removeUserById(long id) {
//        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    //Получение всех User(ов) из таблицы
    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//
//        try (ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM users")) {
//            while(resultSet.next()) {
//                User user = new User(resultSet.getString("name"), resultSet.getString("lastname"), resultSet.getByte("age"));
//                user.setId(resultSet.getLong("id"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return users;
        return null;
    }

    //Очистка содержания таблицы
    public void cleanUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("TRUNCATE TABLE users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}*/
package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
