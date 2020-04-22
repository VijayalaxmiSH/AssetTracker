package com.lk.assettracker.model;

import org.hibernate.annotations.Columns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(
        name = "UserMobileData"
)
public class UserMobileData implements Serializable {

    @Id
    @Column(
            name = "GUID",
            unique = true
    )
    private String id;

    @Column(
            name = "NAME"
    )
    private String name;

    @Column(
            name = "MOBILENUMBER"
    )
    private String mobileNumber;

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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
