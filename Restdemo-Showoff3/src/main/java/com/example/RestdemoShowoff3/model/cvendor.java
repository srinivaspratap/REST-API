package com.example.RestdemoShowoff3.model;

public class cvendor {
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorphone;
    public cvendor(String vendorId, String vendorName, String vendorAddress, String vendorphone) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorphone = vendorphone;
    }
    public String getVendorId() {
        return vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public String getVendorphone() {
        return vendorphone;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public void setVendorphone(String vendorphone) {
        this.vendorphone = vendorphone;
    }
    @Override
    public String toString() {
        return "cvendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
                + ", vendorphone=" + vendorphone + "]";
    }
}
