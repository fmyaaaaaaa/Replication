package com.replication.rep.ability.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.replication.rep.ability.domain.model.AbilityVerification;
import com.replication.rep.ability.domain.repository.AbilityRepository;

@Service
@Transactional
public class AbilityVertificationServiceImpl implements AbilityVertificationService {
	
	@Autowired
	AbilityRepository abilityRepository;
	
	/** Log */
	private Log log = LogFactory.getLog(AbilityVertificationServiceImpl.class);

	@Override
	public AbilityVerification get(Integer id) {
		log.info("AbilityVerification get:" + id);
		return abilityRepository.getOne(id);
	}
	
	@Override
	public List<AbilityVerification> selectAll() {
		log.info("AbilityVerification getAll");
		return abilityRepository.findAll();
	}
}
