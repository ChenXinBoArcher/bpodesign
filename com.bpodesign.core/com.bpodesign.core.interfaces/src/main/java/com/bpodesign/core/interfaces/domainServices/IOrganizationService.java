package com.bpodesign.core.interfaces.domainServices;

import java.util.List;
import com.bpodesign.core.interfaces.entities.IOrganization;
import com.bpodesign.core.interfaces.entities.IUser;

public interface IOrganizationService {
	
	public IServiceResponse<IOrganization> CreateOrganization(IOrganization organization, IUser registrant);
	
	public IServiceResponse<IOrganization> UpdateOrganization(IOrganization organization, IUser registrant);
	
	public IServiceResponse<IOrganization> AddOrganizationMember(IOrganization organization, IUser operator, IUser member);
	
	public IServiceResponse<IOrganization> AddOrganizationMember(IOrganization organization, IUser operator, List<IUser> memberList);
	
	public IServiceResponse<IUser> CreateUser(IUser registrant);
	
	public IServiceResponse<IUser> UpdateUser(IUser registrant);
	
}
