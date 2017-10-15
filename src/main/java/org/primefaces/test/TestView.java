package org.primefaces.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultOrganigramNode;
import org.primefaces.model.OrganigramNode;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3587328058256135536L;

	private String testString;

	@PostConstruct
	public void init() {
		testString = "Welcome to PrimeFaces!!!";
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}

	public OrganigramNode getRootNode() {
		return new DefaultOrganigramNode("root", "TEST", null);
	}
}
