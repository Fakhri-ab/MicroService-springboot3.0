package com.fakhri.etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EtudiantRepo extends JpaRepository<Etudiant,Integer>{
    List<Etudiant> findAllBySchoolId(Integer schoolId);
}
