package com.example.Service;

import com.example.dao.UserDao;
import com.example.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yueminrui on 2018/7/30.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public UserInfo findByName(String userName){
        return userDao.findByUserName(userName);
    }
}
