package com.replication.rep.ability.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.replication.rep.ability.domain.model.AbilityVerification;

@Repository
public interface AbilityRepository extends JpaRepository<AbilityVerification, Integer>{

}
