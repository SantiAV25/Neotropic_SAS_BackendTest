package com.neotropic_sas_backendTest.com.neotropicSASBackendTest.service.serviceInterface;

import java.util.List;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.entities.Mark;

public interface imarkService {
    Mark saveMark(Mark mark);
    Mark deleteMark(Mark mark);
    Mark updateMark(Mark mark);
    List<Mark> findAllmarks();


    
}
