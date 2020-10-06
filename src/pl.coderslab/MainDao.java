package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        User user = new User();               // sprawdzenie metody create
        user.setUserName("NewUser");
        user.setEmail("newnew@gmail.com");
        user.setPassword("password");

        userDao.create(user);

//
//        User user = userDao.read(2);         // sprawdzenie metody read
//        System.out.println(user);
//
//        User user2 = userDao.read(1);
//        System.out.println(user2);


//        User user = userDao.read(2);         // sprawdzenie metody update
//        user.setUserName("Janek");
//        user.setEmail("jan.kowalski@wp.pl");
//        user.setPassword("haslo");
//
//        userDao.update(user);



    }
}

