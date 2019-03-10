package com.replication.rep.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.replication.rep.cache.CacheManager;

@Configuration
public class BeanConfiguration {
	
	/**
	 * CacheManagerを初期化し、Beanに登録する。
	 * CacheManagerの呼び出しには @Autowired のアノテーションを付与する。
	 * @return
	 */
	@Bean
	public CacheManager cretaeCacheManager() {
		return new CacheManager();
	}
}
