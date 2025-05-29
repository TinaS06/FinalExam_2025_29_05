package org.example.service;
import org.example.Repository.StopRepository;
import org.springframework.stereotype.Service;

@Service
public class StopService {

    private final StopRepository stopRepository;
    public StopService(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }



}
