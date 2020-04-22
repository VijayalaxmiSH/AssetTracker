package com.lk.assettracker.repository;

import com.lk.assettracker.model.EmployeeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeMasterRepository extends JpaRepository<EmployeeMaster, String> {


    @Query("SELECT em FROM EmployeeMaster em WHERE em.employeeId = :#{#employeeId}")
    EmployeeMaster findByEmployeeId(String employeeId);

    @Query("SELECT em FROM EmployeeMaster em WHERE em.emailId = :#{#emailId}")
    EmployeeMaster findByEmailId(String emailId);

    @Query("SELECT em FROM EmployeeMaster em WHERE em.contactNumber = :#{#contactNumber}")
    EmployeeMaster findByContactNumber(String contactNumber);
}
