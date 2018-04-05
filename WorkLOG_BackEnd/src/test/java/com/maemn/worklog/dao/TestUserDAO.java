package com.maemn.worklog.dao;

import com.maemn.worklog.entity.UserPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestUserDAO {

    @Autowired
    private UserDAO userDao;

    @Test
    public void testGetUser() {
        UserPO user = userDao.getUser("1");
        assertNotNull(user);
    }
}
