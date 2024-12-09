package icu.yunke.byapi.common.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 17:14
 * @description: redisson配置类
 */
@Configuration
public class RedissonGlobalConfig {

    private static final String REDIS_PROTOCOL_PREFIX = "redis://";

    @Resource
    private RedisProperties redisProperties;

    /**
     * 配置RedissonClient
     * @return
     */
    @Bean(destroyMethod = "shutdown")
    public RedissonClient redisson() {
        // 目前只支持单节点，需要多节点则进行判断
        Config config = new Config();
        config.useSingleServer()
                .setAddress(REDIS_PROTOCOL_PREFIX + redisProperties.getHost() + ":" + redisProperties.getPort())
                .setDatabase(redisProperties.getDatabase())
                .setUsername(redisProperties.getUsername())
                .setPassword(redisProperties.getPassword());
        // 设置序列化
        config.setCodec(new JsonJacksonCodec());
        return Redisson.create(config);
    }

}
