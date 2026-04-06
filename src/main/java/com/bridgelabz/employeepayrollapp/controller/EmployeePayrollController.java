package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    private int empCounter = 1;

    // CREATE
    @PostMapping("/create")
    public EmployeePayrollData create(@RequestBody EmployeePayrollDTO dto) {
        return new EmployeePayrollData(empCounter++, dto);
    }

    // GET (dummy for now)
    @GetMapping("/get/{id}")
    public EmployeePayrollData get(@PathVariable int id) {
        return new EmployeePayrollData(id,
                new EmployeePayrollDTO("Dummy", 1000));
    }
}