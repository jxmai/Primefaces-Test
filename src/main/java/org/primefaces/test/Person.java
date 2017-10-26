package org.primefaces.test;
import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 8742265431595759127L;

    private String name;

    public Person() {
        super();
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}