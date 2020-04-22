package com.lk.assettracker.services;

import com.lk.assettracker.model.EmployeeMaster;

import java.util.List;

public interface EmployeeMasterService {

    void registerEmployee(EmployeeMaster employeeMaster);

    List<EmployeeMaster> getEmployees();

    EmployeeMaster searchEmployee(String employeeId, String emailId, String contactNumber);
}
