package net.coderdojo.linz.springdemo.model;

public class Workshop {

    private int id;
    private String name;
    private String speaker;

    public Workshop(int id, String name, String speaker) {
        this.id = id;
        this.name = name;
        this.speaker = speaker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }
}
