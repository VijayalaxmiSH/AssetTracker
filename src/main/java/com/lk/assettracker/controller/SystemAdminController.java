package com.lk.assettracker.controller;

import com.lk.assettracker.model.SystemAdminMaster;
import com.lk.assettracker.services.SystemAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/admin")
public class SystemAdminController{

   @Autowired
    SystemAdminService systemAdminService;

   @PostMapping
    void registerAdmin(@RequestBody SystemAdminMaster systemAdminMaster){
       systemAdminService.registerAdmin(systemAdminMaster);
   }

   @GetMapping
    List<SystemAdminMaster> getAdmin(){
       return systemAdminService.getAdmin();
   }


}
