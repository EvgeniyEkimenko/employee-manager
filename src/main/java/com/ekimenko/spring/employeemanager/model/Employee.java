package com.ekimenko.spring.employeemanager.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false , updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String warehouseName;
    private String imageUrl;
    @Column(nullable = false , updatable = false)
    private String employeeCode;
}
