package com.lk.assettracker.repository;

import com.lk.assettracker.model.AssetTrackerMaster;
import com.lk.assettracker.model.AssetTypeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AssetTrackerRepository extends JpaRepository<AssetTrackerMaster,String> {
}
