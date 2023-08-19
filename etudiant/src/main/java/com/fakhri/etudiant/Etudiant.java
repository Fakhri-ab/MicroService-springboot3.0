package com.fakhri.etudiant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Etudiant {

    @Id
    @GeneratedValue
    private Integer id ;
    private String firstname ;
    private String lastname ;
    private String email ;
    private Integer schoolId ;

}
