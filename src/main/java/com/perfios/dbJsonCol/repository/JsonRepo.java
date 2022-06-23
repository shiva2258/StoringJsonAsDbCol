package com.perfios.dbJsonCol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfios.dbJsonCol.entity.InputData;

public interface JsonRepo extends JpaRepository<InputData, Integer> {

}
