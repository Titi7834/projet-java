package com.devops;

public class GreetingService {

    public String greet(String name) {
        return "Bravo Monsieur ! Application déployée avec succès. L'application fonctionne !";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getPipelineSteps() {
        return "Git → Jenkins → Maven → Docker Build → Docker Deploy";
    }
}
