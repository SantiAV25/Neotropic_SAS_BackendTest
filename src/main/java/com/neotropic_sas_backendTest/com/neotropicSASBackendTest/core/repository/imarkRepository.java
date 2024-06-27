package com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.repository;

import java.util.List;

import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.entities.Mark;

public interface imarkRepository {
    List<Mark> findAllmarks();
    Mark deleteMark(Mark mark);
    Mark saveMark(Mark mark);
    Mark updateMark(Mark mark);
    Mark findMarkById(String id);
}
