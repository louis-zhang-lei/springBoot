package com.sql.service.imjl;

import com.sql.dao.userDao;
import com.sql.entity.userInfo;
import com.sql.service.userService;
import org.springframework.beans.factory.annotation.Autowired;

public class userServiceImjl implements userService {

    @Autowired
    private userDao userDao;

    @Override
    public int insertUser(userInfo userInfo) {
        String username=userInfo.getEname();
        if (null != username && !"".equals(username)){
            username +="aaa";
            userInfo.setEname(username);
        }

        return userDao.saveUser(userInfo);
    }
}
