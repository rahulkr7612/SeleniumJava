package POJOClass;

import java.util.List;

public class Courses {

    private List<webAutomation> webAutomation;
    private List<api> api;
    private List<mobile> mobile;

    public List<POJOClass.api> getApi() {
        return api;
    }

    public void setApi(List<POJOClass.api> api) {
        this.api = api;
    }

    public List<POJOClass.webAutomation> getWebAutomation() {
        return webAutomation;
    }

    public void setWebAutomation(List<POJOClass.webAutomation> webAutomation) {
        this.webAutomation = webAutomation;
    }

    public List<POJOClass.mobile> getMobile() {
        return mobile;
    }

    public void setMobile(List<POJOClass.mobile> mobile) {
        this.mobile = mobile;
    }




}
