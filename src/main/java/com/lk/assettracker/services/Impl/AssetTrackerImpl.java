package com.lk.assettracker.services.Impl;

import com.lk.assettracker.model.AssetMaster;
import com.lk.assettracker.model.AssetTrackerMaster;
import com.lk.assettracker.model.AssetTrackerResponse;
import com.lk.assettracker.model.EmployeeMaster;
import com.lk.assettracker.repository.AssetTrackerRepository;
import com.lk.assettracker.services.AssetService;
import com.lk.assettracker.services.AssetTrackerService;
import com.lk.assettracker.services.EmployeeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AssetTrackerImpl implements AssetTrackerService {

    @Autowired
    private AssetTrackerRepository assetTrackerRepository;

    @Autowired
    private EmployeeMasterService employeeMasterService;

    @Autowired
    private AssetService assetService;

    @Override
    public void assignAsset(AssetTrackerMaster assetTrackerMaster) {
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
            return assetTrackerRepository.findAssetByEmpId(employee.getId());
        }
        return null;
    }

    @Override
    public List<AssetTrackerResponse> getAssetHistory(String assetTag) {
        List<AssetTrackerResponse> assetTrackerResponses = new ArrayList<>();
        AssetMaster asset = assetService.findActiveAssetById(assetTag);
        if (Objects.nonNull(asset)) {
            List<AssetTrackerMaster> assetTrackerMasters = assetTrackerRepository.findByAssetTag(asset.getId());
            if (Objects.isNull(assetTrackerMasters)) return null;
            for (AssetTrackerMaster assetTrackerMaster : assetTrackerMasters) {
                if (Objects.isNull(assetTrackerMaster.getEmployeeId())) return null;
                EmployeeMaster employeeMaster = employeeMasterService.searchEmployeeByGUIId(assetTrackerMaster.getId());
                assetTrackerResponses.add(getDetails(assetTrackerMaster, asset, employeeMaster));
            }
            return assetTrackerResponses;
        } else return null;
    }

    @Override
    public AssetTrackerResponse getCurrentAssignee(String assetId) {
        AssetMaster asset = assetService.findActiveAssetById(assetId);
        if (Objects.isNull(asset)) return null;
        AssetTrackerMaster assetTrackerResponse = assetTrackerRepository.findCurrentAssigneeByAssetTag(asset.getId());
        if (Objects.isNull(assetTrackerResponse)) return null;
        EmployeeMaster employeeMaster = employeeMasterService.searchEmployeeByGUIId(assetTrackerResponse.getEmployeeId());
        if (Objects.isNull(employeeMaster)) return null;
        return getDetails(assetTrackerResponse, asset, employeeMaster);
    }

    private AssetTrackerResponse getDetails(AssetTrackerMaster trackerMaster, AssetMaster asset, EmployeeMaster employeeMaster) {
        AssetTrackerResponse assetTrackerResponse = new AssetTrackerResponse();
        assetTrackerResponse.setAssetId(asset.getAssetTagNumber());
        assetTrackerResponse.setAssetName(asset.getName());
        assetTrackerResponse.setEmployeeId(employeeMaster.getEmployeeId());
        assetTrackerResponse.setAssetType(asset.getAssetType());
        assetTrackerResponse.setIssueDate(trackerMaster.getIssueDate());
        assetTrackerResponse.setReturnDate(trackerMaster.getReturnDate());
        assetTrackerResponse.setRemarks(asset.getRemarks());
        assetTrackerResponse.setStatus(asset.getStatus());
        return assetTrackerResponse;
    }


}
