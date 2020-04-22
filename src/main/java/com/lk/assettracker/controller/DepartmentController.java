package com.lk.assettracker.controller;

import com.lk.assettracker.model.DepartmentMaster;
import com.lk.assettracker.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    void addDepartment(@RequestBody DepartmentMaster departmentMaster){
        departmentService.addDepartmentData(departmentMaster);
    }

    @GetMapping
    List<DepartmentMaster> getDepartment(){
       return departmentService.getdepartmentList();
    }
}
