package com.lk.assettracker.services;

import com.lk.assettracker.model.AssetTypeMaster;

import java.util.List;

public interface AssetTypeService {

    void addAssetType(AssetTypeMaster assetTypeMaster);

    List<AssetTypeMaster> getAssetType();
}
