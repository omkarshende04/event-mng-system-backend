package com.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.entity.RegisterEvent;

@Repository
public interface CardDataDao extends JpaRepository<RegisterEvent, String> {

}
