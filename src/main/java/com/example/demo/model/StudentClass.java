package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentClassId;
    private long studentId;
    private long classId;
    private long dateCreateStudent;
    private int studentStatus;

    public StudentClass() {

    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public long getDateCreateStudent() {
        return dateCreateStudent;
    }

    public void setDateCreateStudent(long dateCreateStudent) {
        this.dateCreateStudent = dateCreateStudent;
    }

    public int getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(int studentStatus) {
        this.studentStatus = studentStatus;
    }
}
