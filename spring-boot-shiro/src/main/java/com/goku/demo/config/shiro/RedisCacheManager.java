package com.goku.demo.config.shiro;

import com.goku.demo.config.shiro.ShiroCache;
import org.apache.shiro.cache.AbstractCacheManager;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * Created by nbfujx on 2017-11-08.
 */
public class RedisCacheManager extends AbstractCacheManager {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    protected Cache<String, Object> createCache(String name) throws CacheException {
        return new ShiroCache<>(redisTemplate, name);
    }
}
