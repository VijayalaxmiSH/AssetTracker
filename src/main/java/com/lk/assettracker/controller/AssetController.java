package com.lk.assettracker.controller;


import com.lk.assettracker.model.AssetMaster;
import com.lk.assettracker.services.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/asset")
public class AssetController {

   /* @Autowired
    private AssetService assetService;

    @PostMapping
    void addAssetData(AssetMaster assetMaster) {
        assetService.addAssetData(assetMaster);
    }

    @PostMapping
    List<AssetMaster> getAssetData() {
        return assetService.getAssetData();
    }*/


}
