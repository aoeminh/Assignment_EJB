package com.example.demo.interfaces;

import com.example.demo.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentModel extends PagingAndSortingRepository<Student,Long> {
}
