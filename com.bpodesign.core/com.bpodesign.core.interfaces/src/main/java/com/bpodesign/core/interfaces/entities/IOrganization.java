package com.bpodesign.core.interfaces.entities;

import java.util.List;

import org.joda.time.DateTime;

public interface IOrganization extends IEntity {
	public String getName();
	public void setName(String newName);
	
	public String getDescription();
	public void setDescription(String newDescription);
	
	public IUser getRegistrant();
	public void setRegistrant(IUser registrantUser);
	
	public DateTime getRegistrationTime();
	public void setRegistrationTime(DateTime registrationTime);
	
	public List<IUser> getMembers();
	public void AddMember(IUser newMember);
	public void RemoveMember(IUser member);
	
	public Boolean getIsActived();
	public void setIsActived(Boolean actived);
	
}
