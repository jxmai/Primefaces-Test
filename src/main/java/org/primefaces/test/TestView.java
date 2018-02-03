package org.primefaces.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

//@ManagedBean(name = "testView")
//@ViewScoped
@ViewScoped
@Named
public class TestView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4124891683211838799L;

	private Info info = new Info();

	@PostConstruct
	public void init() {
		info.setName("Jane Smith");

		info.setDescription("Test");
	}

	public void editButtonAction() {
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Successful", "Edit mode is on"));

		System.out.println("Edit button action");
		this.info.setReadOnly(false);
	}
	
	public void onEdit() {
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Successful", "Editing"));

	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
}
