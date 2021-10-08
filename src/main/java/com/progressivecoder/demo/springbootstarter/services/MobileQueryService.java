package com.progressivecoder.demo.springbootstarter.services;

import com.progressivecoder.demo.springbootstarter.dto.MobileQueryDTO;

import java.util.List;
import java.util.UUID;

public interface MobileQueryService {

    public MobileQueryDTO getMobile(UUID id);
    public List<MobileQueryDTO> listAllMobiles();
}
