package com.application.rest.persistence;

import com.application.rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerDAO {

    List<Maker> findAll();

    Optional<Maker> finById(Long id);

    void save(Maker maker);

    void deleteMakerById(Long id);

}
