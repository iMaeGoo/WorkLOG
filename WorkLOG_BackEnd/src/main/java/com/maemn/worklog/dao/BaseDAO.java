package com.maemn.worklog.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class BaseDAO extends HibernateDaoSupport {

    public BaseDAO() {
        // Need a non-parametric construction method.
    }
}
