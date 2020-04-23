package com.lk.assettracker.controller;


import com.lk.assettracker.model.AssetMaster;
import com.lk.assettracker.query.AssetSpec;
import com.lk.assettracker.services.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/asset")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @PostMapping
    void addAssetData(@RequestBody AssetMaster assetMaster) {
        assetService.addAssetData(assetMaster);
    }

    @GetMapping
    List<AssetMaster> getAssetData(AssetSpec assetSpec) {
     return assetService.getAssetData(assetSpec);
    }


}
