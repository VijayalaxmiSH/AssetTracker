package com.lk.assettracker.controller;

import com.lk.assettracker.model.AssetTrackerMaster;
import com.lk.assettracker.services.AssetTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/assetTracker")
public class AssetTrackerController {

    @Autowired
    private AssetTrackerService assetTrackerService;

    @PostMapping
    void addAssetDetails(@RequestBody AssetTrackerMaster assetTrackerMaster){
        assetTrackerService.entryToAssetTracker(assetTrackerMaster);
    }

    @GetMapping
    List<AssetTrackerMaster> getEmployeeAssetDetails(String employeeId){
       return assetTrackerService.getEmployeeAssetDetails(employeeId);
    }

}
