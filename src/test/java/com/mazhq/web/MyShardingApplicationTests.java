package com.mazhq.web;

import com.mazhq.web.dao.UserAuthDao;
import com.mazhq.web.entity.UserAuthEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyShardingApplicationTests {
    @Autowired
    UserAuthDao userAuthDao;

    @Test
    public void contextLoads() {
//        UserAuthEntity userAuthEntity = new UserAuthEntity();
//        userAuthEntity.setUserId(1l);
//        userAuthEntity.setAddDate(new Date());
//        userAuthEntity.setEmail("test@163.com");
//        userAuthEntity.setPassword("123456");
//        userAuthEntity.setPhone("13888888888");
//        userAuthDao.save(userAuthEntity);
    }

}
