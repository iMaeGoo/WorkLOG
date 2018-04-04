package com.maemn.worklog.dao;

import com.maemn.worklog.model.UserPO;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;

public class UserDAO extends BaseDAO {

    public UserPO getUser(final String userId) {
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
