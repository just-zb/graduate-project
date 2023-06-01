package com.example.backend_project.service;

import com.example.backend_project.pojo.Creative;

public interface CreativeService {
    Creative getCreativeById(String creativeId);
    Boolean setCreative(Creative creative);
}
