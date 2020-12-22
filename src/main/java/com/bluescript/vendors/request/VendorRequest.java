package com.bluescript.vendors.request;

public class VendorRequest {

    private String vendorName;
    private int vendorContactNo;
    private String vendorEmailId;
    private String vendorAddress;
    private String vendorGSTnumber;
    private String vendorCategory;

    public VendorRequest() {
    }

    public VendorRequest( String vendorName, int vendorContactNo, String vendorEmailId, String vendorAddress, String vendorGSTnumber, String vendorCategory) {

        this.vendorName = vendorName;
        this.vendorContactNo = vendorContactNo;
        this.vendorEmailId = vendorEmailId;
        this.vendorAddress = vendorAddress;
        this.vendorGSTnumber = vendorGSTnumber;
        this.vendorCategory = vendorCategory;
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
}
