package com.maemn.worklog.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.annotation.Resource;

public class BaseDAO extends HibernateDaoSupport {

    @Resource
    public void setSessionFactoryOverride(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    public BaseDAO() {
        // Need a non-parametric construction method.
    }
}
