package com.replication.rep.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.replication.rep.uid.domain.repository.UniqueIdCounterRepository;

public class UniqueIdGenerator {
	
	@Autowired
	UniqueIdCounterRepository uidRepository;
	
	

}
