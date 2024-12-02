package com.example.EmployeeManagementSystem.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name="Designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long desnid;
    private String desnname;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}