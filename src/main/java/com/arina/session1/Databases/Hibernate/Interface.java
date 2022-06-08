package com.arina.session1.Databases.Hibernate;

import com.arina.session1.Databases.User;

public class Interface {

    public static User getUser(String login, String password) {
        return (User) Hibernate
                .getSessionFactory()
                .openSession()
                .createQuery("FROM User A WHERE A.login = '" + login +"' AND A.password = '" + password + "'")
                .uniqueResult();
    }
}
