package com.lk.assettracker.controller;

import com.lk.assettracker.model.AssetTypeMaster;
import com.lk.assettracker.services.AssetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/assetType")
public class AssetTypeController {

    @Autowired
    private AssetTypeService assetTypeService;

    @PostMapping
    void addAssetType(@RequestBody AssetTypeMaster assetTypeMaster) {
        assetTypeService.addAssetType(assetTypeMaster);
    }

    @GetMapping
    List<AssetTypeMaster> getAssetType() {
        return assetTypeService.getAssetType();
    }

}
