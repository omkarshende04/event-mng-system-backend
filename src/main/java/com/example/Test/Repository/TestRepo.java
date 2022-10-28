package com.example.Test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Test.Entity.TestEntity;

@Repository
public interface TestRepo extends JpaRepository<TestEntity, Long>{

}
