package com.example.demo.interfaces;

import com.example.demo.model.StudentClass;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentClassModel extends PagingAndSortingRepository<StudentClass,Long>
{
}
