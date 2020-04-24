package com.lk.assettracker.controller;

import com.lk.assettracker.services.AssetTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/assetTracker")
public class AssetTrackerController {

    @Autowired
    private AssetTrackerService assetTrackerService;

}
