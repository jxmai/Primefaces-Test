package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 4124891683211838799L;

    private String testString;

    private List<Person> people;

    @PostConstruct
    public void init() {
	testString = "Welcome to PrimeFaces!!!";
	this.people = new ArrayList<Person>();
	Person person1 = new Person(1, "Alice", true, "This is Alice ...");
	Person person2 = new Person(2, "Bob", true, "This is Bob  ...");
	people.add(person1);
	people.add(person2);
    }

    public String getTestString() {
	return testString;
    }

    public void setTestString(String testString) {
	this.testString = testString;
    }

    public List<Person> getPeople() {
	return people;
    }

    public void setPeople(List<Person> people) {
	this.people = people;
    }
}
