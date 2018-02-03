package org.primefaces.test;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.Push;
import org.omnifaces.cdi.PushContext;

@Named
//@ApplicationScoped
@ViewScoped
public class ApplicationSocket implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 67715084034342565L;

	@Inject
	@Push(channel = "secondChannel")
	private PushContext socket;

	private boolean readOnly = true;

	public void turnOnEditMode() {
		readOnly = false;
		socket.send(readOnly);
	}

	public void sendMessage(Object message) {
		socket.send(message);
	}

	public PushContext getSocket() {
		return socket;
	}

	public void setSocket(PushContext socket) {
		this.socket = socket;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

}
