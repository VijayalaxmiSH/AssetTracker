package com.lk.assettracker.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(
        name = "SYSTEM_ADMIN_MASTER"
)
public class SystemAdminMaster {

    @Id
    @Column(
            name = "S_GUID",
            unique = true
    )
    @NotNull
    private String id;

    @Column(
            name = "S_EMPLOYEE_ID",
            unique = true
    )
    @NotNull
    private String employeeId;

    @Column(
            name = "CREATED_DATE"
    )
    @NotNull
    @CreationTimestamp
    private Date createdDate;

    @Column(
            name = "UPDATED_DATE "
    )
    @NotNull
    @UpdateTimestamp
    private Date updatedDate;

    @Column(
            name = "IS_ACTIVE"
    )
    @NotNull
    private boolean isActive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
