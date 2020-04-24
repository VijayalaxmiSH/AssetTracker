package com.lk.assettracker.services.Impl;


import com.google.common.base.Strings;
import com.lk.assettracker.enums.AssetStatus;
import com.lk.assettracker.model.AssetMaster;
import com.lk.assettracker.repository.AssetRepository;
import com.lk.assettracker.services.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class AssetImpl implements AssetService {

    @Autowired
    private AssetRepository assetRepository;

    @Override
    public void addAssetData(AssetMaster assetMaster) {
        if (Objects.nonNull(assetMaster)) {
            assetMaster.setId(UUID.randomUUID().toString());
            assetMaster.setCreatedDate(Calendar.getInstance().getTime());
            assetMaster.setUpdatedDate(Calendar.getInstance().getTime());
            assetMaster.setDeleted(true);
            assetRepository.save(assetMaster);
        }
        //TODO: Throw bad request exception

    }

    @Override
    public List<AssetMaster> getAssetData(Specification<AssetMaster> assetMasterSpecification) {
        return assetRepository.findAll(assetMasterSpecification);
    }

    @Override
    public AssetMaster searchEAssetById(String assetTagNumber) {
        if (!Strings.isNullOrEmpty(assetTagNumber)) {
            return assetRepository.findByAssetId(assetTagNumber);
        } else return null; //TODO need to handle exception
    }

    @Override
    public AssetMaster findActiveAssetById(String assetTagNumber) {
        if (!Strings.isNullOrEmpty(assetTagNumber)) {
            AssetMaster assetMaster = assetRepository.findByAssetId(assetTagNumber);
            if (Objects.nonNull(assetMaster) && assetMaster.getStatus() == AssetStatus.WORKING) return assetMaster;
            else return null;
        } else return null; //TODO need to handle exception
    }
}




