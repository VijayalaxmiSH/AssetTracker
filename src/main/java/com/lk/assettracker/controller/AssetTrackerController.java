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
        assetTrackerService.assignAsset(assetTrackerMaster);
    }

    @GetMapping("/employee")
    List<AssetTrackerMaster> getEmployeeAssetDetails(String employeeId){
       return assetTrackerService.getEmployeeAssetDetails(employeeId);
    }

    @GetMapping("/asset/{assetId}")
    List<AssetTrackerMaster> getAssetHistory(@PathVariable("assetId") String assetId){
        return assetTrackerService.getAssetHistory(assetId);
    }

    @GetMapping("/asset/{currentAssetId}")
    List<AssetTrackerMaster> getCurrentAssigneeDetails(@PathVariable("currentAssetId") String assetId){
        return assetTrackerService.getCurrentAssignee(assetId);
    }
}
