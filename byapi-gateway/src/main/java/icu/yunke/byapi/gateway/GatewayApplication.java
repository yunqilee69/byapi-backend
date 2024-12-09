package icu.yunke.byapi.gateway;

import icu.yunke.byapi.common.config.SpringDocConfig;
import icu.yunke.byapi.common.startup.DruidRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author yunqilee
 */
@SpringBootApplication
@EnableDiscoveryClient
// 排除一些类
@ComponentScan(
        basePackages = "icu.yunke.byapi",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
                SpringDocConfig.class,
                DruidRunner.class})
)
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
