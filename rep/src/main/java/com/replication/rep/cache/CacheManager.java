package com.replication.rep.cache;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.replication.rep.ability.domain.model.AbilityVerification;

public class CacheManager {
	
	/**
	 * AbilityVerificationのキャッシュ
	 */
	@Autowired
	private ConcurrentHashMap<String, AbilityVerification> abilityVerificationCache;
	
	public void putAbilityVerificationCache(AbilityVerification abilityVerification) {
		this.abilityVerificationCache.put(abilityVerification.getCode(), abilityVerification);
	}
	
	public AbilityVerification getAbilityVerification(String code) {
		return this.abilityVerificationCache.get(code);
	}
}
