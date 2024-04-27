package com.crudproject.CloudVendor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    VendorModel vendorModel;
    @GetMapping("/h1")
    public String hello()
    {
        return "hello kunal";
    }
    //getting vendor details by their id
    @GetMapping("{vendorId}")
    public VendorModel getVendorDetails(String vendorId)
    {
      //  return new VendorModel("1","kunal","nsk");
        return  vendorModel;
    }
    // adding new vendor details
    @PostMapping
    public  String createCloudVendor(@RequestBody VendorModel vendorModel)
    {
        this.vendorModel=vendorModel;
        return "successfully Created";
    }
    //putmapping is
    @PutMapping
    public  String updateCloudVendor(@RequestBody VendorModel vendorModel)
    {
        this.vendorModel=vendorModel;
        return "successfully updated";
    }

    //using vendorid data will be deleted
    @DeleteMapping("{vendorID}")
    public  String deleteCloudVendor(String vendorId)
    {
        this.vendorModel=null;
        return "successfully Deleted";
    }
}
