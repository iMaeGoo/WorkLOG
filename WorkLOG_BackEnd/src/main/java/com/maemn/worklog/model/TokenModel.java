package com.maemn.worklog.model;

/**
 * Token的Model类，可以增加字段提高安全性，例如时间戳、url签名
 */
public class TokenModel {
    private String userId;

    // UUID Token
    private String token;

    public TokenModel(String userId, String token) {
        this.userId = userId;
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
