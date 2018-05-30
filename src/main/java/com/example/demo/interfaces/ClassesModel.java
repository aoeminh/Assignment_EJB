package com.example.demo.interfaces;

import com.example.demo.model.Classes;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClassesModel extends PagingAndSortingRepository<Classes,Long> {
}
