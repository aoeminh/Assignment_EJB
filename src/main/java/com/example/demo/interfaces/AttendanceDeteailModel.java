package com.example.demo.interfaces;

import com.example.demo.model.AttendanceDetails;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AttendanceDeteailModel extends PagingAndSortingRepository<AttendanceDetails,Long> {
}
