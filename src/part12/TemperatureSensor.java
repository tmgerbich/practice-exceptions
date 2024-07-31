package part12;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
        return;
    }

    @Override
    public void setOff() {
        this.isOn = false;
        return;
    }

    @Override
    public int read() {
        if(!this.isOn) {
            throw new IllegalStateException("Sensor is off");
        }
        Random random = new Random();
        int min = -30;
        int max = 30;
        int temperature = random.nextInt((max - min) + 1) + min;;
        return temperature;
    }
}
