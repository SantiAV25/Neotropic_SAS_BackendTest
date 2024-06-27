package com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.entities.Mark;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.persistence.model.MarkEntity;
import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface markEntityMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "latitude", target = "latitude")
    @Mapping(source = "longitude", target = "longitude")
    Mark toMark(MarkEntity markEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "latitude", target = "latitude")
    @Mapping(source = "longitude", target = "longitude")
    MarkEntity toMarkEntity(Mark mark);
    
    List<Mark> toMarkList(List<MarkEntity> markEntityList);
    List<MarkEntity> toMarkEntityList(List<Mark> markList);
}
