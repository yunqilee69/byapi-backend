package icu.yunke.byapi.common.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.InetAddress;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 17:29
 * @description: 输出Druid接口地址
 */
@Slf4j
@Component
public class DruidRunner implements CommandLineRunner {

    @Resource
    private ServletWebServerApplicationContext webServerAppCtx;

    @Override
    public void run(String... args) throws Exception {

        String ip = InetAddress.getLocalHost().getHostAddress();
        int port = webServerAppCtx.getWebServer().getPort();
        log.info("Druid后台地址:http://{}:{}/druid/login.html", ip, port);
    }
}
