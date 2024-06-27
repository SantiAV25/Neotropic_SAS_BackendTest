package com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.persistence.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.persistence.model.MarkEntity;

public interface markRepository extends JpaRepository<MarkEntity, String>{
    
}
