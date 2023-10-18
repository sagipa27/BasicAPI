package com.example.basicapi.controller;

import com.example.basicapi.model.EmployeeModel;
import com.example.basicapi.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<ArrayList<EmployeeModel>> findAll() {
        return ResponseEntity.ok(this.employeeService.findAll());
    }

    @PostMapping
    public ResponseEntity<EmployeeModel> save(EmployeeModel employeeModel) {
        return ResponseEntity.ok(this.employeeService.save(employeeModel));
    }

    @PatchMapping
    public ResponseEntity<EmployeeModel> update(EmployeeModel employeeModel) {
        return ResponseEntity.ok(this.employeeService.update(employeeModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return ResponseEntity.ok(this.employeeService.delete(id));
    }
}
