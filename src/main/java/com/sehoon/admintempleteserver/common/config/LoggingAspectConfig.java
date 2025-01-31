package com.sehoon.admintempleteserver.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.sehoon.admintempleteserver.common.constant.ApplicationConstant;
import com.sehoon.admintempleteserver.common.logging.LoggingAspect;

@Configuration
@EnableAspectJAutoProxy
public class LoggingAspectConfig {

    /**
     * 로깅 Aspect 설정
     * @param env
     * @return
     */
    @Bean
    @Profile({ApplicationConstant.SPRING_PROFILE_DEVELOPMENT, ApplicationConstant.SPRING_PROFILE_LOCAL})
    public LoggingAspect loggingAspect(Environment env) {
        return new LoggingAspect(env);
    }
}
