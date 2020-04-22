package com.lk.assettracker.services;

import com.lk.assettracker.model.BranchMaster;

import java.util.List;

public interface BranchService {

    void addBranchData(BranchMaster branchMaster);

    List<BranchMaster> getBranchList();
}
