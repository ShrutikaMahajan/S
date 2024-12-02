package com.example.EmployeeManagementSystem.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email;
    private String empfname;
    private String emplname;
    private long empid;
    private int age;
    private long mbno;
    private String address;
    private date doj;
    private double salary;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}