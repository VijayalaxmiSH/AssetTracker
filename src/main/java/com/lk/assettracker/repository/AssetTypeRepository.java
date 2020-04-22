package com.lk.assettracker.repository;

import com.lk.assettracker.model.AssetTypeMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetTypeRepository extends JpaRepository<AssetTypeMaster, String> {
}
