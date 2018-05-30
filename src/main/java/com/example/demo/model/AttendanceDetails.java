package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttendanceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long detailsId;
    private long attendanceId;
    private long studentId;
    private long timeAttendance;
    private int  status;

    public AttendanceDetails(){}

    public long getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(long detailsId) {
        this.detailsId = detailsId;
    }

    public long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getTimeAttendance() {
        return timeAttendance;
    }

    public void setTimeAttendance(long timeAttendance) {
        this.timeAttendance = timeAttendance;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}


