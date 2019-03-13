package com.replication.rep.uid.domain.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UniqueIdCounter {
	
	@Id
	private String contextId;
	
	@Column(name="contextName")
	private String contextName;
	
	@Column(name="lastCount")
	private int lastCount;
	
	@Column(name="fromChank")	
	private int fromChank;

	@Column(name="toChank")
	private int toChank;
	
	@Column(name="updateTime")
	private Timestamp updateTime;

	public String getContextId() {
		return contextId;
	}

	public void setContextId(String contextId) {
		this.contextId = contextId;
	}

	public String getContextName() {
		return contextName;
	}

	public void setContextName(String contextName) {
		this.contextName = contextName;
	}

	public int getLastCount() {
		return lastCount;
	}

	public void setLastCount(int lastCount) {
		this.lastCount = lastCount;
	}

	public int getFromChank() {
		return fromChank;
	}

	public void setFromChank(int fromChank) {
		this.fromChank = fromChank;
	}

	public int getToChank() {
		return toChank;
	}

	public void setToChank(int toChank) {
		this.toChank = toChank;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}
