package com.example.springrestfuldemo.dao;

import com.example.springrestfuldemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {

}
