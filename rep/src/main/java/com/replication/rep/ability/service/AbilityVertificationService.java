package com.replication.rep.ability.service;

import java.util.List;

import com.replication.rep.ability.domain.model.AbilityVerification;

public interface AbilityVertificationService {
	
	/**
	 * PKに一致するAbilityVerificationを取得
	 * @param id
	 * @return
	 */
	AbilityVerification get(Integer id);
	
	/**
	 * AbilityVerificationの全件取得
	 * @return
	 */
	List<AbilityVerification> selectAll();	
}
