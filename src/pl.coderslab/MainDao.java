package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        userDao.findAll();
    }
}

