package com.lk.assettracker.services.Impl;

import com.google.common.base.Strings;
import com.lk.assettracker.model.EmployeeMaster;
import com.lk.assettracker.repository.EmployeeMasterRepository;
import com.lk.assettracker.services.EmployeeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class EmployeeMasterImpl implements EmployeeMasterService {

    @Autowired
    EmployeeMasterRepository employeeMasterRepository;

    @Override
    public void registerEmployee(EmployeeMaster employeeMaster) {
        if (Objects.nonNull(employeeMaster)) {
            employeeMaster.setId(UUID.randomUUID().toString());
            employeeMaster.setCreatedDate(Calendar.getInstance().getTime());
            employeeMaster.setUpdatedDate(Calendar.getInstance().getTime());
            employeeMaster.setActive(true);
            employeeMasterRepository.save(employeeMaster);
        }
        //TODO: Throw bad request exception
    }

    @Override
    public List<EmployeeMaster> getEmployees() {
        return employeeMasterRepository.findAll();
    }

    @Override
    public EmployeeMaster searchEmployee(String employeeId, String emailId, String contactNumber) {
        if (!Strings.isNullOrEmpty(employeeId)){
            return employeeMasterRepository.findByEmployeeId(employeeId);
        } else if (!Strings.isNullOrEmpty(emailId)){
            return employeeMasterRepository.findByEmailId(emailId);
        }else if (!Strings.isNullOrEmpty(contactNumber)){
            return employeeMasterRepository.findByContactNumber(contactNumber);
        }else return null; //TODO need to handle exception
    }
}
