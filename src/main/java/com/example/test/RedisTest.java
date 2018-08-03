package com.example.test;

import com.example.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yueminrui on 2018/7/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisDao redisDao;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testRedis(){
        redisDao.setKey("name","forezp");
        redisDao.setKey("age","19");
        System.out.println(redisDao.getValue("name"));
        System.out.println(redisDao.getValue("age"));
    }

}
