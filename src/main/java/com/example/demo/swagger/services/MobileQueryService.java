package com.example.demo.swagger.services;

import java.util.List;
import java.util.UUID;

import com.example.demo.swagger.dto.MobileQueryDTO;

public interface MobileQueryService {

    public MobileQueryDTO getMobile(UUID id);
    public List<MobileQueryDTO> listAllMobiles();
}
