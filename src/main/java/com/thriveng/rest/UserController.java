package com.thriveng.rest;

import com.thriveng.dao.UserDao;
import com.thriveng.domain.User;
import com.thriveng.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by DoctorSushi on 4/15/17.
 */
@Controller
@RequestMapping("thriveng-service/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String createUser(@RequestBody UserDao userDao) {
        User user = new User(userDao.getName(), userDao.getEmail());
        User persistedUser = userRepository.save(user);
        System.out.println(persistedUser.getId());
        return "index";

    }
}
