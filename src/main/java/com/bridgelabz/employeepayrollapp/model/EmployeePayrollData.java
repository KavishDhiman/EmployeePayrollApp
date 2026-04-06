package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {

    private int id;
    private String name;
    private long salary;

    // ✅ REQUIRED CONSTRUCTOR
    public EmployeePayrollData(int id, EmployeePayrollDTO dto) {
        this.id = id;
        this.name = dto.name;
        this.salary = dto.salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public long getSalary() { return salary; }
}