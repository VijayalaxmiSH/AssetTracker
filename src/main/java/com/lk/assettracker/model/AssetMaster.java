package com.lk.assettracker.model;


import com.lk.assettracker.enums.AssetStatus;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import springfox.documentation.spring.web.json.Json;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(
        name = "ASSET_MASTER"
)
public class AssetMaster {

    @Id
    @Column(
            name = "AM_GUID",
            unique = true
    )
    @NotNull
    private String id;

    @Column(
            name = "AM_ASSET_TYPE"
    )
    @NotNull
    private String assetType;

    @Column(
            name = "AM_BRANCH"
    )
    @NotNull
    private String branch;

    @Column(
            name = "AM_NAME "
    )
    private String name;


    @Column(
            name = "AM_DEPARTMENT"
    )
    @NotNull
    private String department;

    @Column(
            name = "AM_VENDOR"
    )
    private String vendor;

    @Column(
            name = "AM_INVOICE_NUMBER"
    )
    private String invoiceNumber;

    @Column(
            name = "AM_INVOICE_DATE"
    )
    @NotNull
    @CreationTimestamp
    private Date invoiceDate;

    @Column(
            name = "AM_BILLING_COMPANY_NAME"
    )
    private String billingCompanyName;

    @Column(
            name = "AM_SERIAL_NUMBER"
    )
    private String serialNumber;

    @Column(
            name = "AM_ASSET_TAG_NUMBER",
            unique = true

    )
    @NotNull
    private String assetTagNumber;

    @Column(
            name = "AM_CREATED_BY"
    )
    @NotNull
    private String createBy;

    @Column(
            name = "AM_SPECIFICATION"
    )
    private String specification;

    @Column(
            name = "AM_STATUS"
    )
    @Enumerated(EnumType.STRING)
    private AssetStatus status;

    @Column(
            name = "AM_REMARKS"
    )
    private String remarks;


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

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getBillingCompanyName() {
        return billingCompanyName;
    }

    public void setBillingCompanyName(String billingCompanyName) {
        this.billingCompanyName = billingCompanyName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAssetTagNumber() {
        return assetTagNumber;
    }

    public void setAssetTagNumber(String assetTagNumber) {
        this.assetTagNumber = assetTagNumber;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public AssetStatus getStatus() {
        return status;
    }

    public void setStatus(AssetStatus status) {
        this.status = status;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
