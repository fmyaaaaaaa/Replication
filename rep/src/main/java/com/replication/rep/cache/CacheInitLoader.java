package com.replication.rep.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.replication.rep.ability.domain.model.AbilityVerification;
import com.replication.rep.ability.service.AbilityVertificationService;

@Configuration
public class CacheInitLoader {

	@Autowired
	CacheManager cacheManager;
	
	@Autowired
	AbilityVertificationService abilityVertificationService;
	
	@Bean
	public void initAbilityVertification() {
		List<AbilityVerification> abilityVerifications = abilityVertificationService.selectAll();
		cacheManager.initAbilityVertificationCache(abilityVerifications);
	}
}
