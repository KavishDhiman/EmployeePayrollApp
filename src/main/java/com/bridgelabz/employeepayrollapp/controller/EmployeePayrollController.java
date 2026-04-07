package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeeService;

    @GetMapping("/")
    public List<EmployeePayrollData> getAll() {
        log.info("Fetching all employees");
        return employeeService.getEmployeePayrollData();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollData getById(@PathVariable int id) {
        log.info("Fetching employee with id {}", id);
        return employeeService.getEmployeePayrollDataById(id);
    }

    @PostMapping("/create")
    public EmployeePayrollData create(@RequestBody EmployeePayrollDTO dto) {
        log.info("Creating employee: {}", dto);
        return employeeService.createEmployeePayrollData(dto);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollData update(@PathVariable int id,
                                      @RequestBody EmployeePayrollDTO dto) {
        log.info("Updating employee with id {}", id);
        return employeeService.updateEmployeePayrollData(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        log.info("Deleting employee with id {}", id);
        employeeService.deleteEmployeePayrollData(id);
        return "Deleted Successfully";
    }
}