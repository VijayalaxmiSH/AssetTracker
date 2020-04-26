package com.lk.assettracker.repository;

import com.lk.assettracker.model.AssetTrackerMaster;
import com.lk.assettracker.model.AssetTypeMaster;
import com.lk.assettracker.model.EmployeeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AssetTrackerRepository extends JpaRepository<AssetTrackerMaster,String> {

    @Query("SELECT em FROM AssetTrackerMaster em WHERE em.employeeId = :#{#employeeId}")
    List<AssetTrackerMaster> findAssetByEmployeeId(String employeeId);
}
