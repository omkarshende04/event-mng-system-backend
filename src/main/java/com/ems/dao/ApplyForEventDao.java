package com.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.entity.ApplyForEvent;

@Repository
public interface ApplyForEventDao extends JpaRepository<ApplyForEvent, Long>{

}
