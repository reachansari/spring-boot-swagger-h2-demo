package com.example.demo.swagger.controllers;

import com.example.demo.swagger.dto.MobileCreateDTO;
import com.example.demo.swagger.dto.MobileQueryDTO;
import com.example.demo.swagger.dto.MobileUpdateDTO;
import com.example.demo.swagger.services.MobileCommandService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/mobiles")
public class MobileCommandController {

    @Autowired
    private MobileCommandService mobileCommandService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UUID> createMobile(@Valid @RequestBody MobileCreateDTO mobileCreateDTO){
        return new ResponseEntity<>(mobileCommandService.createMobile(mobileCreateDTO), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<MobileQueryDTO> updateMobile(@PathVariable(value = "id") UUID id,
                                                         @RequestBody MobileUpdateDTO mobileUpdateDTO){
        return new ResponseEntity<>(mobileCommandService.updateMobile(id, mobileUpdateDTO), HttpStatus.OK);
    }
}
