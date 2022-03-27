package com.example.springrestfuldemo.controller;

import com.example.springrestfuldemo.entity.Student;
import com.example.springrestfuldemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
       return studentService.addStudent(student);
    }

    @PostMapping("/bulkAdd")
    public String addStudents(@RequestBody List<Student> students){
        return studentService.addStudents(students);
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/put")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

    @PatchMapping("/patch/{id}")
    public String patchStudent(@RequestBody Student student){
        return studentService.renewStudent(student);
    }
}
