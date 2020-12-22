package com.bluescript.vendors.response;

public class VendorDeleteResponse {

    private String vendorId;
    private boolean vendorIdDeleted;

    public VendorDeleteResponse(String vendorId, boolean vendorIdDeleted) {
        this.vendorId = vendorId;
        this.vendorIdDeleted = vendorIdDeleted;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public boolean isVendorIdDeleted() {
        return vendorIdDeleted;
    }

    public void setVendorIdDeleted(boolean vendorIdDeleted) {
        this.vendorIdDeleted = vendorIdDeleted;
    }
}
