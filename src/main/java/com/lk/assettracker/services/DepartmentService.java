package com.lk.assettracker.services;

import com.lk.assettracker.model.DepartmentMaster;

import java.util.List;

public interface DepartmentService {

    void addDepartmentData(DepartmentMaster departmentMaster);

    List<DepartmentMaster> getdepartmentList();
}
