package com.maemn.worklog.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDAO extends HibernateDaoSupport {

    @Autowired
    public BaseDAO(SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }

    public BaseDAO() {
        // Need a non-parametric construction method.
    }
}
