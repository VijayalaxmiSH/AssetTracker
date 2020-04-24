package com.lk.assettracker.repository;

import com.lk.assettracker.model.AssetMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AssetRepository extends JpaRepository<AssetMaster, String>, JpaSpecificationExecutor<AssetMaster> {

    @Query("SELECT a FROM AssetMaster a WHERE a.assetTagNumber = :#{#assetTagNumber}")
    AssetMaster findByAssetId(String assetTagNumber);

}
