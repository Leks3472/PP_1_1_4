package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Or885522!";
    private static SessionFactory sessionFactory = null;

        public static SessionFactory getConnection () {

            try {
                Configuration configuration = new Configuration()
                        .setProperty("hibernate.connection.URL", URL)
                        .setProperty("hibernate.connection.USERNAME", USERNAME)
                        .setProperty("hibernate.connection.PASSWORD", PASSWORD)
                        .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                        .addAnnotatedClass(User.class).setProperty("hibernate.c3p0.min_size","5")
                        .setProperty("hibernate.c3p0.max_size","200")
                        .setProperty("hibernate.c3p0.max_statements","200");

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

                    System.out.println("Соединение с БД установлено Connection is OK");

            } catch (Exception e) {
                System.out.println("Соединение с БД не установлено Connection not established");
            }
            return sessionFactory;
        }
//    public static void closeConnection() {
//        if (sessionFactory != null)
//            sessionFactory.close();
//    }

}
