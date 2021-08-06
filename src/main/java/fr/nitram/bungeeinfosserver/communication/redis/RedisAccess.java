package fr.nitram.bungeeinfosserver.communication.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;

public class RedisAccess {

    public static RedisAccess instance;
    private RedissonClient redissonClient;

    public RedisAccess(RedisCredentials redisCredentials) {

        instance = this;
        this.redissonClient = this.initRedisson(redisCredentials);
    }

    public static void init() {
        new RedisAccess(new RedisCredentials("localhost", "lepassword", 5506));
    }

    public static void close() {
        RedisAccess.instance.getRedissonClient().shutdown();
    }

    public RedissonClient initRedisson(RedisCredentials redisCredentials) {

        final Config config = new Config();

        config.setCodec(new JsonJacksonCodec());
        config.setThreads(2);
        config.setNettyThreads(2);
        config.useSingleServer()
                .setAddress(redisCredentials.getAdress() + ":" + redisCredentials.getPort())
                .setPassword(redisCredentials.getPassword())
                .setDatabase(3)
                .setClientName(redisCredentials.getClient())
                .setConnectionPoolSize(2000)
                .setConnectionMinimumIdleSize(1);

        return Redisson.create(config);
    }

    public RedissonClient getRedissonClient() {
        return redissonClient;
    }
}