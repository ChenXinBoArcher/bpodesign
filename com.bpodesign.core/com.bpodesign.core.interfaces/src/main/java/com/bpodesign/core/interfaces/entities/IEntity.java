package com.bpodesign.core.interfaces.entities;

public interface IEntity {
	public Long getId();
	public void setId(Long newId);
	
	public int getVersion();
	public void setVersion(int newVersion);
	
	public Boolean getIsDeleted();
	public void setIsDeleted(Boolean deleted);
	
	
}
