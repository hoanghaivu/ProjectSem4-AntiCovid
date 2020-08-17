package com.sem4.covid.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "patient_location")
public class PatientLocation {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "patient_id")
    private Integer patientId;

    @Column(name = "verify_date")
    private java.sql.Timestamp verifyDate;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public java.sql.Timestamp getVerifyDate() {
        return verifyDate;
    }

    public void setVerifyDate(java.sql.Timestamp verifyDate) {
        this.verifyDate = verifyDate;
    }

}
