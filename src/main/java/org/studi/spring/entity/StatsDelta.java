package org.studi.spring.entity;
import org.springframework.stereotype.Service;

@Service
public class StatsDelta {
    private int delta = 7;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "StatsDelta{" +
                "delta=" + delta +
                '}';
    }
}
