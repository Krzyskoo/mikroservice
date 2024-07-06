package com.mikro.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(
            @RequestBody School student
    ){
        studentService.saveStudent(student);
    }

    @GetMapping()
    public ResponseEntity<List<School>> findAllSchools(){
        return ResponseEntity.ok(studentService.findAllStudents());
    }
    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllSchools(
            @PathVariable("school-id") Integer schoolId
    ){
        return ResponseEntity.ok(studentService.findSchoolsWithStudents(schoolId));
    }


}
