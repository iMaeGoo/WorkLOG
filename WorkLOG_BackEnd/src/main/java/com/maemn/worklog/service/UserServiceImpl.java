package com.maemn.worklog.service;

import com.maemn.worklog.dao.UserDAO;
import com.maemn.worklog.model.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl() {
        // Need a non-parametric construction method.
    }

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public UserPO getUser(final String userId) {
        return userDAO.getUser(userId);
    }
}
