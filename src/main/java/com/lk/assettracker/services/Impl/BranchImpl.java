package com.lk.assettracker.services.Impl;

import com.lk.assettracker.model.BranchMaster;
import com.lk.assettracker.repository.BranchRepository;
import com.lk.assettracker.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class BranchImpl implements BranchService {

    @Autowired
    private BranchRepository branchRepository;

    @Override
    public void addBranchData(BranchMaster branchMaster) {
        if (Objects.nonNull(branchMaster)) {
            branchMaster.setId(UUID.randomUUID().toString());
            branchMaster.setCreatedDate(Calendar.getInstance().getTime());
            branchMaster.setUpdatedDate(Calendar.getInstance().getTime());
            branchMaster.setDeleted(true);
            branchRepository.save(branchMaster);
        }
        //TODO: Throw bad request exception
    }

    @Override
    public List<BranchMaster> getBranchList() {
        return branchRepository.findAll();
    }
}
