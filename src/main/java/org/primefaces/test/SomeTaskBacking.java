package org.primefaces.test;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.Push;
import org.omnifaces.cdi.PushContext;

@Named
@RequestScoped
public class SomeTaskBacking {


    @Inject @Push
    private PushContext async;

    public void start() {
    	
    }

	public PushContext getAsync() {
		return async;
	}

	public void setAsync(PushContext async) {
		this.async = async;
	}

}