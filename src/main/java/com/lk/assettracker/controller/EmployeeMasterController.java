package com.lk.assettracker.controller;

import com.lk.assettracker.model.EmployeeMaster;
import com.lk.assettracker.services.EmployeeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/employee")
public class EmployeeMasterController {

    @Autowired
    EmployeeMasterService employeeMasterService;


    @PostMapping("/register")
    void registerEmployee(@RequestBody EmployeeMaster employeeMaster) {
        employeeMasterService.registerEmployee(employeeMaster);
    }

    @GetMapping
    List<EmployeeMaster> getEmployees() {
        return employeeMasterService.getEmployees();
    }

    @GetMapping("/search")
    EmployeeMaster searchEmployee(@RequestParam(value = "employeeId", required = false) String employeeId ,
                                  @RequestParam(value = "emailId", required = false) String emailId,
                                  @RequestParam(value = "contactNumber", required = false) String contactNumber){
        return employeeMasterService.searchEmployee(employeeId,emailId,contactNumber);
    }

}
