package com.company;

public class Process {

    private String name;
    private float timeFrame;
    private int intera;

    public Process(String name, float timeFrame, int intera) {
        this.name = name;
        this.timeFrame = timeFrame;
        this.intera = intera;
    }

    public Process() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(float timeFrame) {
        this.timeFrame = timeFrame;
    }

    public int getIntera() {
        return intera;
    }

    public void setIntera(int intera) {
        this.intera = intera;
    }
}
