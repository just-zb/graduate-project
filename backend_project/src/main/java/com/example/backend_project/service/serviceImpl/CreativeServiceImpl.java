package com.example.backend_project.service.serviceImpl;

import com.example.backend_project.pojo.Creative;
import com.example.backend_project.service.CreativeService;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CreativeServiceImpl implements CreativeService {
    @Resource
    RedisTemplate<String,Creative> redisTemplate;
    @Override
    public Creative getCreativeById(String creativeId) {
        return redisTemplate.opsForValue().get(creativeId);
    }

    @Override
    public Boolean setCreative(Creative creative) {

        redisTemplate.opsForValue().set(creative.getCreativeId(),creative);
        return true;
    }
}
