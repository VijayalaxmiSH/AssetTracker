package com.lk.assettracker.services;

import com.lk.assettracker.model.EmployeeMaster;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface EmployeeMasterService {

    void registerEmployee(EmployeeMaster employeeMaster);

    EmployeeMaster searchEmployeeById(String employeeId);

    EmployeeMaster searchEmployeeByGUIId(String guiId);

    List<EmployeeMaster> searchEmployee(Specification<EmployeeMaster> employeeSpec);

}
