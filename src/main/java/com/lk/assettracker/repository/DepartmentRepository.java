package com.lk.assettracker.repository;

import com.lk.assettracker.model.DepartmentMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentMaster, String> {
}
