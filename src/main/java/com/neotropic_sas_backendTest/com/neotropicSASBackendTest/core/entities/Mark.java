package com.neotropic_sas_backendTest.com.neotropicSASBackendTest.core.entities;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mark{


    private Long id;
    private String name;
    private String description;
    private float latitude;
    private float longitude;
    
}
