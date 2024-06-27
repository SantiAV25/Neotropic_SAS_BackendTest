package com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.entities.Mark;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.repository.imarkRepository;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.persistence.mapper.markEntityMapper;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.persistence.model.MarkEntity;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.persistence.repository.markRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class markPersistence implements imarkRepository{

    @Autowired
    private final markRepository markRepository;

    @Autowired
    private final markEntityMapper markEntityMapper;

    @Override
    public List<Mark> findAllmarks() {
        System.out.println("EntroAlPersistence");
        return markEntityMapper.toMarkList(markRepository.findAll());
    }

    @Override
    public Mark deleteMark(Mark mark) {
        MarkEntity markEntity = markEntityMapper.toMarkEntity(mark);
        markRepository.delete(markEntity);
        return markEntityMapper.toMark(markEntity);
    }

    @Override
    public Mark saveMark(Mark mark) {
        System.out.println("Guarda la Marca");
        MarkEntity markEntity = markEntityMapper.toMarkEntity(mark);
        markEntity = markRepository.save(markEntity);
        return markEntityMapper.toMark(markEntity);
    }

    @Override
    public Mark updateMark(Mark mark) {
        MarkEntity markEntity = markEntityMapper.toMarkEntity(mark);
        markEntity = markRepository.save(markEntity);
        return markEntityMapper.toMark(markEntity);
    }

    @Override
    public Mark findMarkById(String id) {
        return markEntityMapper.toMark(markRepository.findById(id).get());
    }

   
    
    
}
