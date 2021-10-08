package com.example.demo.swagger.controllers;

import com.example.demo.swagger.dto.MobileQueryDTO;
import com.example.demo.swagger.services.MobileQueryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/mobiles")
public class MobileQueryController {

    @Autowired
    private MobileQueryService mobileQueryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<MobileQueryDTO>> listAllMobiles(){
        return new ResponseEntity<>(mobileQueryService.listAllMobiles(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<MobileQueryDTO> getMobile(@PathVariable(value = "id") UUID id){
        return new ResponseEntity<>(mobileQueryService.getMobile(id), HttpStatus.OK);
    }
}
