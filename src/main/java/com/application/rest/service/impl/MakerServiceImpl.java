package com.application.rest.service.impl;

import com.application.rest.entities.Maker;
import com.application.rest.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakerServiceImpl implements IMakerService {

    @Autowired
    private IMakerService makerService;

    @Override
    public List<Maker> findAll() {
        return makerService.findAll();
    }

    @Override
    public Optional<Maker> finById(Long id) {
        return makerService.finById(id);
    }

    @Override
    public void save(Maker maker) {
        makerService.save(maker);

    }

    @Override
    public void deleteMakerById(Long id) {
        makerService.deleteMakerById(id);

    }
}
