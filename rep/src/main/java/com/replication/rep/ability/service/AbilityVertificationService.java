package com.replication.rep.ability.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.replication.rep.ability.domain.model.AbilityVerification;
import com.replication.rep.ability.domain.repository.AbilityRepository;

@Service
@Transactional
public class AbilityVertificationService {
	
	@Autowired
	AbilityRepository abilityRepository;

	public List<AbilityVerification> selectAll() {
		return abilityRepository.findAll();
	}

}
