package com.maemn.worklog.service;

import com.maemn.worklog.entity.UserPO;

public interface UserService {
    UserPO getUser(String userId);
}
