package com.sql.service;

import com.sql.entity.userInfo;
import org.springframework.stereotype.Service;

/**
 * 新增用户
 * @author zl
 * @param
 * @return int
 * @date 2020/5/4
 */
@Service
public interface userService {

    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int insertUser(userInfo userInfo);
}
