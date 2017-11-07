package org.primefaces.test;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 812243260866629419L;
    private String test = "test";
    private String test2 = "test2";
    private String test3 = "test3";

    public void testCommandButton() {
        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }
}
