package com.example.demo.interfaces;

import com.example.demo.model.Timeslots;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TimeSlotModel extends PagingAndSortingRepository<Timeslots,Long> {
}
