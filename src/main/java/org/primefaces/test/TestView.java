package org.primefaces.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.primefaces.event.FileUploadEvent;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7705670082140081684L;

    private String testString;

    private String fakeHash = "abcde";

    @PostConstruct
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
    }

    public void uploadListener(FileUploadEvent event) {
        FacesMessage msg = new FacesMessage("Succesful",
                event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);

        // skip some steps, just assume we have the hash back
        Document document = Jsoup.parse(testString);

        Elements elements = document.select("p");
        if (!elements.isEmpty()) {
            Element element = elements.first();
            element.appendText(fakeHash);
            testString = element.text();
        } else {
            testString = testString.concat(fakeHash);
        }

    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public String getFakeHash() {
        return fakeHash;
    }
}
