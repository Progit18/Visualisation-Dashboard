package com.dashboard.controller;

import com.dashboard.model.data;
import com.dashboard.service.dataservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class datacontroller {
    @Autowired
    private dataservice dataservice;

    @GetMapping
    public List<data> getAlldata() {
        return dataservice.getAlldata();
    }

    @GetMapping("/{id}")
    public data getdataById(@PathVariable Long id) {
        return dataservice.getdataById(id);
    }

    @PostMapping
    public data savedata(@RequestBody data data) {
        return dataservice.savedata(data);
    }

    @DeleteMapping("/{id}")
    public void deletedata(@PathVariable Long id) {
        dataservice.deletedata(id);
    }
}
