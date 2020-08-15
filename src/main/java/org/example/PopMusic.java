package org.example;

public class PopMusic implements Music{
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
        return "idontwannabeyou";
    }
}
