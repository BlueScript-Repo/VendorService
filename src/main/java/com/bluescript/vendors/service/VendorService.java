package com.bluescript.vendors.service;

import com.bluescript.vendors.request.VendorRequest;
import com.bluescript.vendors.utils.VendorUtils;
import com.bluescript.vendors.constant.StringConstants;
import com.bluescript.vendors.entity.VendorEntity;
import com.bluescript.vendors.exception.NoRecordFoundException;
import com.bluescript.vendors.repository.VendorRepo;
import com.bluescript.vendors.response.VendorDeleteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

    @Autowired
    VendorRepo vendorRepo;

    public VendorEntity createVendor(VendorRequest vendorRequest) {

        String vendorId= VendorUtils.generateId(StringConstants.vendorId_prefix);
        VendorEntity vendorEntity=new VendorEntity();
        vendorEntity.setVendorId(vendorId);
        vendorEntity.setVendorAddress(vendorRequest.getVendorAddress());
        vendorEntity.setVendorCategory(vendorRequest.getVendorCategory());
        vendorEntity.setVendorContactNo(vendorRequest.getVendorContactNo());
        vendorEntity.setVendorEmailId(vendorRequest.getVendorEmailId());
        vendorEntity.setVendorGSTnumber(vendorRequest.getVendorGSTnumber());
        vendorEntity.setVendorName(vendorRequest.getVendorName());

        return vendorRepo.save(vendorEntity);
    }

    public VendorEntity getVendor(String vendorId) {

        VendorEntity vendorEntity=vendorRepo.findByvendorId(vendorId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +vendorId);
        });
        return vendorEntity;
    }

    public VendorDeleteResponse deleteVendor(String vendorId) {

        VendorEntity vendorEntity=vendorRepo.findByvendorId(vendorId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +vendorId);
        });
        VendorDeleteResponse vendorDeleteResponse=new VendorDeleteResponse(vendorId,true);
        vendorRepo.delete(vendorEntity);

        return vendorDeleteResponse;
    }

    public VendorEntity updateVendor(String vendorId, VendorRequest vendorRequest) {

        VendorEntity vendorEntity=vendorRepo.findByvendorId(vendorId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +vendorId);
        });

        vendorEntity.getVendorId();
        vendorEntity.setVendorName(vendorRequest.getVendorName());
        vendorEntity.setVendorGSTnumber(vendorRequest.getVendorGSTnumber());
        vendorEntity.setVendorEmailId(vendorRequest.getVendorEmailId());
        vendorEntity.setVendorContactNo(vendorRequest.getVendorContactNo());
        vendorEntity.setVendorCategory(vendorRequest.getVendorCategory());
        vendorEntity.setVendorAddress(vendorRequest.getVendorAddress());

        return vendorRepo.save(vendorEntity);
    }
}
