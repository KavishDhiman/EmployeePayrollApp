package com.bridgelabz.employeepayrollapp.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @GetMapping("/")
    public String getMessage() {
        return "Employee Payroll App is Running!";
    }
}