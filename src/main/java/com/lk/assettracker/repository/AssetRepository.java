package com.lk.assettracker.repository;

import com.lk.assettracker.model.AssetMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AssetRepository extends JpaRepository<AssetMaster, String>, JpaSpecificationExecutor<AssetMaster> {
}
