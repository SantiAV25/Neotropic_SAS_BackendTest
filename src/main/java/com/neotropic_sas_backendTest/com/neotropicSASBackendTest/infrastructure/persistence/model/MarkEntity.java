package com.neotropic_sas_backendTest.com.neotropicSASBackendTest.infrastructure.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "MARK")
public class MarkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false,name = "markId")
    private Long id;

    @Column(name = "markName")
    private String name;

    @Column(name = "markDescription")
    private String description;

    @Column(name = "markLatitude")
    private float latitude;

    @Column(name = "markLongitude") 
    private float longitude;

    
}
