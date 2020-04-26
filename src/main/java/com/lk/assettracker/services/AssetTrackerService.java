package com.lk.assettracker.services;

import com.lk.assettracker.model.AssetTrackerMaster;

import java.util.List;

public interface AssetTrackerService {

    void entryToAssetTracker(AssetTrackerMaster assetTrackerMaster);

    List<AssetTrackerMaster> getEmployeeAssetDetails(String employeeId);


}
