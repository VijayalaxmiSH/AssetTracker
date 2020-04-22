package com.lk.assettracker.repository;

import com.lk.assettracker.model.BranchMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<BranchMaster, String> {
}
