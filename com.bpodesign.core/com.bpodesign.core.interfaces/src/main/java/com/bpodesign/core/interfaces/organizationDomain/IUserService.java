package com.bpodesign.core.interfaces.organizationDomain;

import com.bpodesign.core.interfaces.domainServices.*;
import com.bpodesign.core.entities.*;

public interface IUserService {
	public IServiceResponse<User> CreateUser(IServiceRequest<User> request);
}
