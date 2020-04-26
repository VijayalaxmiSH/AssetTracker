package com.lk.assettracker.services.Impl;

import com.lk.assettracker.model.AssetMaster;
import com.lk.assettracker.model.AssetTrackerMaster;
import com.lk.assettracker.model.EmployeeMaster;
import com.lk.assettracker.repository.AssetTrackerRepository;
import com.lk.assettracker.services.AssetService;
import com.lk.assettracker.services.AssetTrackerService;
import com.lk.assettracker.services.EmployeeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
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
            EmployeeMaster employee = employeeMasterService.searchEmployeeById(assetTrackerMaster.getEmployeeId());
            AssetMaster asset = assetService.findActiveAssetById(assetTrackerMaster.getAssetId());
            if (Objects.isNull(employee) ||
                    Objects.isNull(asset)) {
                //TODO:need handle exception
            } else {
                assetTrackerMaster.setId(UUID.randomUUID().toString());
                assetTrackerMaster.setEmployeeId(employee.getId());
                assetTrackerMaster.setAssetId(asset.getId());
                assetTrackerMaster.setIssueDate(Calendar.getInstance().getTime());
                assetTrackerMaster.setCreatedDate(Calendar.getInstance().getTime());
                assetTrackerMaster.setUpdateDate(Calendar.getInstance().getTime());
                assetTrackerRepository.save(assetTrackerMaster);
            }
        }

    }

    @Override
    public List<AssetTrackerMaster> getEmployeeAssetDetails(String employeeId) {
        EmployeeMaster employee = employeeMasterService.searchEmployeeById(employeeId);
        if (Objects.nonNull(employee)) {
            return assetTrackerRepository.findAssetByEmployeeId(employee.getId());
        }
        return null;
    }


}
