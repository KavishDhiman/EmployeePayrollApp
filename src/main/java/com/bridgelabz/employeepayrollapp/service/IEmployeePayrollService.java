package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int id);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO dto);

    EmployeePayrollData updateEmployeePayrollData(int id, EmployeePayrollDTO dto);

    void deleteEmployeePayrollData(int id);
}