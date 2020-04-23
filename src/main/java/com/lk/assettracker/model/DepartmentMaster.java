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
        name = "DEPARTMENT_MASTER"
)
public class DepartmentMaster {

    @Id
    @Column(
            name = "D_GUID",
            unique = true
    )

    @NotNull
    private String id;

    @Column(
            name = "D_NAME"
    )
    @NotNull
    private String departmentName;

    @Column(
            name = "CREATED_DATE"
    )
    @NotNull
    @CreationTimestamp
    private Date createdDate;

    @Column(
            name = "UPDATED_DATE"
    )
    @NotNull
    @UpdateTimestamp
    private Date updatedDate;

    @Column(
            name = "IS_DELETED"
    )
    @NotNull
    private boolean isDeleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
