package com.lk.assettracker.services;

import com.lk.assettracker.model.SystemAdminMaster;

import java.util.List;

public interface SystemAdminService {

    void registerAdmin(SystemAdminMaster systemAdminMaster);

    List<SystemAdminMaster> getAdmin();
}
