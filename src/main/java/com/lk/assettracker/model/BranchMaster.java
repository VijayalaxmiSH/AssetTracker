package com.lk.assettracker.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(
        name = "BRANCH_MASTER\n"
)

public class BranchMaster {

    @Id
    @Column(
            name = "B_GUID",
            unique = true
    )

    @NotNull
    private String id;

    @Column(
            name = "B_NAME"
    )

    @NotNull
    private String branchName;

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

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
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
