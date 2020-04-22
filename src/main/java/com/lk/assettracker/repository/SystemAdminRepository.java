package com.lk.assettracker.repository;

import com.lk.assettracker.model.SystemAdminMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemAdminRepository extends JpaRepository<SystemAdminMaster, String> {
}
