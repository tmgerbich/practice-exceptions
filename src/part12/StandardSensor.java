package part12;

public class StandardSensor implements Sensor {
    private int reading;

    public StandardSensor(int reading) {
        this.reading = reading;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        return;
    }

    @Override
    public void setOff() {
        return;

    }

    @Override
    public int read() {
        return this.reading;
    }
}
