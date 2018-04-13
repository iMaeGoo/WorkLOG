package com.maemn.worklog.service;

import com.maemn.worklog.dao.UserDAO;
import com.maemn.worklog.entity.UserPO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDAO userDAO;

    public UserPO getUser(String userId) {
        logger.info("getUser");
        return userDAO.getUser(userId);
    }
}
