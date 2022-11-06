package com.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {
}
