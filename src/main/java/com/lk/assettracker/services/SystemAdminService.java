package com.lk.assettracker.services;

import com.lk.assettracker.model.SystemAdminMaster;
import com.lk.assettracker.repository.SystemAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SystemAdminService {

    void registerAdmin(SystemAdminMaster systemAdminMaster);

    List<SystemAdminMaster> getAdmin();
}
