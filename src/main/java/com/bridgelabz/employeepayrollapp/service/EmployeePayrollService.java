package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private List<EmployeePayrollData> employeeList = new ArrayList<>();
    private int empCounter = 1;

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeeList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO dto) {
        EmployeePayrollData emp = new EmployeePayrollData(empCounter++, dto);
        employeeList.add(emp);
        return emp;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int id, EmployeePayrollDTO dto) {
        EmployeePayrollData emp = this.getEmployeePayrollDataById(id);
        if (emp != null) {
            emp.setName(dto.getName());
            emp.setSalary(dto.getSalary());
        }
        return emp;
    }

    @Override
    public void deleteEmployeePayrollData(int id) {
        employeeList.removeIf(emp -> emp.getId() == id);
    }
}