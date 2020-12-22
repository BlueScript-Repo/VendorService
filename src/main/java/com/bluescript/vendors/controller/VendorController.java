package com.bluescript.vendors.controller;

import com.bluescript.vendors.request.VendorRequest;
import com.bluescript.vendors.entity.VendorEntity;
import com.bluescript.vendors.response.VendorDeleteResponse;
import com.bluescript.vendors.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/vendorDetails")
public class VendorController {

    @Autowired
    VendorService vendorService;

    @PostMapping
    public VendorEntity createVendor(@RequestBody @Valid VendorRequest vendorRequest){
        return vendorService.createVendor(vendorRequest);
    }

    @GetMapping("/{vendorId}")
    public VendorEntity getVendor(@PathVariable ("vendorId") String vendorId){
        return vendorService.getVendor(vendorId);
    }

    @DeleteMapping("/{vendorId}")
    public VendorDeleteResponse deleteVendor(@PathVariable ("vendorId") String vendorId){
        return vendorService.deleteVendor(vendorId);
    }

    @PutMapping("/{vendorId}")
    public VendorEntity updateVendor(@PathVariable ("vendorId") String vendorId,@RequestBody @Valid VendorRequest vendorRequest){
        return vendorService.updateVendor(vendorId,vendorRequest);
    }
}
