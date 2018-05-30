package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Entity
public class AttendanceSlots {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long attendanceId;
    private long idClass;
    private long idSlot;
    private String subjectCode;
    private long attendanceDate;
    private int attendanceStatus;

    public AttendanceSlots() {

    }
    public String getAttendDate() {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return  dateFormat.format(this.attendanceDate);
    }
    public long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public long getIdClass() {
        return idClass;
    }

    public void setIdClass(long idClass) {
        this.idClass = idClass;
    }

    public long getIdSlot() {
        return idSlot;
    }

    public void setIdSlot(long idSlot) {
        this.idSlot = idSlot;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public long getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(long attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public int getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(int attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public  String getStatus(){
        switch (this.attendanceStatus){
            case 1:
                return "View";
            case 0:
                return "Take";
             default:
                 return  null;
        }
    }
}
