package com.ems.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
