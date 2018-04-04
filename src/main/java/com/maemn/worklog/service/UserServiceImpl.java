package com.maemn.worklog.service;

import com.maemn.worklog.dao.UserDAO;
import com.maemn.worklog.model.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public UserPO getUser(final String userId) {
        return userDAO.getUser(userId);
    }
}
