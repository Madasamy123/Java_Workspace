package com.temperatureData.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Organization implements Serializable {
    private String name;
    private String certificateid;
    private String type;
    private Date dateOfInitiation;
    private String email;
    private String phone;
    private String ceo;
    private List<Location> location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateOfInitiation() {
        return dateOfInitiation;
    }

    public void setDateOfInitiation(Date dateOfInitiation) {
        this.dateOfInitiation = dateOfInitiation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone(String number) {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }


    public String toString(){
        return this.name+" "+
                this.ceo+" "+
                this.email+" "+
                this.phone;
    }

}
