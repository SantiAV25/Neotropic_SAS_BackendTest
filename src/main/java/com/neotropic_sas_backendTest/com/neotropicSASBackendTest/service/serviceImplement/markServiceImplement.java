package com.neotropic_sas_backendTest.com.neotropicSASBackendTest.service.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.entities.Mark;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.repository.imarkRepository;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.service.serviceInterface.imarkService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class markServiceImplement implements imarkService{

    @Autowired
    private imarkRepository markRepository;

    @Override
    public Mark saveMark(Mark mark) {
        return this.markRepository.saveMark(mark);
    }

    @Override
    public Mark deleteMark(Mark mark) {
       return this.markRepository.deleteMark(mark);
    }

    @Override
    public Mark updateMark(Mark mark) {
       return this.markRepository.updateMark(mark);
    }

    @Override
    public Mark findMarkById(String id) {
       return this.markRepository.findMarkById(id);
    }

    @Override
    public List<Mark> findAllmarks() {
        return this.markRepository.findAllmarks();
    }
    
}
