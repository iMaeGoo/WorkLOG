package com.maemn.worklog.dao;

import com.maemn.worklog.model.UserPO;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends BaseDAO {
    private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);

    public UserPO getUser(final String userId) {
        logger.info("getUser");
        return getHibernateTemplate().execute(new HibernateCallback<UserPO>() {
            @Override
            public UserPO doInHibernate(Session session) throws HibernateException {
                String hql = "from UserPO where id = ?";
                Query query = session.createQuery(hql);
                query.setParameter(0, userId);
                return (UserPO) query.uniqueResult();
            }
        });
    }
}
