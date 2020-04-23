package com.lk.assettracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(
        name = "EMPLOYEE_MASTER"
)
public class EmployeeMaster {

    @Id
    @Column(
            name = "E_GUID",
            unique = true
    )
    @NotNull
    @JsonProperty(access =  JsonProperty.Access.READ_ONLY)
    private String id;

    @Column(
            name = "E_ID",
            unique = true
    )
    @NotNull
    private String employeeId;

    @Column(
            name = "E_NAME"
    )
    @NotNull
    private String employeeName;

    @Column(
            name = "E_CONTACT_NO"
    )
    @NotNull
    private String contactNumber;

    @Column(
            name = "E_EMAIL_ID"
    )
    @NotNull
    private String emailId;

    @Column(
            name = "CREATED_DATE"
    )
    @NotNull
    @CreationTimestamp
    @JsonProperty(access =  JsonProperty.Access.READ_ONLY)
    private Date createdDate;

    @Column(
            name = "UPDATED_DATE"
    )
    @NotNull
    @UpdateTimestamp
    @JsonProperty(access =  JsonProperty.Access.READ_ONLY)
    private Date updatedDate;

    @JsonIgnore
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

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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
