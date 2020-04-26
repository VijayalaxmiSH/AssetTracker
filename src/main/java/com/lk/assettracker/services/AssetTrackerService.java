package com.lk.assettracker.services;

import com.lk.assettracker.model.AssetTrackerMaster;
import com.lk.assettracker.model.EmployeeMaster;

import java.util.List;

public interface AssetTrackerService {

    void assignAsset(AssetTrackerMaster assetTrackerMaster);

    List<AssetTrackerMaster> getEmployeeAssetDetails(String employeeId);

    List<AssetTrackerMaster> getAssetHistory(String assetTag);

    EmployeeMaster getCurrentAssignee(String assetId);
}
