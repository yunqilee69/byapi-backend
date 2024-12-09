package icu.yunke.byapi.gateway.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.InetAddress;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 15:01
 * @description: 输出SpringDoc接口地址
 */
@Slf4j
@Component
public class SpringDocRunner implements CommandLineRunner {

    @Resource
    private Environment env;

    @Override
    public void run(String... args) throws Exception {

        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        log.info("Api文档地址:http://{}:{}/doc.html", ip, port);
    }
}
