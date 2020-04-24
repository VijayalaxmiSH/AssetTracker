package com.lk.assettracker.services.Impl;

import com.lk.assettracker.model.AssetTrackerMaster;
import com.lk.assettracker.repository.AssetTrackerRepository;
import com.lk.assettracker.services.AssetService;
import com.lk.assettracker.services.AssetTrackerService;
import com.lk.assettracker.services.EmployeeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Objects;
import java.util.UUID;

@Service
public class AssetTrackerImpl implements AssetTrackerService {

    @Autowired
    private AssetTrackerRepository assetTrackerRepository;

    @Autowired
    private EmployeeMasterService employeeMasterService;

    @Autowired
    private AssetService assetService;

    @Override
    public void entryToAssetTracker(AssetTrackerMaster assetTrackerMaster) {
        if (Objects.nonNull(assetTrackerMaster)) {
            if (Objects.isNull(employeeMasterService.searchEmployeeById(assetTrackerMaster.getEmployeeId())) &&
                    Objects.isNull(assetService.searchEAssetById(assetTrackerMaster.getAssetId())) &&
                    Objects.isNull(assetService.findActiveAssetById(assetTrackerMaster.getAssetId()))) {
                //TODO:need handle exception
            } else {
                assetTrackerMaster.setId(UUID.randomUUID().toString());
                assetTrackerMaster.setCreatedDate(Calendar.getInstance().getTime());
                assetTrackerMaster.setUpdateDate(Calendar.getInstance().getTime());
                assetTrackerRepository.save(assetTrackerMaster);
            }
        }

    }
}
