package com.maemn.worklog;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Reference website:
 * https://yq.aliyun.com/articles/47122
 * https://blog.csdn.net/yuqing_410/article/details/74279439
 */
public class RestApplication extends ResourceConfig {

    public RestApplication() {
        packages("com.maemn.worklog.controller");

        // register filters
        register(RequestContextFilter.class);

        // register features
        register(JacksonFeature.class);
    }
}
