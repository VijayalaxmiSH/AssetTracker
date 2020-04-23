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
        name = "ASSET_TYPE_MASTER"
)
public class AssetTypeMaster {

    @Id
    @Column(
            name = "AT_GUID",
            unique = true
    )
    @NotNull
    private String id;

    @Column(
            name = "AT_NAME"
    )
    @NotNull
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
