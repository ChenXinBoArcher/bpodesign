package com.bpodesign.core.interfaces.entities;

import org.joda.time.DateTime;


public interface IUser extends IEntity {
	public String getName();
	public void setName(String newName);
	
	public String getDescription();
	public void setDescription(String newDescription);
	
	public IOrganization getOrganization();
	public void setOrganization(IOrganization newOrganization);
	
	public DateTime getRegistrationTime();
	public void setRegistrationTime(DateTime dateTime);
	
	public String getEmail();
	public void setEmail(String newEmail);
	
	public Boolean getIsActived();
	public void setIsActived(Boolean actived);
}
