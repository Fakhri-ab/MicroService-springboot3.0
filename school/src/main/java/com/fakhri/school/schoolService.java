package com.fakhri.school;

import com.fakhri.school.client.EtudiantClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class schoolService {

    private final schoolRepo repository;
    private final EtudiantClient client;

    public void saveSchool(school s) {
        repository.save(s);
    }

    public List<school> findAllSchools() {
        return repository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var schoolparam = repository.findById(schoolId)
                .orElse(
                        school.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );
        var students = client.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(schoolparam.getName())
                .email(schoolparam.getEmail())
                .Etudiants(students)
                .build();
    }
}
