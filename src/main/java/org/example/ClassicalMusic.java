package org.example;

public class ClassicalMusic implements Music {
    private String actor;

    @Override
    public String getActor() {
        return actor;
    }

    @Override
    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String getSong() {
        return "Bogemskaia Rapsodia";
    }
}
