package com.example.demo.swagger.services;

import java.util.UUID;

import com.example.demo.swagger.dto.MobileCreateDTO;
import com.example.demo.swagger.dto.MobileQueryDTO;
import com.example.demo.swagger.dto.MobileUpdateDTO;

public interface MobileCommandService {

    public UUID createMobile(MobileCreateDTO mobileCreateDTO);
    public MobileQueryDTO updateMobile(UUID id, MobileUpdateDTO mobileUpdateDTO);

}
