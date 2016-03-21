package com.bpodesign.core.interfaces.domainServices;

public interface IServiceRequest<T> extends IServiceRequestBase {
	public T getObject();
	public void setObject(T obj);
}
