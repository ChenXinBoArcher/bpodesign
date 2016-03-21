package com.bpodesign.core.interfaces.domainServices;

public interface IServiceResponse<T> extends IServiceResponseBase {
	
	public T getResult();
	public T setResult();
	
}
