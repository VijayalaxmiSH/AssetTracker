package com.lk.assettracker.repository;

import com.lk.assettracker.model.UserMobileData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserMobileDataRepository extends JpaRepository<UserMobileData, String> {

    @Query("SELECT u FROM UserMobileData u WHERE u.mobileNumber = :#{#mobileNumber}")
    UserMobileData getUserByMobileNumber(String mobileNumber);
}
