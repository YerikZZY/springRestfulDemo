package com.example.springrestfuldemo.service;

import com.example.springrestfuldemo.dao.StudentDAO;
import com.example.springrestfuldemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO dao;
    public String addStudent(Student student){
        dao.save(student);
        return "New Student add in DB";
    }
    public String addStudents(List<Student> students){
        dao.saveAll(students);
        return "All New Student add in DB";
    }
    public String deleteStudent(int id){
        Student student = dao.getById(id);
        dao.delete(student);
        return "Student is deleted";
    }
    public String updateStudent(Student student){
        dao.save(student);
        return "Student is update";
    }
    public Student getStudent(int id) {
        return dao.getById(id);
    }
    public String renewStudent(Student student){
        dao.save(student);
        return "Student " + student.getId() + "is update.";
    }
}
