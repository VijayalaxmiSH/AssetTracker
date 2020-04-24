package com.lk.assettracker.services;

import com.lk.assettracker.model.AssetMaster;
import com.lk.assettracker.model.AssetTypeMaster;
import com.lk.assettracker.model.EmployeeMaster;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AssetService {

    void addAssetData(AssetMaster assetMaster);

    List<AssetMaster> getAssetData(Specification<AssetMaster> assetMasterSpecification);

    AssetMaster searchEAssetById(String assetTagNumber);

    AssetMaster findActiveAssetById(String assetTagNumber);



}
