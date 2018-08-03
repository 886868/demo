package com.example.dao;

import com.example.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yueminrui on 2018/7/30.
 */
public interface UserDao extends JpaRepository<UserInfo, Long> {
    UserInfo findByUserName(String userName);
}
