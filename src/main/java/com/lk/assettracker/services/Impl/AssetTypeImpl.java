package com.lk.assettracker.services.Impl;

import com.lk.assettracker.model.AssetTypeMaster;
import com.lk.assettracker.repository.AssetTypeRepository;
import com.lk.assettracker.services.AssetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class AssetTypeImpl implements AssetTypeService {

    @Autowired
    private AssetTypeRepository assetTypeRepository;

    @Override
    public void addAssetType(AssetTypeMaster assetTypeMaster) {
        if (Objects.nonNull(assetTypeMaster)) {
            assetTypeMaster.setId(UUID.randomUUID().toString());
            assetTypeMaster.setCreatedDate(Calendar.getInstance().getTime());
            assetTypeMaster.setUpdatedDate(Calendar.getInstance().getTime());
            assetTypeMaster.setDeleted(true);
            assetTypeRepository.save(assetTypeMaster);
        }
//TODO: need to handle exception
    }

    @Override
    public List<AssetTypeMaster> getAssetType() {
        return assetTypeRepository.findAll();
    }
}
