package com.lk.assettracker.services.Impl;

import com.google.common.base.Strings;
import com.lk.assettracker.exception.BadRequestRequestException;
import com.lk.assettracker.model.EmployeeMaster;
import com.lk.assettracker.repository.EmployeeMasterRepository;
import com.lk.assettracker.services.EmployeeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
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
        } else throw new BadRequestRequestException("Request body should not be a null");
    }

    @Override
    public EmployeeMaster searchEmployeeById(String employeeId) {
        if (!Strings.isNullOrEmpty(employeeId)) {
            return employeeMasterRepository.findByEmployeeId(employeeId);
        } else throw new BadRequestRequestException("Employee Id should not be a null or empty");
    }

    @Override
    public EmployeeMaster searchEmployeeByGUIId(String guiId) {
        return employeeMasterRepository.findByEmployeeGuiId(guiId);
    }


    @Override
    public List<EmployeeMaster> searchEmployee(Specification<EmployeeMaster> employeeSpec) {
        return employeeMasterRepository.findAll(employeeSpec);
    }
}
