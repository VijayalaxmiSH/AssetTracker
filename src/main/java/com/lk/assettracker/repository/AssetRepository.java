package com.lk.assettracker.repository;

import com.lk.assettracker.model.AssetMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<AssetMaster, String> {
}
