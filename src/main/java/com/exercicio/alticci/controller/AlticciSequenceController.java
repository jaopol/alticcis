package com.exercicio.alticci.controller;

import com.exercicio.alticci.service.SequenceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/alticci")
public class AlticciSequenceController {

    @Autowired
    private SequenceService service;
    @ApiOperation("Return value of the Alticci sequence")
    @GetMapping(path = "/{number}")
    public ResponseEntity<Integer> getAlticciSequence(@PathVariable Integer number){

        return new ResponseEntity<>(service.getAlticciSequence(number), HttpStatus.OK);
    }
}
