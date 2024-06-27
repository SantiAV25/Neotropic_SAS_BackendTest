package com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.controller;

import org.apache.catalina.connector.Response;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.entities.Mark;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.service.serviceInterface.imarkService;

import lombok.RequiredArgsConstructor;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/neutropicmap")
@RequiredArgsConstructor
public class markController {

    @Autowired
    private final imarkService markService;

    @PostMapping("/createMark")
    public ResponseEntity<Mark> createMark(@RequestBody @Validated Mark mark) {
        System.out.println("EntroAlControladorCrear");
        System.out.println("Mark: "+mark.getName()+mark.getDescription());
        return new ResponseEntity<>(this.markService.saveMark(mark), HttpStatus.CREATED);
    }

    @GetMapping("/findAllMarks")
    public ResponseEntity<List<Mark>> findAllMarks() {
        System.out.println("EntroAlControladorVerMarcas");
        return new ResponseEntity<>(this.markService.findAllmarks(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteMark")
    public ResponseEntity<Mark> deleteMark(@RequestBody @Validated Mark mark) {
        System.out.println("EntroAlControladorEliminar");
        return new ResponseEntity<>(this.markService.deleteMark(mark), HttpStatus.OK);
    }

    @PostMapping("/updateMark")
    public ResponseEntity<Mark> updateMark(@RequestBody @Validated Mark mark) {
        System.out.println("EntroAlControladorActualizar");
        return new ResponseEntity<>(this.markService.updateMark(mark), HttpStatus.OK);
    }

  
    
    
    
}
