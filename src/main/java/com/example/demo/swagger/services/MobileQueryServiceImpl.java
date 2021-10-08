package com.example.demo.swagger.services;

import com.example.demo.swagger.dto.MobileQueryDTO;
import com.example.demo.swagger.entities.Mobile;
import com.example.demo.swagger.repo.MobileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MobileQueryServiceImpl implements MobileQueryService {

    @Autowired
    private MobileRepository mobileRepository;

    @Override
    public MobileQueryDTO getMobile(UUID id) {
        if (mobileRepository.findById(id).isPresent()){
            Mobile fetchedMobile = mobileRepository.findById(id).get();
            return new MobileQueryDTO(fetchedMobile.getId(), fetchedMobile.getMobileIMEI(), fetchedMobile.getMake(), fetchedMobile.getModel());
        }else{
            throw new EntityNotFoundException("Mobile Id " + id.toString() + " not found in the database");
        }
    }

    @Override
    public List<MobileQueryDTO> listAllMobiles() {
        List<MobileQueryDTO> mobileList = new ArrayList<>();

        mobileRepository.findAll().forEach(mobile -> {
        	mobileList.add(new MobileQueryDTO(mobile.getId(), mobile.getMobileIMEI(), mobile.getMake(), mobile.getModel()));
        });

        if (mobileList.size() > 0){
            return mobileList;
        }else{
            throw new EntityNotFoundException("No Mobiles Found in the Database");
        }
    }
}
