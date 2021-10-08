package com.progressivecoder.demo.springbootstarter.services;

import com.progressivecoder.demo.springbootstarter.dto.MobileCreateDTO;
import com.progressivecoder.demo.springbootstarter.dto.MobileQueryDTO;
import com.progressivecoder.demo.springbootstarter.dto.MobileUpdateDTO;

import java.util.UUID;

public interface MobileCommandService {

    public UUID createMobile(MobileCreateDTO mobileCreateDTO);
    public MobileQueryDTO updateMobile(UUID id, MobileUpdateDTO mobileUpdateDTO);

}
