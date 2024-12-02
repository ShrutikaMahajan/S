package com.example.EmployeeManagementSystem.entity;

import lombok.Data;
import jakarta.persistence.*;
//import java.time.LocalDateTime;

@Entity
@Data
@Table(name="Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deptid;
    private String deptname;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}
