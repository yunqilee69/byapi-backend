package icu.yunke.byapi.auth;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 22:24
 * @description: 启动类
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("icu.yunke.byapi")
@MapperScan("icu.yunke.byapi.auth.mapper")
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}
