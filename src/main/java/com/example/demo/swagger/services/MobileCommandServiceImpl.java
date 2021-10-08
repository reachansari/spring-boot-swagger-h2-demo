package com.example.demo.swagger.services;

import com.example.demo.swagger.dto.MobileCreateDTO;
import com.example.demo.swagger.dto.MobileQueryDTO;
import com.example.demo.swagger.dto.MobileUpdateDTO;
import com.example.demo.swagger.entities.Mobile;
import com.example.demo.swagger.entities.Status;
import com.example.demo.swagger.repo.MobileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

@Service
public class MobileCommandServiceImpl implements MobileCommandService {

    @Autowired
    private MobileRepository mobileRepository;

    @Override
    public UUID createMobile(MobileCreateDTO mobileCreateDTO) {
        Mobile newMobile = new Mobile();

        newMobile.setId(UUID.randomUUID());
        newMobile.setMobileIMEI(mobileCreateDTO.getMobileIMEI());
        newMobile.setMake(mobileCreateDTO.getMake());
        newMobile.setModel(mobileCreateDTO.getModel());
        newMobile.setStatus(String.valueOf(Status.FOR_SALE));

        return mobileRepository.save(newMobile).getId();
    }

    @Override
    public MobileQueryDTO updateMobile(UUID id, MobileUpdateDTO mobileUpdateDTO) {

        if (mobileRepository.findById(id).isPresent()){
            Mobile existingMobile = mobileRepository.findById(id).get();

            existingMobile.setMake(mobileUpdateDTO.getMake());
            existingMobile.setModel(mobileUpdateDTO.getModel());

            Mobile updatedMobile = mobileRepository.save(existingMobile);

            return new MobileQueryDTO(updatedMobile.getId(), updatedMobile.getMobileIMEI(),
            		updatedMobile.getMake(), updatedMobile.getModel());
        }else{
            throw new EntityNotFoundException("Mobile Id " + id.toString() + " not found in the database");
        }
    }

}
