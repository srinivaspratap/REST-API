package com.example.RestdemoShowoff3.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestdemoShowoff3.model.cvendor;

@RestController
@RequestMapping("/vendorr")
public class cAPI {
    cvendor cloud;
    @GetMapping("{vendorId}")
    
    public cvendor getvendordetails(String vendorId)
    {
        return cloud;
        //new cvendor("A1","srinivas","tpg","xxx");
    }
    @PostMapping
    public String postvendordetails(@RequestBody cvendor cloud)
    {
        this.cloud=cloud;
        return "added successfully";
    }

    @PutMapping
    public String putvendordetails(@RequestBody cvendor cloud)
    {
        this.cloud=cloud;
        return "updated success";
    }
    @DeleteMapping("{vendorId}")
    public String delvendordetails(String vendorId)
    {
        this.cloud=null;
        return "deleted succesfully";
    }
}
