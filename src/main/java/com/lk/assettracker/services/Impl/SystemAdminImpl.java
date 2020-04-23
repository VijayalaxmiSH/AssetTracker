package com.lk.assettracker.services.Impl;

import com.google.common.base.Strings;
import com.lk.assettracker.model.SystemAdminMaster;
import com.lk.assettracker.repository.SystemAdminRepository;
import com.lk.assettracker.services.EmployeeMasterService;
import com.lk.assettracker.services.SystemAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class SystemAdminImpl implements SystemAdminService {

    @Autowired
    private SystemAdminRepository systemAdminRepository;

    @Autowired
    private EmployeeMasterService employeeMasterService;

    @Override
    public void registerAdmin(SystemAdminMaster request) {
        if (Objects.nonNull(request)) {
            if (Strings.isNullOrEmpty(request.getEmployeeId())) {
                //TODO: need to handle exception
            } else if (Objects.isNull(employeeMasterService.searchEmployeeById(request.getEmployeeId()))) {
                //TODO: need to handle exception
            } else {
                request.setId(UUID.randomUUID().toString());
                request.setCreatedDate(Calendar.getInstance().getTime());
                request.setUpdatedDate(Calendar.getInstance().getTime());
                request.setActive(true);
                systemAdminRepository.save(request);
            }
        }
        //TODO: Throw bad request exception
    }

    @Override
    public List<SystemAdminMaster> getAdmin() {
        return systemAdminRepository.findAll();
    }
}
