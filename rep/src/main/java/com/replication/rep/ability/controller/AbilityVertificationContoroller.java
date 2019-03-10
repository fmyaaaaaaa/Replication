package com.replication.rep.ability.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.replication.rep.ability.domain.model.AbilityVerification;
import com.replication.rep.ability.service.AbilityVertificationService;
import com.replication.rep.cache.CacheManager;

@RestController
public class AbilityVertificationContoroller {
	
	@Autowired
	AbilityVertificationService abilityVertificationService;
	
	@Autowired
	CacheManager cacheManager;
	
	@RequestMapping(value = "/ability/get", method = RequestMethod.GET)
	private AbilityVerification get(String code) {
		AbilityVerification ability = cacheManager.getAbilityVerification(code);
		return ability;
	}
	
	@RequestMapping(value = "/ability/getall", method = RequestMethod.GET)
	private List<AbilityVerification> selectAll() {
		List<AbilityVerification> abilityList = abilityVertificationService.selectAll();
		return abilityList;
	}
}
