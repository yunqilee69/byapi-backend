package icu.yunke.byapi.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * springdoc配置文件
 * @author yunqilee
 */
@Configuration
public class SpringDocConfig {

    @Value("${spring.application.name}")
    private String appName;

    private License license() {
        return new License()
                .name("MIT")
                .url("https://opensource.org/licenses/MIT");
    }

    private Info info(){
        return new Info()
                .title(appName)
                .description("白云API-" + appName)
                .version("v1.0.0")
                .license(license());
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(info());
    }
}
