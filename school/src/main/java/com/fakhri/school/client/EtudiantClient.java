package com.fakhri.school.client;

import com.fakhri.school.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "etudiant-service", url = "${application.config.students-url}")
public interface EtudiantClient {
    @GetMapping("/school/{school-id}")
    List<Etudiant> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);
}
