package com.bpodesign.core.interfaces.domainServices;

import com.bpodesign.core.entities.User;

public interface IServiceRequestBase {

	public User getRequestor();
	public void setRequestor(User requestor);
	
	
}
