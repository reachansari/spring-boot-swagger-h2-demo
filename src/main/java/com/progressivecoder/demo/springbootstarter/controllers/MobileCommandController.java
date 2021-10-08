package com.progressivecoder.demo.springbootstarter.controllers;

import com.progressivecoder.demo.springbootstarter.dto.MobileCreateDTO;
import com.progressivecoder.demo.springbootstarter.dto.MobileQueryDTO;
import com.progressivecoder.demo.springbootstarter.dto.MobileUpdateDTO;
import com.progressivecoder.demo.springbootstarter.services.MobileCommandService;
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
