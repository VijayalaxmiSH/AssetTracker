package com.lk.assettracker.repository;

import com.lk.assettracker.model.AssetTrackerMaster;
import com.lk.assettracker.model.AssetTypeMaster;
import com.lk.assettracker.model.EmployeeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AssetTrackerRepository extends JpaRepository<AssetTrackerMaster,String> {

    @Query("SELECT a FROM AssetTrackerMaster a WHERE a.employeeId = :#{#employeeId}")
    List<AssetTrackerMaster> findAssetByEmpId(String employeeId);

    @Query("SELECT a FROM AssetTrackerMaster a WHERE a.assetId = :#{#assetId}")
    List<AssetTrackerMaster> findByAssetTag(String assetId);

    @Query("SELECT a FROM AssetTrackerMaster a WHERE a.assetId = :#{#assetId} AND a.returnDate IS NULL")
    AssetTrackerMaster findCurrentAssigneeByAssetTag(String assetId);

    @Query("SELECT a FROM AssetTrackerMaster a WHERE a.employeeId = :#{#employeeId} AND a.returnDate IS NULL")
    AssetTrackerMaster findCurrentAssigneeByEmployeeId(String employeeId);
}
