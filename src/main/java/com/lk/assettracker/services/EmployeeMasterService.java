package com.lk.assettracker.services;

import com.lk.assettracker.model.EmployeeMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface EmployeeMasterService {

    void registerEmployee(EmployeeMaster employeeMaster);

    EmployeeMaster searchEmployeeById(String employeeId);

    List<EmployeeMaster> searchEmployee(Specification<EmployeeMaster> employeeSpec);

}
