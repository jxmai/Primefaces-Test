package org.primefaces.test;

import java.io.Serializable;

public class Person implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 9204747603994128392L;

    private Integer id;

    private String name;

    private Boolean isActive;

    private String description;

    public Person(Integer id, String name, Boolean isActive, String description) {
	super();
	this.id = id;
	this.name = name;
	this.isActive = isActive;
	this.description = description;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Boolean getIsActive() {
	return isActive;
    }

    public void setIsActive(Boolean isActive) {
	this.isActive = isActive;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

}
