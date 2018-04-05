package com.maemn.worklog.dao;

import com.maemn.worklog.entity.UserPO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

public class TestUserDAO {

    @Autowired
    private UserDAO userDao;

    @Test
    public void testGetUser() {
        UserPO user = userDao.getUser("1");
        assertNotNull(user);
    }
}
