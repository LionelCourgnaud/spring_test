package org.studi.spring.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class StatsConverter {
    private int caractIn;
    private int caractOut;

    @Autowired
    public StatsDelta statsDelta;

    public void exec() {
        System.out.println(statsDelta);     // retourne null
        caractOut = caractIn + 7;
    }

    public int getCaractIn() {
        return caractIn;
    }

    public void setCaractIn(int caractIn) {
        this.caractIn = caractIn;
    }

    public int getCaractOut() {
        return caractOut;
    }

    public void setCaractOut(int caractOut) {
        this.caractOut = caractOut;
    }

    @Override
    public String toString() {
        return "StatsConverter { " +
                "caractIn=" + caractIn +
                ", caractOut=" + caractOut +
                " }";
    }
}
