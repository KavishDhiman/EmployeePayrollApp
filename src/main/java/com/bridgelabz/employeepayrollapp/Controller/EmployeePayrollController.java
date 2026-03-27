package com.bridgelabz.employeepayrollapp.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    // GET (test API)
    @GetMapping("/")
    public String getMessage() {
        return "Employee Payroll Service";
    }

    // GET by ID
    @GetMapping("/get/{id}")
    public String getEmployee(@PathVariable int id) {
        return "Employee ID: " + id;
    }

    // POST
    @PostMapping("/create")
    public String createEmployee(@RequestBody Map<String, Object> emp) {
        return "Employee Created: " + emp;
    }

    // PUT
    @PutMapping("/update")
    public String updateEmployee(@RequestBody Map<String, Object> emp) {
        return "Employee Updated: " + emp;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Employee Deleted ID: " + id;
    }
}