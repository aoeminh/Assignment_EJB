package com.example.demo.interfaces;

import com.example.demo.model.AttendanceSlots;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AttendanceSlotModel extends PagingAndSortingRepository<AttendanceSlots,Long> {
}
