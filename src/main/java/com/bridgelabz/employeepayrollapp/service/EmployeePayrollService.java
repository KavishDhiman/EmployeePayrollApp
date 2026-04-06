package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private int empCounter = 1;

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO dto) {
        return new EmployeePayrollData(empCounter++, dto);
    }
}