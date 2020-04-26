package com.lk.assettracker.repository;

import com.lk.assettracker.model.EmployeeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeMasterRepository extends JpaRepository<EmployeeMaster, String>, JpaSpecificationExecutor<EmployeeMaster> {


    @Query("SELECT em FROM EmployeeMaster em WHERE em.employeeId = :#{#employeeId} AND em.isActive = true")
    EmployeeMaster findByEmployeeId(String employeeId);

    @Query("SELECT em FROM EmployeeMaster em WHERE em.id = :#{#id}")
    EmployeeMaster findByEmployeeGuiId(String id);

}
