package com.example.basicapi.service;

import com.example.basicapi.model.EmployeeModel;
import com.example.basicapi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeModel> findAll() {
        return (ArrayList<EmployeeModel>) this.employeeRepository.findAll();
    }

    public EmployeeModel findById(Long id) {
        return this.employeeRepository.findById(id).get();
    }

    public EmployeeModel save(EmployeeModel employeeModel) {
        return this.employeeRepository.save(employeeModel);
    }

    public EmployeeModel update(EmployeeModel employeeModel) {
        return this.employeeRepository.save(employeeModel);
    }

    public Boolean delete(Long id) {
        try {
            this.employeeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
