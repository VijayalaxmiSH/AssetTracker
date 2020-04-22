package com.lk.assettracker.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(
        name = "ASSET_TRACKER_MASTER"
)
public class AssetTrackerMaster {

    @Id
    @Column(
            name = "ATM_GUID",
            unique = true
    )

    @NotNull
    private String id;

    @Column(
            name = "AMT_EMPLOYEE_ID"
    )

    @NotNull
    private String employeeId;

    @Column(
            name = "AMT_ASSET_ID "
    )

    @NotNull
    private String assetId;

    @Column(
            name = "AMT_ISSUE_DATE"
    )

    @NotNull
    @CreationTimestamp
    private Date issueDate;

    @Column(
            name = "AMT_RETURN_DATE"
    )

    @NotNull
    @CreationTimestamp
    private Date returnDate;

    @Column(
            name = "AM_REMARKS"
    )

    private String remarks;

    @Column(
            name = "CREATED_DATE "
    )

    @NotNull
    @CreationTimestamp
    private Date createdDate;

    @Column(
            name = "UPDATED_DATE"
    )

    @NotNull
    @CreationTimestamp
    private Date updateDate;

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

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
