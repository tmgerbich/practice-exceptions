package part12;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();


    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public boolean isOn() {
        return true;
    };

    @Override
    public int read() {
        if (sensors.isEmpty()) {
            throw new IllegalStateException("No sensors added");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        readings.add(sum/sensors.size());
        return sum / sensors.size();
    }

}
