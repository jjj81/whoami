package com.zut.edu.bi_she.controller;
import com.zut.edu.bi_she.entity.Student;
import com.zut.edu.bi_she.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;


    @GetMapping("/student/find_all")
    public List<Student>  find_all()
    {
        return studentMapper.find_all();
    }
    @PostMapping("/student/create")
    void create_student(@RequestBody  Student student)
    {
        studentMapper.insert(student);
    }

}
