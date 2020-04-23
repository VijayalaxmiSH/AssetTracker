package com.lk.assettracker.controller;

import com.lk.assettracker.model.EmployeeMaster;
import com.lk.assettracker.query.EmployeeSpec;
import com.lk.assettracker.services.EmployeeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/employee")
public class EmployeeMasterController {

    @Autowired
    EmployeeMasterService employeeMasterService;


    @PostMapping
    void registerEmployee(@RequestBody EmployeeMaster employeeMaster) {
        employeeMasterService.registerEmployee(employeeMaster);
    }

    @GetMapping
    List<EmployeeMaster> getEmployees(EmployeeSpec employeeSpec) {
        return employeeMasterService.searchEmployee(employeeSpec);
    }

}
