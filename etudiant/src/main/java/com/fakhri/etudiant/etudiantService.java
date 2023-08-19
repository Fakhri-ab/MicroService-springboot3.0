package com.fakhri.etudiant;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class etudiantService {



    private final EtudiantRepo etudiantRepo;

    public void saveStudent(Etudiant etudiant) {
        etudiantRepo.save(etudiant);
    }

    public List<Etudiant> findAllStudents() {
        return etudiantRepo.findAll();
    }

    public List<Etudiant> findAllStudentsBySchool(Integer schoolId) {
        return etudiantRepo.findAllBySchoolId(schoolId);
    }
}
