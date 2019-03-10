package com.replication.rep.cache;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.replication.rep.ability.domain.model.AbilityVerification;


public class CacheManager {
	
	/**
	 * AbilityVerificationのキャッシュ
	 */
	private final ConcurrentHashMap<String, AbilityVerification> abilityVerificationCache = new ConcurrentHashMap<String, AbilityVerification>();
	
	/** Log */
	private Log log = LogFactory.getLog(CacheManager.class);
	
	public void putAbilityVerificationCache(AbilityVerification abilityVerification) {
		this.abilityVerificationCache.put(abilityVerification.getCode(), abilityVerification);
	}
	
	public AbilityVerification getAbilityVerification(String code) {
		return this.abilityVerificationCache.get(code);
	}
	
	protected void initAbilityVertificationCache(List<AbilityVerification> targets) {
		log.info("Initialize Cache :" + targets.size());
		if(!targets.isEmpty()) {
			targets.forEach(e -> {
				this.abilityVerificationCache.put(e.getCode(), e);				
			});
		}
	}
}
