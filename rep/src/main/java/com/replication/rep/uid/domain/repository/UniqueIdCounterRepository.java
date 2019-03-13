package com.replication.rep.uid.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.replication.rep.uid.domain.model.UniqueIdCounter;

@Repository
public interface UniqueIdCounterRepository extends JpaRepository<UniqueIdCounter, String>{

}
