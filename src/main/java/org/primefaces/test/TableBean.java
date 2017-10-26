package org.primefaces.test;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "tableBean")
@ViewScoped
public class TableBean implements Serializable {

    private List<Person> persons = new ArrayList<Person>();

    private List<Person> filterPersons;

    private static final long serialVersionUID = -2848956414992723911L;

    @PostConstruct
    public void init() {
        persons.clear();

        Person person1;
        Person person2;
        Person person3;
        person1 = new Person("Person 1");
        person2 = new Person("Person 2");
        person3 = new Person("Person 3");

        this.getPersons().add(person1);
        this.getPersons().add(person2);
        this.getPersons().add(person3);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getFilterPersons() {
        return filterPersons;
    }

    public void setFilterPersons(List<Person> filterPersons) {
        this.filterPersons = filterPersons;
    }

}