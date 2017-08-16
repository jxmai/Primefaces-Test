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

    private static final long serialVersionUID = 4124891683211838799L;

    private String testString;

    private List<String> testStrings = new ArrayList<String>();

    @PostConstruct
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
        testStrings.add("1");
        testStrings.add("2");
        testStrings.add("3");
    }

    public void fireActionListener(String str) {
        System.out.println(str);
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public List<String> getTestStrings() {
        return testStrings;
    }

    public void setTestStrings(List<String> testStrings) {
        this.testStrings = testStrings;
    }
}
