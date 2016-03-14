package com.bpodesign.core.interfaces.domainServices;

public interface IServiceResponse<T> {
	public T getResult();
	public T setResult();
	
	public Boolean getIsSuccess();
	public void setIsSuccess();
	
	public String getMessage();
	public void setMessage();
}
