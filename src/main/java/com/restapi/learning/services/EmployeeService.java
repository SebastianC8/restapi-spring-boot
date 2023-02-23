package com.restapi.learning.services;

import com.restapi.learning.models.Employee;
import com.restapi.learning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public Employee update(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll()
    {
        return employeeRepository.findAll();
    }

    public void delete(Employee employee)
    {
        employeeRepository.delete(employee);
    }
}
