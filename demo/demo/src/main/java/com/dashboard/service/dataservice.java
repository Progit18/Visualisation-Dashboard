package com.dashboard.service;

import com.dashboard.model.data;
import com.dashboard.repository.datarepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dataservice {
    private final datarepository dataRepository;

    public dataservice(datarepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<data> getAlldata() {
        return dataRepository.findAll();
    }

    public data getdataById(Long id) {
        return dataRepository.findById(id).orElse(null);
    }

    public data savedata(data data) {
        return dataRepository.save(data);
    }

    public void deletedata(Long id) {
        dataRepository.deleteById(id);
    }
}
