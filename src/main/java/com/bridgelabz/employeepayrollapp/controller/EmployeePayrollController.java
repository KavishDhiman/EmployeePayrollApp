package com.bridgelabz.employeepayrollapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeeService;

    @GetMapping("/")
    public List<EmployeePayrollData> getAll() {
        return employeeService.getEmployeePayrollData();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollData getById(@PathVariable int id) {
        return employeeService.getEmployeePayrollDataById(id);
    }

    @PostMapping("/create")
    public EmployeePayrollData create(@RequestBody EmployeePayrollDTO dto) {
        return employeeService.createEmployeePayrollData(dto);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollData update(@PathVariable int id,
                                      @RequestBody EmployeePayrollDTO dto) {
        return employeeService.updateEmployeePayrollData(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        employeeService.deleteEmployeePayrollData(id);
        return "Deleted Successfully";
    }
}