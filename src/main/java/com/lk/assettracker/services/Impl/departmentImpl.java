package com.lk.assettracker.services.Impl;

import com.lk.assettracker.model.DepartmentMaster;
import com.lk.assettracker.repository.DepartmentRepository;
import com.lk.assettracker.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class departmentImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void addDepartmentData(DepartmentMaster departmentMaster) {
        if (Objects.nonNull(departmentMaster)) {
            departmentMaster.setId(UUID.randomUUID().toString());
            departmentMaster.setCreatedDate(Calendar.getInstance().getTime());
            departmentMaster.setUpdatedDate(Calendar.getInstance().getTime());
            departmentMaster.setDeleted(true);
            departmentRepository.save(departmentMaster);
        }
        //TODO need to handle exception
    }

    @Override
    public List<DepartmentMaster> getdepartmentList() {
        return departmentRepository.findAll();
    }


}
