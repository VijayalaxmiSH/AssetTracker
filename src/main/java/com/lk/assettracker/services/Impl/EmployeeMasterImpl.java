package com.lk.assettracker.services.Impl;

import com.google.common.base.Strings;
import com.lk.assettracker.model.EmployeeMaster;
import com.lk.assettracker.query.EmployeeSpec;
import com.lk.assettracker.repository.EmployeeMasterRepository;
import com.lk.assettracker.services.EmployeeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
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
    public EmployeeMaster searchEmployeeById(String employeeId) {
        if (!Strings.isNullOrEmpty(employeeId)){
            return employeeMasterRepository.findByEmployeeId(employeeId);
        }else return null; //TODO need to handle exception
    }


    @Override
    public List<EmployeeMaster> searchEmployee(Specification<EmployeeMaster> employeeSpec) {
        return employeeMasterRepository.findAll(employeeSpec);
    }
}
