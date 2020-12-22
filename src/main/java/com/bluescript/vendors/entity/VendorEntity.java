package com.bluescript.vendors.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "vendor")
public class VendorEntity {

    @Id
    private String vendorId;
    @NotNull
    private String vendorName;
    private int vendorContactNo;
    @NotNull
    private String vendorEmailId;
    private String vendorAddress;
    private String vendorGSTnumber;
    @NotNull
    private String vendorCategory;

    public VendorEntity() {
    }

    public VendorEntity(String vendorId, String vendorName, int vendorContactNo, String vendorEmailId, String vendorAddress, String vendorGSTnumber, String vendorCategory) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorContactNo = vendorContactNo;
        this.vendorEmailId = vendorEmailId;
        this.vendorAddress = vendorAddress;
        this.vendorGSTnumber = vendorGSTnumber;
        this.vendorCategory = vendorCategory;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public int getVendorContactNo() {
        return vendorContactNo;
    }

    public void setVendorContactNo(int vendorContactNo) {
        this.vendorContactNo = vendorContactNo;
    }

    public String getVendorEmailId() {
        return vendorEmailId;
    }

    public void setVendorEmailId(String vendorEmailId) {
        this.vendorEmailId = vendorEmailId;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorGSTnumber() {
        return vendorGSTnumber;
    }

    public void setVendorGSTnumber(String vendorGSTnumber) {
        this.vendorGSTnumber = vendorGSTnumber;
    }

    public String getVendorCategory() {
        return vendorCategory;
    }

    public void setVendorCategory(String vendorCategory) {
        this.vendorCategory = vendorCategory;
    }

    @Override
    public String toString() {
        return "VendorEntity{" +
                "vendorId='" + vendorId + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", vendorContactNo=" + vendorContactNo +
                ", vendorEmailId='" + vendorEmailId + '\'' +
                ", vendorAddress='" + vendorAddress + '\'' +
                ", vendorGSTnumber='" + vendorGSTnumber + '\'' +
                ", vendorCategory='" + vendorCategory + '\'' +
                '}';
    }
}
