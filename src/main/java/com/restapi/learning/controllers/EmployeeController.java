package com.restapi.learning.controllers;

import com.restapi.learning.models.Employee;
import com.restapi.learning.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll()
    {
        return employeeService.getAll();
    }

    @PostMapping
    public Employee save(@RequestBody Employee employee)
    {
        return employeeService.save(employee);
    }

    @PutMapping
    public Employee update(@RequestBody Employee employee)
    {
        return  employeeService.update(employee);
    }

    @DeleteMapping
    public void delete(@RequestBody Employee employee)
    {
        employeeService.delete(employee);
    }
}
