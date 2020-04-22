package com.lk.assettracker.controller;

import com.lk.assettracker.model.BranchMaster;
import com.lk.assettracker.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("v1/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping("register")
    void addBranch(@RequestBody BranchMaster branchMaster) {
        branchService.addBranchData(branchMaster);
    }

    @GetMapping
    List<BranchMaster> getBranchList() {
        return branchService.getBranchList();
    }
}
